/** The basic operations for a matrix-vector library
 */

class MVOperations{
  
  /** Matrix made of an array of Double-valued arrays.
   */
  type Matrix = Array[Array[Double]]
  
  /** Column vector made of an array of Double values.
   */
  type Vector = Array[Double]
  
  // Get the number of rows of the matrix
  private def getRows (x: Matrix) : Int = x.size
  
  // Get the number of columns of the matrix
  private def getColumns(x: Matrix) : Int = x(0).size
  
  /** Print a matrix.
   * @param x matrix to be printed
   */
  def printM(x: Matrix): Unit = {
    val rx = getRows(x); val cx = getColumns(x)
	for(i <- 0 until rx){
	  for (j <- 0 until cx) print(s"${x(i)(j)}\t")
	  println
	}
  }
  
  /** Print a vector.
   * @param x vector to be printed
   */
  def printV(x: Vector): Unit = {
    val xsize = x.size
	for(i <- 0 until xsize) print(s"${x(i)}\n")
  }  
  
  /** Add two matrices.
   * @param x first matrix
   * @param y second matrix
   * @return the result of addition in a third matrix
   */
  def addM(x: Matrix, y: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	val ry = getRows(y); val cy = getColumns(y)
    assert(rx == ry && cx == cy, "The dimensions of the matrices are not equal!")
	val z = Array.ofDim[Double](rx,cx)
    for (i <- 0 until rx)
	  for (j <- 0 until cx)
	    z(i)(j) = x(i)(j) + y(i)(j)
	return z
  }
  
  /** Add two vectors.
   * @param x first vector
   * @param y second vector
   * @return the result of addition in a third vector
   */
  def addV(x: Vector, y: Vector): Vector = {
    val xsize = x.size; val ysize = y.size
    assert(xsize == ysize, "The dimensions of the vectors are not equal!")
	val z = new Array[Double](xsize)
    for (i <- 0 until xsize) z(i) = x(i) + y(i)
	return z
  }
  
  /** Subtract two matrices.
   * @param x left operand matrix
   * @param y right operand matrix
   * @return the result of subtraction in a third matrix
   */
  def subM(x: Matrix, y: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	val ry = getRows(y); val cy = getColumns(y)
    assert(rx == ry && cx == cy, "The dimensions of the matrices are not equal!")
	val z = Array.ofDim[Double](rx,cx)
    for (i <- 0 until rx)
	  for (j <- 0 until cx)
	    z(i)(j) = x(i)(j) - y(i)(j)
	return z
  }
  
  /** Subtract two vectors.
   * @param x left operand vector
   * @param y right operand vector
   * @return the result of subtraction in a third vector
   */
  def subV(x: Vector, y: Vector): Vector = {
    val xsize = x.size; val ysize = y.size
    assert(xsize == ysize, "The dimensions of the vectors are not equal!")
	val z = new Array[Double](xsize)
    for (i <- 0 until xsize) z(i) = x(i) - y(i)
	return z
  }
  
  /** Multiply a matrix by a constant.
   * @param ct the constant to be multiplied by
   * @param x the matrix which is multiplied
   * @return the result of constant multiplication in a new matrix
   */
  def ctmulM(ct: Double, x: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
    val z = Array.ofDim[Double](rx,cx)
	for(i <- 0 until rx)
	  for(j <- 0 until cx)
	    z(i)(j) = ct * x(i)(j)
    return z
  }
   
  /** Multiply a vector by a constant.
   * @param ct the constant to be multiplied by
   * @param x the vector which is multiplied
   * @return the result of constant multiplication in a new vector
   */
  def ctmulV(ct: Double, x: Vector): Vector = {
    val xsize = x.size
	val z = new Array[Double](xsize)
	for(i <- 0 until xsize) z(i) = ct * x(i)
    return z
  }
  
