object numMethTester{

  def f1(x:Double): Double = -x* Math.log(x)/Math.log(2) // integration
  def f2(x:Double): Double = Math.cos(Math.cos(x)) // integration
  def f3(x:Double): Double = Math.log(Math.log(x)) // integration
  
  def f4(x:Double): Double = 10 - x*x // bisection + Newton's 1D + secant
  def df4(x:Double): Double = -2*x // Newton's 1D
  def f5(x:Double): Double = x*x - 3 // bisection + Newton's 1D + secant
  def df5(x:Double): Double = 2*x // Newton's 1D
  
  def f6 (x:Double):Double = x*x*x*x - 4*x*x +4 // Newton's 1D + secant
  def df6 (x:Double):Double = 4 *x*x*x - 8*x // Newton's 1D
  def f7(x:Double):Double = Math.pow(x-1,50)*Math.pow(x+1,50) // Newton's 1D + secant (failing)
  def df7(x:Double):Double = 100*x*Math.pow(x-1,49)*Math.pow(x+1,49) // Newton's 1D (failing)
  
  def f8(x:Double): Double = Math.cos(x) - x // bisection + Newton's 1D + secant
  def df8(x:Double): Double = -Math.sin(x) - 1 // Newton's 1D
  def f9(x:Double): Double = Math.pow(x,1.0/3) // Newton's 1D failing (because Math.pow returns NaN for negative values)
  def df9(x:Double): Double = 1.0/3*Math.pow(x,-2.0/3) // Newton's 1D failing (because Math.pow returns NaN for negative values)
  
  def f10(x:Double): Double = x*x*x - x - 1 // secant + Newton's 1D
  def df10(x:Double): Double = 3*x*x - 1 // Newton's 1D
  def f11(x:Double):Double = Math.cos(x) + 2 * Math.sin(x) + x*x // secant + Newton's 1D
  def df11(x:Double): Double = -Math.sin(x) + 2 * Math.cos(x) + 2*x // secant + Newton's 1D
  
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
  def f16(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	val z = xs(2)
	return Array(Math.exp(x)+y+z-1,Math.exp(2*y)+x+z-2,Math.exp(3*z)+x+y-3)
  } // Newton's + Broyden's n dimensions
  def jf16(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	val z = xs(2)
	return Array(Array(Math.exp(x),1,1),Array(1.0,2*Math.exp(2*y),1),Array(1.0,1,3*Math.exp(3*z)))
  } // Newton's + Broyden's n dimensions
  
  def f17(x:Double): Double = Math.exp(x-1)+Math.exp(100-100*x) // Golden section search (s.br. (0,2*phi,2))
  def f18(x:Double): Double = ((x-1)*Math.sin(x))/(x*x+1) // Golden section search (s.br. (-6,-6*phi,0))
  def f19(x:Double): Double = (Math.cos(x)-1)/(x*x) // Golden section search (s.br. (-1,2*phi-1,1))
  def f20(x:Double): Double ={
    val s1 = 10.0/(1+10*Math.sin(x))
	val s2 = 2 - (x-2)*(x-2)*(x-2)*(x-2)
	val s3 = (x-1)*(x-1)*(x-1)
	val max1 = Math.max(s1,s2)
	val maxmax = Math.max(max1,s3)
	return maxmax
  } // Golden section search (s.br. (0,1,2))
  
