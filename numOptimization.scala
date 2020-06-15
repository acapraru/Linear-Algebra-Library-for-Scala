/** Numerical methods for optimization (both in 1 dimension and n dimensions)
 */
class numOptimization{
  
  private val u = new MVOperations
  
  // general tolerance defined by sqrt(epsilon) with epsilon the Machine Epsilon
  
  // Function to check if two real values are equal
  private def isEqual(x: Double,y: Double): Boolean = return(Math.abs(x-y)<1e-12)

  // Function to check if a real value is 0
  private def is0(x: Double): Boolean = return(Math.abs(x-0.0)<1e-15)

  /** Golden section search algorithm for finding a minimum of a function.
   * @param f the function for which we do the optimization
   * @param a_0 the first member of the bracket
   * @param b_0 the second member of the bracket
   * @param c_0 the third member of the bracket
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the optimization problem
   */
  def goldenSection(f: Double => Double, a_0: Double, b_0: Double, c_0: Double, N:Int, tol: Double): Double ={
    assert(a_0 < b_0 && b_0 < c_0 && f(a_0) > f(b_0) && f(b_0) < f(c_0), "(a_0,b_0,c_0) should form a bracket!")
	var a = a_0
	var b = b_0
	var c = c_0
	var z = 0.0
	var n = 0
	while(n < N && Math.abs(c-a) >= tol * Math.abs(b)){
	  if(c-b > b-a){
	    z = c - ((Math.sqrt(5.0)-1)/2)*(c-b)
		if(f(b)<f(z)) c = z
		else{a = b; b = z}
	  }
	  else{
	    z = a + ((Math.sqrt(5.0)-1)/2)*(b-a)
		if(f(b)<f(z)) a = z
		else{c = b; b = z}
	  }
	  n += 1
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return b
  }
  
  /** Gradient descent with backtracking algorithm for finding a minimum of a function.
   * @param f the function for which we do the optimization
   * @param df the derivative of the function for which we do the optimization
   * @param x_0 the point from which we start the search
   * @param alpha_0 the initial step length
   * @param rho the factor (between 0 and 1) by which we do the backtracking (usually 0.5)
   * @param delta the Armijo constant (usually between 1e-4 and 1e-1)
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the optimization problem
   */
  def gradientDescent(f: Array[Double] => Double, df: Array[Double] => Array[Double], x_0: Array[Double], alpha_0: Double, rho: Double, delta: Double, N: Int, tol: Double): Array[Double] ={
	assert(0.0 < rho && rho < 1.0, "The rho factor should be between 0 and 1!")
	var x = u.copyV(x_0)
	var g = df(x)
	var d = u.ctmulV(-1,g)
	val tocmpwith = tol*(1+u.lengthV(g))
	var stlngth = alpha_0
	var n = 0
	var ok:Boolean = false
	while(n < N && (u.lengthV(g) >= tocmpwith || !ok)){
	  if(!ok) ok = true
	  val xold = u.copyV(x)
	  val fxold = f(xold)
	  var changing = delta*stlngth*u.mulV(g,d)
	  var armijo = fxold + changing
	  x = u.addV(xold,u.ctmulV(stlngth,d))
	  while(f(x) >= armijo){
	    stlngth = rho*stlngth
		changing = rho*stlngth
		armijo = fxold + changing
		x = u.addV(xold,u.ctmulV(stlngth,d))
	  }
	  n += 1
	  val ctone = u.mulV(g,d)
	  g = df(x)
	  d = u.ctmulV(-1,g)
	  val cttwo = u.mulV(g,d)
	  stlngth = stlngth*(ctone/cttwo)
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
  /** Newton's method for optimization with backtracking for finding a minimum of a function
   * @param f the function for which we do the optimization
   * @param df the derivative of the function for which we do the optimization
   * @param hessf the Hessian of the function for which we do the optimization
   * @param x_0 the point from which we start the search
   * @param rho the factor (between 0 and 1) by which we do the backtracking (usually 0.5)
   * @param delta the Armijo constant (usually between 1e-4 and 1e-1)
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the optimization problem
   */
  def newtonOptimization(f: Array[Double] => Double, df: Array[Double] => Array[Double], hessf: Array[Double] => Array[Array[Double]], x_0: Array[Double], rho: Double, delta: Double, N: Int, tol: Double): Array[Double] ={
	assert(0.0 < rho && rho < 1.0, "The rho factor should be between 0 and 1!")
	var x = u.copyV(x_0)
	var g = df(x)
	val sol1 = u.noMsgSysSolve(hessf(x),u.ctmulV(-1,g))
	var d = sol1._2
	assert(d.size != 0, "No solution to the system to be solved found!")
	val tocmpwith = tol*(1+u.lengthV(g))
	var n = 0
	var ok:Boolean = false
	while(n < N && (u.lengthV(g) >= tocmpwith || !ok)){
	  if(!ok) ok = true
	  // if (u.mulV(g,d) > 0) d = u.ctmulV(-1,d) switching the sign of d to make it a descent direction
	  var stlngth:Double = 1.0
	  val xold = u.copyV(x)
	  val fxold = f(xold)
	  var changing = delta*stlngth*u.mulV(g,d)
	  var armijo = fxold + changing
	  x = u.addV(xold,u.ctmulV(stlngth,d))
	  while(f(x) >= armijo){
	    stlngth = rho*stlngth
		changing = rho*stlngth
		armijo = fxold + changing
		x = u.addV(xold,u.ctmulV(stlngth,d))
	  }
	  n += 1
	  g = df(x)
	  val sol2 = u.noMsgSysSolve(hessf(x),u.ctmulV(-1,g))
	  d = sol2._2
	  assert(d.size != 0, "No solution to the system to be solved found!")
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
  /** BFGS's method for optimization with backtracking for finding a minimum of a function
   * @param f the function for which we do the optimization
   * @param df the derivative of the function for which we do the optimization
   * @param x_0 the point from which we start the search
   * @param rho the factor (between 0 and 1) by which we do the backtracking (usually 0.5)
   * @param delta the Armijo constant (usually between 1e-4 and 1e-1)
   * @param N the maximum number of allowed steps
   * @param tol the tolerance accepted for returning the solution we found
   * @return the solution to the optimization problem
   */
  def bfgs(f: Array[Double] => Double, df: Array[Double] => Array[Double], x_0: Array[Double], rho: Double, delta: Double, N: Int, tol: Double): Array[Double] ={
	assert(0.0 < rho && rho < 1.0, "The rho factor should be between 0 and 1!")
	var x = u.copyV(x_0)
	val xsize = x.size
	var hess = u.genId(xsize)
	var g = df(x)
	var d = u.ctmulV(-1,g)
	val tocmpwith = tol*(1+u.lengthV(g))
	var n = 0
	var ok:Boolean = false
	while(n < N && (u.lengthV(g) >= tocmpwith || !ok)){
	  if(!ok) ok = true
	  var stlngth:Double = 1.0
	  val xold = u.copyV(x)
	  val fxold = f(xold)
	  val gold = u.copyV(g)
	  var changing = delta*stlngth*u.mulV(g,d)
	  var armijo = fxold + changing
	  x = u.addV(xold,u.ctmulV(stlngth,d))
	  while(f(x) >= armijo){
	    stlngth = rho*stlngth
		changing = rho*stlngth
		armijo = fxold + changing
		x = u.addV(xold,u.ctmulV(stlngth,d))
	  }
	  n += 1
	  g = df(x)
	  val deltax = u.subV(x,xold)
	  val deltag = u.subV(g,gold)
	  if(u.mulV(deltax,deltag)>0){
	    val ct1 = 1.0/u.mulV(deltag,deltax)
		val ct2 = 1.0/u.mulV(deltax,u.mulMV(hess,deltax))
		val mx1 = u.ctmulM(ct1,u.mulM(u.vecttomatr(deltag),u.transposeV(deltag)))
		val mx2 = u.ctmulM(ct2,u.mulM(u.mulM(u.mulM(hess,u.vecttomatr(deltax)),u.transposeV(deltax)),hess))
		hess = u.addM(hess,u.subM(mx1,mx2))
	  }
	  else hess = u.genId(xsize)
	  val sol2 = u.noMsgSysSolve(hess,u.ctmulV(-1,g))
	  d = sol2._2
	}
	if(n == N) println("We've reached the maximum number of allowed steps!")
	return x
  }
  
}