object numMethTester{

  def f1(x:Double): Double = -x* Math.log(x)/Math.log(2) // integration
  def f2(x:Double): Double = Math.cos(Math.cos(x)) // integration
  def f3(x:Double): Double = Math.log(Math.log(x)) // integration
  def f4(x:Double): Double = 10 - x*x // bisection
  def f5(x:Double): Double = x*x - 3 // bisection
  def f6 (x:Double):Double = x*x*x*x - 4*x*x +4 // Newton's 1D
  def df6 (x:Double):Double = 4 *x*x*x - 8*x // Newton's 1D
  def f7(x:Double):Double = Math.pow(x-1,50)*Math.pow(x+1,50) // Newton's 1D
  def df7(x:Double):Double = 100*x*Math.pow(x-1,49)*Math.pow(x+1,49) // Newton's 1D
  def f8(x:Double): Double = Math.cos(x) - x // Newton's 1D + secant
  def df8(x:Double): Double = -Math.sin(x) - 1 // Newton's 1D
  def f9(x:Double): Double = Math.pow(x,1.0/3) // Newton's 1D failing
  def df9(x:Double): Double = -1.0/3*Math.pow(x,-2.0/3) // Newton's 1D failing
  def f10(x:Double): Double = x*x*x - x - 1 // secant
  def f11(x:Double):Double = Math.cos(x) + 2 * Math.sin(x) + x*x // secant
  def f12(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
    return Array(x+Math.exp(x)-3,x+y+Math.exp(y)-5)
  } // Newton's + Broyden's n dimensions
  def jf12(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2,"The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(1 + Math.exp(x), 0.0), Array(1.0,1 + Math.exp(y)))
  } // Newton's + Broyden's n dimensions
  def f13(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(x*Math.exp(y)-1,-x*x+y-1)
  } // Newton's + Broyden's n dimensions
  def jf13(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2,"The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(Math.exp(y), x*Math.exp(y)), Array(-2.0*x,1))
  } // Newton's + Broyden's n dimensions
  def f14(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	return Array(xs(0)*xs(0)+xs(1)*xs(1)-2,Math.exp(xs(0)-1)+xs(1)*xs(1)*xs(1)-2)
  } // Newton's + Broyden's n dimensions (s.p. (1.5,2))
  def jf14(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	return Array(Array(2*xs(0),2*xs(1)),Array(Math.exp(xs(0)-1),3*xs(1)*xs(1)))
  } // Newton's + Broyden's n dimensions (s.p. (1.5,2))
  def f15(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 3!")
	return Array(xs(0)*xs(0)+xs(1)*xs(1)+xs(2)*xs(2)-3,xs(0)*xs(0)+xs(1)*xs(1)-xs(2)-1,xs(0)+xs(1)+xs(2)-3)
  } // Newton's + Broyden's n dimensions (s.p. (1.0,0,1))
  def jf15(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 2!")
	return Array(Array(2*xs(0),2*xs(1),2*xs(2)),Array(2*xs(0),2*xs(1),-1),Array(1.0,1,1))
  } // Newton's + Broyden's n dimensions (s.p. (1.0,0,1))
  
  def main(args: Array[String]):Unit ={
    val u = new numIntegration
	
	println("For the first function:")
	println(u.midpoint1D(f1,0.5,1,2))
	println(u.trapezium1D(f1,0.5,1,2))
	println(u.simpsons1D(f1,0.5,1,2))
	
	println("For the second function:")
	println(u.midpoint1D(f2,0.0,Math.PI,4))
	println(u.trapezium1D(f2,0.0,Math.PI,4))
	println(u.simpsons1D(f2,0.0,Math.PI,4))
	
	println("For the third function:")
	println(u.midpoint1D(f3,3.0,4.0,8))
	println(u.trapezium1D(f3,3.0,4.0,8))
	println(u.simpsons1D(f3,3.0,4.0,8))
  }
  
}