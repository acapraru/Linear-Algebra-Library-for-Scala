import org.scalatest.FunSuite
class Testsuite extends FunSuite{

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
  val o = Array(-1.0,2,9,1,29,-349,1,344,2,1)
  val p = Array(2.0,3,1,4,7,-22,-111,1,543,1)
  val q = Array(1.0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,0)
  val r = Array(1.0,-2,-3,4,5,6,7,8,9,1,2,20,11,15,13,21,0)

  test("Tests for equality of two matrices (isEqualM)"){
    assert(u.isEqualM(a,a) === true)
	assert(u.isEqualM(b,b) === true)
	assert(u.isEqualM(n,n) === true)
    assert(u.isEqualM(a,b) === false)
	assert(u.isEqualM(f,g) === false)
	assert(u.isEqualM(Array(Array(-1.0,-2,-3,4),Array(-2.0,3,8,1),Array(1.0,1,5,1)),Array(Array(-1.0,-2,-3,4),Array(-2.0,3,8,1),Array(1.0,1,5,1))) == true)
	assert(u.isEqualM(Array(Array(-1.0,-2,-3,4.1),Array(-2.0,3,8,1),Array(1.0,1,5,1)),Array(Array(-1.0,-2,-3,4),Array(-2.0,3,8,1),Array(1.0,1,5,1))) == false)
    assert(u.isEqualM(a,f) === false)
	val s1 = Array.ofDim[Double](50,100)
	val s2 = Array.ofDim[Double](50,100)
	for(i <- 0 until 50; j <- 0 until 100) {s1(i)(j) = i+j; s2(i)(j) = i+j}
	assert(u.isEqualM(s1,s2) === true)
	assert(u.isEqualM(s2,s1) === true)
	s1(2)(3) = 4
	assert(u.isEqualM(s1,s2) === false)
	val s3 = Array.ofDim[Double](1001,1001)
	val s4 = Array.ofDim[Double](521,1911)
	assert(u.isEqualM(s3,s4) === false)
  }
  
  test("Tests for equality of two vectors (isEqualV)"){
    assert(u.isEqualV(c,c) === true)
	assert(u.isEqualV(d,d) === true)
	assert(u.isEqualV(Array(1.0,2,3,9,3,1,3,2),Array(-1.0,2.3)) === false)
	assert(u.isEqualV(Array(1.0,2,3,9,3,1,3,2),Array(1.0,2,3,9,3,1,3,2)) === true)
	assert(u.isEqualV(Array(1.0,2,3,9,3,1,3,2),Array(1.0,2,3,9,3,1,3,2.1)) === false)
	assert(u.isEqualV(Array[Double](),Array(1.0)) === false)
	val s1 = new Array[Double](3932)
	val s2 = new Array[Double](3932)
	for(i <- 0 until 3932) {s1(i) = i; s2(i) = i}
	assert(u.isEqualV(s1,s2) === true)
	assert(u.isEqualV(s2,s1) === true)
	s1(291) = 2
	assert(u.isEqualV(s1,s2) === false)
	val s3 = new Array[Double](19191)
	val s4 = new Array[Double](19192)
	assert(u.isEqualV(s3,s4) === false)
  }
  
  test("Tests for adding two matrices (addM)"){
    val s1 = u.addM(a,b)
	val s2 = u.addM(f,g)
	assert(u.isEqualM(s1,Array(Array(5.5,5,4),Array(3.0,-3,8),Array(4.3,3,12),Array(4,6,11))) == true)
	intercept[AssertionError]{u.addM(a,e)}
	intercept[AssertionError]{u.addM(i,k)}
	assert(u.isEqualM(s2,Array(Array(3.0,7),Array(-2.0,10.5))) === true)
	val s3 = u.addM(h,i)
	val s4 = u.addM(j,k)
	val s5 = u.addM(l,l)
	assert(u.isEqualM(s3,Array(Array(5.9,5.5,-2.2,6.6),Array(-0.1,-2.7,1.2,-13.1),Array(4.5,4.4,-0.4,-8.0),Array(21.7,3.5,2.1,0.0))) === true)
	assert(u.isEqualM(s4,Array(Array(5.9,5.5,-2.2,6.6,1.1),Array(-0.1,-2.7,1.2,-13.1,-0.5),Array(4.5,4.4,-0.4,-8.0,11.4),Array(21.7,3.5,2.1,0.0,6.3),Array(3.4,4.9,-3.7,-4.8,25.2))) === true)
	assert(u.isEqualM(s5,Array(Array(2.0,0.0,0.0,0.0),Array(0.0,2.0,0.0,0.0),Array(0.0,0.0,2.0,0.0),Array(0.0,0.0,0.0,2.0))) == true)
  }
  
  test("Tests for adding two vectors (addV)"){
    val s1 = u.addV(c,d)
	assert(u.isEqualV(s1,Array(3.0,5.0,7.0)) === true)
	intercept[AssertionError]{u.addV(p,q)}
	intercept[AssertionError]{u.addV(o,r)}
	intercept[AssertionError]{u.addV(p,c)}
	intercept[AssertionError]{u.addV(q,d)}
	val s2 = u.addV(o,p)
	val s3 = u.addV(q,r)
	assert(u.isEqualV(s2,Array(1.0,5,10,5,36,-371,-110,345,545,2)) === true)
	assert(u.isEqualV(s3,Array(2.0,0,0,8,10,12,14,16,18,11,13,32,24,29,28,37,0)) === true)
  }
  
