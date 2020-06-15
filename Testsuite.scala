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
  val s = Array(Array(2.0,1.0),Array(1.0,3.0),Array(5.0,8.0))
  val t = Array(Array(2.0,1.0,3.0,4.0,7.0),Array(4.0,3.0,2.0,1.0,9.0),Array(6.0,7.0,8.0,9.0,16.0))
  val uu = Array(Array(1.0),Array(2.0),Array(3.0))
  val v = Array(Array(-1.0),Array(-2.0),Array(-3.0),Array(4.0),Array(7.0))
  val w = Array(Array(49.0),Array(-22.0),Array(-313.0),Array(47.0),Array(74.0),Array(1921.2),Array(1001.0))
  val x = Array(Array(2.5))
  val y = Array(Array(4.0))
  val z = Array(Array(2.0,3.0,4.0))
  val a1 = Array(Array(1.0,2.1,3.1,2.3,2.1),Array(4.0,-1.2,2.3,4.2,1.2))
  val ang1 = Array(1.0,1.0)
  val ang2 = Array(1.0,-1.0)
  val ang3 = Array(-1.0,1.0)
  val ang4 = Array(1.0,0.0)
  val symm1 = Array(Array(2.0,1.0),Array(1.0,3.0))
  val symm2 = Array(Array(2.0,1.0,3.0),Array(1.0,4.0,5.0),Array(3.0,5.0,7.0))
  val symm3 = Array(Array(11.0,-5.0,2.0,4.0),Array(-5.0,3.0,9.0,7.0),Array(2.0,9.0,6.0,1.0),Array(4.0,7.0,1.0,16.0))
  val ex1 = Array(Array(1.0,1,1,2),Array(-1.0,0,2,-3),Array(2.0,4,8,5))
  val ex2 = Array(Array(1.0,0,0,0,2),Array(-2.0,1,-3,-2,-4),Array(0.0,5,-14,-9,0),Array(2.0,10,-28,-18,4))
  val ex3 = Array(Array(1.0,1,5,1,4),Array(2.0,-1,1,2,2),Array(3.0,0,6,0,-3))
  val newex1 = Array(Array(2.0,1.0,1.0),Array(4.0,-6.0,0.0),Array(-2.0,7.0,2.0))
  val newex2 = Array(Array(1.0,7,2,3,1),Array(5.0,1,3,2,1),Array(1.0,9,8,0,1))
  val newex3 = Array(Array(3.0,5,4),Array(1.0,2,3),Array(8.0,1,7))
  val newex4 = Array(Array(0.0,2,7,3),Array(1.0,2,5,6),Array(3.0,1,2,4),Array(1.0,2,8,1))
  val newex5 = Array(Array(1.0,2),Array(1.0,3),Array(1.0,4),Array(1.0,5),Array(1.0,7))
  val newex6 = Array(Array(1.0,2,3,4,5),Array(1.0,2,3,4,6),Array(1.0,2,3,4,7),Array(1.0,2,3,4,8))
  val inv1 = Array(Array(2.0,2),Array(2.0,0))
  val inv2 = Array(Array(1.0,2,3),Array(2.0,5,4),Array(1.0,-1,10))
  val noinv1 = Array(Array(1.0,2),Array(1.0,2))
  val noinv2 = Array(Array(2.0,1,-4),Array(-4.0,-1,6),Array(-2.0,2,-2))
  val noinv3 = Array(Array(1.0,-1,2),Array(3.0,1,2),Array(2.0,3,-1))
  val rnk1 = Array(Array(1.0,1,1),Array(2.0,0,4),Array(3.0,2,4),Array(0.0,5,-5))
  val rnk2 = Array(Array(1.0,-2,3,4,5),Array(2.0,-3,4,5,6),Array(-1.0,0,1,2,3))
  val rnk3 = Array(Array(3.0,-1,-2,3,-1),Array(4.0,1,2,5,4),Array(7.0,10,10,2,-3),Array(2.0,-3,-6,1,-6),Array(3.0,9,8,-3,-7))
  val rnk4 = Array(Array(0.0,0,0,1),Array(0.0,0,0,0),Array(0.0,0,0,0),Array(0.0,0,0,0),Array(0.0,0,0,0),Array(0.0,0,0,0),Array(0.0,0,0,0))
  val plu1 = Array(Array(2.0,1,3),Array(4.0,-1,3),Array(-2.0,5,5))
  val plu2 = Array(Array(1.0,1,1),Array(2.0,2,5),Array(4.0,6,8))
  val plu3 = Array(Array(0.0,1,0),Array(-8.0,8,1),Array(2.0,-2,0))
  val plu4 = Array(Array(1.0,1,1),Array(4.0,3,-1),Array(3.0,5,3))
  val plu5 = Array(Array(1.0,4,7),Array(2.0,5,8),Array(3.0,6,10))
  val plu6 = Array(Array(2.0,1,4),Array(4.0,2,1),Array(4.0,1,5))
  val det1 = Array(Array(3.0,4,6,8),Array(1.0,2,3,4),Array(7.0,2,3,5),Array(9.0,1,6,7))
  val det2 = Array(Array(1.0,2),Array(-1.0,3))
  val det3 = Array(Array(1.0,-1,2),Array(2.0,3,-3),Array(4.0,5,1))
  val det4 = Array(Array(1.0,-1,2),Array(3.0,6,-1),Array(4.0,5,1))
  val det5 = Array(Array(3.0,2,1),Array(2.0,1,-3),Array(4.0,0,1))
  val det6 = Array(Array(2.0,1,-2,0),Array(0.0,3,2,1),Array(0.0,2,1,-3),Array(0.0,4,0,1))
  val det7 = Array(Array(2.0,1,2,1),Array(0.0,3,2,1),Array(0.0,0,4,3),Array(0.0,0,0,1))
  val sys1 = (Array(Array(1.0,1,1),Array(2.0,3,5),Array(4.0,0,5)),Array(5.0,8,2))
  val sys2 = (Array(Array(1.0,2),Array(2.0,-1)),Array(1.0,7))
  val sys3 = (Array(Array(2.0,1,-1),Array(1.0,0,5),Array(-1.0,3,-2)),Array(3.0,6,3))
  val sys4 = (Array(Array(-3.0,-4),Array(4.0,6),Array(1.0,1)),Array(-1.0,-2,0))
  val sys5 = (Array(Array(-3.0,4,1),Array(-4.0,6,1)),Array(1.0,2))
  val sys6 = (Array(Array(-1.0,1,1),Array(3.0,-1,0),Array(2.0,-4,-5)),Array(0.0,0,0))
  val sys7 = (Array(Array(1.0,-2,3),Array(-3.0,6,-9)),Array(0.0,0))
  val sys8 = (Array(Array(1.0,3,10),Array(-2.0,7,32),Array(-1.0,3,14),Array(1.0,1,2)),Array(18.0,29,12,8))
  val sys9 = (Array(Array(3.0,-2,16,-2),Array(-1.0,5,-14,18),Array(3.0,-1,14,2)),Array(-7.0,29,1))
  val sys10 = (Array(Array(1.0,2,-3),Array(2.0,-1,1),Array(4.0,-1,1)),Array(9.0,0,4))
  val sys11 = (Array(Array(2.0,1,-1,-1,2),Array(0.0,1,-2,1,1),Array(0.0,0,1,2,-1)),Array(3.0,-1,2))
  val sys12 = (Array(Array(1.0,-2,-1),Array(2.0,1,3),Array(-3.0,1,-2)),Array(-2.0,1,1))
  val sys13 = (Array(Array(3.0,2,1),Array(2.0,-1,4)),Array(-1.0,5))
  val sys14 = (Array(Array(1.0,1,1,1),Array(1.0,0,1,1),Array(1.0,0,1,0)),Array(6.0,4,2))
  val sys15 = (plu5,Array(2.0,1,3))
  val sys16 = (plu6,Array(7.0,7,10))
  val sys17 = (ex1,Array(0.0,0,0))
  val sys18 = (ex2,Array(0.0,0,0,0))
  val sys19 = (ex3,Array(0.0,0,0))
  val sys20 = (Array(Array(0.0,4,8),Array(1.0,2,3),Array(2.0,5,9)),Array(10.0,11,12))
  val linind1 = Array(Array(1.0,-8,12),Array(2.0,-1,3),Array(5.0,0,4))
  val linind2 = Array(Array(4.0,2,3),Array(2.0,0,0),Array(0.0,0,9))
  val linind3 = Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))
  val linind4 = Array(Array(1.0,0),Array(0.0,1),Array(2.0,3))
  val linind5 = Array(Array(1.0,1,1),Array(1.0,-1,3),Array(1.0,3,-1))
  val linind6 = Array(Array(1.0,2,3),Array(2.0,0,0),Array(0.0,3,0),Array(0.0,0,4))
  val linind7 = Array(Array(1.0,2,3),Array(1.0,0,0),Array(0.0,3,1),Array(0.0,1,4))
  val linind8 = Array(Array(9.0,5,-2,2),Array(3.0,0,0,0),Array(0.0,2,-4,0),Array(0.0,1,6,0),Array(0.0,0,0,4))
  val linind9 = Array(Array(1.0,3,-1),Array(3.0,7,-7),Array(1.0,2,-3))
  val linind10 = Array(Array(1.0,4,5),Array(1.0,1,0),Array(3.0,6,8))
  val linind11 = Array(Array(1.0,2),Array(3.0,7),Array(1.0,4))
  val linind12 = Array(Array(2.0,3,2),Array(4.0,7,3),Array(4.0,9,1))
  val linind13 = Array(Array(1.0,2),Array(2.0,4))
  val linind14 = Array(Array(1.0,0),Array(0.0,1))
  val linind15 = Array(Array(1.0,1),Array(2.0,1))
  val linind16 = Array(Array(1.0,2,3),Array(0.0,0,1),Array(0.0,0,2))
  val linind17 = Array(Array(1.0,2,-1),Array(2.0,-1,1),Array(8.0,1,1))
  val linind18 = Array(Array(1.0,2,3),Array(-1.0,1,4))
  val linind19 = Array(Array(1.0,3,-1,0),Array(2.0,9,-1,3),Array(4.0,5,6,11),Array(1.0,-1,2,5),Array(3.0,-2,6,7))
  val linind20 = Array(Array(1.0,4,1,7),Array(3.0,-5,2,3),Array(2.0,-1,6,9),Array(-2.0,3,1,6))
  val linind21 = Array(Array(1.0,-1,2,3),Array(2.0,-1,1,-1),Array(-1.0,1,1,1))
  val linind22 = Array(Array(2.0,-1,0,1),Array(1.0,0,-1,2),Array(0.0,3,1,2),Array(-1.0,1,2,1))
  val (orth11,orth12) = (Array(6.0,1,4),Array(2.0,0,-3))
  val (orth21,orth22) = (Array(0.0,0,-1),Array(1.0,1,1))
  val (orth31,orth32) = (Array(-6.0,0,4),Array(3.0,1,6))
  val (orth41,orth42) = (Array(2.0,4,-8),Array(5.0,3,7))
  val (orth51,orth52) = (Array(2.0,3),Array(5.0,-7))
  val (orth61,orth62) = (Array(-6.0,-2),Array(4.0,0))
  val (orth71,orth72) = (Array(1.0,-5,4),Array(3.0,3,3))
  val (orth81,orth82) = (Array(-2.0,2,3),Array(1.0,7,-4))
  val ex1set = (Array(Array(1.0,1,1)),Array(Array(1.0,1,-2)))
  val ex2set = (Array(orth11,orth12),Array(orth21,orth22))
  val ex3set = (Array(Array(1.0,2,5,4),Array(3.0,7,3,12)),Array(Array(-29.0,12,1,0),Array(-4.0,0,0,1)))
  val ex4set = (Array(Array(1.0,2,5,4),Array(3.0,7,3,12)),Array(Array(-2.0,12,1,0),Array(-4.0,0,0,1)))
  val ex5set = (Array(Array(1.0,1,0,2),Array(2.0,0,1,1),Array(1.0,-1,1,-1)),Array(Array(-1.0,1,2,0),Array(-1.0,-3,0,2)))
  val ex6set = (Array(Array(1.0,0,1,0,2),Array(0.0,1,1,1,0),Array(1.0,1,1,1,1)),Array(Array(0.0,-1.0,0,1,0),Array(-1.0,1,-1,0,1)))
  val ex7set = (Array(Array(1.0,0,1,0,2),Array(0.0,1,1,1,0),Array(1.0,1,1,1,1)),Array(Array(0.0,-1.0,0,1,0),Array(-1.0,1,-1,0,1),Array(3.0,1,1,0,0)))
  val orths1 = Array(Array(1.0,1,1),Array(1.0,-2,1),Array(1.0,0,-1))
  val orths2 = Array(Array(1.0,1,1),Array(1.0,-2,1),Array(1.0,-1,-1))
  val orths3 = Array(Array(2.0,3),Array(3.0,2))
  val orths4 = Array(Array(-1.0,1),Array(1.0,1))
  val orths5 = Array(Array(-2.0,1,1),Array(1.0,0,2),Array(-2.0,-5,1))
  val orths6 = Array(Array(-3.0,4,-1),Array(1.0,2,5),Array(4.0,-3,0))
  val orths7 = Array(Array(2.0,3),Array(-3.0,2))
  val orths8 = Array(Array(1.0,-2),Array(-2.0,1))
  val orths9 = Array(Array(1.0,0,1),Array(1.0,1,1),Array(-1.0,0,1))
  val orths10 = Array(Array(2.0,-2,1),Array(2.0,1,-2),Array(1.0,2,2))
  val norms1 = Array(Array(1.0/Math.sqrt(3),1.0/Math.sqrt(3),1.0/Math.sqrt(3)),Array(1.0/Math.sqrt(6),-2.0/Math.sqrt(6),1.0/Math.sqrt(6)),Array(1.0/Math.sqrt(2),0.0,-1.0/Math.sqrt(2)))
  val norms2 = Array(Array(1.0,0),Array(0.0,2))
  val norms3 = Array(Array(1.0,0,1),Array(1.0,1,-1),Array(-1.0,0,1))
  val norms4 = Array(Array(1.0,0,0),Array(0.0,1.0/Math.sqrt(2),-1.0/Math.sqrt(2)),Array(0.0,1.0/Math.sqrt(2),1.0/Math.sqrt(2)))
  val norms5 = Array(Array(1.0,0,-1),Array(1.0,Math.sqrt(2),1),Array(1.0,-Math.sqrt(2),1))
  val norms6 = Array(Array(1.0/Math.sqrt(2),0,-1.0/Math.sqrt(2)),Array(0.5,Math.sqrt(2)/2,0.5),Array(0.5,-Math.sqrt(2)/2,0.5))
  val norms7 = Array(Array(1.0,0,0,0),Array(0.0,1,0,0),Array(0.0,0,1,0),Array(0.0,0,0,1))
  val norms8 = Array(Array(0.0,1,0,0),Array(0.0,0,1,0),Array(0.0,0,0,1),Array(1.0,0,0,0))
  val nrmv1 = Array(4.0,-3)
  val nrmv2 = Array(2.0,2,2)
  val nrmv3 = Array(1.0,2,1,3)
  val nrmv4 = Array(-5.0,12)
  val nrmv5 = Array(1.0,-1,2)
  val nrmv6 = Array(-2.0,3,3,-1)
  val grsch1 = Array(Array(1.0,-1,-1,1),Array(2.0,1,0,1),Array(2.0,2,1,2))
  val grsch2 = Array(Array(1.0,1,1),Array(-1.0,1,0),Array(1.0,2,1))
  val grsch3 = Array(Array(0.0,2,1,0),Array(1.0,-1,0,0),Array(1.0,2,0,-1),Array(1.0,0,0,1))
  val grsch4 = Array(Array(1.0,1,1),Array(1.0,1,0),Array(1.0,0,0))
  val grsch5 = Array(Array(1.0,1),Array(2.0,1))
  val grsch6 = Array(Array(0.0,1),Array(-1.0,3))
  val grsch7 = Array(Array(0.0,1),Array(-1.0,0))
  val grsch8 = Array(Array(2.0,2,2),Array(1.0,0,-1),Array(0.0,3,1))
  val grsch9 = Array(Array(1.0,-1,0),Array(0.0,1,0),Array(2.0,3,1))
  val rcnsp1 = Array(Array(1.0,2),Array(0.0,1),Array(3.0,2))
  val rcnsp2 = Array(Array(1.0,1,1,2),Array(-1.0,0,2,-3),Array(2.0,4,8,5))
  val rcnsp3 = Array(Array(1.0,0,0,0,2),Array(-2.0,1,-3,-2,-4),Array(0.0,5,-14,-9,0),Array(2.0,10,-28,-18,4))
  val rcnsp4 = Array(Array(3.0,4,0,7),Array(1.0,-5,2,-2),Array(-1.0,4,0,3),Array(1.0,-1,2,2))
  val rcnsp5 = Array(Array(1.0,2,0,3,1),Array(2.0,4,-1,5,4),Array(3.0,6,-1,8,5),Array(4.0,8,-1,12,8))
  val rcnsp6 = Array(Array(2.0,-1,0,1),Array(3.0,5,7,-1),Array(1.0,4,2,7))
  val rcnsp7 = Array(Array(5.0,-1))
  val rcnsp8 = Array(Array(5.0),Array(-1.0))
  val rcnsp9 = Array(Array(-1.0,2),Array(1.0,-2))
  val rcnsp10 = Array(Array(-1.0,2,0),Array(1.0,-2,1))
  val rcnsp11 = Array(Array(-1.0,2),Array(1.0,-2),Array(1.0,0))
  val rcnsp12 = Array(Array(1.0,-1,1),Array(0.0,0,1))
  val rcnsp13 = Array(Array(1.0,-1,0),Array(0.0,1,1),Array(2.0,3,5))
  val rcnsp14 = Array(Array(1.0,-1,0),Array(0.0,1,1),Array(2.0,3,5),Array(-1.0,0,-1))
  val rcnsp15 = Array(Array(1.0,-1,0),Array(0.0,1,1),Array(2.0,3,5),Array(-1.0,0,-1),Array(3.0,0,1))
  val lintr1 = Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,0))
  val lintr2 = Array(Array(1.0,0),Array(0.0,-1))
  val lintr3 = Array(Array(1.0,4,5,2),Array(2.0,1,3,0),Array(-1.0,3,2,2))
  val lintr4 = Array(Array(1.0,1,5,1,4),Array(2.0,-1,1,2,2),Array(3.0,0,6,0,-3))
  val lintr5 = Array(Array(1.0,3),Array(2.0,6),Array(3.0,9))
  val lintr6 = Array(Array(1.0,1,0),Array(0.0,1,-1),Array(1.0,0,1))
  val lintr7 = Array(Array(-1.0,2,1,-1),Array(1.0,3,2,-3),Array(2.0,1.0,-1,2),Array(4.0,-2,-2,6))
  val lintr8 = Array(Array(1.0,1,1,1),Array(1.0,2,1,2),Array(2.0,3,2,3))
  val lintr9 = Array(Array(1.0,0,0),Array(1.0,1,0))
  val lintr10 = Array(Array(1.0,2,-1,4),Array(2.0,4,3,5),Array(-1.0,-2,6,-7))
  val lintr11 = Array(Array(1.0,0),Array(1.0,1),Array(1.0,2))
  val lintr12 = Array(Array(1.0,1,0),Array(0.0,1,1))
  val lintr13 = Array(Array(0.0,0,1),Array(0.0,0,0),Array(1.0,1,0),Array(0.0,0,0))
  val lintr14 = Array(Array(1.0,0,-1),Array(1.0,2,-1),Array(1.0,0,-1))
  val qr1 = Array(Array(12.0,-51,4),Array(6.0,167,-68),Array(-4.0,24,-41))
  val qr2 = Array(Array(1.0,1,0),Array(1.0,0,1),Array(0.0,1,1))
  val qr3 = Array(Array(2.0,0,1),Array(-1.0,2,3),Array(1.0,0,2))
  val qr4 = Array(Array(1.0,-1,4),Array(1.0,4,-2),Array(1.0,4,2),Array(1.0,-1,0))
  val qr5 = Array(Array(2.0,-1,1),Array(1.0,3,-2),Array(0.0,1,-2))
  val eig1 = Array(Array(2.0,0),Array(0.0,5))
  val eig2 = Array(Array(3.0,0,0),Array(0.0,4,0),Array(0.0,0,7))
  val eig3 = Array(Array(5.0,1),Array(4.0,5))
  val eig4 = Array(Array(3.0,5),Array(3.0,1))
  val eig5 = Array(Array(0.0,1,2),Array(-4.0,1,4),Array(-5.0,1,7))
  val eig6 = Array(Array(4.0,1,6),Array(0.0,2,3),Array(0.0,0,9))
  val eig7 = Array(Array(3.0,1),Array(2.0,4))
  val eig8 = Array(Array(1.0,3),Array(4.0,5))
  val eig9 = Array(Array(2.0,6),Array(1.0,3))
  val eig10 = Array(Array(4.0,1,3),Array(1.0,3,1),Array(2.0,0,5))
  val eig11 = Array(Array(2.0,2),Array(1.0,3))
  val eig12 = Array(Array(3.0,4,2),Array(1.0,6,2),Array(1.0,4,4))
  val eig13 = Array(Array(2.0,1,3,4),Array(0.0,2,1,3),Array(2.0,1,6,5),Array(1.0,2,4,8))
  val eig14 = Array(Array(1.0,-3,3),Array(3.0,-5,3),Array(6.0,-6,4))
  
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
  
  test("Tests for changing the size of a matrix (fillM)"){
    val s1 = u.fillM(j,3,2)
	val s2 = u.fillM(j,3,6)
	val s3 = u.fillM(j,10,6)
	val s4 = u.fillM(n,4,3)
	assert(u.isEqualM(s1,Array(Array(3.9,4.2),Array(-1.3,-5.9),Array(3.0,2.1))) === true)
	assert(u.isEqualM(s2,Array(Array(3.9,4.2,1.9,3.1,-2.3,0.0),Array(-1.3,-5.9,2.4,-9.1,1.8,0.0),Array(3.0,2.1,-2.3,1.2,9.5,0.0))) === true)
	assert(u.isEqualM(s3,Array(Array(3.9,4.2,1.9,3.1,-2.3,0.0),Array(-1.3,-5.9,2.4,-9.1,1.8,0.0),Array(3.0,2.1,-2.3,1.2,9.5,0.0),Array(20.3,1.2,3.5,-2.9,-2.5,0.0),Array(1.4,1.8,-2.3,-1.9,21.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0))) === true)
	assert(u.isEqualM(s4,Array(Array(3.0,-2.0,0.0),Array(0.0,1.0,3.0),Array(1.0,-2.0,-3.0),Array(1.0,2.0,3.0))) === true)
	intercept[AssertionError]{u.fillM(a,-10,20)}
	intercept[AssertionError]{u.fillM(a,10,-20)}
	intercept[AssertionError]{u.fillM(a,0,20)}
	intercept[AssertionError]{u.fillM(a,10,0)}
  }
  
  test("Tests for changing the size of a vector (fillV)"){
    val s1 = u.fillV(c,9)
	val s2 = u.fillV(d,1)
	val s3 = u.fillV(r,4)
	val s4 = u.fillV(o,16)
	assert(u.isEqualV(s1,Array(1.0,2.0,3.0,0.0,0.0,0.0,0.0,0.0,0.0)) === true)
	assert(u.isEqualV(s2,Array(2.0)) === true)
	assert(u.isEqualV(s3,Array(1.0,-2.0,-3.0,4.0)) === true)
	assert(u.isEqualV(s4,Array(-1.0,2.0,9.0,1.0,29.0,-349,1.0,344.0,2.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0)) === true)
	intercept[AssertionError]{u.fillV(p,-10)}
	intercept[AssertionError]{u.fillV(q,0)}
  }
  
  test("Tests for multiplying 2 matrices (mulM)"){
    val s1 = u.mulM(a,e)
	assert(u.isEqualM(s1,Array(Array(9.3,15.6,38.1,20.3),Array(31.2,7.8,13.1,2.6),Array(15.0,16.2,35.1,19.6),Array(16.5,17.8,28.4,21.65))) === true)
	val s2 = u.mulM(e,a)
	assert(u.isEqualM(s2,Array(Array(28.1,-0.2,31.9),Array(28.1,-4.55,23.4),Array(41.5,6.15,50.3))) === true)
	val s3 = u.mulM(b,e)
	assert(u.isEqualM(s3,Array(Array(19.05,23.3,26.2,29.2),Array(5.1,14.8,55.5,20.1),Array(29.55,35.1,97.6,43.06),Array(20.7,37.2,106.3,48.65))) === true)
	val s4 = u.mulM(e,b)
	assert(u.isEqualM(s4,Array(Array(22.75,35.9,57.3),Array(5.3,26.75,81.9),Array(33.61,45.75,130.6))) === true)
    val s5 = u.mulM(f,g)
	assert(u.isEqualM(s5,Array(Array(-7.0,45.5),Array(7.0,-21.0))) === true)
	val s6 = u.mulM(g,f)
	assert(u.isEqualM(s6,Array(Array(6.0,-5.0),Array(6.5,-34.0))) === true)
	val s7 = u.mulM(e,h)
	assert(u.isEqualM(s7,Array(Array(81.61,7.14,24.65,-21.43),Array(83.37,-6.12,7.93,-32.07),Array(98.01,18.83,-0.66,-13.57))) === true)
	intercept[AssertionError]{u.mulM(h,e)}
	val s8 = u.mulM(e,i)
	assert(u.isEqualM(s8,Array(Array(18.58,25.11,-24.63,3.83),Array(11.94,24.29,4.18,-39.29),Array(26.81,40.88,1.13,-82.25))) === true)
	intercept[AssertionError]{u.mulM(i,e)}
	val s9 = u.mulM(j,k)
	assert(u.isEqualM(s9,Array(Array(15.43,22.88,-18.54,-4.97,24.83),Array(-15.22,-30.4,27.19,-34.64,-58.81),Array(25.75,37.54,-34.17,-0.81,51.46),Array(38.23,23.86,-70.46,32.89,36.89),Array(40.85,63.02,-39.01,-47.55,67.73))) === true)
	val s10 = u.mulM(k,j)
	assert(u.isEqualM(s10,Array(Array(69.62,2.44,20.78,-27.16,21.44),Array(-87.5,-25.3,4.01,-10.87,-46.7),Array(-175.54,-10.9,-32.57,9.07,81.64),Array(69.46,8.69,1.31,-43.4,165.17),Array(-53.42,-8.75,-5.35,-23.26,83.13))) === true)
	val s11 = u.mulM(l,m)
	assert(u.isEqualM(s11,m) === true)
	val s12 = u.mulM(m,l)
	assert(u.isEqualM(s12,m) === true)
	val s13 = u.mulM(a,s)
	assert(u.isEqualM(s13,Array(Array(19.0,31.0),Array(18.0,13.0),Array(20.0,29.0),Array(17.5,23.5))) === true)
	intercept[AssertionError]{u.mulM(s,a)}
	val s14 = u.mulM(a,t)
	assert(u.isEqualM(s14,Array(Array(28.0,28.0,31.0,33.0,73.0),Array(6.0,10.0,26.0,38.0,31.0),Array(26.0,26.0,32.0,36.0,71.0),Array(24.0,21.5,28.0,31.5,66.5))) === true)
	intercept[AssertionError]{u.mulM(t,a)}
	val l1 = Array.ofDim[Double](1012,1012)
	val l2 = Array.ofDim[Double](1012,1012)
	for(i <- 0 until 1012)
	  for(j <- 0 until 1012){
	    l1(i)(j)= i+j
		if(i==j) l2(i)(j)= 1.0
	  }
	val s15 = u.mulM(l1,l2)
	assert(u.isEqualM(s15,l1) === true)
	val s16 = u.mulM(l2,l1)
	assert(u.isEqualM(s16,l1) === true)
  }
  
  // Function to check if two real values are equal
  def eqDouble(x: Double,y: Double): Boolean = return(Math.abs(x-y)<1e-12)
  
  test("Tests for multiplying 2 vectors (mulV)"){
    val s1 = u.mulV(c,d)
    val s2 = u.mulV(o,p)
    val s3 = u.mulV(q,r)
	assert(eqDouble(s1,20.0) === true)
	assert(eqDouble(s2,9218.0) === true)
	assert(eqDouble(s3,1415.0) === true)
	intercept[AssertionError]{u.mulV(c,o)}
	intercept[AssertionError]{u.mulV(p,q)}
	intercept[AssertionError]{u.mulV(r,d)}
  }
  
  test("Tests for transforming a matrix into a vector (matrtovect)"){
    val s1 = u.matrtovect(uu)
    val s2 = u.matrtovect(v)
    val s3 = u.matrtovect(w)
	assert(u.isEqualV(s1,Array(1.0,2,3)) === true)
	assert(u.isEqualV(s2,Array(-1.0,-2,-3,4,7)) === true)
	assert(u.isEqualV(s3,Array(49.0,-22,-313,47,74,1921.2,1001)) === true)
	intercept[AssertionError]{u.matrtovect(a)}
	intercept[AssertionError]{u.matrtovect(f)}
	intercept[AssertionError]{u.matrtovect(m)}
  }
  
  test("Tests for transforming a vector intro a matrix (vecttomatr)"){
    val s1 = u.vecttomatr(c)
    val s2 = u.vecttomatr(o)
    val s3 = u.vecttomatr(r)
	assert(u.isEqualM(s1,Array(Array(1.0),Array(2.0),Array(3.0))) === true)
	assert(u.isEqualM(s2,Array(Array(-1.0),Array(2.0),Array(9.0),Array(1.0),Array(29.0),Array(-349.0),Array(1.0),Array(344.0),Array(2.0),Array(1.0))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0),Array(-2.0),Array(-3.0),Array(4.0),Array(5.0),Array(6.0),Array(7.0),Array(8.0),Array(9.0),Array(1.0),Array(2.0),Array(20.0),Array(11.0),Array(15.0),Array(13.0),Array(21.0),Array(0.0))) === true)
  }
  
  test("Tests for transforming a matrix into a value (matrtoval)"){
    val s1 = u.matrtoval(x)
	val s2 = u.matrtoval(y)
	assert(eqDouble(s1,2.5) === true)
	assert(eqDouble(s2,4.0) === true)
	val ss = u.mulM(z,uu)
	val s3 = u.matrtoval(ss)
	assert(eqDouble(s3,20.0))
	intercept[AssertionError]{u.matrtoval(a)}
	intercept[AssertionError]{u.matrtoval(uu)}
	intercept[AssertionError]{u.matrtoval(z)}
  }
  
  test("Tests for multiplying a matrix by a vector (mulMV)"){
    val s1 = u.mulMV(a,c)
    val s2 = u.mulMV(a,d)
    val s3 = u.mulMV(b,c)
    val s4 = u.mulMV(b,d)
    val s5 = u.mulMV(n,o)
    val s6 = u.mulMV(n,p)
	assert(u.isEqualV(s1,Array(14.0,3.0,13.0,12.0)) === true)
	assert(u.isEqualV(s2,Array(20.0,5.0,19.0,18.5)) === true)
	assert(u.isEqualV(s3,Array(13.5,18.0,33.3,37.0)) === true)
	assert(u.isEqualV(s4,Array(22.0,24.0,46.6,51.5)) === true)
	assert(u.isEqualV(s5,Array(721.0,203.0,-257.0,634.0,872.0,-584.0,3430.0,776.0,-790.0,-653.0)) === true)
	assert(u.isEqualV(s6,Array(2354.0,998.0,4726.0,653.0,4058.0,240.0,-8446.0,-1725.0,1393.0,-4494.0)) === true)
  }
  
  test("Tests for copying a matrix (copyM)"){
    val s1 = u.copyM(a)
    val s2 = u.copyM(b)
    val s3 = u.copyM(h)
    val s4 = u.copyM(m)
	val s5 = u.copyM(f)
	val s6 = u.copyM(g)
    assert(u.isEqualM(s1,a) === true)
    assert(u.isEqualM(s2,b) === true)
    assert(u.isEqualM(s3,h) === true)
    assert(u.isEqualM(s4,m) === true)
    assert(u.isEqualM(s5,Array(Array(2.0,3.0),Array(1.0,-2.0))) === true)
    assert(u.isEqualM(s6,Array(Array(1.0,4.0),Array(-3.0,12.5))) === true)
  }
  
  test("Tests for copying a vector (copyV)"){
    val s1 = u.copyV(c)
    val s2 = u.copyV(d)
    val s3 = u.copyV(o)
    val s4 = u.copyV(p)
    val s5 = u.copyV(q)
    val s6 = u.copyV(r)
	assert(u.isEqualV(s1,Array(1.0,2.0,3.0)) === true)
	assert(u.isEqualV(s2,Array(2.0,3.0,4.0)) === true)
	assert(u.isEqualV(s3,o) === true)
	assert(u.isEqualV(s4,p) === true)
	assert(u.isEqualV(s5,q) === true)
	assert(u.isEqualV(s6,r) === true)
  }
  
  test("Tests for generating an identity matrix (genId)"){
    val s1 = u.genId(2)
    val s2 = u.genId(4)
    val s3 = u.genId(6)
    val s4 = u.genId(8)
    val s5 = u.genId(10)
	assert(u.isEqualM(s1,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s2,Array(Array(1.0,0,0,0),Array(0.0,1,0,0),Array(0.0,0,1.0,0),Array(0.0,0,0,1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,0,0,0,0,0),Array(0.0,1,0,0,0,0),Array(0.0,0,1.0,0,0,0),Array(0.0,0,0,1,0,0),Array(0.0,0,0,0,1,0),Array(0.0,0,0,0,0,1))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,0,0,0,0,0,0,0),Array(0.0,1,0,0,0,0,0,0),Array(0.0,0,1.0,0,0,0,0,0),Array(0.0,0,0,1,0,0,0,0),Array(0.0,0,0,0,1,0,0,0),Array(0.0,0,0,0,0,1,0,0),Array(0.0,0,0,0,0,0,1,0),Array(0.0,0,0,0,0,0,0,1))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0,0,0,0,0,0,0,0,0,0),Array(0.0,1,0,0,0,0,0,0,0,0),Array(0.0,0,1.0,0,0,0,0,0,0,0),Array(0.0,0,0,1,0,0,0,0,0,0),Array(0.0,0,0,0,1,0,0,0,0,0),Array(0.0,0,0,0,0,1,0,0,0,0),Array(0.0,0,0,0,0,0,1,0,0,0),Array(0.0,0,0,0,0,0,0,1,0,0),Array(0.0,0,0,0,0,0,0,0,1,0),Array(0.0,0,0,0,0,0,0,0,0,1))) === true)
	intercept[AssertionError]{u.genId(0)}
	intercept[AssertionError]{u.genId(-4)}
  }
  
  test("Tests for exponentiating a square matrix (expM)"){
	val s1 = u.expM(f,2)
	assert(u.isEqualM(s1,Array(Array(7.0,0),Array(0.0,7))) === true)
	val s2 = u.expM(f,10)
	assert(u.isEqualM(s2,Array(Array(16807.0,0),Array(0.0,16807))) === true)
	val s3 = u.expM(g,3)
	assert(u.isEqualM(s3,Array(Array(-173.0,631),Array(-473.25,1641.125))) === true)
	val s4 = u.expM(g,8)
	assert(u.isEqualM(s4,Array(Array(-34563059.1875,119121952.21875),Array(-89341464.1640625,307912553.44140625))) === true)
	val s5 = u.expM(h,3)
	assert(u.isEqualM(s5,Array(Array(-288.163, 344.196, -22.805, 373.257), Array(727.541, -891.863, 124.416, -1049.557), Array(-157.914, 152.991, -60.119, 181.692), Array(1388.907, -234.918, 425.171, -815.509))) === true)
	val s6 = u.expM(l,1000000000)
	assert(u.isEqualM(s6,l) === true)
	val s7 = u.expM(n,8)
	assert(u.isEqualM(s7,Array(Array(-2.408532343677E12, -4.10998527663E12, 4.295812055082E12, -7.385326446117E12, -1.1729871701717E13, -1.7926723424892E13, 1.64103080590419E14, -8.654993684E10, 4.136120198469E12, -5.27864550099E11),
	                           Array(-1.351817341383E12, -2.307769067927E12, 2.416627694815E12, -4.148458308842E12, -6.586937397397E12, -1.0068894282403E13, 9.2199656024206E13, -4.6143264277E10, 2.326065034202E12, -2.92407925016E11),
							   Array(-1.155836400101E12, -1.973056713534E12, 2.066329602029E12, -3.546773234854E12, -5.63187376767E12, -8.609010081803E12, 7.8830307267511E13, -3.9666714496E10, 1.988472632937E12, -2.50190748505E11),
							   Array(9.40318744321E11, 1.604608190004E12, -1.676627975819E12, 2.883253123157E12, 4.579236957761E12, 6.998278635454E12, -6.4062083094989E13, 3.3776595666E10, -1.614835232435E12, 2.06294311229E11),
							   Array(-6.081713708837E12, -1.0378932184101E13, 1.0852838031114E13, -1.86518292814E13, -2.9622020468296E13, -4.5273495446228E13, 4.14467615136651E14, -2.15943389859E11, 1.0448976680086E13, -1.32918559032E12),
							   Array(-5.947445059302E12, -1.0149172445188E13, 1.0608752587542E13, -1.8237727179889E13, -2.8965401520102E13, -4.4268310083781E13, 4.05245306988731E14, -2.12787873472E11, 1.0215294590099E13, -1.302730416493E12),
							   Array(-6.8303375623909E13, -1.16544782241397E14, 1.21757215019479E14, -2.09405610422865E14, -3.32604187140231E14, -5.08296009717364E14, 4.65271490584225E15, -2.475696185068E12, 1.17258096987961E14, -1.5015382850349E13),
							   Array(-5.050734966254E12, -8.619695615401E12, 9.013883793922E12, -1.5490674353647E13, -2.4600948444552E13, -3.7599828741262E13, 3.44224470675498E14, -1.78545139756E11, 8.678999649308E12, -1.103352211671E12),
							   Array(1.234086277739E12, 2.104592319105E12, -2.193817618586E12, 3.779816811757E12, 6.005628145001E12, 9.175721742068E12, -8.3961243852626E13, 4.722271333E10, -2.113701137243E12, 2.7564362175E11),
							   Array(2.655746157291E12, 4.532268551824E12, -4.740347678373E12, 8.145299181241E12, 1.2935672475005E13, 1.9771144646104E13, -1.81006134966953E14, 9.3761484224E10, -4.563888321013E12, 5.80000367914E11))) === true)
	intercept[AssertionError]{u.expM(f,-1)}
	intercept[AssertionError]{u.expM(f,0)}
	intercept[AssertionError]{u.expM(a,7)}
  }
  
  test("Tests for transposing a matrix (transposeM)"){
    val s1 = u.transposeM(a)
    val s2 = u.transposeM(e)
    val s3 = u.transposeM(v)
    val s4 = u.transposeM(a1)
    assert(u.isEqualM(s1,Array(Array(1.0,4,2,3),Array(2.0,-5,1,1.5),Array(3.0,3,3,2))) === true)
	assert(u.isEqualM(s2,Array(Array(4.5,-1.2,2.4),Array(3,2.4,2.6),Array(1.0,4,9.7),Array(3.2,3.9,3.1))) === true)
	assert(u.isEqualM(s3,Array(Array(-1.0,-2,-3,4,7))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,4),Array(2.1,-1.2),Array(3.1,2.3),Array(2.3,4.2),Array(2.1,1.2))) === true)
  }
  
  test("Tests for transposing a vector (transposeV)"){
    val s1 = u.transposeV(d)
    val s2 = u.transposeV(o)
    val s3 = u.transposeV(r)
	assert(u.isEqualM(s1,Array(Array(2.0,3,4))) === true)
	assert(u.isEqualM(s2,Array(Array(-1.0,2,9,1,29,-349,1,344,2,1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,-2,-3,4,5,6,7,8,9,1,2,20,11,15,13,21,0))) === true)
  }
  
  test("Tests for computing the length of a vector (lengthV)"){
    val s1 = u.lengthV(c)
    val s2 = u.lengthV(d)
    val s3 = u.lengthV(o)
    val s4 = u.lengthV(p)
    val s5 = u.lengthV(q)
    val s6 = u.lengthV(r)
	assert(eqDouble(s1,Math.sqrt(14)) === true)
	assert(eqDouble(s2,Math.sqrt(29)) === true)
	assert(eqDouble(s3,Math.sqrt(241071)) === true)
	assert(eqDouble(s4,Math.sqrt(307735)) === true)
	assert(eqDouble(s5,Math.sqrt(1496)) === true)
	assert(eqDouble(s6,Math.sqrt(1646)) === true)
  }
  
  test("Tests for computing the angle between 2 vectors (angleV)"){
    val s1 = u.angleV(ang1,ang2)
    val s2 = u.angleV(ang1,ang3)
    val s3 = u.angleV(ang1,ang4)
    val s4 = u.angleV(c,d)
    val s5 = u.angleV(o,p)
    val s6 = u.angleV(q,r)
    assert(eqDouble(s1,90.0) === true)
    assert(eqDouble(s2,90.0) === true)
    assert(eqDouble(s3,45.0) === true)
    assert(eqDouble(s4,6.9824972879186674) === true)
    assert(eqDouble(s5,88.0605376846545927) === true)
    assert(eqDouble(s6,25.6138095871836455) === true)
	intercept[AssertionError]{u.angleV(ang1,c)}
	intercept[AssertionError]{u.angleV(d,o)}
	intercept[AssertionError]{u.angleV(p,q)}
	intercept[AssertionError]{u.angleV(r,ang1)}
  }
  
  test("Tests for checking if a square matrix is symmetric (isSymmetric)"){
    val s1 = u.isSymmetric(symm1)
    val s2 = u.isSymmetric(symm2)
    val s3 = u.isSymmetric(symm3)
    val s4 = u.isSymmetric(l)
    val s5 = u.isSymmetric(f)
    val s6 = u.isSymmetric(j)
    val s7 = u.isSymmetric(m)
    val s8 = u.isSymmetric(n)
	assert(s1 === true)
	assert(s2 === true)
	assert(s3 === true)
	assert(s4 === true)
	assert(s5 === false)
	assert(s6 === false)
	assert(s7 === false)
	assert(s8 === false)
	intercept[AssertionError]{u.isSymmetric(a)}
	intercept[AssertionError]{u.isSymmetric(s)}
	intercept[AssertionError]{u.isSymmetric(z)}
	intercept[AssertionError]{u.isSymmetric(a1)}
  }
  
  test("Tests for adding a multiple of one row of a matrix to another row of that matrix (elOpAdd)"){
    val cp1 = u.copyM(b)
	u.elOpAdd(cp1,1,2,1.0)
	assert(u.isEqualM(cp1,Array(Array(4.5,3.0,1.0),Array(3.5,5.0,6.0),Array(2.3,2.0,9.0),Array(1.0,4.5,9.0))) === true)
	u.elOpAdd(cp1,1,3,-2.0)
	assert(u.isEqualM(cp1,Array(Array(4.5,3.0,1.0),Array(3.5,5.0,6.0),Array(-6.7,-4.0,7.0),Array(1.0,4.5,9.0))) === true)
	u.elOpAdd(cp1,1,4,-1.5)
	assert(u.isEqualM(cp1,Array(Array(4.5,3.0,1.0),Array(3.5,5.0,6.0),Array(-6.7,-4.0,7.0),Array(-5.75,0,7.5))) === true)
	intercept[AssertionError]{u.elOpAdd(cp1,2,2,-9.0)} // same row
    val cp2 = u.copyM(e)
	u.elOpAdd(cp2,2,1,2.0)
	u.elOpAdd(cp2,3,2,4.0)
	assert(u.isEqualM(cp2,Array(Array(2.1,7.8,9.0,11.0),Array(8.4,12.8,42.8,16.3),Array(2.4,2.6,9.7,3.1))) === true)
	intercept[AssertionError]{u.elOpAdd(cp2,0,2,-9.0)} // rows indexed from 1
	intercept[AssertionError]{u.elOpAdd(cp2,4,2,8.0)}  // rows indexed until cpy2.size
    val cp3 = u.copyM(k)
	u.elOpAdd(cp3,5,1,-1.0)
	u.elOpAdd(cp3,5,2,-1.0)
	u.elOpAdd(cp3,5,3,-1.0)
	u.elOpAdd(cp3,5,4,-1.0)
	assert(u.isEqualM(cp3,Array(Array(0.0,-1.8,-2.7,6.4,-0.8),Array(-0.8,0.1,0.2,-1.1,-6.5),Array(-0.5,-0.8,3.3,-6.3,-2.3),Array(-0.6,-0.8,0.0,5.8,4.6),Array(2.0,3.1,-1.4,-2.9,4.2))) === true)
	intercept[AssertionError]{u.elOpAdd(cp3,1,0,11.0)} // rows indexed from 1
	intercept[AssertionError]{u.elOpAdd(cp3,1,6,2.0)}  // rows indexed until cpy3.size
    val cp4 = u.copyM(m)
	u.elOpAdd(cp4,4,1,44.2)
	u.elOpAdd(cp4,3,2,16.2)
	u.elOpAdd(cp4,2,3,-2.1)
	assert(u.isEqualM(cp4,Array(Array(133.8,86.1,45.51,-436.18),Array(330.25,32.1,163.49,-26.88),Array(-673.325,-65.31,-333.329,54.548),Array(3.0,2.0,1.0,-9.9))) === true)
	intercept[AssertionError]{u.elOpAdd(cp4,-2,2,3.0)} // rows indexed from 1
    val cp5 = u.copyM(t)
	u.elOpAdd(cp5,1,2,2.0)
	u.elOpAdd(cp5,2,3,2.0)
	u.elOpAdd(cp5,3,1,2.0)
	assert(u.isEqualM(cp5,Array(Array(46.0,35.0,51.0,58.0,131.0),Array(8.0,5.0,8.0,9.0,23.0),Array(22.0,17.0,24.0,27.0,62.0))) === true)
	intercept[AssertionError]{u.elOpAdd(cp5,2,-2,6.0)} // rwos indexed from 1
  }
  
  test("Tests for switching two rows of a matrix (elOpSwitch)"){
    val cp1 = u.copyM(b)
	u.elOpSwitch(cp1,1,2)
	assert(u.isEqualM(cp1,Array(Array(-1.0,2.0,5.0),Array(4.5,3.0,1.0),Array(2.3,2.0,9.0),Array(1.0,4.5,9.0))) === true)
	u.elOpSwitch(cp1,3,2)
	assert(u.isEqualM(cp1,Array(Array(-1.0,2.0,5.0),Array(2.3,2.0,9.0),Array(4.5,3.0,1.0),Array(1.0,4.5,9.0))) === true)
	u.elOpSwitch(cp1,1,4)
	assert(u.isEqualM(cp1,Array(Array(1.0,4.5,9.0),Array(2.3,2.0,9.0),Array(4.5,3.0,1.0),Array(-1.0,2.0,5.0))) === true)
	intercept[AssertionError]{u.elOpSwitch(cp1,2,2)} // same row
    val cp2 = u.copyM(e)
	u.elOpSwitch(cp2,1,2)
	u.elOpSwitch(cp2,2,3)
	u.elOpSwitch(cp2,3,2)
	assert(u.isEqualM(cp2,Array(Array(-1.2,2.4,4.0,3.9),Array(4.5,3.0,1.0,3.2),Array(2.4,2.6,9.7,3.1))) === true)
	intercept[AssertionError]{u.elOpSwitch(cp2,0,2)} // rows indexed from 1
	intercept[AssertionError]{u.elOpSwitch(cp2,4,2)}  // rows indexed until cpy2.size
    val cp3 = u.copyM(k)
	u.elOpSwitch(cp3,2,4)
	u.elOpSwitch(cp3,3,1)
	u.elOpSwitch(cp3,3,5)
	assert(u.isEqualM(cp3,Array(Array(1.5,2.3,1.9,-9.2,1.9),Array(1.4,2.3,-1.4,2.9,8.8),Array(2.0,3.1,-1.4,-2.9,4.2),Array(1.2,3.2,-1.2,-4.0,-2.3),Array(2.0,1.3,-4.1,3.5,3.4))) === true)
	intercept[AssertionError]{u.elOpSwitch(cp3,1,0)} // rows indexed from 1
	intercept[AssertionError]{u.elOpSwitch(cp3,1,6)}  // rows indexed until cpy3.size
    val cp4 = u.copyM(m)
	u.elOpSwitch(cp4,1,3)
	u.elOpSwitch(cp4,3,2)
	u.elOpSwitch(cp4,4,1)
	assert(u.isEqualM(cp4,Array(Array(3.0,2.0,1.0,-9.9),Array(1.2,-2.3,1.31,1.4),Array(3.01,-1.92,1.49,3.9),Array(20.2,2.1,10.0,-1.9))) === true)
	intercept[AssertionError]{u.elOpSwitch(cp4,-2,2)} // rows indexed from 1
    val cp5 = u.copyM(t)
	u.elOpSwitch(cp5,1,2)
	u.elOpSwitch(cp5,1,2)
	u.elOpSwitch(cp5,1,2)
	u.elOpSwitch(cp5,2,3)
	u.elOpSwitch(cp5,1,3)
	u.elOpSwitch(cp5,3,1)
	assert(u.isEqualM(cp5,Array(Array(4.0,3.0,2.0,1.0,9.0),Array(6.0,7.0,8.0,9.0,16.0),Array(2.0,1.0,3.0,4.0,7.0))) === true)
	intercept[AssertionError]{u.elOpSwitch(cp5,2,-2)} // rwos indexed from 1
  }
  
  test("Tests for multiplying a row of a matrix by a constant (elOpMul)"){
    val cp1 = u.copyM(b)
	u.elOpMul(cp1,1,2.0)
	assert(u.isEqualM(cp1,Array(Array(9.0,6.0,2.0),Array(-1.0,2.0,5.0),Array(2.3,2.0,9.0),Array(1.0,4.5,9.0))) === true)
	u.elOpMul(cp1,2,-1.0)
	assert(u.isEqualM(cp1,Array(Array(9.0,6.0,2.0),Array(1.0,-2.0,-5.0),Array(2.3,2.0,9.0),Array(1.0,4.5,9.0))) === true)
	u.elOpMul(cp1,3,3.0)
	assert(u.isEqualM(cp1,Array(Array(9.0,6.0,2.0),Array(1.0,-2.0,-5.0),Array(6.9,6.0,27.0),Array(1.0,4.5,9.0))) === true)
	u.elOpMul(cp1,4,-2.0)
	assert(u.isEqualM(cp1,Array(Array(9.0,6.0,2.0),Array(1.0,-2.0,-5.0),Array(6.9,6.0,27.0),Array(-2.0,-9.0,-18.0))) === true)
    val cp2 = u.copyM(e)
	u.elOpMul(cp2,1,2.0)
	u.elOpMul(cp2,1,5.0)
	u.elOpMul(cp2,2,-4.0)
	u.elOpMul(cp2,3,20.0)
	assert(u.isEqualM(cp2,Array(Array(45.0,30.0,10.0,32.0),Array(4.8,-9.6,-16.0,-15.6),Array(48.0,52.0,194.0,62.0))) === true)
	intercept[AssertionError]{u.elOpMul(cp2,0,-9.0)} // rows indexed from 1
	intercept[AssertionError]{u.elOpMul(cp2,4,8.0)}  // rows indexed until cpy2.size
		val cp3 = u.copyM(k)
		u.elOpMul(cp3,5,-1.2)
		u.elOpMul(cp3,4,2.3)
		u.elOpMul(cp3,3,11.4)
		u.elOpMul(cp3,2,-19.5)
		u.elOpMul(cp3,1,12.6)
	assert(u.isEqualM(cp3,Array(Array(25.2,16.38,-51.66,44.1,42.84),Array(-23.4,-62.4,23.4,78.0,44.85),Array(17.1,26.22,21.66,-104.88,21.66),Array(3.22,5.29,-3.22,6.67,20.24),Array(-2.4,-3.72,1.68,3.48,-5.04))) === true)
    val cp4 = u.copyM(m)
	u.elOpMul(cp4,1,13.8)
	u.elOpMul(cp4,2,-2.7)
	u.elOpMul(cp4,3,1.6)
	u.elOpMul(cp4,4,0.5)
	assert(u.isEqualM(cp4,Array(Array(16.56,-31.74,18.078,19.32),Array(-8.127,5.184,-4.023,-10.53),Array(32.32,3.36,16.0,-3.04),Array(1.5,1.0,0.5,-4.95))) === true)
	intercept[AssertionError]{u.elOpMul(cp4,-2,3.0)} // rows indexed from 1
    val cp5 = u.copyM(t)
	u.elOpMul(cp5,1,-0.4)
	u.elOpMul(cp5,2,-1.3)
	u.elOpMul(cp5,3,-2.2)
	assert(u.isEqualM(cp5,Array(Array(-0.8,-0.4,-1.2,-1.6,-2.8),Array(-5.2,-3.9,-2.6,-1.3,-11.7),Array(-13.2,-15.4,-17.6,-19.8,-35.2))) === true)
  }
  
  test("Tests for creating an elementary matrix for addition of rows (elMAdd)"){
    val gen1 = u.elMAdd(2,1,2,3.0)
	assert(u.isEqualM(gen1,Array(Array(1.0,0.0),Array(3.0,1.0))) === true)
    val gen2 = u.elMAdd(3,2,3,1.0)
	assert(u.isEqualM(gen2,Array(Array(1.0,0.0,0.0),Array(0.0,1.0,0.0),Array(0.0,1.0,1.0))) === true)
    val gen3 = u.elMAdd(4,3,2,-1.5)
	assert(u.isEqualM(gen3,Array(Array(1.0,0.0,0.0,0.0),Array(0.0,1.0,-1.5,0.0),Array(0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,1.0))) === true)
    val gen4 = u.elMAdd(4,2,3,2.4)
	assert(u.isEqualM(gen4,Array(Array(1.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0),Array(0.0,2.4,1.0,0.0),Array(0.0,0.0,0.0,1.0))) === true)
    val gen5 = u.elMAdd(5,5,4,1.3)
	assert(u.isEqualM(gen5,Array(Array(1.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,1.3),Array(0.0,0.0,0.0,0.0,1.0))) === true)
    val gen6 = u.elMAdd(5,1,3,-7.2)
	assert(u.isEqualM(gen6,Array(Array(1.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0),Array(-7.2,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,1.0))) === true)
    val gen7 = u.elMAdd(6,4,2,0.7)
	assert(u.isEqualM(gen7,Array(Array(1.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.7,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,1.0))) === true)
    val gen8 = u.elMAdd(7,7,1,-0.4)
	assert(u.isEqualM(gen8,Array(Array(1.0,0.0,0.0,0.0,0.0,0.0,-0.4),Array(0.0,1.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0,1.0))) === true)
	intercept[AssertionError]{u.elMAdd(7,0,2,1.0)}
	intercept[AssertionError]{u.elMAdd(7,8,2,2.0)}
	intercept[AssertionError]{u.elMAdd(7,-1,2,3.0)}
	intercept[AssertionError]{u.elMAdd(7,1,8,4.0)}
	intercept[AssertionError]{u.elMAdd(7,1,0,5.0)}
	intercept[AssertionError]{u.elMAdd(7,1,-1,6.0)}
	intercept[AssertionError]{u.elMAdd(7,2,2,7.0)}
  }
  
  test("Tests for creating an elementary matrix for switching of rows (elMSwitch)"){
    val gen1 = u.elMSwitch(2,1,2)
	assert(u.isEqualM(gen1,Array(Array(0.0,1.0),Array(1.0,0.0))) === true)
    val gen2 = u.elMSwitch(3,2,3)
	assert(u.isEqualM(gen2,Array(Array(1.0,0.0,0.0),Array(0.0,0.0,1.0),Array(0.0,1.0,0.0))) === true)
    val gen3 = u.elMSwitch(4,3,2)
	assert(u.isEqualM(gen3,Array(Array(1.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0),Array(0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,1.0))) === true)
    val gen4 = u.elMSwitch(4,2,3)
	assert(u.isEqualM(gen4,Array(Array(1.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0),Array(0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,1.0))) === true)
    val gen5 = u.elMSwitch(5,5,4)
	assert(u.isEqualM(gen5,Array(Array(1.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0),Array(0.0,0.0,0.0,1.0,0.0))) === true)
    val gen6 = u.elMSwitch(5,1,3)
	assert(u.isEqualM(gen6,Array(Array(0.0,0.0,1.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0),Array(1.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,1.0))) === true)
    val gen7 = u.elMSwitch(6,4,2)
	assert(u.isEqualM(gen7,Array(Array(1.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,1.0))) === true)
    val gen8 = u.elMSwitch(7,7,1)
	assert(u.isEqualM(gen8,Array(Array(0.0,0.0,0.0,0.0,0.0,0.0,1.0),Array(0.0,1.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,1.0,0.0),Array(1.0,0.0,0.0,0.0,0.0,0.0,0.0))) === true)
	intercept[AssertionError]{u.elMSwitch(7,0,2)}
	intercept[AssertionError]{u.elMSwitch(7,8,2)}
	intercept[AssertionError]{u.elMSwitch(7,-1,2)}
	intercept[AssertionError]{u.elMSwitch(7,1,8)}
	intercept[AssertionError]{u.elMSwitch(7,1,0)}
	intercept[AssertionError]{u.elMSwitch(7,1,-1)}
	intercept[AssertionError]{u.elMSwitch(7,2,2)}
  }
  
  test("Tests for creating an elementary matrix for multiplying a row (elMMul)"){
    val gen1 = u.elMMul(2,1,3.0)
	assert(u.isEqualM(gen1,Array(Array(3.0,0.0),Array(0.0,1.0))) === true)
    val gen2 = u.elMMul(3,2,1.0)
	assert(u.isEqualM(gen2,Array(Array(1.0,0.0,0.0),Array(0.0,1.0,0.0),Array(0.0,0.0,1.0))) === true)
    val gen3 = u.elMMul(4,3,-1.5)
	assert(u.isEqualM(gen3,Array(Array(1.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0),Array(0.0,0.0,-1.5,0.0),Array(0.0,0.0,0.0,1.0))) === true)
    val gen4 = u.elMMul(4,2,2.4)
	assert(u.isEqualM(gen4,Array(Array(1.0,0.0,0.0,0.0),Array(0.0,2.4,0.0,0.0),Array(0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,1.0))) === true)
    val gen5 = u.elMMul(5,5,1.3)
	assert(u.isEqualM(gen5,Array(Array(1.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,1.3))) === true)
    val gen6 = u.elMMul(5,1,-7.2)
	assert(u.isEqualM(gen6,Array(Array(-7.2,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,1.0))) === true)
    val gen7 = u.elMMul(6,4,0.7)
	assert(u.isEqualM(gen7,Array(Array(1.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.7,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,1.0))) === true)
    val gen8 = u.elMMul(7,7,-0.4)
	assert(u.isEqualM(gen8,Array(Array(1.0,0.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,1.0,0.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,1.0,0.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,1.0,0.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,1.0,0.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,1.0,0.0),Array(0.0,0.0,0.0,0.0,0.0,0.0,-0.4))) === true)
	intercept[AssertionError]{u.elMMul(7,0,1.0)}
	intercept[AssertionError]{u.elMMul(7,8,2.0)}
	intercept[AssertionError]{u.elMMul(7,-1,3.0)}
  }
  
  test("Tests for reducing a matrix to its REF form (ref)"){
    val s1 = u.ref(a)
    val s2 = u.ref(symm2)
    val s3 = u.ref(ex1)
    val s4 = u.ref(ex2)
    val s5 = u.ref(ex3)
    val s6 = u.ref(newex1)
    val s7 = u.ref(newex2)
    val s8 = u.ref(newex3)
    val s9 = u.ref(newex4)
    val s10 = u.ref(newex5)
	val s11 = u.ref(newex6)
	assert(u.isEqualM(s1,Array(Array(1.0,2,3),Array(0.0,-13,-9),Array(0.0,0,-12.0/13),Array(0.0,0,0))) === true)
	assert(u.isEqualM(s2,Array(Array(2.0,1,3),Array(0.0,3.5,3.5),Array(0.0,0,-1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,1,1,2),Array(0.0,1,3,-1),Array(0.0,0,0,3))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,0,0,0,2),Array(0.0,1,-3,-2,0),Array(0.0,0,1,1,0),Array(0.0,0,0,0,0))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0,1,5,1,4),Array(0.0,-3,-9,0,-6),Array(0.0,0,0,-3,-9))) === true)
	assert(u.isEqualM(s6,Array(Array(2.0,1,1),Array(0.0,-8,-2),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s7,Array(Array(1.0,7,2,3,1),Array(0.0,-34,-7,-13,-4),Array(0.0,0,95.0/17,-64.0/17,-4.0/17))) === true)
	assert(u.isEqualM(s8,Array(Array(3.0,5,4),Array(0.0,1.0/3,5.0/3),Array(0.0,0,58.0))) === true)
	assert(u.isEqualM(s9,Array(Array(1.0,2,8,1),Array(0.0,2,7,3),Array(0.0,0,-4.5,8.5),Array(0.0,0,0,-2.0/3))) === true)
	assert(u.isEqualM(s10,Array(Array(1.0,2.0),Array(0.0,1.0),Array(0.0,0.0),Array(0.0,0.0),Array(0.0,0.0))) === true)
	assert(u.isEqualM(s11,Array(Array(1.0,2,3,4,5),Array(0.0,0,0,0,1),Array(0.0,0,0,0,0),Array(0.0,0,0,0,0))) === true)
  }
  
  test("Tests for reducing a matrix to its RREF form (rref)"){
    val s1 = u.rref(a)
    val s2 = u.rref(symm2)
    val s3 = u.rref(ex1)
    val s4 = u.rref(ex2)
    val s5 = u.rref(ex3)
    val s6 = u.rref(newex1)
    val s7 = u.rref(newex2)
    val s8 = u.rref(newex3)
    val s9 = u.rref(newex4)
    val s10 = u.rref(newex5)
	val s11 = u.rref(newex6)
	assert(u.isEqualM(s1,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1),Array(0.0,0,0))) === true)
	assert(u.isEqualM(s2,Array(Array(1.0,0,0),Array(0,1.0,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,0,-2,0),Array(0.0,1,3,0),Array(0.0,0,0,1))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,0,0,0,2),Array(0.0,1,0,1,0),Array(0.0,0,1,1,0),Array(0.0,0,0,0,0))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0,0,2,0,-1),Array(0.0,1,3,0,2),Array(0.0,0,0,1,3))) === true)
	assert(u.isEqualM(s6,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s7,Array(Array(1.0,0,0,7.0/10,1.0/5),Array(0.0,1,0,99.0/190,12.0/95),Array(0.0,0,1,-64.0/95,-4.0/95))) === true)
	assert(u.isEqualM(s8,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1.0))) === true)
	assert(u.isEqualM(s9,Array(Array(1.0,0,0,0),Array(0.0,1,0,0),Array(0.0,0,1,0),Array(0.0,0,0,1))) === true)
	assert(u.isEqualM(s10,Array(Array(1.0,0),Array(0.0,1.0),Array(0.0,0.0),Array(0.0,0.0),Array(0.0,0.0))) === true)
	assert(u.isEqualM(s11,Array(Array(1.0,2,3,4,0),Array(0.0,0,0,0,1),Array(0.0,0,0,0,0),Array(0.0,0,0,0,0))) === true)
  }
  
  test("Tests for the inverse of a matrix (inverse)"){
	val s1 = u.inverse(f)
	val s2 = u.inverse(g)
	val s3 = u.inverse(h)
	val s4 = u.inverse(i)
	val s5 = u.inverse(k)
	val s6 = u.inverse(l)
	val s7 = u.inverse(n)
	val s8 = u.inverse(x)
	val s9 = u.inverse(y)
	val s10 = u.inverse(symm1)
	val s11 = u.inverse(symm2)
	val s12 = u.inverse(symm3)
	val s13 = u.inverse(inv1)
	val s14 = u.inverse(inv2)
	assert(u.isEqualM(s1,Array(Array(0.2857142857142857, 0.42857142857142855), Array(0.14285714285714285, -0.2857142857142857))) === true)
	assert(u.isEqualM(s2,Array(Array(0.5102040816326531, -0.16326530612244897), Array(0.12244897959183673, 0.04081632653061224))) === true)
	assert(u.isEqualM(s3,Array(Array(-0.07840139188116567, -0.04962828835468874, -0.019189746569905883, 0.06398117700419549), Array(0.39358912575121896, 0.22123398344483503, 0.3775725705862343, -0.1172468533847375), Array(0.15051664020864045, 0.010194608232225877, -0.2798751275654836, 0.013096722984465358), Array(-0.20428726329515817, -0.2435490843633065, -0.3158716266016555, 0.07033110329969385))) === true)
	assert(u.isEqualM(s4,Array(Array(0.3566140309138878, -0.6920382357849735, 0.5143792543879895, 0.24689209966586298), Array(-0.27405626711076236, 0.34836713171247885, -0.1692700473331179, 0.2742693194044478), Array(-0.20115687395471218, -0.30240997652873897, 0.16987369549856013, 0.36456798321147926), Array(-0.05191374222802987, -0.08819477240688726, -0.03206437019966551, 0.18411269045987338))) === true)
	assert(u.isEqualM(s5,Array(Array(2.7468086726236827, 2.3378942539724146, 3.4165248406022806, 2.668387933958846, -8.079810409230033), Array(-0.12997322812184384, 0.5310141318510181, 0.005673845667543, 0.4202392218615803, -0.48705809054253046), Array(1.220948946471663, 1.5003238067336382, 1.896577478470707, 1.8052972275975854, -4.807284398683186), Array(0.584603664412869, 0.7186871178887801, 0.7407874093148403, 0.8289657169620761, -2.1516824940057204), Array(-0.4014336157647621, -0.5088777012805785, -0.4874158680718851, -0.4066906566337977, 1.3570055972306814))) === true)
	assert(u.isEqualM(s6,l) === true)
	assert(u.isEqualM(s7,Array(Array(0.3265669050503484, -0.43879692862607517, 0.10246032618819115, -0.18837670481701482, -0.07460880494106839, -0.200102418289716, 0.006837764700357529, 0.2423511494305215, 0.2869554063041596, 0.058560513963955375),
	                           Array(-0.13824553292768485, -0.6969492319562745, 0.4404527710742081, -0.1699314864835239, 0.2600356915458009, -0.5191935239032226, 0.021930513563170093, 0.3582773596099751, 0.2650718270406534, 0.3211479973655562),
							   Array(0.06284837058831749, 0.49459316333886827, -0.42246076049585, 0.18231263073172266, -0.13056017411227916, 0.42343462422286293, -0.019765044896405907, -0.2783000106529973, -0.13711512264904652, -0.269055967928634),
							   Array(0.07719634708100012, -0.05311469937707407, -0.12012914245033118, -0.10480668518150278, 0.018729072800910313, -0.003094798059249948, -0.0029749481315322103, -0.015711791538968893, 0.06029483734866685, -0.06675068423480701),
							   Array(-0.04353534384751434, 0.02280505166258697, 0.28109092536396185, -0.025197524695537425, -0.007031857801739325, -0.22528059196845882, 0.01443618485284995, 0.1392481087221586, 0.02581137436925638, 0.1816823743742106),
							   Array(-0.16036127989399096, 0.0026303870057996395, -0.009003392079278473, 0.01853931535966118, -1.93754910991701E-4, 0.3414395097687036, -0.01767377045469668, -0.10551233871322058, -0.09907188838957681, -0.024226891576724585),
							   Array(-0.01831405386061685, -0.03794572714686597, 0.039586668451758164, -0.017094201123545608, 0.007993740985854059, -0.008896264340051268, 0.011286831343829478, 0.019630634982419886, 0.007697059016270013, 0.026207619293026042),
							   Array(0.11502613425571104, 0.204591848252904, -0.20094620331300206, 0.09015924999813847, -0.017121208889435267, -0.02636331146892907, -0.004970817284246323, 0.0063314046889148285, -0.055752507288670386, -0.11999333230946688),
							   Array(0.024607913483066436, 0.005685676121055903, -0.06649374111935026, 0.010669079131003774, 0.024265615859681604, 0.05322287283658643, -0.004420006002582766, -0.07822590394212221, 0.028290428591944607, -0.10319497064611244),
							   Array(-0.03810438590513825, -0.09907186614020905, 0.1342005326023991, -0.028235604666469665, 0.07702464129346788, -0.11474948265028417, 0.005489660674298832, 0.039164227122376834, -0.004403179547384375, 0.13155116688589216))) === true)
	assert(u.isEqualM(s8,Array(Array(0.4))) === true)
	assert(u.isEqualM(s9,Array(Array(0.25))) === true)
	assert(u.isEqualM(s10,Array(Array(0.6, -0.2), Array(-0.2, 0.4))) === true)
	assert(u.isEqualM(s11,Array(Array(-0.42857142857142855, -1.1428571428571428, 1.0), Array(-1.1428571428571428, -0.7142857142857143, 1.0), Array(1.0, 1.0, -1.0))) === true)
	assert(u.isEqualM(s12,Array(Array(0.060923935510541545, -0.04552501033484911, 0.04769532864820174, 0.0017052501033484912), Array(-0.04552501033484911, -0.04655849524596941, 0.0805601488218272, 0.026715584952459695), Array(0.04769532864820174, 0.0805601488218272, 0.038187267465895, -0.04955560148821827), Array(0.0017052501033484912, 0.026715584952459695, -0.04955560148821827, 0.053482844150475405))) === true)
	assert(u.isEqualM(s13,Array(Array(0.0, 0.5), Array(0.5, -0.5))) === true)
	assert(u.isEqualM(s14,Array(Array(54.0, -23.0, -7.0), Array(-16.0, 7.0, 2.0), Array(-7.0, 3.0, 1.0))) === true)
	intercept[AssertionError]{u.inverse(noinv1)}
	intercept[AssertionError]{u.inverse(noinv2)}
	intercept[AssertionError]{u.inverse(noinv3)}
    intercept[AssertionError]{u.inverse(a)}
    intercept[AssertionError]{u.inverse(b)}
    intercept[AssertionError]{u.inverse(t)}
    intercept[AssertionError]{u.inverse(w)}
    intercept[AssertionError]{u.inverse(a1)}
  }
  
  test("Tests for finding the rank of a matrix (rank)"){
    val s1 = u.rank(a)
    val s2 = u.rank(symm2)
    val s3 = u.rank(ex1)
    val s4 = u.rank(ex2)
    val s5 = u.rank(ex3)
    val s6 = u.rank(newex1)
    val s7 = u.rank(newex2)
    val s8 = u.rank(newex3)
    val s9 = u.rank(newex4)
    val s10 = u.rank(newex5)
	val s11 = u.rank(newex6)
	val s12 = u.rank(rnk1)
	val s13 = u.rank(rnk2)
	val s14 = u.rank(rnk3)
	val s15 = u.rank(rnk4)
	assert((s1 == 3) === true)
	assert((s2 == 3) === true)
	assert((s3 == 3) === true)
	assert((s4 == 3) === true)
	assert((s5 == 3) === true)
	assert((s6 == 3) === true)
	assert((s7 == 3) === true)
	assert((s8 == 3) === true)
	assert((s9 == 4) === true)
	assert((s10 == 2) === true)
	assert((s11 == 2) === true)
	assert((s12 == 2) === true)
	assert((s13 == 2) === true)
	assert((s14 == 3) === true)
	assert((s15 == 1) === true)
  }
  
  test("Tests for PLU decomposition (plu)"){
    val (p1,l1,u1) = u.plu(newex4)
	assert(u.isEqualM(p1,Array(Array(0.0,0,0,1),Array(1.0,0,0,0),Array(0.0,0,1,0),Array(0.0,1,0,0))) === true)
	assert(u.isEqualM(l1,Array(Array(1.0,0,0,0),Array(0.0,1,0,0),Array(3.0,-2.5,1,0),Array(1.0,0,2.0/3,1))) === true)
	assert(u.isEqualM(u1,Array(Array(1.0,2,8,1),Array(0.0,2,7,3),Array(0.0,0,-4.5,8.5),Array(0.0,0,0,-2.0/3))) === true)
	assert(u.isEqualM(u.mulM(p1,newex4),u.mulM(l1,u1)) === true)
    val (p2,l2,u2) = u.plu(plu1)
	assert(u.isEqualM(p2,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(l2,Array(Array(1.0,0,0),Array(2.0,1,0),Array(-1.0,-2,1))) === true)
	assert(u.isEqualM(u2,Array(Array(2.0,1,3),Array(0.0,-3,-3),Array(0.0,0,2))) === true)
	assert(u.isEqualM(u.mulM(p2,plu1),u.mulM(l2,u2)) === true)
    val (p3,l3,u3) = u.plu(plu2)
	assert(u.isEqualM(p3,Array(Array(1.0,0,0),Array(0.0,0,1),Array(0.0,1,0))) === true)
	assert(u.isEqualM(l3,Array(Array(1.0,0,0),Array(4.0,1,0),Array(2.0,0,1))) === true)
	assert(u.isEqualM(u3,Array(Array(1.0,1,1),Array(0.0,2,4),Array(0.0,0,3))) === true)
	assert(u.isEqualM(u.mulM(p3,plu2),u.mulM(l3,u3)) === true)
    val (p4,l4,u4) = u.plu(plu3)
	assert(u.isEqualM(p4,Array(Array(0.0,0,1),Array(1.0,0,0),Array(0.0,1,0))) === true)
	assert(u.isEqualM(l4,Array(Array(1.0,0,0),Array(0.0,1,0),Array(-4.0,0,1))) === true)
	assert(u.isEqualM(u4,Array(Array(2.0,-2,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(u.mulM(p4,plu3),u.mulM(l4,u4)) === true)
    val (p5,l5,u5) = u.plu(plu4)
	assert(u.isEqualM(p5,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(l5,Array(Array(1.0,0,0),Array(4.0,1,0),Array(3.0,-2,1))) === true)
	assert(u.isEqualM(u5,Array(Array(1.0,1,1),Array(0.0,-1,-5),Array(0.0,0,-10))) === true)
	assert(u.isEqualM(u.mulM(p5,plu4),u.mulM(l5,u5)) === true)
    val (p6,l6,u6) = u.plu(plu5)
	assert(u.isEqualM(p6,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(l6,Array(Array(1.0,0,0),Array(2.0,1,0),Array(3.0,2,1))) === true)
	assert(u.isEqualM(u6,Array(Array(1.0,4,7),Array(0.0,-3,-6),Array(0.0,0,1))) === true)
	assert(u.isEqualM(u.mulM(p6,plu5),u.mulM(l6,u6)) === true)
    val (p7,l7,u7) = u.plu(plu6)
	assert(u.isEqualM(p7,Array(Array(1.0,0,0),Array(0.0,0,1),Array(0.0,1,0))) === true)
	assert(u.isEqualM(l7,Array(Array(1.0,0,0),Array(2.0,1,0),Array(2.0,0,1))) === true)
	assert(u.isEqualM(u7,Array(Array(2.0,1,4),Array(0.0,-1,-3),Array(0.0,0,-7))) === true)
	assert(u.isEqualM(u.mulM(p7,plu6),u.mulM(l7,u7)) === true)
    intercept[AssertionError]{u.plu(a)}
    intercept[AssertionError]{u.plu(b)}
    intercept[AssertionError]{u.plu(t)}
    intercept[AssertionError]{u.plu(w)}
    intercept[AssertionError]{u.plu(a1)}
  }
  
  test("Tests for finding the determinant of a matrix (det)"){
	val s1 = u.det(f)
	val s2 = u.det(g)
	val s3 = u.det(h)
	val s4 = u.det(i)
	val s5 = u.det(k)
	val s6 = u.det(l)
	val s7 = u.det(m)
	val s8 = u.det(x)
	val s9 = u.det(y)
	val s10 = u.det(symm1)
	val s11 = u.det(symm2)
	val s12 = u.det(newex1)
	val s13 = u.det(inv1)
	val s14 = u.det(inv2)
	val s15 = u.det(det1)
	val s16 = u.det(det2)
	val s17 = u.det(det3)
	val s18 = u.det(det4)
	val s19 = u.det(det5)
	val s20 = u.det(det6)
	val s21 = u.det(det7)
	val s22 = u.det(noinv1)
	val s23 = u.det(noinv2)
	val s24 = u.det(noinv3)
	assert(eqDouble(s1,-7.0) === true)
	assert(eqDouble(s2,24.5) === true)
	assert(eqDouble(s3,1128.832) === true)
	assert(eqDouble(s4,112.6484) === true)
	assert(eqDouble(s5,83.012480000000000044) === true)
	assert(eqDouble(s6,1.0) === true)
	assert(eqDouble(s7,-274.79624499999999994) === true)
	assert(eqDouble(s8,2.5) === true)
	assert(eqDouble(s9,4.0) === true)
	assert(eqDouble(s10,5.0) === true)
	assert(eqDouble(s11,-7.0) === true)
	assert(eqDouble(s12,-16.0) === true)
	assert(eqDouble(s13,-4.0) === true)
	assert(eqDouble(s14,1.0) === true)
	assert(eqDouble(s15,-9.0) === true)
	assert(eqDouble(s16,5.0) === true)
	assert(eqDouble(s17,28.0) === true)
	assert(eqDouble(s18,0.0) === true)
	assert(eqDouble(s19,-29.0) === true)
	assert(eqDouble(s20,-58.0) === true)
	assert(eqDouble(s21,24.0) === true)
	assert(eqDouble(s22,0.0) === true)
	assert(eqDouble(s23,0.0) === true)
	assert(eqDouble(s24,0.0) === true)
    intercept[AssertionError]{u.det(a)}
    intercept[AssertionError]{u.det(b)}
    intercept[AssertionError]{u.det(t)}
    intercept[AssertionError]{u.det(w)}
    intercept[AssertionError]{u.det(a1)}
  }
  
  test("Tests for solving a linear system (sysSolve)"){
  
    println("The solution to system 1")
	val (base1,s1) = u.sysSolve(sys1._1,sys1._2)
	assert((base1.size == 0) === true)
	assert(u.isEqualV(s1,Array(3.0,4,-2)) === true)
	
    println("The solution to system 2")
	val (base2,s2) = u.sysSolve(sys2._1,sys2._2)
	assert((base2.size == 0) === true)
	assert(u.isEqualV(s2,Array(3.0,-1)) === true)
	
    println("The solution to system 3")
	val (base3,s3) = u.sysSolve(sys3._1,sys3._2)
	assert((base3.size == 0) === true)
	assert(u.isEqualV(s3,Array(1.0,2,1)) === true)

    println("The solution to system 4")
	val (base4,s4) = u.sysSolve(sys4._1,sys4._2)
	assert((base4.size == 0) === true)
	assert((s4.size == 0) === true)
	println
	
    println("The solution to system 5")
	val (base5,s5) = u.sysSolve(sys5._1,sys5._2)
	assert((base5.size == 1) === true)
	assert(u.isEqualV(base5(0),Array(1.0,0.5,1)) === true)
	assert(u.isEqualV(s5,Array(1.0,1,0)) === true)
	
    println("The solution to system 6")
	val (base6,s6) = u.sysSolve(sys6._1,sys6._2)
	assert((base6.size == 1) === true)
	assert(u.isEqualV(base6(0),Array(-0.5,-1.5,1)) === true)
	assert(u.isEqualV(s6,Array(0.0,0,0)) === true)
	
    println("The solution to system 7")
	val (base7,s7) = u.sysSolve(sys7._1,sys7._2)
	assert((base7.size == 2) === true)
	assert(u.isEqualV(base7(0),Array(2.0,1,0)) === true)
	assert(u.isEqualV(base7(1),Array(-3,0,1)) === true)
	assert(u.isEqualV(s7,Array(0.0,0,0)) === true)
	
    println("The solution to system 8")
	val (base8,s8) = u.sysSolve(sys8._1,sys8._2)
	assert((base8.size == 1) === true)
	assert(u.isEqualV(base8(0),Array(2.0,-4,1)) === true)
	assert(u.isEqualV(s8,Array(3.0,5,0)) === true)
	
    println("The solution to system 9")
	val (base9,s9) = u.sysSolve(sys9._1,sys9._2)
	assert((base9.size == 0) === true)
	assert((s9.size == 0) === true)
	println
	
    println("The solution to system 10")
	val (base10,s10) = u.sysSolve(sys10._1,sys10._2)
	assert((base10.size == 0) === true)
	assert(u.isEqualV(s10,Array(2.0,5,1)) === true)
	
    println("The solution to system 11")
	val (base11,s11) = u.sysSolve(sys11._1,sys11._2)
	assert((base11.size == 2) === true)
	assert(u.isEqualV(base11(0),Array(2.0,-5,-2,1,0)) === true)
	assert(u.isEqualV(base11(1),Array(-1,1,1,0,1)) === true)
	assert(u.isEqualV(s11,Array(1.0,3,2,0,0)) === true)
	
    println("The solution to system 12")
	val (base12,s12) = u.sysSolve(sys12._1,sys12._2)
	assert((base12.size == 1) === true)
	assert(u.isEqualV(base12(0),Array(-1.0,-1,1)) === true)
	assert(u.isEqualV(s12,Array(0.0,1,0)) === true)
	
    println("The solution to system 13")
	val (base13,s13) = u.sysSolve(sys13._1,sys13._2)
	assert((base13.size == 1) === true)
	assert(u.isEqualV(base13(0),Array(-9.0/7,10.0/7,1)) === true)
	assert(u.isEqualV(s13,Array(9.0/7,-17.0/7,0)) === true)
	
    println("The solution to system 14")
	val (base14,s14) = u.sysSolve(sys14._1,sys14._2)
	assert((base14.size == 1) === true)
	assert(u.isEqualV(base14(0),Array(-1.0,0,1,0)) === true)
	assert(u.isEqualV(s14,Array(2.0,2,0,2)) === true)
	
    println("The solution to system 15")
	val (base15,s15) = u.sysSolve(sys15._1,sys15._2)
	assert((base15.size == 0) === true)
	assert(u.isEqualV(s15,Array(1.0,-5,3)) === true)
	
    println("The solution to system 16")
	val (base16,s16) = u.sysSolve(sys16._1,sys16._2)
	assert((base16.size == 0) === true)
	assert(u.isEqualV(s16,Array(1.0,1,1)) === true)
	
    println("The solution to system 17")
	val (base17,s17) = u.sysSolve(sys17._1,sys17._2)
	assert((base17.size == 1) === true)
	assert(u.isEqualV(base17(0),Array(2.0,-3,1,0)) === true)
	assert(u.isEqualV(s17,Array(0.0,0,0,0)) === true)
	
    println("The solution to system 18")
	val (base18,s18) = u.sysSolve(sys18._1,sys18._2)
	assert((base18.size == 2) === true)
	assert(u.isEqualV(base18(0),Array(0.0,-1,-1,1,0)) === true)
	assert(u.isEqualV(base18(1),Array(-2.0,0,0,0,1)) === true)
	assert(u.isEqualV(s18,Array(0.0,0,0,0,0)) === true)
	
    println("The solution to system 19")
	val (base19,s19) = u.sysSolve(sys19._1,sys19._2)
	assert((base19.size == 2) === true)
	assert(u.isEqualV(base19(0),Array(-2.0,-3,1,0,0)) === true)
	assert(u.isEqualV(base19(1),Array(1.0,-2.0,0,-3.0,1)) === true)
	assert(u.isEqualV(s19,Array(0.0,0,0,0,0)) === true)
	
    println("The solution to system 20")	
	val (base20,s20) = u.sysSolve(sys20._1,sys20._2)
	assert((base20.size == 0) === true)
	assert(u.isEqualV(s20,Array(-6.5,27.5,-12.5)) === true)
	
    intercept[AssertionError]{u.sysSolve(a,c)}
    intercept[AssertionError]{u.sysSolve(f,d)}
    intercept[AssertionError]{u.sysSolve(k,o)}
    intercept[AssertionError]{u.sysSolve(n,r)}
  }
  
  test("Tests for solving a linear system without message printing(noMsgSysSolve)"){

	val (base1,s1) = u.noMsgSysSolve(sys1._1,sys1._2)
	assert((base1.size == 0) === true)
	assert(u.isEqualV(s1,Array(3.0,4,-2)) === true)

	val (base2,s2) = u.noMsgSysSolve(sys2._1,sys2._2)
	assert((base2.size == 0) === true)
	assert(u.isEqualV(s2,Array(3.0,-1)) === true)

	val (base3,s3) = u.noMsgSysSolve(sys3._1,sys3._2)
	assert((base3.size == 0) === true)
	assert(u.isEqualV(s3,Array(1.0,2,1)) === true)

	val (base4,s4) = u.noMsgSysSolve(sys4._1,sys4._2)
	assert((base4.size == 0) === true)
	assert((s4.size == 0) === true)

	val (base5,s5) = u.noMsgSysSolve(sys5._1,sys5._2)
	assert((base5.size == 1) === true)
	assert(u.isEqualV(base5(0),Array(1.0,0.5,1)) === true)
	assert(u.isEqualV(s5,Array(1.0,1,0)) === true)
	
	val (base6,s6) = u.noMsgSysSolve(sys6._1,sys6._2)
	assert((base6.size == 1) === true)
	assert(u.isEqualV(base6(0),Array(-0.5,-1.5,1)) === true)
	assert(u.isEqualV(s6,Array(0.0,0,0)) === true)

	val (base7,s7) = u.noMsgSysSolve(sys7._1,sys7._2)
	assert((base7.size == 2) === true)
	assert(u.isEqualV(base7(0),Array(2.0,1,0)) === true)
	assert(u.isEqualV(base7(1),Array(-3,0,1)) === true)
	assert(u.isEqualV(s7,Array(0.0,0,0)) === true)

	val (base8,s8) = u.noMsgSysSolve(sys8._1,sys8._2)
	assert((base8.size == 1) === true)
	assert(u.isEqualV(base8(0),Array(2.0,-4,1)) === true)
	assert(u.isEqualV(s8,Array(3.0,5,0)) === true)

	val (base9,s9) = u.noMsgSysSolve(sys9._1,sys9._2)
	assert((base9.size == 0) === true)
	assert((s9.size == 0) === true)

	val (base10,s10) = u.noMsgSysSolve(sys10._1,sys10._2)
	assert((base10.size == 0) === true)
	assert(u.isEqualV(s10,Array(2.0,5,1)) === true)

	val (base11,s11) = u.noMsgSysSolve(sys11._1,sys11._2)
	assert((base11.size == 2) === true)
	assert(u.isEqualV(base11(0),Array(2.0,-5,-2,1,0)) === true)
	assert(u.isEqualV(base11(1),Array(-1,1,1,0,1)) === true)
	assert(u.isEqualV(s11,Array(1.0,3,2,0,0)) === true)

	val (base12,s12) = u.noMsgSysSolve(sys12._1,sys12._2)
	assert((base12.size == 1) === true)
	assert(u.isEqualV(base12(0),Array(-1.0,-1,1)) === true)
	assert(u.isEqualV(s12,Array(0.0,1,0)) === true)

	val (base13,s13) = u.noMsgSysSolve(sys13._1,sys13._2)
	assert((base13.size == 1) === true)
	assert(u.isEqualV(base13(0),Array(-9.0/7,10.0/7,1)) === true)
	assert(u.isEqualV(s13,Array(9.0/7,-17.0/7,0)) === true)

	val (base14,s14) = u.noMsgSysSolve(sys14._1,sys14._2)
	assert((base14.size == 1) === true)
	assert(u.isEqualV(base14(0),Array(-1.0,0,1,0)) === true)
	assert(u.isEqualV(s14,Array(2.0,2,0,2)) === true)

	val (base15,s15) = u.noMsgSysSolve(sys15._1,sys15._2)
	assert((base15.size == 0) === true)
	assert(u.isEqualV(s15,Array(1.0,-5,3)) === true)

	val (base16,s16) = u.noMsgSysSolve(sys16._1,sys16._2)
	assert((base16.size == 0) === true)
	assert(u.isEqualV(s16,Array(1.0,1,1)) === true)

	val (base17,s17) = u.noMsgSysSolve(sys17._1,sys17._2)
	assert((base17.size == 1) === true)
	assert(u.isEqualV(base17(0),Array(2.0,-3,1,0)) === true)
	assert(u.isEqualV(s17,Array(0.0,0,0,0)) === true)

	val (base18,s18) = u.noMsgSysSolve(sys18._1,sys18._2)
	assert((base18.size == 2) === true)
	assert(u.isEqualV(base18(0),Array(0.0,-1,-1,1,0)) === true)
	assert(u.isEqualV(base18(1),Array(-2.0,0,0,0,1)) === true)
	assert(u.isEqualV(s18,Array(0.0,0,0,0,0)) === true)

	val (base19,s19) = u.noMsgSysSolve(sys19._1,sys19._2)
	assert((base19.size == 2) === true)
	assert(u.isEqualV(base19(0),Array(-2.0,-3,1,0,0)) === true)
	assert(u.isEqualV(base19(1),Array(1.0,-2.0,0,-3.0,1)) === true)
	assert(u.isEqualV(s19,Array(0.0,0,0,0,0)) === true)
	
	val (base20,s20) = u.noMsgSysSolve(sys20._1,sys20._2)
	assert((base20.size == 0) === true)
	assert(u.isEqualV(s20,Array(-6.5,27.5,-12.5)) === true)
	
    intercept[AssertionError]{u.noMsgSysSolve(a,c)}
    intercept[AssertionError]{u.noMsgSysSolve(f,d)}
    intercept[AssertionError]{u.noMsgSysSolve(k,o)}
    intercept[AssertionError]{u.noMsgSysSolve(n,r)}
  }
  
  test("Tests for checking if a set of vectors is linearly independent (isInd)"){
    val s1 = u.isInd(linind1)
    val s2 = u.isInd(linind2)
    val s3 = u.isInd(linind3)
    val s4 = u.isInd(linind4)
    val s5 = u.isInd(linind5)
    val s6 = u.isInd(linind6)
    val s7 = u.isInd(linind7)
    val s8 = u.isInd(linind8)
    val s9 = u.isInd(linind9)
    val s10 = u.isInd(linind10)
    val s11 = u.isInd(linind11)
    val s12 = u.isInd(linind12)
    val s13 = u.isInd(linind13)
    val s14 = u.isInd(linind14)
    val s15 = u.isInd(linind15)
    val s16 = u.isInd(linind16)
    val s17 = u.isInd(linind17)
    val s18 = u.isInd(linind18)
    val s19 = u.isInd(linind19)
    val s20 = u.isInd(linind20)
    val s21 = u.isInd(linind21)
    val s22 = u.isInd(linind22)
	assert((s1 == false) === true)
	assert((s2 == true) === true)
	assert((s3 == true) === true)
	assert((s4 == false) === true)
	assert((s5 == false) === true)
	assert((s6 == false) === true)
	assert((s7 == false) === true)
	assert((s8 == false) === true)
	assert((s9 == false) === true)
	assert((s10 == true) === true)
	assert((s11 == false) === true)
	assert((s12 == false) === true)
	assert((s13 == false) === true)
	assert((s14 == true) === true)
	assert((s15 == true) === true)
	assert((s16 == false) === true)
	assert((s17 == false) === true)
	assert((s18 == true) === true)
	assert((s19 == false) === true)
	assert((s20 == true) === true)
	assert((s21 == true) === true)
	assert((s22 == true) === true)
    intercept[AssertionError]{u.isInd(Array(Array(1.0,2,3),Array(1.0,2),Array(2.0,3,4)))}
    intercept[AssertionError]{u.isInd(Array(Array(3.0,2,3),Array(1.0),Array(1.0,2)))}
    intercept[AssertionError]{u.isInd(Array(Array(4.0,2),Array(1.0),Array(2.0)))}
    intercept[AssertionError]{u.isInd(Array(Array(4.0),Array(1.0),Array(2.0,1)))}
  }
  
  test("Tests for checking if 2 vectors are orthogonal (areOrth)"){
    val s1 = u.areOrth(orth11,orth12)
    val s2 = u.areOrth(orth21,orth22)
    val s3 = u.areOrth(orth31,orth32)
    val s4 = u.areOrth(orth41,orth42)
    val s5 = u.areOrth(orth51,orth52)
    val s6 = u.areOrth(orth61,orth62)
    val s7 = u.areOrth(orth71,orth72)
    val s8 = u.areOrth(orth81,orth82)
	assert((s1 == true) === true)
	assert((s2 == false) === true)
	assert((s3 == false) === true)
	assert((s4 == false) === true)
	assert((s5 == false) === true)
	assert((s6 == false) === true)
	assert((s7 == true) === true)
	assert((s8 == true) === true)
    intercept[AssertionError]{u.areOrth(c,o)}
    intercept[AssertionError]{u.areOrth(p,q)}
    intercept[AssertionError]{u.areOrth(r,d)}
  }
  
  test("Tests for checking if 2 vector sets are orthogonal (areOrthSets)"){
    val s1 = u.areOrthSets(ex1set._1,ex1set._2)
    val s2 = u.areOrthSets(ex2set._1,ex2set._2)
    val s3 = u.areOrthSets(ex3set._1,ex3set._2)
    val s4 = u.areOrthSets(ex4set._1,ex4set._2)
    val s5 = u.areOrthSets(ex5set._1,ex5set._2)
    val s6 = u.areOrthSets(ex6set._1,ex6set._2)
    val s7 = u.areOrthSets(ex7set._1,ex7set._2)
	assert((s1 == true) === true)
	assert((s2 == false) === true)
	assert((s3 == true) === true)
	assert((s4 == false) === true)
	assert((s5 == true) === true)
	assert((s6 == true) === true)
	assert((s7 == false) === true)
  }
  
  test("Tests for checking if a vector set is orthogonal (isOrthSet)"){
    val s1 = u.isOrthSet(orths1)
    val s2 = u.isOrthSet(orths2)
    val s3 = u.isOrthSet(orths3)
    val s4 = u.isOrthSet(orths4)
    val s5 = u.isOrthSet(orths5)
    val s6 = u.isOrthSet(orths6)
    val s7 = u.isOrthSet(orths7)
    val s8 = u.isOrthSet(orths8)
    val s9 = u.isOrthSet(orths9)
    val s10 = u.isOrthSet(orths10)
	assert((s1 == true) === true)
	assert((s2 == false) === true)
	assert((s3 == false) === true)
	assert((s4 == true) === true)
	assert((s5 == true) === true)
	assert((s6 == false) === true)
	assert((s7 == true) === true)
	assert((s8 == false) === true)
	assert((s9 == false) === true)
	assert((s10 == true) === true)
  }
  
  test("Tests for checking if a vector set is orthonormal (isOrthNormSet)"){
    val s1 = u.isOrthNormSet(norms1)
    val s2 = u.isOrthNormSet(norms2)
    val s3 = u.isOrthNormSet(norms3)
    val s4 = u.isOrthNormSet(norms4)
    val s5 = u.isOrthNormSet(norms5)
    val s6 = u.isOrthNormSet(norms6)
    val s7 = u.isOrthNormSet(norms7)
    val s8 = u.isOrthNormSet(norms8)
	assert((s1 == true) === true)
	assert((s2 == false) === true)
	assert((s3 == false) === true)
	assert((s4 == true) === true)
	assert((s5 == false) === true)
	assert((s6 == true) === true)
	assert((s7 == true) === true)
	assert((s8 == true) === true)
  }
  
  test("Tests for normalizing a vector (normV)"){
    val s1 = u.normV(nrmv1)
    val s2 = u.normV(nrmv2)
    val s3 = u.normV(nrmv3)
    val s4 = u.normV(nrmv4)
    val s5 = u.normV(nrmv5)
    val s6 = u.normV(nrmv6)
	assert(u.isEqualV(s1,Array(0.8,-0.6)) === true)
	assert(u.isEqualV(s2,Array(1.0/Math.sqrt(3),1.0/Math.sqrt(3),1.0/Math.sqrt(3))) === true)
	assert(u.isEqualV(s3,Array(1.0/Math.sqrt(15),2.0/Math.sqrt(15),1.0/Math.sqrt(15),3.0/Math.sqrt(15))) === true)
	assert(u.isEqualV(s4,Array(-5.0/13,12.0/13)) === true)
	assert(u.isEqualV(s5,Array(1.0/Math.sqrt(6),-1.0/Math.sqrt(6),2.0/Math.sqrt(6))) === true)
	assert(u.isEqualV(s6,Array(-2.0/Math.sqrt(23),3.0/Math.sqrt(23),3.0/Math.sqrt(23),-1.0/Math.sqrt(23))) === true)
  }
  
  test("Tests for the Gram-Schmidt orthogonalisation (orthGrSch)"){
    val s1 = u.orthGrSch(grsch1)
    val s2 = u.orthGrSch(grsch2)
    val s3 = u.orthGrSch(grsch3)
    val s4 = u.orthGrSch(grsch4)
    val s5 = u.orthGrSch(grsch5)
    val s6 = u.orthGrSch(grsch6)
    val s7 = u.orthGrSch(grsch7)
    val s8 = u.orthGrSch(grsch8)
    val s9 = u.orthGrSch(grsch9)
	assert(u.isEqualM(s1,Array(Array(0.5,-0.5,-0.5,0.5),Array(3.0*Math.sqrt(5)/10,3.0*Math.sqrt(5)/10,Math.sqrt(5)/10,Math.sqrt(5)/10),Array(-1.0/Math.sqrt(6),0,1.0/Math.sqrt(6),2.0/Math.sqrt(6)))) === true)
	assert(u.isEqualM(s2,Array(Array(1.0/Math.sqrt(3),1.0/Math.sqrt(3),1.0/Math.sqrt(3)),Array(-1.0/Math.sqrt(2),1.0/Math.sqrt(2),0),Array(1.0/Math.sqrt(6),1.0/Math.sqrt(6),-2.0/Math.sqrt(6)))) === true)
	assert(u.isEqualM(s3,Array(Array(0.0,2.0/Math.sqrt(5),1.0/Math.sqrt(5),0),Array(5.0/Math.sqrt(30),-1.0/Math.sqrt(30),2.0/Math.sqrt(30),0),Array(1.0/Math.sqrt(10),1.0/Math.sqrt(10),-2.0/Math.sqrt(10),-2.0/Math.sqrt(10)),Array(1.0/Math.sqrt(15),1.0/Math.sqrt(15),-2.0/Math.sqrt(15),3.0/Math.sqrt(15)))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0/Math.sqrt(3),1.0/Math.sqrt(3),1.0/Math.sqrt(3)),Array(1.0/Math.sqrt(6),1.0/Math.sqrt(6),-2.0/Math.sqrt(6)),Array(1.0/Math.sqrt(2),-1.0/Math.sqrt(2),0))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0/Math.sqrt(2),1.0/Math.sqrt(2)),Array(1.0/Math.sqrt(2),-1.0/Math.sqrt(2)))) === true)
	assert(u.isEqualM(s6,Array(Array(0.0,1),Array(-1.0,0))) === true)
	assert(u.isEqualM(s7,Array(Array(0.0,1),Array(-1.0,0))) === true)
	assert(u.isEqualM(s8,Array(Array(1.0/Math.sqrt(3),1.0/Math.sqrt(3),1.0/Math.sqrt(3)),Array(1.0/Math.sqrt(2),0,-1.0/Math.sqrt(2)),Array(-1.0/Math.sqrt(6),2.0/Math.sqrt(6),-1.0/Math.sqrt(6)))) === true)
	assert(u.isEqualM(s9,Array(Array(1.0/Math.sqrt(2),-1.0/Math.sqrt(2),0),Array(1.0/Math.sqrt(2),1.0/Math.sqrt(2),0),Array(0.0,0,1))) === true)
    intercept[AssertionError]{u.orthGrSch(linind1)}
    intercept[AssertionError]{u.orthGrSch(linind4)}
    intercept[AssertionError]{u.orthGrSch(linind5)}
    intercept[AssertionError]{u.orthGrSch(linind6)}
  }
  
  test("Tests for finding the row basis for a matrix (rowSpace)"){
    val s1 = u.rowSpace(rcnsp1)
    val s2 = u.rowSpace(rcnsp2)
    val s3 = u.rowSpace(rcnsp3)
    val s4 = u.rowSpace(rcnsp4)
    val s5 = u.rowSpace(rcnsp5)
    val s6 = u.rowSpace(rcnsp6)
    val s7 = u.rowSpace(rcnsp7)
    val s8 = u.rowSpace(rcnsp8)
    val s9 = u.rowSpace(rcnsp9)
    val s10 = u.rowSpace(rcnsp10)
    val s11 = u.rowSpace(rcnsp11)
    val s12 = u.rowSpace(rcnsp12)
    val s13 = u.rowSpace(rcnsp13)
    val s14 = u.rowSpace(rcnsp14)
    val s15 = u.rowSpace(rcnsp15)
	assert(u.isEqualM(s1,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s2,Array(Array(1.0,0,-2,0),Array(0.0,1,3,0),Array(0.0,0,0,1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,0,0,0,2),Array(0.0,1,0,1,0),Array(0.0,0,1,1,0))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,0,0,1),Array(0.0,1,0,1),Array(0.0,0,1,1))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0,2,0,0,-5),Array(0.0,0,1,0,-4),Array(0.0,0,0,1,2))) === true)
	assert(u.isEqualM(s6,Array(Array(1.0,0,0,69.0/37),Array(0.0,1,0,101.0/37),Array(0.0,0,1,-107.0/37))) === true)
	assert(u.isEqualM(s7,Array(Array(1.0,-0.2))) === true)
	assert(u.isEqualM(s8,Array(Array(1.0))) === true)
	assert(u.isEqualM(s9,Array(Array(1.0,-2))) === true)
	assert(u.isEqualM(s10,Array(Array(1.0,-2,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s11,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s12,Array(Array(1.0,-1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s13,Array(Array(1.0,0,1),Array(0.0,1,1))) === true)
	assert(u.isEqualM(s14,Array(Array(1.0,0,1),Array(0.0,1,1))) === true)
	assert(u.isEqualM(s15,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
  }
  
  test("Tests for finding the column basis for a matrix (columnSpace)"){
    val s1 = u.columnSpace(rcnsp1)
    val s2 = u.columnSpace(rcnsp2)
    val s3 = u.columnSpace(rcnsp3)
    val s4 = u.columnSpace(rcnsp4)
    val s5 = u.columnSpace(rcnsp5)
    val s6 = u.columnSpace(rcnsp6)
    val s7 = u.columnSpace(rcnsp7)
    val s8 = u.columnSpace(rcnsp8)
    val s9 = u.columnSpace(rcnsp9)
    val s10 = u.columnSpace(rcnsp10)
    val s11 = u.columnSpace(rcnsp11)
    val s12 = u.columnSpace(rcnsp12)
    val s13 = u.columnSpace(rcnsp13)
    val s14 = u.columnSpace(rcnsp14)
    val s15 = u.columnSpace(rcnsp15)
	assert(u.isEqualM(s1,Array(Array(1.0,0,3),Array(0.0,1,-4))) === true)
	assert(u.isEqualM(s2,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,0,0,2),Array(0.0,1,0,0),Array(0.0,0,1,2))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,0,0,0.25),Array(0.0,1,0,1),Array(0.0,0,1,0.75))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0,0,1,0),Array(0.0,1,1,0),Array(0.0,0,0,1))) === true)
	assert(u.isEqualM(s6,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s7,Array(Array(1.0))) === true)
	assert(u.isEqualM(s8,Array(Array(1.0,-0.2))) === true)
	assert(u.isEqualM(s9,Array(Array(1.0,-1))) === true)
	assert(u.isEqualM(s10,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s11,Array(Array(1.0,-1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s12,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s13,Array(Array(1.0,0,2),Array(0.0,1,5))) === true)
	assert(u.isEqualM(s14,Array(Array(1.0,0,2,-1),Array(0.0,1,5,-1))) === true)
	assert(u.isEqualM(s15,Array(Array(1.0,0,2,-1,0),Array(0.0,1,5,-1,0),Array(0.0,0,0,0,1))) === true)
  }
  
  test("Tests for finding the null basis for a matrix (nullspace)"){
    val s1 = u.nullspace(rcnsp1)
    val s2 = u.nullspace(rcnsp2)
    val s3 = u.nullspace(rcnsp3)
    val s4 = u.nullspace(rcnsp4)
    val s5 = u.nullspace(rcnsp5)
    val s6 = u.nullspace(rcnsp6)
    val s7 = u.nullspace(rcnsp7)
    val s8 = u.nullspace(rcnsp8)
    val s9 = u.nullspace(rcnsp9)
    val s10 = u.nullspace(rcnsp10)
    val s11 = u.nullspace(rcnsp11)
    val s12 = u.nullspace(rcnsp12)
    val s13 = u.nullspace(rcnsp13)
    val s14 = u.nullspace(rcnsp14)
    val s15 = u.nullspace(rcnsp15)
	assert((s1.size == 0) === true)
	assert(u.isEqualM(s2,Array(Array(2.0,-3,1,0))) === true)
	assert(u.isEqualM(s3,Array(Array(0.0,-1,-1,1,0),Array(-2.0,0,0,0,1))) === true)
	assert(u.isEqualM(s4,Array(Array(-1.0,-1,-1,1))) === true)
	assert(u.isEqualM(s5,Array(Array(-2.0,1,0,0,0),Array(5.0,0,4,-2,1))) === true)
	assert(u.isEqualM(s6,Array(Array(-69.0/37,-101.0/37,107.0/37,1))) === true)
	assert(u.isEqualM(s7,Array(Array(0.2,1))) === true)
	assert((s8.size == 0) === true)
	assert(u.isEqualM(s9,Array(Array(2.0,1))) === true)
	assert(u.isEqualM(s10,Array(Array(2.0,1,0))) === true)
	assert((s11.size == 0) === true)
	assert(u.isEqualM(s12,Array(Array(1.0,1,0))) === true)
	assert(u.isEqualM(s13,Array(Array(-1.0,-1,1))) === true)
	assert(u.isEqualM(s14,Array(Array(-1.0,-1,1))) === true)
	assert((s15.size == 0) === true)
  }
  
  test("Tests for finding the basis for the kernel of a linear transformation (kernelLinTr)"){
    val s1 = u.kernelLinTr(lintr1)
    val s2 = u.kernelLinTr(lintr2)
    val s3 = u.kernelLinTr(lintr3)
    val s4 = u.kernelLinTr(lintr4)
    val s5 = u.kernelLinTr(lintr5)
    val s6 = u.kernelLinTr(lintr6)
    val s7 = u.kernelLinTr(lintr7)
    val s8 = u.kernelLinTr(lintr8)
    val s9 = u.kernelLinTr(lintr9)
    val s10 = u.kernelLinTr(lintr10)
    val s11 = u.kernelLinTr(lintr11)
    val s12 = u.kernelLinTr(lintr12)
    val s13 = u.kernelLinTr(lintr13)
    val s14 = u.kernelLinTr(lintr14)
	assert(u.isEqualM(s1,Array(Array(0.0,0,1))) === true)
	assert((s2.size == 0) === true)
	assert(u.isEqualM(s3,Array(Array(-1.0,-1,1,0),Array(2.0/7,-4.0/7,0,1))) === true)
	assert(u.isEqualM(s4,Array(Array(-2.0,-3.0,1,0,0),Array(1.0,-2,0,-3,1))) === true)
	assert(u.isEqualM(s5,Array(Array(-3.0,1))) === true)
	assert(u.isEqualM(s6,Array(Array(-1.0,1,1))) === true)
	assert((s7.size == 0) === true)
	assert(u.isEqualM(s8,Array(Array(-1.0,0,1,0),Array(0.0,-1,0,1))) === true)
	assert(u.isEqualM(s9,Array(Array(0.0,0,1))) === true)
	assert(u.isEqualM(s10,Array(Array(-2.0,1,0,0),Array(-3.4,0,0.6,1))) === true)
	assert((s11.size == 0) === true)
	assert(u.isEqualM(s12,Array(Array(1.0,-1,1))) === true)
	assert(u.isEqualM(s13,Array(Array(-1.0,1,0))) === true)
	assert(u.isEqualM(s14,Array(Array(1.0,0,1))) === true)
  }
  
  test("Tests for finding the basis for the range of a linear transformation (rangeLinTr)"){
    val s1 = u.rangeLinTr(lintr1)
    val s2 = u.rangeLinTr(lintr2)
    val s3 = u.rangeLinTr(lintr3)
    val s4 = u.rangeLinTr(lintr4)
    val s5 = u.rangeLinTr(lintr5)
    val s6 = u.rangeLinTr(lintr6)
    val s7 = u.rangeLinTr(lintr7)
    val s8 = u.rangeLinTr(lintr8)
    val s9 = u.rangeLinTr(lintr9)
    val s10 = u.rangeLinTr(lintr10)
    val s11 = u.rangeLinTr(lintr11)
    val s12 = u.rangeLinTr(lintr12)
    val s13 = u.rangeLinTr(lintr13)
    val s14 = u.rangeLinTr(lintr14)
	assert(u.isEqualM(s1,Array(Array(1.0,0,0),Array(0.0,1,0))) === true)
	assert(u.isEqualM(s2,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s3,Array(Array(1.0,0,1),Array(0.0,1,-1))) === true)
	assert(u.isEqualM(s4,Array(Array(1.0,0,0),Array(0.0,1,0),Array(0.0,0,1))) === true)
	assert(u.isEqualM(s5,Array(Array(1.0,2,3))) === true)
	assert(u.isEqualM(s6,Array(Array(1.0,0,1),Array(0.0,1,-1))) === true)
	assert(u.isEqualM(s7,Array(Array(1.0,0,0,0),Array(0.0,1,0,0),Array(0.0,0,1,0),Array(0.0,0,0,1))) === true)
	assert(u.isEqualM(s8,Array(Array(1.0,0,1),Array(0.0,1,1))) === true)
	assert(u.isEqualM(s9,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s10,Array(Array(1.0,0,-3),Array(0.0,1,1))) === true)
	assert(u.isEqualM(s11,Array(Array(1.0,0,-1),Array(0.0,1,2))) === true)
	assert(u.isEqualM(s12,Array(Array(1.0,0),Array(0.0,1))) === true)
	assert(u.isEqualM(s13,Array(Array(1.0,0,0,0),Array(0.0,0,1,0))) === true)
	assert(u.isEqualM(s14,Array(Array(1.0,0,1),Array(0.0,1,0))) === true)
  }
  
  test("Tests for finding the nullity of a linear transformation (nullityLinTr)"){
    val s1 = u.nullityLinTr(lintr1)
    val s2 = u.nullityLinTr(lintr2)
    val s3 = u.nullityLinTr(lintr3)
    val s4 = u.nullityLinTr(lintr4)
    val s5 = u.nullityLinTr(lintr5)
    val s6 = u.nullityLinTr(lintr6)
    val s7 = u.nullityLinTr(lintr7)
    val s8 = u.nullityLinTr(lintr8)
    val s9 = u.nullityLinTr(lintr9)
    val s10 = u.nullityLinTr(lintr10)
    val s11 = u.nullityLinTr(lintr11)
    val s12 = u.nullityLinTr(lintr12)
    val s13 = u.nullityLinTr(lintr13)
    val s14 = u.nullityLinTr(lintr14)
	assert((s1 == 1) === true)
	assert((s2 == 0) === true)
	assert((s3 == 2) === true)
	assert((s4 == 2) === true)
	assert((s5 == 1) === true)
	assert((s6 == 1) === true)
	assert((s7 == 0) === true)
	assert((s8 == 2) === true)
	assert((s9 == 1) === true)
	assert((s10 == 2) === true)
	assert((s11 == 0) === true)
	assert((s12 == 1) === true)
	assert((s13 == 1) === true)
	assert((s14 == 1) === true)
  }
  
  test("Tests for finding the rank of a linear transformation (rankLinTr)"){
    val s1 = u.rankLinTr(lintr1)
    val s2 = u.rankLinTr(lintr2)
    val s3 = u.rankLinTr(lintr3)
    val s4 = u.rankLinTr(lintr4)
    val s5 = u.rankLinTr(lintr5)
    val s6 = u.rankLinTr(lintr6)
    val s7 = u.rankLinTr(lintr7)
    val s8 = u.rankLinTr(lintr8)
    val s9 = u.rankLinTr(lintr9)
    val s10 = u.rankLinTr(lintr10)
    val s11 = u.rankLinTr(lintr11)
    val s12 = u.rankLinTr(lintr12)
    val s13 = u.rankLinTr(lintr13)
    val s14 = u.rankLinTr(lintr14)
	assert((s1 == 2) === true)
	assert((s2 == 2) === true)
	assert((s3 == 2) === true)
	assert((s4 == 3) === true)
	assert((s5 == 1) === true)
	assert((s6 == 2) === true)
	assert((s7 == 4) === true)
	assert((s8 == 2) === true)
	assert((s9 == 2) === true)
	assert((s10 == 2) === true)
	assert((s11 == 2) === true)
	assert((s12 == 2) === true)
	assert((s13 == 2) === true)
	assert((s14 == 2) === true)
  }
  
  test("Tests for checking if a linear transformation is onto (isOntoLinTr)"){
    val s1 = u.isOntoLinTr(lintr1)
    val s2 = u.isOntoLinTr(lintr2)
    val s3 = u.isOntoLinTr(lintr3)
    val s4 = u.isOntoLinTr(lintr4)
    val s5 = u.isOntoLinTr(lintr5)
    val s6 = u.isOntoLinTr(lintr6)
    val s7 = u.isOntoLinTr(lintr7)
    val s8 = u.isOntoLinTr(lintr8)
    val s9 = u.isOntoLinTr(lintr9)
    val s10 = u.isOntoLinTr(lintr10)
    val s11 = u.isOntoLinTr(lintr11)
    val s12 = u.isOntoLinTr(lintr12)
    val s13 = u.isOntoLinTr(lintr13)
    val s14 = u.isOntoLinTr(lintr14)
	assert((s1 == false) === true)
	assert((s2 == true) === true)
	assert((s3 == false) === true)
	assert((s4 == true) === true)
	assert((s5 == false) === true)
	assert((s6 == false) === true)
	assert((s7 == true) === true)
	assert((s8 == false) === true)
	assert((s9 == true) === true)
	assert((s10 == false) === true)
	assert((s11 == false) === true)
	assert((s12 == true) === true)
	assert((s13 == false) === true)
	assert((s14 == false) === true)
  }
  
  test("Tests for checking if a linear transformation is 1-1 (isOnetoOneLinTr)"){
    val s1 = u.isOnetoOneLinTr(lintr1)
    val s2 = u.isOnetoOneLinTr(lintr2)
    val s3 = u.isOnetoOneLinTr(lintr3)
    val s4 = u.isOnetoOneLinTr(lintr4)
    val s5 = u.isOnetoOneLinTr(lintr5)
    val s6 = u.isOnetoOneLinTr(lintr6)
    val s7 = u.isOnetoOneLinTr(lintr7)
    val s8 = u.isOnetoOneLinTr(lintr8)
    val s9 = u.isOnetoOneLinTr(lintr9)
    val s10 = u.isOnetoOneLinTr(lintr10)
    val s11 = u.isOnetoOneLinTr(lintr11)
    val s12 = u.isOnetoOneLinTr(lintr12)
    val s13 = u.isOnetoOneLinTr(lintr13)
    val s14 = u.isOnetoOneLinTr(lintr14)
	assert((s1 == false) === true)
	assert((s2 == true) === true)
	assert((s3 == false) === true)
	assert((s4 == false) === true)
	assert((s5 == false) === true)
	assert((s6 == false) === true)
	assert((s7 == true) === true)
	assert((s8 == false) === true)
	assert((s9 == false) === true)
	assert((s10 == false) === true)
	assert((s11 == true) === true)
	assert((s12 == false) === true)
	assert((s13 == false) === true)
	assert((s14 == false) === true)
  }
  
  test("Tests for the QR decomposition of a matrix (qr)"){
    val (q1,r1) = u.qr(qr1)
	assert(u.isEqualM(q1,Array(Array(6.0/7,-69.0/175,-58.0/175),Array(3.0/7,158.0/175,6.0/175),Array(-2.0/7,6.0/35,-33.0/35))) === true)
	assert(u.isEqualM(r1,Array(Array(14.0,21,-14),Array(0.0,175,-70),Array(0.0,0,35))) === true)
	assert(u.isEqualM(qr1,u.mulM(q1,r1)) === true)
    val (q2,r2) = u.qr(qr2)
	assert(u.isEqualM(q2,Array(Array(1.0/Math.sqrt(2),1.0/Math.sqrt(6),-1.0/Math.sqrt(3)),Array(1.0/Math.sqrt(2),-1.0/Math.sqrt(6),1.0/Math.sqrt(3)),Array(0.0,2.0/Math.sqrt(6),1.0/Math.sqrt(3)))) === true)
	assert(u.isEqualM(r2,Array(Array(2.0/Math.sqrt(2),1.0/Math.sqrt(2),1.0/Math.sqrt(2)),Array(0.0,3.0/Math.sqrt(6),1.0/Math.sqrt(6)),Array(0.0,0.0,2.0/Math.sqrt(3)))) === true)
	assert(u.isEqualM(qr2,u.mulM(q2,r2)) === true)
    val (q3,r3) = u.qr(qr3)
	assert(u.isEqualM(q3,Array(Array(2.0/Math.sqrt(6),2.0/Math.sqrt(30),-1.0/Math.sqrt(5)),Array(-1.0/Math.sqrt(6),5.0/Math.sqrt(30),0),Array(1.0/Math.sqrt(6),1.0/Math.sqrt(30),2.0/Math.sqrt(5)))) === true)
	assert(u.isEqualM(r3,Array(Array(Math.sqrt(6),-2.0/Math.sqrt(6),4.0/Math.sqrt(6)-3.0/Math.sqrt(6)),Array(0.0,10.0/Math.sqrt(30),4.0/Math.sqrt(30)+15.0/Math.sqrt(30)),Array(0.0,0.0,3.0/Math.sqrt(5)))) === true)
	assert(u.isEqualM(qr3,u.mulM(q3,r3)) === true)
    val (q4,r4) = u.qr(qr4)
	assert(u.isEqualM(q4,Array(Array(0.5,-0.5,0.5),Array(0.5,0.5,-0.5),Array(0.5,0.5,0.5),Array(0.5,-0.5,-0.5))) === true)
	assert(u.isEqualM(r4,Array(Array(2.0,3,2),Array(0.0,5,-2),Array(0.0,0,4))) === true)
	assert(u.isEqualM(qr4,u.mulM(q4,r4)) === true)
    val (q5,r5) = u.qr(qr5)
	assert(u.isEqualM(q5,Array(Array(2*Math.sqrt(5)/5,-7.0*Math.sqrt(30)/90,-Math.sqrt(6)/18),Array(Math.sqrt(5)/5,7.0*Math.sqrt(30)/45,Math.sqrt(6)/9),Array(0.0,Math.sqrt(30)/18,-7.0*Math.sqrt(6)/18))) === true)
	assert(u.isEqualM(r5,Array(Array(Math.sqrt(5),Math.sqrt(5)/5,0),Array(0.0,3.0*Math.sqrt(30)/5,-Math.sqrt(30)/2),Array(0.0,0,Math.sqrt(6)/2))) === true)
	assert(u.isEqualM(qr5,u.mulM(q5,r5)) === true)
    intercept[AssertionError]{u.qr(Array(Array(1.0,2,3),Array(2.0,4,5),Array(3.0,6,7)))}
    intercept[AssertionError]{u.qr(Array(Array(0.0,0,0),Array(2.0,4,5),Array(3.0,6,7)))}
    intercept[AssertionError]{u.qr(Array(Array(1.0,2),Array(2.0,4)))}
  }
  
  // Function to check for weaker equality between Doubles
  def eqDoubleWeaker(x:Double, y: Double): Boolean = return (Math.abs(x-y)<1e-10)
  
  // Function to check for weaker equality between Vetors
  def isEqualVWeaker(x: Array[Double], y: Array[Double]): Boolean = {
    val xsize = x.size
	val ysize = y.size
	if(xsize != ysize) return false
	for(i <- 0 until xsize) if (!eqDoubleWeaker(x(i),y(i))) return false
	return true
  }
  
  test("Tests for the eigenvalues finder for a matrix (eigvals)"){
    val s1 = u.eigvals(qr1)
	assert(isEqualVWeaker(s1,Array(-34.19667500146917,16.05999093950038,156.13668406196879)) === true)
    val s2 = u.eigvals(qr3)
	assert(isEqualVWeaker(s2,Array(1.0,2,3)) === true)
    val s3 = u.eigvals(eig1)
	assert(isEqualVWeaker(s3,Array(2.0,5)) === true)
    val s4 = u.eigvals(eig2)
	assert(isEqualVWeaker(s4,Array(3.0,4,7)) === true)
    val s5 = u.eigvals(eig3)
	assert(isEqualVWeaker(s5,Array(3.0,7)) === true)
    val s6 = u.eigvals(eig4)
	assert(isEqualVWeaker(s6,Array(-2.0,6)) === true)
    val s7 = u.eigvals(eig5)
	assert(isEqualVWeaker(s7,Array(1.0,2,5)) === true)
    val s8 = u.eigvals(eig6)
	assert(isEqualVWeaker(s8,Array(2.0,4,9)) === true)
    val s9 = u.eigvals(eig7)
	assert(isEqualVWeaker(s9,Array(2.0,5)) === true)
    val s10 = u.eigvals(eig8)
	assert(isEqualVWeaker(s10,Array(-1.0,7)) === true)
	intercept[AssertionError]{u.eigvals(eig9)}
    val s11 = u.eigvals(eig10)
	assert(isEqualVWeaker(s11,Array(1.80741759643275,3,7.19258240356725)) === true)
    val s12 = u.eigvals(eig11)
	assert(isEqualVWeaker(s12,Array(1.0,4)) === true)
    val s13 = u.eigvals(eig12)
	assert(isEqualVWeaker(s13,Array(2.0,2,9)) === true)
    val s14 = u.eigvals(eig13)
	assert(isEqualVWeaker(s14,Array(1.0,1,2.90098048640722,13.09901951359278)) === true)
    val s15 = u.eigvals(eig14)
	assert(isEqualVWeaker(s15,Array(-2.0,-2,4)) === true)
    intercept[AssertionError]{u.eigvals(Array(Array(1.0,2,3),Array(2.0,4,5),Array(3.0,6,7)))}
    intercept[AssertionError]{u.eigvals(Array(Array(0.0,0,0),Array(2.0,4,5),Array(3.0,6,7)))}
    intercept[AssertionError]{u.eigvals(Array(Array(1.0,2),Array(2.0,4)))}
	intercept[AssertionError]{u.eigvals(qr4)}
	intercept[AssertionError]{u.eigvals(a)}
	intercept[AssertionError]{u.eigvals(e)}
    intercept[AssertionError]{u.eigvals(qr2)}
    intercept[AssertionError]{u.eigvals(Array(Array(0.0,1),Array(1.0,0)))}
  }
  
  test("Tests for the eigenvectors finder for a matrix (eigvectors)"){
    intercept[AssertionError]{u.eigvectors(qr1)}
    val s2 = u.eigvectors(qr3)
	assert(isEqualVWeaker(s2(0)._2,Array(-1.0,-4,1)) === true)
	assert(isEqualVWeaker(s2(1)._2,Array(0.0,1,0)) === true)
	assert(isEqualVWeaker(s2(2)._2,Array(1.0,2,1)) === true)
    val s3 = u.eigvectors(eig1)
	assert(isEqualVWeaker(s3(0)._2,Array(1.0,0)) === true)
	assert(isEqualVWeaker(s3(1)._2,Array(0.0,1)) === true)
    val s4 = u.eigvectors(eig2)
	assert(isEqualVWeaker(s4(0)._2,Array(1.0,0,0)) === true)
	assert(isEqualVWeaker(s4(1)._2,Array(0.0,1,0)) === true)
	assert(isEqualVWeaker(s4(2)._2,Array(0.0,0,1)) === true)
    val s5 = u.eigvectors(eig3)
	assert(isEqualVWeaker(s5(0)._2,Array(-0.5,1)) === true)
	assert(isEqualVWeaker(s5(1)._2,Array(0.5,1)) === true)
    val s6 = u.eigvectors(eig4)
	assert(isEqualVWeaker(s6(0)._2,Array(-1.0,1)) === true)
	assert(isEqualVWeaker(s6(1)._2,Array(5.0/3,1)) === true)
    val s7 = u.eigvectors(eig5)
	assert(isEqualVWeaker(s7(0)._2,Array(1.0,-1,1)) === true)
	assert(isEqualVWeaker(s7(1)._2,Array(1.0,0,1)) === true)
	assert(isEqualVWeaker(s7(2)._2,Array(0.5,0.5,1)) === true)
    val s8 = u.eigvectors(eig6)
	assert(isEqualVWeaker(s8(0)._2,Array(-0.5,1,0)) === true)
	assert(isEqualVWeaker(s8(1)._2,Array(1.0,0,0)) === true)
	assert(isEqualVWeaker(s8(2)._2,Array(1.28571428571429,0.42857142857143,1)) === true)
    val s9 = u.eigvectors(eig7)
	assert(isEqualVWeaker(s9(0)._2,Array(-1.0,1)) === true)
	assert(isEqualVWeaker(s9(1)._2,Array(0.5,1)) === true)
    val s10 = u.eigvectors(eig8)
	assert(isEqualVWeaker(s10(0)._2,Array(-1.5,1)) === true)
	assert(isEqualVWeaker(s10(1)._2,Array(0.5,1)) === true)
	intercept[AssertionError]{u.eigvectors(eig9)}
    val s11 = u.eigvectors(eig10)
	assert(isEqualVWeaker(s11(0)._2,Array(-1.59629120178363,0.5,1)) === true)
	assert(isEqualVWeaker(s11(1)._2,Array(-1.0,-2,1)) === true)
	assert(isEqualVWeaker(s11(2)._2,Array(1.09629120178363,0.5,1)) === true)
    val s12 = u.eigvectors(eig11)
	assert(isEqualVWeaker(s12(0)._2,Array(-2.0,1)) === true)
	assert(isEqualVWeaker(s12(1)._2,Array(1.0,1)) === true)
    val s13 = u.eigvectors(eig12)
	assert(isEqualVWeaker(s13(0)._2,Array(-6.0,1,1)) === true)
	assert(isEqualVWeaker(s13(1)._2,Array(-6.0,1,1)) === true)
	assert(isEqualVWeaker(s13(2)._2,Array(1.0,1,1)) === true)
    val s14 = u.eigvectors(eig13)
	assert(isEqualVWeaker(s14(0)._2,Array(-3.0,-4,1,1)) === true)
	assert(isEqualVWeaker(s14(1)._2,Array(-3.0,-4,1,1)) === true)
	assert(isEqualVWeaker(s14(2)._2,Array(-0.28172904669025,1.28172904669025,-1.84518714007076,1)) === true)
	assert(isEqualVWeaker(s14(3)._2,Array(0.64536541032662,0.35463458967338,0.93609623097985,1)) === true)
    val s15 = u.eigvectors(eig14)
	assert(isEqualVWeaker(s15(0)._2,Array(0.0,1,1)) === true)
	assert(isEqualVWeaker(s15(1)._2,Array(0.0,1,1)) === true)
	assert(isEqualVWeaker(s15(2)._2,Array(0.5,0.5,1)) === true)
    intercept[AssertionError]{u.eigvectors(Array(Array(1.0,2,3),Array(2.0,4,5),Array(3.0,6,7)))}
    intercept[AssertionError]{u.eigvectors(Array(Array(0.0,0,0),Array(2.0,4,5),Array(3.0,6,7)))}
    intercept[AssertionError]{u.eigvectors(Array(Array(1.0,2),Array(2.0,4)))}
	intercept[AssertionError]{u.eigvectors(qr4)}
	intercept[AssertionError]{u.eigvectors(a)}
	intercept[AssertionError]{u.eigvectors(e)}
    intercept[AssertionError]{u.eigvectors(qr2)}
    intercept[AssertionError]{u.eigvectors(Array(Array(0.0,1),Array(1.0,0)))}
  }
  
}