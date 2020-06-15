/** Numerical methods for root-finding (both in 1 dimension and n dimensions)
 */
class numRootFinding{

  private val u = new MVOperations

  // general tolerance defined by 2*epsilon or 4*epsilon with epsilon the Machine Epsilon

  // Function to check if two real values are equal
  private def isEqual(x: Double,y: Double): Boolean = return(Math.abs(x-y)<1e-12)

  // Function to check if a real value is 0
  private def is0(x: Double): Boolean = return(Math.abs(x-0.0)<1e-15)

  /** Interval bisection method for finding a root of a function.
   * @param f the function for which we will search for the root
   * @param a_0 the lower bound of the interval we are searching on for the root
   * @param b_0 the upper bound of the interval we are searching on for the root
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the root-finding problem
   */
  def bisection(f: Double => Double, a_0: Double, b_0: Double, N: Int, tol: Double): Double = {
    assert(!is0(f(a_0)*f(b_0)) && f(a_0)*f(b_0) < 0,"The bracket we choose must have a root")
	var a = a_0
	var b = b_0
	var n = 0
	var x = (a+b)/2
	while(n < N && Math.abs(b-a) >= tol){
	  if(is0(x)) return x
	  if(f(a)*f(x) < 0){
	    b = x
	  }
	  else{
	    a = x
	  }
	  n += 1
	  x = (a+b)/2
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
  /** Newton's method (1 dimension) for finding a root of a function.
   * @param f the function for which we will search for the root
   * @param df the derivative of the function for which we will search for the root
   * @param x_0 the point from which we start the search
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the root-finding problem
   */
  def newton1D(f: Double => Double, df: Double => Double, x_0: Double, N: Int, tol: Double): Double={
    var n = 0
	var ok:Boolean = false
	var x = x_0
	var prevx = x
	while(n < N && (Math.abs(x - prevx) >= tol * (1 + Math.abs(x)) || !ok)){
	  if(!ok) ok = true
	  prevx = x
	  assert(!is0(df(prevx)), "We have reached a 0 derivative!")
	  x = prevx - f(prevx)/df(prevx)
	  n += 1
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
  /** Secant method for finding a root of a function.
   * @param f the function for which we will search for the root
   * @param x_0 the first point from which we start the search
   * @param x_1 the second point from which we start the search
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the root-finding problem
   */
  def secant(f: Double => Double, x_0: Double, x_1: Double, N: Int, tol: Double): Double={
    var n = 1
	var ok:Boolean = false
	var prevprevx = x_0
	var prevx = x_0
	var x = x_1
	while(n < N && (Math.abs(x - prevx) >= tol * (1 + Math.abs(x)) || !ok)){
	  if(!ok) ok = true
	  prevprevx = prevx
	  prevx = x
	  assert(!is0(f(prevx)-f(prevprevx)), "We have reached 2 equal functions!")
	  x = prevx - f(prevx)*((prevx-prevprevx)/(f(prevx)-f(prevprevx)))
	  n += 1
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
  /** Newton's method (n dimensions) for finding a root of a function.
   * @param f the function for which we will search for the root
   * @param jacobf the Jacobian of the function for which we will search for the root
   * @param x_0 the point from which we start
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution
   * @return the solution to the root-finding problem
   */
  def newton(f: Array[Double] => Array[Double], jacobf: Array[Double] => Array[Array[Double]], x_0: Array[Double], N: Int, tol: Double): Array[Double] ={
    var n = 0
	var x = u.copyV(x_0)
	var deltax:Array[Double] = u.copyV(x_0)
	var ok:Boolean = false
	while(n < N && (u.lengthV(deltax) >= tol * (1 + u.lengthV(x)) || !ok)){
	  if(!ok) ok = true
	  val solution = u.noMsgSysSolve(jacobf(x),u.ctmulV(-1,f(x)))
	  deltax = solution._2
	  assert(deltax.size != 0, "No solution to the system to be solved found!")
	  x = u.addV(x,deltax)
	  n += 1
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
  /** Broyden's method for finding a root of a function.
   * @param f the function for which we will search for the root
   * @param jacobf the Jacobian of the function for which we will search for the root (used for the initial step only, can be set to -Id)
   * @param x_0 the point from which we start
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution
   * @return the solution to the root-finding problem
   */
  def broyden(f: Array[Double] => Array[Double], jacobf: Array[Double] => Array[Array[Double]], x_0: Array[Double], N: Int, tol: Double): Array[Double] ={
    var n = 1
	var x = u.copyV(x_0)
	var jcb = jacobf(x)
	val sol1 = u.noMsgSysSolve(jcb,u.ctmulV(-1,f(x)))
	var deltax:Array[Double] = sol1._2
	assert(deltax.size != 0, "No solution to the system to be solved found!")
	var xold = x
	x = u.addV(xold,deltax)
	var ok:Boolean = false
	while(n < N && (u.lengthV(deltax) >= tol * (1 + u.lengthV(x)) || !ok)){
	  if(!ok) ok = true
	  val deltay = u.subV(f(x),f(xold))
	  val ctpart = u.lengthV(deltax)
	  val deltajcb = u.mulM(u.vecttomatr(u.ctmulV(1.0/(ctpart*ctpart),u.subV(deltay,u.mulMV(jcb,deltax)))),u.transposeV(deltax))
	  jcb = u.addM(jcb,deltajcb)
	  val sol2 = u.noMsgSysSolve(jcb,u.ctmulV(-1,f(x)))
	  deltax = sol2._2
	  assert(deltax.size != 0, "No solution to the system to be solved found!")
	  xold = x
	  x = u.addV(xold,deltax)
	  n += 1
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
}