  test("Tests for subtracting two matrices (subM)"){
    val s1 = u.subM(a,b)
	val s2 = u.subM(f,g)
	assert(u.isEqualM(s1,Array(Array(-3.5,-1,2),Array(5.0,-7,-2),Array(-0.3,-1,-6),Array(2,-3,-7))) === true)
	intercept[AssertionError]{u.subM(a,e)}
	intercept[AssertionError]{u.subM(i,k)}
	assert(u.isEqualM(s2,Array(Array(1.0,-1),Array(4.0,-14.5))) === true)
	val s3 = u.subM(h,i)
	val s4 = u.subM(j,k)
	val s5 = u.subM(l,l)
	assert(u.isEqualM(s3,Array(Array(1.9,2.9,6,-0.4),Array(-2.5,-9.1,3.6,-5.1),Array(1.5,-0.2,-4.2,10.4),Array(18.9,-1.1,4.9,-5.8))) === true)
	assert(u.isEqualM(s4,Array(Array(1.9,2.9,6,-0.4,-5.7),Array(-2.5,-9.1,3.6,-5.1,4.1),Array(1.5,-0.2,-4.2,10.4,7.6),Array(18.9,-1.1,4.9,-5.8,-11.3),Array(-0.6,-1.3,-0.9,1.0,16.8))) === true)
	assert(u.isEqualM(s5,Array(Array(0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0))) === true)
  }
  
  test("Tests for subtracting two vectors (subV)"){
    val s1 = u.subV(c,d)
	assert(u.isEqualV(s1,Array(-1.0,-1.0,-1.0)) === true)
	intercept[AssertionError]{u.subV(p,q)}
	intercept[AssertionError]{u.subV(o,r)}
	intercept[AssertionError]{u.subV(p,c)}
	intercept[AssertionError]{u.subV(q,d)}
	val s2 = u.subV(o,p)
	val s3 = u.subV(q,r)
	assert(u.isEqualV(s2,Array(-3.0,-1,8,-3,22,-327,112,343,-541,0)) === true)
	assert(u.isEqualV(s3,Array(0.0,4,6,0,0,0,0,0,0,9,9,-8,2,-1,2,-5,0)) === true)
  }
  
  test("Tests for multiplying a matrix by a constant (ctmulM)"){
    val s1 = u.ctmulM(-2,a)
    val s2 = u.ctmulM(3,b)
	val s3 = u.ctmulM(4,k)
	val s4 = u.ctmulM(1000.5,l)
	val s5 = u.ctmulM(-2.2,m)
	val s6 = u.ctmulM(101,f)
	assert(u.isEqualM(s1,Array(Array(-2.0,-4,-6),Array(-8.0,10,-6),Array(-4.0,-2,-6),Array(-6,-3,-4))) === true)
	assert(u.isEqualM(s2,Array(Array(13.5,9,3),Array(-3.0,6,15),Array(6.9,6,27),Array(3.0,13.5,27))) === true)
	assert(u.isEqualM(s3,Array(Array(8.0,5.2,-16.4,14,13.6),Array(4.8,12.8,-4.8,-16,-9.2),Array(6.0,9.2,7.6,-36.8,7.6),Array(5.6,9.2,-5.6,11.6,35.2),Array(8.0,12.4,-5.6,-11.6,16.8))) === true)
	assert(u.isEqualM(s4,Array(Array(1000.5,0,0,0),Array(0.0,1000.5,0,0),Array(0.0,0,1000.5,0),Array(0.0,0,0,1000.5))) === true)
	assert(u.isEqualM(s5,Array(Array(-2.64,5.06,-2.882,-3.08),Array(-6.622,4.224,-3.278,-8.58),Array(-44.44,-4.62,-22,4.18),Array(-6.6,-4.4,-2.2,21.78))) === true)
	assert(u.isEqualM(s6,Array(Array(202.0,303),Array(101.0,-202))) === true)
  }
  
  test("Tests for multiplying a vector by a constant (ctmulV)"){
    val s1 = u.ctmulV(-4,c)
    val s2 = u.ctmulV(8,d)
    val s3 = u.ctmulV(2.4,o)
    val s4 = u.ctmulV(-1.5,p)
    val s5 = u.ctmulV(9,q)
    val s6 = u.ctmulV(19,r)
	assert(u.isEqualV(s1,Array(-4.0,-8,-12)) === true)
	assert(u.isEqualV(s2,Array(16.0,24,32)) === true)
	assert(u.isEqualV(s3,Array(-2.4,4.8,21.6,2.4,69.6,-837.6,2.4,825.6,4.8,2.4)) === true)
	assert(u.isEqualV(s4,Array(-3.0,-4.5,-1.5,-6,-10.5,33,166.5,-1.5,-814.5,-1.5)) === true)
	assert(u.isEqualV(s5,Array(9.0,18,27,36,45,54,63,72,81,90,99,108,117,126,135,144,0)) === true)
	assert(u.isEqualV(s6,Array(19.0,-38,-57,76,95,114,133,152,171,19,38,380,209,285,247,399,0)) === true)
  }
  
}