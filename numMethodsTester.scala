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
	val x = xs(0); val y = xs(1)
	return Array(x*x+y*y-2,Math.exp(x-1)+y*y*y-2)
  } // Newton's + Broyden's n dimensions (s.p. (1.5,2))
  def jf14(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(2*x,2*y),Array(Math.exp(x-1),3*y*y))
  } // Newton's + Broyden's n dimensions (s.p. (1.5,2))
  def f15(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 3!")
	val x = xs(0); val y = xs(1); val z = xs(2)
	return Array(x*x+y*y+z*z-3,x*x+y*y-z-1,x+y+z-3)
  } // Newton's + Broyden's n dimensions (s.p. (10.0,11,12))
  def jf15(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1); val z = xs(2)
	return Array(Array(2*x,2*y,2*z),Array(2*x,2*y,-1),Array(1.0,1,1))
  } // Newton's + Broyden's n dimensions (s.p. (10.0,11,12))
  def f16(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1); val z = xs(2)
	return Array(Math.exp(x)+y+z-1,Math.exp(2*y)+x+z-2,Math.exp(3*z)+x+y-3)
  } // Newton's + Broyden's n dimensions (Broyden's method converges to a different value for more starting points and for Newton's we must be careful because we might get NaN)
  def jf16(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 3, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1); val z = xs(2)
	return Array(Array(Math.exp(x),1,1),Array(1.0,2*Math.exp(2*y),1),Array(1.0,1,3*Math.exp(3*z)))
  } // Newton's + Broyden's n dimensions (Broyden's method converges to a different value for more starting points and for Newton's we must be careful because we might get NaN)
  
  def phi = (Math.sqrt(5)-1)/2
  def f17(x:Double): Double = Math.exp(x-1)+Math.exp(100-100*x) // Golden section search (s.br. (0,2*phi,2))
  def f18(x:Double): Double = ((x-1)*Math.sin(x))/(x*x+1) // Golden section search (s.br. (-6,-6*phi,0))
  def f19(x:Double): Double = (Math.cos(x)-1)/(x*x) // Golden section search (s.br. (-1,2*phi-1,1)) (no global minimum)

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
	val x = xs(0); val y = xs(1)
	return 4*(x-2*y)*(x-2*y)+(x+2*y)*(x+2*y)+(1.0/50)*(4*(x-2*y)*(x-2*y)*(x-2*y)*(x-2*y)+(x+2*y)*(x+2*y)*(x+2*y)*(x+2*y))
  } // Gradient descent + Newton + BFGS 
  def df21(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(8*(x-2*y)+2*(x+2*y)+(1.0/50)*(16*(x-2*y)*(x-2*y)*(x-2*y)+4*(x+2*y)*(x+2*y)*(x+2*y)),-16*(x-2*y)+4*(x+2*y)+1.0/50*(-32*(x-2*y)*(x-2*y)*(x-2*y)+8*(x+2*y)*(x+2*y)*(x+2*y)))
  } // Gradient descent + Newton + BFGS 
  def hf21(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(1.0/50*(48*(x-2*y)*(x-2*y)+12*(x+2*y)*(x+2*y))+10,1.0/50*(24*(x+2*y)*(x+2*y)-96*(x-2*y)*(x-2*y))-12),Array(1.0/50*(24*(x+2*y)*(x+2*y)-96*(x-2*y)*(x-2*y))-12,1.0/50*(192*(x-2*y)*(x-2*y)+48*(x+2*y)*(x+2*y))+40))
  } // Newton
  def f22(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Math.cos(x+y)+Math.sin(x-y)
  } // Gradient descent + Newton + BFGS ((s.p. (PI/4,PI/2))
  def df22(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Math.cos(x-y)-Math.sin(x+y),-Math.sin(x+y)-Math.cos(x-y))
  } // Gradient descent + Newton + BFGS ((s.p. (PI/4,PI/2))
  def hf22(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(-Math.sin(x-y)-Math.cos(x+y),Math.sin(x-y)-Math.cos(x+y)),Array(Math.sin(x-y)-Math.cos(x+y),-Math.sin(x-y)-Math.cos(x+y)))
  } // Newton ((s.p. (PI/4,PI/2))
  def f23(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return 0.5*((x+y)*(x+y)*(x+y)*(x+y)+(x-y)*(x-y)*(x-y)*(x-y))
  } // Gradient descent (s.p. (2,1)) (not converging very well)
  def df23(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(0.5*(4*(x+y)*(x+y)*(x+y)+4*(x-y)*(x-y)*(x-y)),0.5*(4*(x+y)*(x+y)*(x+y)-4*(x-y)*(x-y)*(x-y)))
  } // Gradient descent (s.p. (2,1)) (not converging very well)
  def f24(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return x*x+y*y+Math.exp(2*x+y)
  } // Gradient descent + Newton + BFGS (s.p. (0,0))
  def df24(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(2*x+2*Math.exp(2*x+y),2*y+Math.exp(2*x+y))
  } // Gradient descent + Newton + BFGS ((s.p. (0,0))
  def hf24(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(4*Math.exp(2*x+y)+2,2*Math.exp(2*x+y)),Array(2*Math.exp(2*x+y),Math.exp(2*x+y)+2))
  } // Newton ((s.p. (0,0))
  def f25(xs:Array[Double]): Double ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return x*x*x*x+y*y-3+x-y
  } // Gradient descent + Newton + BFGS (s.p. (0,0) for Gradient descent and BFGS and (1,0) for Newton)
  def df25(xs:Array[Double]): Array[Double] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(4*x*x*x+1,2*y-1)
  } // Gradient descent + Newton + BFGS ((s.p. (0,0) for Gradient descent and BFGS and (1,0) for Newton)
  def hf25(xs:Array[Double]): Array[Array[Double]] ={
    assert(xs.size == 2, "The function applies to vectors of dimension 2!")
	val x = xs(0); val y = xs(1)
	return Array(Array(12*x*x,0),Array(0.0,2))
  } // Newton ((s.p. (1,0))

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
  
  def printArray1(x:Array[Double])={
    val xsize = x.size
	if(xsize > 0) print(x(0).toString)
	for(i <- 1 until xsize) print(s"\t${x(i).toString}")
	println
  }
  
  def printArray2(x:Array[Double])={
    val xsize = x.size
	if(xsize > 0) print(x(0).toString)
	for(i <- 1 until xsize) print(s"\t${x(i).toString}")
  }
  
  def numRFtestND(): Unit ={
    val u3 = new numRootFinding
	
	println
	println("Numerical root-finding in n dimensions examples:")
	println
	
	println("For the function f12 (x+e^x-3,x+y+e^y-5):")
	print("Newton:\t\t")
	printArray1(u3.newton(f12,jf12,Array(0.0,0),1000,1e-14))
	print("Broyden:\t")
	printArray1(u3.broyden(f12,jf12,Array(0.0,0),1000,1e-14))
	println
	
	println("For the function f13 (x*e^y-1,-x^2+y-1):")
	print("Newton:\t\t")
	printArray1(u3.newton(f13,jf13,Array(0.0,0),1000,1e-14))
	print("Broyden:\t")
	printArray1(u3.newton(f13,jf13,Array(0.0,0),1000,1e-14))
	println
	
	println("For the function f14 (x^2+y^2-2,e^(x-1)+y^3-2):")
	print("Newton:\t\t")
	printArray1(u3.newton(f14,jf14,Array(1.5,2),1000,1e-14))
	print("Broyden:\t")
	printArray1(u3.broyden(f14,jf14,Array(1.5,2),1000,1e-14))
	println
	
	println("For the function f15 (x^2+y^2+z^2-3,x^2+y^2-z-1,x+y+z-3):")
	print("Newton:\t\t")
	printArray1(u3.newton(f15,jf15,Array(10.0,11,12),1000,1e-14))
	print("Broyden:\t")
	printArray1(u3.broyden(f15,jf15,Array(10.0,11,12),1000,1e-14))
	println
	
	println("For the function f16 (e^x+y+z-1,e^(2*y)+x+z-2,e^(3*z)+x+y-3):")
	print("Newton:\t\t")
	printArray1(u3.newton(f16,jf16,Array(1.0,3,2),1000,1e-14))
	print("Broyden:\t")
	printArray1(u3.broyden(f16,jf16,Array(1.0,3.5,0),1000,1e-14))
	println
  }
  
  def numOpttest1D(): Unit ={
	val u4 = new numOptimization
	
	println
	println("Numerical optimization in 1 dimension examples:")
	println
	
	println("For the function f17 (e^(x-1)+e^(100-100x)):")
	val sol1 = u4.goldenSection(f17,0,2*phi,2,1000,1e-8)
	println("Golden section:\t"+sol1+" with minimum "+f17(sol1))
	println
	
	println("For the function f18 ((x-1)*sin(x)*sin(x)/(x^2+1)):")
	val sol2 = u4.goldenSection(f18,-6,-6*phi,0,1000,1e-8)
	println("Golden section:\t"+sol2+" with minimum "+f18(sol2))
	println
	
	println("For the function f20 (max(10/(1+10*sin(x)),2-(x-2)^4,(x-1)^3)):")
	val sol3 = u4.goldenSection(f20,0,1,2,1000,1e-8)
	println("Golden section:\t"+sol3+" with minimum "+f20(sol3))
	println
  }
  
  def numOpttestND(): Unit ={
	val u5 = new numOptimization
	
	println
	println("Numerical optimization in n dimensions examples:")
	println
	
	println("For the function f21 (4*(x-2*y)^2+(x+2*y)^2+1/50*(4*(x-2*y)^4+(x+2*y)^4))")
	val sol41 = u5.gradientDescent(f21,df21,Array(-2.0,1),1,0.5,1e-1,1000,1e-8)
	print("Gradient desc.:\t")
	printArray2(sol41)
	println(" with minimum "+f21(sol41))
	val sol42 = u5.newtonOptimization(f21,df21,hf21,Array(-2.0,1),0.5,1e-1,1000,1e-8)
	print("Newton:\t\t")
	printArray2(sol42)
	println(" with minimum "+f21(sol42))
	val sol43 = u5.bfgs(f21,df21,Array(-2.0,1),0.5,1e-1,1000,1e-8)
	print("BFGS:\t\t")
	printArray2(sol43)
	println(" with minimum "+f21(sol43))
	println
	
	println("For the function f22 (cos(x+y)+sin(x-y))")
	val sol51 = u5.gradientDescent(f22,df22,Array(Math.PI/4,Math.PI/2),1,0.5,1e-1,10000,1e-8) // 1000 steps not enough to converge
	print("Gradient desc.:\t")
	printArray2(sol51)
	println(" with minimum "+f22(sol51))
	val sol52 = u5.newtonOptimization(f22,df22,hf22,Array(Math.PI/4,Math.PI/2),0.5,1e-1,1000,1e-8)
	print("Newton:\t\t")
	printArray2(sol52)
	println(" with minimum "+f22(sol52))
	val sol53 = u5.bfgs(f22,df22,Array(Math.PI/4,Math.PI/2),0.5,1e-1,1000,1e-8)
	print("BFGS:\t\t")
	printArray2(sol53)
	println(" with minimum "+f22(sol53))
	println
	
	println("For the function f24 (x^2+y^2+e^(2*x+y))")
	val sol61 = u5.gradientDescent(f24,df24,Array(0.0,0),1,0.5,1e-1,100000,1e-8) // 1000 steps not enough to converge
	print("Gradient desc.:\t")
	printArray2(sol61)
	println(" with minimum "+f24(sol61))
	val sol62 = u5.newtonOptimization(f24,df24,hf24,Array(0.0,0),0.5,1e-1,1000,1e-8)
	print("Newton:\t\t")
	printArray2(sol62)
	println(" with minimum "+f24(sol62))
	val sol63 = u5.bfgs(f24,df24,Array(0.0,0),0.5,1e-1,1000,1e-8)
	print("BFGS:\t\t")
	printArray2(sol63)
	println(" with minimum "+f24(sol63))
	println
	
	println("For the function f25 (x^4+y^2-3+x-y)")
	val sol71 = u5.gradientDescent(f25,df25,Array(0.0,0),1,0.5,1e-1,10000,1e-8) // 1000 steps not enough to converge
	print("Gradient desc.:\t")
	printArray2(sol71)
	println(" with minimum "+f25(sol71))
	val sol72 = u5.newtonOptimization(f25,df25,hf25,Array(1.0,0),0.5,1e-1,1000,1e-8)
	print("Newton:\t\t")
	printArray2(sol72)
	println(" with minimum "+f25(sol72))
	val sol73 = u5.bfgs(f25,df25,Array(0.0,0),0.5,1e-1,1000,1e-8)
	print("BFGS:\t\t")
	printArray2(sol73)
	println(" with minimum "+f25(sol73))
	println
  }

  def main(args: Array[String]):Unit ={
	numInttest1D
	numRFtest1D
	numRFtestND
	numOpttest1D
	numOpttestND
  }
  
}