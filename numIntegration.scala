/** Numerical methods for numerical integration (in 1 dimension)
 */
class numIntegration{
  
  /** Midpoint rule method for approximating an integral.
   * @param f the function for which we approximate the integral
   * @param a the lower bound of the integral
   * @param b the upper bound of the integral
   * @param n the number of strips used for approximating the integral
   * @return the approximated integral
   */
  def midpoint1D(f: Double => Double, a: Double, b: Double,n: Int): Double = {
    var sol:Double = 0.0
	val ctmul:Double = (b-a)/n
	for(i <- 0 until n){
	  val md = a + ((2*i+1)/2.0) * ctmul
	  sol += ctmul*f(md)
	}
	return sol
  }
  
  /** Trapezium rule method for approximating an integral.
   * @param f the function for which we approximate the integral
   * @param a the lower bound of the integral
   * @param b the upper bound of the integral
   * @param n the number of strips used for approximating the integral
   * @return the approximated integral
   */
  def trapezium1D(f: Double => Double, a: Double, b: Double,n: Int): Double = {
    var sol:Double = 0.0
	var ctmul:Double = (b-a)/(2*n)
	val factor = (b-a)/n
	for(i <- 0 to n){
	  val xi = a + i*factor
	  if(i == 0 || i == n) sol += ctmul*f(xi)
	  else sol += ctmul*2*f(xi)
	}
	return sol
  }
  
  /** Simpson's rule method for approximating an integral.
   * @param f the function for which we approximate the integral
   * @param a the lower bound of the integral
   * @param b the upper bound of the integral
   * @param n the number of strips used for approximating the integral
   * @return the approximated integral
   */
  def simpsons1D(f: Double => Double, a: Double, b: Double,n: Int): Double = {
    assert(n%2 == 0,"For Simpson's method the number of strips should be even!")
    var sol:Double = 0.0
	var ctmul:Double = (b-a)/(3*n)
	val factor = (b-a)/n
	for(i <- 0 to n){
	  val xi = a + i*factor
	  if(i == 0 || i == n) sol += ctmul*f(xi)
	  else if (i%2 == 0) sol +=  ctmul*2*f(xi)
	  else sol += ctmul*4*f(xi)
	}
	return sol
  }
  
}