  def f21(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return 4*(x-2*y)*(x-2*y)+(x+2*y)*(x+2*y)+(1.0/50)*(4*(x-2*y)*(x-2*y)*(x-2*y)*(x-2*y)+(x+2*y)*(x+2*y)*(x+2*y)*(x+2*y))
  } // Gradient descent + Newton + BFGS 
  def df21(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(8*(x-2*y)+2*(x+2*y)+(1.0/50)*(16*(x-2*y)*(x-2*y)*(x-2*y)+4*(x+2*y)*(x+2*y)*(x+2*y)),-16*(x-2*y)+4*(x+2*y)+1.0/50*(-32*(x-2*y)*(x-2*y)*(x-2*y)+8*(x+2*y)*(x+2*y)*(x+2*y)))
  } // Gradient descent + Newton + BFGS 
  def hf21(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(Array(1.0/50*(48*(x-2*y)*(x-2*y)+12*(x+2*y)*(x+2*y))+10,1.0/50*(24*(x+2*y)*(x+2*y)-96*(x-2*y)*(x-2*y))-12),Array(1.0/50*(24*(x+2*y)*(x+2*y)-96*(x-2*y)*(x-2*y))-12,1.0/50*(192*(x-2*y)*(x-2*y)+48*(x+2*y)*(x+2*y))+40))
  } // Newton
  def f22(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Math.cos(x+y)+Math.sin(x-y)
  } // Gradient descent + Newton + BFGS ((s.p. (PI/4,PI/2))
  def df22(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(Math.cos(x-y)-Math.sin(x+y),-Math.sin(x+y)-Math.cos(x-y))
  } // Gradient descent + Newton + BFGS ((s.p. (PI/4,PI/2))
  def hf22(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(Array(-Math.sin(x-y)-Math.cos(x+y),Math.sin(x-y)-Math.cos(x+y)),Array(Math.sin(x-y)-Math.cos(x+y),-Math.sin(x-y)-Math.cos(x+y)))
  } // Newton ((s.p. (PI/4,PI/2))
  def f23(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return 0.5*((x+y)*(x+y)*(x+y)*(x+y)+(x-y)*(x-y)*(x-y)*(x-y))
  } // Gradient descent (s.p. (2,1))
  def df23(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(0.5*(4*(x+y)*(x+y)*(x+y)+4*(x-y)*(x-y)*(x-y)),0.5*(4*(x+y)*(x+y)*(x+y)-4*(x-y)*(x-y)*(x-y)))
  } // Gradient descent (s.p. (2,1))
  def f24(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return x*x+y*y+Math.exp(2*x+y)
  } // Gradient descent + Newton + BFGS (s.p. (0,0))
  def df24(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(2*x+2*Math.exp(2*x+y),2*y+Math.exp(2*x+y))
  } // Gradient descent + Newton + BFGS ((s.p. (0,0))
  def hf24(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(Array(4*Math.exp(2*x+y)+2,2*Math.exp(2*x+y)),Array(2*Math.exp(2*x+y),Math.exp(2*x+y)+2))
  } // Newton ((s.p. (0,0))
  def f25(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return x*x*x*x+y*y-3+x-y
  } // Gradient descent (s.p. (0,0))
  def df25(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0)
	val y = xs(1)
	return Array(4*x*x*x+1,2*y-1)
  } // Gradient descent (s.p. (0,0))

  def numInttest1D():Unit ={
    val u1 = new numIntegration
	println
	println ("Numerical integration in 1 dimension examples:")
	println
	
	println("For the function f1 (-x*log(2)(x)) from 0.5 to 1 using 2 intervals:")
	println("Midpoint:\t"+u1.midpoint1D(f1,0.5,1,2))
	println("Trapezium:\t"+u1.trapezium1D(f1,0.5,1,2))
	println("Simpsons:\t"+u1.simpsons1D(f1,0.5,1,2))
	println
	
	println("For the function f2 (cos(cos(x))) from 0 to pi using 4 intervals:")
	println("Midpoint:\t"+u1.midpoint1D(f2,0.0,Math.PI,4))
	println("Trapezium:\t"+u1.trapezium1D(f2,0.0,Math.PI,4))
	println("Simpsons:\t"+u1.simpsons1D(f2,0.0,Math.PI,4))
	println
	
	println("For the function f3 (log(log(x)) from 3 to 4 using 8 intervals:")	
	println("Midpoint:\t"+u1.midpoint1D(f3,3.0,4.0,8))
	println("Trapezium:\t"+u1.trapezium1D(f3,3.0,4.0,8))
	println("Simpsons:\t"+u1.simpsons1D(f3,3.0,4.0,8))
	println
  }
  
  def numRFtest1D():Unit ={
	val u2 = new numRootFinding
	println
	println("Numerical root-finding in 1 dimension examples:")
	println
	
	println("For the function f4 (10-x^2):")
	println("Bisection:\t"+u2.bisection(f4,2,10,1000,1e-14))
	println("Newton:\t\t"+u2.newton1D(f4,df4,1,1000,1e-14))
	println("Secant:\t\t"+u2.secant(f4,0,1,1000,1e-14)) 
	println
	
	println("For the function f5 (x^2-3):")
	println("Bisection:\t"+u2.bisection(f5,0,10,1000,1e-14))
	println("Newton:\t\t"+u2.newton1D(f5,df5,1,1000,1e-14))
	println("Secant:\t\t"+u2.secant(f5,0,2,1000,1e-14)) 
	println
	
	println("For the function f6 (x^4-4*x^2+4):")
	println("Newton:\t\t"+u2.newton1D(f6,df6,2,1000,1e-14))
	println("Secant:\t\t"+u2.secant(f6,1,200,1000,1e-14)) 
	println

	println("For the function f8 (cos(x)-x):")
	println("Bisection:\t"+u2.bisection(f8,-2,1,1000,1e-14))
	println("Newton:\t\t"+u2.newton1D(f8,df8,1,1000,1e-14))
	println("Secant:\t\t"+u2.secant(f8,1,10,1000,1e-14)) 
	println

	println("For the function f10 (x^3-x-1):")
	println("Bisection:\t"+u2.bisection(f10,-1,9,1000,1e-14))
	println("Newton:\t\t"+u2.newton1D(f10,df10,1,1000,1e-14))
	println("Secant:\t\t"+u2.secant(f10,1,2,1000,1e-14)) 
	println
	
	println("For the function f11 (cos(x)+2*sin(x)+2*x):")
	println("Bisection:\t"+u2.bisection(f11,-1,2,1000,1e-14))
	println("Newton:\t\t"+u2.newton1D(f11,df11,1,1000,1e-14))
	println("Secant:\t\t"+u2.secant(f11,1,10,1000,1e-14)) 
	println
	
  }

  def main(args: Array[String]):Unit ={
	val u3 = new numOptimization
	numInttest1D
	numRFtest1D
  }
  
}