  /** Change a matrix's size.
   * @param x matrix to be changed
   * @param r number of rows of the new matrix
   * @param c number of columns of the new matrix
   * @return a new matrix with changed size
   */
  def fillM(x: Matrix, r: Int, c: Int): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	assert(r > 0 && c > 0, "The new matrix should have positive dimensions!")
	val z= Array.ofDim[Double](r,c)
	val minr = Math.min(rx,r)
	val minc = Math.min(cx,c)
	for(i <- 0 until minr)
	  for(j <- 0 until minc)
	    z(i)(j) = x(i)(j)
	return z
  }
  
  /** Change a vector's size.
   * @param x vector to be changed
   * @param d number of elements of the new vector
   * @return a new vector with changed size
   */
  def fillV(x: Vector, d: Int): Vector = {
    val xsize = x.size
	assert(d > 0, "The new vector should have positive dimension!")
	val z = new Array[Double](d)
	val mind = Math.min(xsize,d)
	for(i <- 0 until mind)
	  z(i) = x(i)
	return z
  }
  
  // Multiply 2 matrices with the naive O(n^3) algorithm.
  private def naiveMul(x: Matrix, y: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	val ry = getRows(y); val cy = getColumns(y)
	val z = Array.ofDim[Double](rx,cy)
	for(i <- 0 until rx)
	  for(j <- 0 until cy)
	    for(k <- 0 until cx)
		  z(i)(j)+= x(i)(k)*y(k)(j)
    return z
  }
  
  // Divide a square matrix in 4.
  private def divide4(x: Matrix): (Matrix,Matrix,Matrix,Matrix)={
    val rx = getRows(x); val ry = getColumns(x)
	val x1 = Array.ofDim[Double](rx/2,ry/2)
	val x2 = Array.ofDim[Double](rx/2,ry/2)
	val x3 = Array.ofDim[Double](rx/2,ry/2)
	val x4 = Array.ofDim[Double](rx/2,ry/2)
	val mid = rx/2
	for(i <- 0 until mid;j <- 0 until mid){
	  x1(i)(j)=x(i)(j)
	  x2(i)(j)=x(i)(j+mid)
	  x3(i)(j)=x(i+mid)(j)
	  x4(i)(j)=x(i+mid)(j+mid)
	}
	return(x1,x2,x3,x4)
  }
  
  // Combine 4 square matrices into 1.
  private def combine4(sol1: Matrix,sol2: Matrix,sol3: Matrix,sol4: Matrix): Matrix = {
	val mid = getRows(sol1)
	val sz = mid * 2
	val z = Array.ofDim[Double](sz,sz)
	for(i <- 0 until mid;j <- 0 until mid){
	  z(i)(j)=sol1(i)(j)
	  z(i)(j+mid)=sol2(i)(j)
	  z(i+mid)(j)=sol3(i)(j)
	  z(i+mid)(j+mid)=sol4(i)(j)
	}
	return z
  }
  
  // Multiply 2 matrices both square with Strassen's method combined with the naive method.
  private def betterMul(x: Matrix, y: Matrix): Matrix = {
    val sz = getRows(x)
	if(sz <= 128 || sz%2 != 0) return naiveMul(x,y)
	else {
      val (a,b,c,d)= divide4(x)
      val (e,f,g,h)= divide4(y)
	  val p1 = betterMul(a,subM(f,h))
	  val p2 = betterMul(addM(a,b),h)
	  val p3 = betterMul(addM(c,d),e)
	  val p4 = betterMul(d,subM(g,e))
      val p5 = betterMul(addM(a,d),addM(e,h))
	  val p6 = betterMul(subM(b,d),addM(g,h))
	  val p7 = betterMul(subM(a,c),addM(e,f))
	  val sol1 = addM(subM(addM(p5,p4),p2),p6)
	  val sol2 = addM(p1,p2)
	  val sol3 = addM(p3,p4)
	  val sol4 = subM(subM(addM(p1,p5),p3),p7)
	  return combine4(sol1,sol2,sol3,sol4)
	}
  }
  
  /** Multiply two matrices.
   * @param x first matrix
   * @param y second matrix
   * @return the result of multiplication in a third matrix
   */
  def mulM(x: Matrix, y: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	val ry = getRows(y); val cy = getColumns(y)
	assert(cx == ry, "The matrices are not compatible for multiplication!")
	if(rx == cx && ry == cy && rx >= 128){
	  val sz = rx
	  var copy:Double = sz
	  var power = 1
	  while (copy.toInt >= 128 ) {copy /= 2; power *= 2}
	  var p = copy.toInt + 1
	  p *= power
	  val newx = fillM(x,p,p)
	  val newy = fillM(y,p,p)
	  // fill so that when divided we will get to apply the normal method for size 
	  // between 64 and 128 which turned out to be optimal to get the best time
	  val z = betterMul(newx,newy)
	  val sol = fillM(z,sz,sz)
	  return sol	
	}
	else return naiveMul(x,y)
  }
  
  /** Multiply two vectors.
   * @param x first vector
   * @param y second vector
   * @return the result of multiplication in a Double value
   */
  def mulV(x: Vector, y: Vector): Double = {
    val xsize = x.size; val ysize = y.size
	assert(xsize == ysize, "The vectors are not compatible for multiplication")
	var sol:Double = 0
	for (i <- 0 until xsize)
	  sol += x(i) * y(i)
	return sol
  }
  
  // Is the matrix a column vector?
  private def isVector(x: Matrix): Boolean = return (getColumns(x) == 1)
  
  /** Transform a matrix into a vector.
   * @param x matrix to be transformed
   * @return x as a vector if possible
   */
  def matrtovect(x: Matrix): Vector = {
    assert(isVector(x), "The matrix should have only 1 column!")
	val vsize = x.size
	val z = new Array[Double](vsize)
	for(i <- 0 until vsize) z(i) = x(i)(0)
	return z
  }  
  
  /** Transform a vector into a matrix.
   * @param x vector to be transformed
   * @return x as a matrix
   */
  def vecttomatr(x: Vector): Matrix = {
	val xsize = x.size
	val z = Array.ofDim[Double](xsize,1)
	for(i <- 0 until xsize) z(i)(0) = x(i)
	return z
  }
  
  // Is the matrix 1x1?
  private def isValue(x: Matrix): Boolean =  return (getRows(x) == 1 && getColumns(x) == 1)
  
  /** Transform a 1x1 matrix into a value.
   * @param x matrix to be transformed
   * @return x as a value
   */
  def matrtoval(x: Matrix): Double = {
    assert(isValue(x), "The matrix should have only 1 column!")
	return x(0)(0)
  }
  
  /** Multiply a matrix and a vector.
   * @param x matrix multiplied
   * @param y vector multiplied
   * @return the result of multiplication in a new vector
   */
  def mulMV(x: Matrix, y: Vector): Vector = {
    val cx = getColumns(x)
	val ysize = y.size
	assert(cx == ysize, "The matrix and the vector are not compatible")
    val z = vecttomatr(y)
	val sol = mulM(x,z)
	return matrtovect(sol)
  }
  /** Copy a matrix.
   * @param x matrix copied
   * @return the result in a new matrix
   */
  def copyM(x: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	val z = Array.ofDim[Double](rx,cx)  
	for(i <- 0 until rx)
	  for(j <- 0 until cx) z(i)(j) = x(i)(j)
	return z
  }
  
  /** Copy a vector.
   * @param x vector copied
   * @return the result in a new vector
   */
  def copyV(x: Vector): Vector = {
    val xsize=x.size
	val z = new Array[Double](xsize)
	for(i <- 0 until xsize) z(i) = x(i)
	return z
  }
    
  /** Generate the identity matrix.
   * @param size the dimension of the identity matrix
   * @return the generated identity matrix
   */
  def genId(sz: Int): Matrix = {
    assert(sz > 0, "The dimension of the identity matrix should be positive!")
    val z = Array.ofDim[Double](sz,sz)
	for(i <- 0 until sz) z(i)(i) = 1.0
	return z
  }

  // Fast exponentiation algorithm ( O(x.size^2*log ct))
  private def fastExp(x: Matrix, ct: Int): Matrix = {
    val xsize = getRows(x)
	// Invariant I: sol * z^k = x^ct
	var sol = genId(xsize) // sol = Id
	var z = copyM(x)
	var k = ct
	while(k > 0){
	  if(k%2 == 0){
	    z = mulM(z,z)
		k = k/2
	  }
	  else{
	    sol = mulM(sol,z)
		z = mulM(z,z)
		k = k/2   
	  }
	}
	return sol
  }
  
  /** Exponentiate a square matrix by a natural number.
    * @param x matrix exponentiated
	* @param ct constant used for exponentiation
    * @return the result in a new matrix
   */
  def expM(x: Matrix, ct: Int): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	assert(rx == cx, "The matrix should be square!")
	assert(ct >= 1, "The constant should be positive!")
	return fastExp(x,ct)
  }
  
  /** Transpose a matrix.
   * @param x matrix transposed
   * @return the result in a new matrix
   */
  def transposeM(x: Matrix): Matrix = {
    val rx = getRows(x); val cx = getColumns(x)
	val z = Array.ofDim[Double](cx,rx)
	for(i <- 0 until cx)
	  for(j <- 0 until rx)
	    z(i)(j)=x(j)(i)
	return z
  }
  
  /** Transpose a vector.
   * @param x vector transposed
   * @return the result in a new matrix
   */
  def transposeV(x: Vector) : Matrix = {
	val y = vecttomatr(x)
	val z = transposeM(y)
	return z
  }
  
  /** Find the length of a vector.
   * @param x vector for which we compute the length
   * @return the length of the vector
   */
  def lengthV(x: Vector): Double = {
    val z = mulV(x,x)
	val sol = Math.sqrt(z)
	return sol
  }
  
  /** Find the angle between 2 vectors (in degrees).
   * @param x first vector used
   * @param y second vector used
   * @return the angle between the 2 vectors
   */
  def angleV(x: Vector,y: Vector): Double ={
    val xsize = x.size
	val ysize = y.size
	assert(xsize == ysize, "The vectors are not compatible!")
    val md:Double = lengthV(x)*lengthV(y)
    val z:Double = mulV(x,y)/md
	val cs = Math.acos(z)
	val sol = Math.toDegrees(cs)
	return sol
  }
  
  // Function to check if two real values are equal
  private def isEqual(x: Double,y: Double): Boolean = return(Math.abs(x-y)<1e-12)
  
  /** Check if two matrices are equal.
   * @param x first matrix to be checked for equality
   * @param y second matrix to be checked for equality
   * @return true if x=y, false otherwise
   */
  def isEqualM(x: Matrix, y: Matrix): Boolean = {
    val rx = getRows(x); val cx = getColumns(x)
	val ry = getRows(y); val cy = getColumns(y)
	if(rx != ry || cx != cy) return false
	for(i <- 0 until rx)
	  for(j <- 0 until cx) if (!isEqual(x(i)(j),y(i)(j))) return false
	return true
  }
    
  /** Check if two vectors are equal.
   * @param x first vector to be checked for equality
   * @param y second vector to be checked for equality
   * @return true if x=y, false otherwise
   */
  def isEqualV(x: Vector, y: Vector): Boolean = {
    val xsize = x.size
	val ysize = y.size
	if(xsize != ysize) return false
	for(i <- 0 until xsize) if (!isEqual(x(i),y(i))) return false
	return true
  }
  
  /** Check if a square matrix is symmetric.
   * @param x the matrix checked for symmetry
   * @return true if x is symmetric, false otherwise
   */
  def isSymmetric(x: Matrix): Boolean = {
    val rx = getRows(x); val cx = getColumns(x)
	assert(rx == cx, "The matrix should be square!")
    val y = transposeM(x)
	return isEqualM(x,y)
  }
  
  /** Add a multiple of one row to another one in a matrix (rows indexed from 1).
   * @param x the matrix used for the operations
   * @param r1 the row to be added
   * @param r2 the row where addition is made
   * @param k the multiple used
   */
  def elOpAdd(x: Matrix, r1: Int, r2: Int, k: Double): Unit = {
    val rx = getRows(x); val cx = getColumns(x)
	val rin = r1 - 1; val rout = r2 - 1	// Rows indexed from 0
	assert(0 <= rin && rin < rx && 0 <= rout && rout < rx, "The rows used should be part of the matrix!")
	assert(rin != rout, "The rows used should be different!")
	for (j <- 0 until cx) x(rout)(j)+= k * x(rin)(j)
  }
  
  /** Switch a row with another one in a matrix (rows indexed from 1).
   * @param x the matrix used for the operations
   * @param r1 the first row to be switched
   * @param r2 the second row to be switched
   */  
  def elOpSwitch(x: Matrix, r1: Int, r2: Int): Unit = {
    val rx = getRows(x); val cx = getColumns(x)
	val rsw1 = r1 - 1; val rsw2 = r2 - 1 // Rows indexed from 0
	assert(0 <= rsw1 && rsw1 < rx && 0 <= rsw2 && rsw2 < rx, "The rows used should be part of the matrix!")
	assert(rsw1 != rsw2, "The rows used should be different!")
	for (j <- 0 until cx){
	  val aux = x(rsw1)(j)
	  x(rsw1)(j) = x(rsw2)(j)
	  x(rsw2)(j) = aux
    }
  }
  
  /** Multiply a row by a constant in a matrix (rows indexed from 1).
   * @param x the matrix used for the operations
   * @param r the row to be multiplied
   * @param k the multiple used
   */
  def elOpMul(x: Matrix, r: Int, k: Double): Unit = {
    val rx = getRows(x); val cx = getColumns(x)
	val row = r - 1 // Rows indexed from 0
	assert(0 <= row && row < rx, "The row used should be part of the matrix!")
	for (j <- 0 until cx) x(row)(j)*= k
  }
  
  /** Create an elementary matrix for addition of rows (rows indexed from 1).
   * @param sz the size of the elementary matrix
   * @param r1 the row to be added
   * @param r2 the row where addition is made
   * @return the elementary matrix for addition
   */
  def elMAdd(sz: Int, r1: Int, r2: Int, k: Double): Matrix = {
	val rin = r1 - 1; val rout = r2 - 1 // Rows indexed from 0
	assert(0 <= rin && rin < sz && 0 <= rout && rout < sz, "The rows used should be part of the matrix!")
	assert(rin != rout, "The rows used should be different!")
	val z = genId(sz)
	z(rout)(rin) = k
	return z
  }
  
  /** Create an elementary matrix for switching rows (rows indexed from 1).
   * @param sz the size of the elementary matrix
   * @param r1 the first row to be switched
   * @param r2 the second row to be switched
   * @return the elementary matrix for switching
   */  
  def elMSwitch(sz: Int, r1: Int, r2: Int): Matrix = {
	val rsw1 = r1 - 1; val rsw2 = r2 - 1 // Rows indexed from 0
	assert(0 <= rsw1 && rsw1 < sz && 0 <= rsw2 && rsw2 < sz, "The rows used should be part of the matrix!")
	assert(rsw1 != rsw2, "The rows used should be different!")
	val z = genId(sz)
	z(rsw1)(rsw2) = 1; z(rsw2)(rsw1) = 1
	z(rsw1)(rsw1) = 0; z(rsw2)(rsw2) = 0
	return z
  }
  
  /** Create an elementary matrix for multiplying a row (rows indexed from 1).
   * @param sz the size of the elementary matrix
   * @param r the row to be multiplied
   * @param k the multiple used
   * @return the elementary matrix for multiplication
   */
  def elMMul(sz: Int, r: Int, k: Double): Matrix = {
	val row = r - 1 // Rows indexed from 0
	assert(0 <= row && row < sz, "The row used should be part of the matrix!")
	val z = genId(sz)
	z(row)(row) = k
	return z
  }
  
  // Function to check if a real value is 0
  private def is0(x: Double): Boolean = return(Math.abs(x-0.0)<1e-12)
  
  /** Reduce a matrix to its Row Echelon Form.
   * @param x the matrix reduced to REF
   * @return the REF of x
   */
  def ref(x: Matrix): Matrix = {
    val z = copyM(x)
	val rz = getRows(z); val cz = getColumns(z)
	var cR = 0 // current row
	var cC = 0 // current column
	while(cR < rz && cC < cz){
	  if(!is0(z(cR)(cC))){ // if current pivot not 0
	    for(i <- cR + 1 until rz){
		  val constant:Double = -z(i)(cC)/z(cR)(cC)
		  elOpAdd(z,cR+1,i+1,constant)
		  z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
		cR += 1; cC += 1
	  }
	  else{ // else change pivot
		var i = rz-1
		var sol = -1
	    while(i > cR && sol == -1){
		  if(!is0(z(i)(cC))) sol = i
		  i -= 1
		}
		if(sol == -1) cC += 1 // we have a 0-valued column
		else{
		  elOpSwitch(z,cR+1,sol+1)
		  for(i <- cR + 1 until rz){
		    val constant:Double = -z(i)(cC)/z(cR)(cC)
			elOpAdd(z,cR+1,i+1,constant)
		    z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		  }
		  cR += 1; cC += 1
		}
	  }
	}
    return z
  }

  /** Reduce a matrix to its Reducec Row Echelon Form.
   * @param x the matrix reduced to RREF
   * @return the RREF of x
   */
  def rref(x: Matrix): Matrix = {
    val z = ref(x)
	val rz = getRows(z); val cz = getColumns(z)
	var cR = rz-1 // current row
	var cC = 0    // current column
	while(cR >= 0){
	  cC = cR
	  while(cC < cz && is0(z(cR)(cC))) cC+= 1 // search the pivot on row cR
	  if(cC < cz){
	    val constant:Double = 1.0/z(cR)(cC)
		elOpMul(z,cR+1,constant)
		z(cR)(cC) = 1.0 // otherwise sometimes we get 1 + a number of order 1e-16
		for(i <- cR-1 to 0 by -1){
		  val constant2:Double = -z(i)(cC)
		  elOpAdd(z,cR+1,i+1,constant2)
		  z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
	  }
	  cR -= 1
	}
	for(i <- 0 until rz; j <- 0 until cz) if(is0(z(i)(j))) z(i)(j) = 0.0	
	return z
  }
  
  /** Find the inverse of a matrix.
   * @param x the matrix for which we search for the
   * @return the inverse of the matrix
   */
  def inverse(x: Matrix): Matrix ={
    val rx = getRows(x); val cx = getColumns(x)
	assert(rx == cx, "The matrix should be square!")
    val z = copyM(x)
	val rz = getRows(z); val cz = getColumns(z)
	val solution = genId(rz)
	var cR = 0 // current row
	var cC = 0 // current column
	while(cR < rz && cC < cz){
	  if(!is0(z(cR)(cC))){ // if current pivot not 0
	    for(i <- cR + 1 until rz){
		  val constant:Double = -z(i)(cC)/z(cR)(cC)
		  elOpAdd(z,cR+1,i+1,constant)
		  elOpAdd(solution,cR+1,i+1,constant)
		  z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
		cR += 1; cC += 1
	  }
	  else{ // else change pivot
		var i = rz-1
		var sol = -1
	    while(i > cR && sol == -1){
		  if(!is0(z(i)(cC))) sol = i
		  i -= 1
		}
		if(sol == -1) cC += 1 // we have a 0-valued column
		else{
		  elOpSwitch(z,cR+1,sol+1)
		  elOpSwitch(solution,cR+1,sol+1)
		  for(i <- cR + 1 until rz){
		    val constant:Double = -z(i)(cC)/z(cR)(cC)
			elOpAdd(z,cR+1,i+1,constant)
			elOpAdd(solution,cR+1,i+1,constant)
		    z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		  }
		  cR += 1; cC += 1
		}
	  }
	}
	cR = rz -1 // current row
	cC = 0     // current column
	while(cR >= 0){
	  cC = cR
	  while(cC < cz && is0(z(cR)(cC))) cC+= 1 // search the pivot on row cR
	  if(cC < cz){
	    val constant:Double = 1.0/z(cR)(cC)
		elOpMul(z,cR+1,constant)
		elOpMul(solution,cR+1,constant)
		z(cR)(cC) = 1.0 // otherwise sometimes we get 1 + a number of order 1e-16
		for(i <- cR-1 to 0 by -1){
		  val constant2:Double = -z(i)(cC)
		  elOpAdd(z,cR+1,i+1,constant2)
		  elOpAdd(solution,cR+1,i+1,constant2)
		  z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
	  }
	  cR -= 1
	}
	for(i <- 0 until rz; j <- 0 until cz) if(is0(z(i)(j))) z(i)(j) = 0.0
    val id = genId(rz)	
	assert(isEqualM(z,id), "The matrix is not invertible!")
	return solution
  }
  
  /** Find the rank of a matrix.
   * @param x the matrix for which we compute the rank
   * @return the rank of the matrix
   */
  def rank(x: Matrix): Int = {
    val z = ref(x)
	val rz = getRows(z); val cz = getColumns(z)
	var cR = 0 // current row
	var cC = 0 // current column
	var sol = 0
    while(cR < rz && cC < cz) {
	  if(!is0(z(cR)(cC))){
	    sol += 1
		cR += 1; cC += 1
	  }
	  else cC += 1
	}
	return sol
  }
  
  
  // The inverse of the addition elementary matrix
  private def elMAddInv(sz: Int, r1: Int, r2: Int, k: Double) : Matrix = elMAdd(sz,r1,r2,-k)
  
  // The inverse of the switch elementary matrix
  private def elMSwitchInv(sz: Int, r1: Int, r2: Int): Matrix = elMSwitch(sz,r1,r2)
  
  // The inverse of the multiplication elementary matrix
  private def elMMulInv(sz: Int, r: Int, k: Double): Matrix = elMMul(sz,r,1.0/k)


  // PLU decomposition returning p,l,u and the number of switches we made (for determinant) for a square matrix 	
  private def pludec(x: Matrix): (Matrix,Matrix,Matrix,Int) = {
    val rx = getRows(x); val cx = getColumns(x)
	assert(rx == cx, "The matrix should be square")
	var nbsw =  0 // number of switches
	var cR = 0 // currrent row
	val z = copyM(x)
	val rz = rx
	val swMoves = new scala.collection.mutable.Queue[(Int,Int)] // queue with the switch moves for the permutation matrix
	while(cR < rz){ // search for permutation matrix
	  if(!is0(z(cR)(cR))){ // if current pivot not 0
		for(i <- cR + 1 until rz){
		  val constant:Double = -z(i)(cR)/z(cR)(cR)
		  elOpAdd(z,cR+1,i+1,constant)
		  z(i)(cR) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
	  }
	  else{ // else change pivot
	    var i = rz-1
		var sol = -1
		while(i > cR && sol == -1){
		  if(!is0(z(i)(cR))) sol = i
		  i -= 1
		}
		if(sol != -1){
		  swMoves.enqueue((cR,sol))
		  nbsw += 1
		  elOpSwitch(z,cR+1,sol+1)
		  for(i <- cR + 1 until rz){
		    val constant:Double = -z(i)(cR)/z(cR)(cR)
			elOpAdd(z,cR+1,i+1,constant)
			z(i)(cR) = 0.0 // otherwise sometimes we get a number of order 1e-16
		  }
		}
	  }
	  cR += 1
	}
	var p = genId(rx)
	while(!swMoves.isEmpty){
	  val (sw1,sw2) = swMoves.dequeue
	  val cp = elMSwitch(rx,sw1+1,sw2+1)
	  p = mulM(cp,p)
	}
	val u = mulM(p,x)
	val ru = rx
	var l = genId(rx)
	cR = 0 // current row
	while(cR < ru){ // we can now use only add operations to find L and U
	  if(!is0(u(cR)(cR))){
	    for(i <- cR + 1 until ru){
		  val constant:Double = -u(i)(cR)/u(cR)(cR)
		  elOpAdd(u,cR+1,i+1,constant)
		  val invM = elMAddInv(ru,cR+1,i+1,constant)
		  l = mulM(l,invM)
		  u(i)(cR) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
	  }
	  cR += 1
	}
	return (p,l,u,nbsw)
  }
  
  /** PLU decomposition of a square matrix.
   * @param x the matrix which we decompose in the PLU form
   * @return p, l and u such that p*x = l*u were p is a permutation matrix, l a lower-triangular matrix, and u an upper-triangular matrix
   */
  def plu(x: Matrix): (Matrix,Matrix,Matrix) ={
    val sol = pludec(x)
	return (sol._1,sol._2,sol._3)
  }
  
  /** Determinant of a square matrix.
   * @param x the matrix for which we compute the determinant
   * @return the determinant of the matrix
   */
  def det(x: Matrix): Double ={
    val rx = getRows(x)
    val (p,l,u,nbsw) = pludec(x) // p*x = l*u and nbsw has the number of switches to x
	val detl = 1.0 // the determinant of l is 1 
	var detinvp = 1.0
	if(nbsw%2 == 1) detinvp = -1.0 // the determinant of p is (-1)^nbsw and so is the determinant of the inverse of p
	var detu = 1.0 
	for(i <- 0 until rx)  detu*=u(i)(i) // the determinant of u is the product of elements on the diagonal
	var detx = detinvp * detl * detu // p*x=l*u <=> x=(p^-1)*l*u (as p is invertible)
	if(is0(detx)) detx = 0.0 // 0.0 instead of -0.0
	return detx
  }
  
  // Find the pivot on a line of a matrix or -1 if there is not one
  private def findPivot(x: Matrix, row: Int): Option[Int] = {
    val column = getColumns(x)
    for (i <- 0 until column) if(!is0(x(row)(i))) return Some(i)
	return None
  }
  
  // solver for linear system depending on the task given by the variable tp
  private def solver(a: Matrix, b: Vector,tp: Int): (Array[Vector],Vector) ={
    val ra = getRows(a); val ca = getColumns(a)
	val bsize = b.size
	assert(ra == bsize, "A and b are not compatible!")
    val z = copyM(a)
	val rz = getRows(z); val cz = getColumns(z)
	val reduced = vecttomatr(b)
	var cR = 0 // current row
	var cC = 0 // current column
	while(cR < rz && cC < cz){
	  if(!is0(z(cR)(cC))){ // if current pivot not 0
	    for(i <- cR + 1 until rz){
		  val constant:Double = -z(i)(cC)/z(cR)(cC)
		  elOpAdd(z,cR+1,i+1,constant)
		  elOpAdd(reduced,cR+1,i+1,constant)
		  z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
		cR += 1; cC += 1
	  }
	  else{ // else change pivot
		var i = rz-1
		var sol = -1
	    while(i > cR && sol == -1){
		  if(!is0(z(i)(cC))) sol = i
		  i -= 1
		}
		if(sol == -1) cC += 1 // we have a 0-valued column
		else{
		  elOpSwitch(z,cR+1,sol+1)
		  elOpSwitch(reduced,cR+1,sol+1)
		  for(i <- cR + 1 until rz){
		    val constant:Double = -z(i)(cC)/z(cR)(cC)
			elOpAdd(z,cR+1,i+1,constant)
			elOpAdd(reduced,cR+1,i+1,constant)
		    z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		  }
		  cR += 1; cC += 1
		}
	  }
	}
	cR = rz -1 // current row
	cC = 0     // current column
	while(cR >= 0){
	  cC = cR
	  while(cC < cz && is0(z(cR)(cC))) cC+= 1 // search the pivot on row cR
	  if(cC < cz){
	    val constant:Double = 1.0/z(cR)(cC)
		elOpMul(z,cR+1,constant)
		elOpMul(reduced,cR+1,constant)
		z(cR)(cC) = 1.0 // otherwise sometimes we get 1 + a number of order 1e-16
		for(i <- cR-1 to 0 by -1){
		  val constant2:Double = -z(i)(cC)
		  elOpAdd(z,cR+1,i+1,constant2)
		  elOpAdd(reduced,cR+1,i+1,constant2)
		  z(i)(cC) = 0.0 // otherwise sometimes we get a number of order 1e-16
		}
	  }
	  cR -= 1
	}
	for(i <- 0 until rz; j <- 0 until cz) if(is0(z(i)(j))) z(i)(j) = 0.0
	for(i <- 0 until rz) if(is0(reduced(i)(0))) reduced(i)(0) = 0.0
	val ans:Vector = new Array[Double](cz) // solution to the inhomogenuous system
	var visited = new Array[Boolean](cz)
	var pivots = new Array[Int](rz) // the positions of the pivots
    // Now we need to solve z*x = reduced
	cR = rz - 1
	while(cR >= 0){
	  val pos = findPivot(z,cR)
	  pos match{
	    case Some(s) =>{
	      pivots(cR) = s
		  cC = s
		  var sum = 0.0
		  for(j <- cC + 1 until cz) sum += z(cR)(j)* ans(j)
		  ans(cC) = reduced(cR)(0) - sum
		  visited(cC) = true
		}
	    case None =>{
	      pivots(cR) = cz
		  if(!is0(reduced(cR)(0))){
		    if(tp == 0) println("The system is inconsistent!")
		    return (Array[Array[Double]](),Array[Double]())
		  }
		}
	  }
	  cR -= 1
	}
	var count = 0 // the number of free variables in the solution of the system
	var positions = new Array[Int](0) // the array of free variables in the solution
	for(i <- 0 until cz) if (!visited(i)) {count += 1; positions:+=i}
	// count is also the number of elements in the basis of the homogenuous solution
	if(tp == 0){
	  if(count > 0) println("The system has an infinite number of solutions!")
	  else println("The system has a unique solution!")
	}
	var basis:Array[Vector] = Array[Array[Double]]()
	// count is also the size of the basis
	for(i <- 0 until count){
	  basis :+= new Array[Double](cz)
	  basis(i)(positions(i)) = 1.0
	}
	for(i <- 0 until count)
	  for(j <- 0 until rz)
	    if(pivots(j)!= cz && !is0(z(j)(positions(i)))) basis(i)(pivots(j)) = -z(j)(positions(i))
	if(tp == 0){
	  println
	  // printing the solution
	  for(i <- 0 until cz){
	    print(s"x$i = ")
	    var ok: Boolean = false 
	    if(!is0(ans(i))) {print(s"${ans(i)}"); ok = true}
	    for(j <- 0 until count)
	      if(!is0(basis(j)(i))){
		    if(!ok){print(s"${basis(j)(i)}*a$j"); ok = true}
		    else print(s" + ${basis(j)(i)}*a$j")
		  }
	    if(!ok) println(s"0.0")
	    else println
	  }
	  println
	}
	
	return (basis,ans)
  }
  
  /** System of linear equations solver.
   * @param a the matrix of coefficients
   * @param b the vector of constant terms
   * @return the general solution to the system in a tuple (basis for the homogenuous system solution,a solution to the inhomogenuous system)
   */
  def sysSolve(a: Matrix, b: Vector): (Array[Vector],Vector) ={
     return solver(a,b,0)
  }

  /** System of linear equations solver without messages printed.
   * @param a the matrix of coefficients
   * @param b the vector of constant terms
   * @return the general solution to the system in a tuple (basis for the homogenuous system solution,a solution to the inhomogenuous system)
   */
  def noMsgSysSolve(a: Matrix, b: Vector): (Array[Vector],Vector) ={
     return solver(a,b,-1)
  }
  
  /** Check if a set of vectors is linearly independent.
   * @param a the array of vectors for which we check independence
   * @return true if the vectors are linerly independent, false otherwise
   */
  def isInd(a: Array[Vector]): Boolean ={
    val asize = a.size
	val vectsize = a(0).size
	for(i <- 0 until asize)
	  assert(a(i).size == vectsize, "The vectors do not all have the same dimension!")
    val used = transposeM(a)
	val sz = used.size
	val vect0 = new Array[Double](sz)
    val (basis,sol) = solver(used,vect0,-1)
	if(basis.size == 0) return true // we have only the naive solution so the set is linearly independent
	else return false
  }
  
  /** Check if 2 vectors are orthogonal.
   * @param x the first vector
   * @param y the second vector
   * @return true if the vectors are orthogonal, false otherwise
   */
  def areOrth(x: Vector, y: Vector): Boolean ={
    val z = mulV(x,y)
	if(is0(z)) return true
	else return false
  }
  
  /** Check if 2 sets of vectors are orthogonal.
   * @param a the first vector set
   * @param b the second vector set
   * @return true if the sets of vectors are orthogonal, false otherwise
   */
  def areOrthSets(a: Array[Vector], b: Array[Vector]): Boolean ={
    val asize = a.size
	val bsize = b.size
	for(i <- 0 until asize)
	  for(j <- 0 until bsize)
	    if(!areOrth(a(i),b(j))) return false
	return true
  }
  
  /** Check if a set of vectors is orthogonal.
   * @param a the vector set
   * @return true if the set is orthogonal, false otherwise
   */
  def isOrthSet(a: Array[Vector]): Boolean ={
    val asize = a.size
	for(i <- 0 until asize - 1)
	  for(j <- i + 1 until asize)
	    if(!areOrth(a(i),a(j))) return false
	return true
  }
  
  /** Check if a set of vectors is orthonormal.
   * @param a the vector set
   * @return true if the set is orthonormal, false otherwise
   */  
  def isOrthNormSet(a: Array[Vector]): Boolean ={
    val asize = a.size
    val ok = isOrthSet(a)
	if(ok == false) return false
	for(i <- 0 until asize){
	  val ans = mulV(a(i),a(i))
	  if(!isEqual(ans,1)) return false
	}
	return true
  }
  
  /** Normalize a vector.
   * @param x the vector we normalize
   * @return the normalized vector in a new vector
   */
  def normV(x: Vector): Vector ={
    val lngth = lengthV(x)
	val sol:Vector = ctmulV(1.0/lngth,x)
	return sol
  }
  
  /** Gram-Schmidt process (return an orthonormal set spanning the same set as a given set of linearly independent vectors).
   * @param a the set of linearly independent vectors
   * @return the orthonormal set of vectors computed
   */
  def orthGrSch(a: Array[Vector]): Array[Vector] ={
    assert(isInd(a) == true, "The set should contain linearly independent vectors!")
    val asize = a.size
	val vsize = a(0).size
	assert(asize <= vsize, "The size of the set should be less than or equal to the size of the vectors it has!")
	var sol = Array.ofDim[Double](asize,vsize)
	for(i <- 0 until asize){
	  var newval = a(i)
	  for(j <- 0 until i){
	    val ctval = mulV(sol(j),a(i))
		val addedval = ctmulV(ctval,sol(j))
		newval = subV(newval,addedval)
	  }
	  val normval = lengthV(newval)
	  sol(i) = ctmulV(1.0/normval,newval)
	}
	return sol
  }
  
  /** Find the row space basis for a matrix.
   * @param a the matrix for which we compute the row space
   * @return an array of vectors containing the basis spanning the row space
   */
  def rowSpace(a: Matrix): Array[Vector] ={
    val z = rref(a) // we need to compute the RREF of a and the basis is formed of the non-zero rows
	val rz = getRows(z); val cz = getColumns(z)
	var cR = 0 // current row
	var cC = 0 // current column
	var sol = Array[Vector]()
    while(cR < rz && cC < cz) {
	  if(!is0(z(cR)(cC))){
	    sol:+=z(cR)
		cR += 1; cC += 1
	  }
	  else cC += 1
	}
	return sol
  }
  
  /** Find the column space basis for a matrix.
   * @param a the matrix for which we compute the column space
   * @return an array of vectors containing the basis spanning the column space
   */
  def columnSpace(a: Matrix): Array[Vector] ={
    val atr = transposeM(a)
	// the column space of A is the row space of A transposed
	val sol = rowSpace(atr)
	return sol
  }
  
  /** Find the rowspace basis for a matrix.
   * @param a the matrix for which we compute the nullspace
   * @return an array of vectors containing the basis spanning the nullspace
   */
  def nullspace(a: Matrix): Array[Vector] ={
    val asize = a.size
	val vect0 = new Array[Double](asize)
	val (sol,ct) = solver(a,vect0,-1)
	return sol
  }
  
  /** Find the basis for the kernel of a linear transformation.
   * @param a the matrix of the linear transformation
   * @return an array of vectors containing the basis for the kernel of the linear transformation
   */
  def kernelLinTr(a: Matrix): Array[Vector] = nullspace(a)
  
  /** Find the basis for the range of a linear transformation.
   * @param a the matrix of the linear transformation
   * @return an array of vectors containing the basis for the range of the linear transformation
   */
  def rangeLinTr(a: Matrix): Array[Vector] = columnSpace(a)
  
  /** Find the nullity of a linear transformation.
   * @param a the matrix of the linear transformation
   * @return the nullity of the linear transformation
   */
  def nullityLinTr(a: Matrix): Int ={
    val base = kernelLinTr(a)
	val sol = base.size
	return sol
  }
  
  /** Find the rank of a linear transformation.
   * @param a the matrix of the linear transformation
   * @return the rank of the linear transformation
   */
  def rankLinTr(a: Matrix): Int ={
    val base = rangeLinTr(a)
	val sol = base.size
	return sol
  }
  
  /** Check if a linear transformation is onto.
   * @param a the matrix of the linear transformation
   * @return true if the linear transformation is onto, false otherwise
   */
  def isOntoLinTr(a: Matrix): Boolean ={
    val rnk = rankLinTr(a)
	val imrnk = getRows(a)
	if(rnk == imrnk) return true
	else return false
  }
  
  /** Check if a linear transformation is 1-1.
   * @param a the matrix of the linear transformation
   * @return true if the linear transformation is 1-1, false otherwise
   */
  def isOnetoOneLinTr(a: Matrix): Boolean ={
    val nlt = nullityLinTr(a)
	if(nlt == 0) return true
	else return false
  }
  
  /** QR decomposition of a matrix.
   * @param a the matrix for which we calculate the QR decomposition
   * @return a pair of matrices s.t. Q - orthogonal, R - upper-triangular and A = Q*R
   */
  def qr(a: Matrix): (Matrix,Matrix) ={
    val ac = getColumns(a); val ar = getRows(a)
	val csp = columnSpace(a)
	val sz = csp.size
	assert(ac == sz, "The matrix should have full column rank!")
	val setvectors = transposeM(a)
	val orthsol = orthGrSch(setvectors)
	val q = transposeM(orthsol)
	val r = Array.ofDim[Double](ac,ac)
	for(i <- 0 until ar)
	  for(j <- i until ac)
	    r(i)(j) = mulV(orthsol(i),setvectors(j))
	return (q,r)
  }
  
  // Function to check if a matrix is upper-triangular
  private def isUpperTr(a: Matrix): Boolean ={
    val ra = getRows(a); val ca = getColumns(a)
    assert(ra == ca, "The matrix should be square!")
    for(i<- 0 until ra)
      for(j <- 0 until i)
	    if(!is0(a(i)(j))) return false
    return true
  }
  
  // Set to an integer if the precision of a Double number is less than 1e-11
  private def setInteger(x: Double): Double = if(Math.abs(x-x.round.toDouble)<1e-11) x.round.toDouble else x
  
  /** Find the eigenvalues of a full-rank (symmetric) square matrix.
   * @param a the matrix for which we search for eigenvalues
   * @return the eigenvalues in a vector (in increasing order)
   */
  def eigvals(a: Matrix): Vector ={
    val ra = getRows(a); val ca = getColumns(a)
    assert(ra == ca, "The matrix should be square!")
    var used = copyM(a)
	var n = 0
	val N = 1000
	while(n < N && !isUpperTr(used)){
	  val (qdec,rdec) = qr(used)
	  used = mulM(rdec,qdec)
	  n += 1
	}
	assert(n < N, "The matrix did not converge to the solution! (Try a symmetric one if not already!)") // should always converge for symmetric matrices
	var sol = new Array[Double](ra)
	for(i <- 0 until ra) sol(i) = setInteger(used(i)(i))
	scala.util.Sorting.quickSort(sol)
	return sol
  }
  
  /** Find the eigenvectors of a full-rank (symmetric) square matrix.
   * @param a the matrix for which we search for eigenvalues
   * @return an array of tuples of type (eigenvalue, corresponding eigenvectors) (eigenvalues in increasing order)
   */
  def eigvectors(a: Matrix): Array[(Double,Vector)] ={ // Not working very well for not-so-nice eigenvalues because of the approximations
    val solvalues = eigvals(a)
	var sol = new Array[(Double,Array[Double])](0)
	val asize = getRows(a)
	val identity = genId(asize)
	for(i <- 0 until asize){
	  val touse = subM(a,ctmulM(solvalues(i),identity))
	  val solsys = nullspace(touse)
	  val syssize = solsys.size
	  assert(syssize != 0, s"No solution for the eigenvector corresponding to the eigenvalue ${solvalues(i)}!")
	  var vectcorr = new Array[Double](asize)
	  for(j <- 0 until syssize) vectcorr = addV(vectcorr,solsys(j))
	  sol :+= (solvalues(i),vectcorr)
	}
	return sol
  }
  
  
  /** Find the normalized eigenvectors of a full-rank (symmetric) square matrix using the QR algorithm.
   * @param a the matrix for which we search for eigenvalues
   * @return an array of tuples of type (eigenvalue, corresponding eigenvectors) (eigenvalues in increasing order)
   */
  def eigvectorsNorm(a: Matrix): Array[(Double,Vector)] ={ // Working also for not-so-nice eigenvalues
    val ra = getRows(a); val ca = getColumns(a)
    assert(ra == ca, "The matrix should be square!")
    var used = copyM(a)
	var n = 0
	val N = 1000
	var qsolvect = genId(ra)
	while(n < N && !isUpperTr(used)){
	  val (qdec,rdec) = qr(used)
	  used = mulM(rdec,qdec)
	  n += 1
	  qsolvect = mulM(qsolvect,qdec)
	}
	assert(n < N, "The matrix did not converge to the solution! (Try a symmetric one if not already!)")
	qsolvect = transposeM(qsolvect)
	 for (i <- 0 until ra)
	  for (j <- 0 until ca) if (is0(qsolvect(i)(j))) qsolvect(i)(j) = 0.0
	var sol = new Array[(Double,Array[Double])](0)
	for(i <- 0 until ra) sol :+= (setInteger(used(i)(i)),qsolvect(i))
	sol = sol.sortWith(_._1<_._1)
	return sol
  }

}