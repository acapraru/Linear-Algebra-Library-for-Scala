object Tester{

  def main(args:Array[String]):Unit={
    val u = new MVOperations
    val a = Array(Array(1.0,2.0,3.0),Array(4.0,-5.0,3.0),Array(2.0,1.0,3.0),Array(3.0,1.5,2.0))
    val b = Array(Array(4.5,3.0,1.0),Array(-1.0,2.0,5.0),Array(2.3,2.0,9.0),Array(1.0,4.5,9.0))
	val c = Array(1.0,2.0,3.0)
	val d = Array(2.0,3.0,4.0)
    val e = Array(Array(4.5,3.0,1.0,3.2),Array(-1.2,2.4,4.0,3.9),Array(2.4,2.6,9.7,3.1))
	val f = Array(Array(2.0,3.0),Array(1.0,-2.0))
	val g = Array(Array(1.0,4.0),Array(-3.0,12.5))
	val h = Array(Array(3.9,4.2,1.9,3.1),Array(-1.3,-5.9,2.4,-9.1),Array(3.0,2.1,-2.3,1.2),Array(20.3,1.2,3.5,-2.9))
	val i = Array(Array(2.0,1.3,-4.1,3.5),Array(1.2,3.2,-1.2,-4.0),Array(1.5,2.3,1.9,-9.2),Array(1.4,2.3,-1.4,2.9))
	val j = Array(Array(3.9,4.2,1.9,3.1,-2.3),Array(-1.3,-5.9,2.4,-9.1,1.8),Array(3.0,2.1,-2.3,1.2,9.5),Array(20.3,1.2,3.5,-2.9,-2.5),Array(1.4,1.8,-2.3,-1.9,21.0))
	val k = Array(Array(2.0,1.3,-4.1,3.5,3.4),Array(1.2,3.2,-1.2,-4.0,-2.3),Array(1.5,2.3,1.9,-9.2,1.9),Array(1.4,2.3,-1.4,2.9,8.8),Array(2.0,3.1,-1.4,-2.9,4.2))
    val l = Array(Array(1.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0),Array(0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,1.0))
	val m = Array(Array(1.2,-2.3,1.31,1.4),Array(3.01,-1.92,1.49,3.9),Array(20.2,2.1,10.0,-1.9),Array(3.0,2.0,1.0,-9.9))
	val n = Array(Array(3.0,-2,0,-1,1,2,3,4,5,9),Array(0.0,1,3,4,6,2,1,2,2,1),Array(1.0,-2,-3,-2,4,3,1,2,9,1),Array(1.0,2,3,-9,-3,-2,-1,0,1,1),Array(1.0,2,3,4,5,6,7,8,9,10),Array(2.0,1,3,1,3,5,7,3,2,3),Array(-1.0,-2,3,-4,-6,-9,92,1,3,1),Array(1.0,2,0,2,4,6,5,8,-2,-4),Array(1.0,5,9,2,5,-1,-2,-4,2,-2),Array(1.0,2,7,1,-1,-2,-3,-4,-9,8))
	u.printM(a)
	println
	u.printM(b)
	println
	u.printM(u.addM(a,b))
	println
	u.printV(u.addV(c,d))
	println
	u.printM(u.subM(a,b))
	println
	u.printV(u.subV(c,d))
	println
	u.printM(u.ctmulM(-2.0,a))
	println
	u.printV(u.ctmulV(-9.0,d))
	println
	u.printM(u.mulM(k,j))
	println
	u.printM(u.fillM(a,2,2))
	
	val l1 = Array.ofDim[Double](1012,1012)
	val l2 = Array.ofDim[Double](1012,1012)
	for(i <- 0 until 1012)
	  for(j <- 0 until 1012){
	    l1(i)(j)= i+j
		if(i==j) l2(i)(j)= 1.0
	  }
	
	println
	val t1 = java.lang.System.currentTimeMillis()
	u.mulM(l1,l2)
	val totaltime1 = java.lang.System.currentTimeMillis() - t1
	println(totaltime1)
	
	/*
	val t2 = java.lang.System.currentTimeMillis()
	u.naiveMul(l1,l2)
	val totaltime2 = java.lang.System.currentTimeMillis() - t2
	println(totaltime2)
	*/
	
	println
	println(u.mulV(c,d))
	
	println
	u.printV(u.mulMV(a,d))
	
	println
	val t3 = java.lang.System.currentTimeMillis()
	u.printM(u.expM(g,11))
	val totaltime3 = java.lang.System.currentTimeMillis() - t3
	println(totaltime3)
	
	println
	u.printM(u.inverse(n))
	
  }

}