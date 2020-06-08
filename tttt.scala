import scala.io.Source
object new1{

  def choice():Array[Array[Double]]={
    val filename = "forprint.txt"
	var ok:Boolean = true
	var rows = 0
	var columns = 0
	var sol = Array.ofDim[Double](0,0)
	var i = -1
	var j = 0
	for(line <- Source.fromFile(filename).getLines){
	  if(ok == true){
	    ok = false
	    val s = line.split(" ")
		rows = s(0).toInt
		columns = s(1).toInt
	    sol = Array.ofDim[Double](rows,columns)
		j = columns
	  }
	  else{
	    if(j < columns){
	      sol(i)(j)=line.toDouble
		  j+=1
		}
		else {
		  j=0
		  i+=1 
		}
	  }
	}
	return sol
  
  }

}