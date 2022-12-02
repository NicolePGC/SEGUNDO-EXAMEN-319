import java.util.Scanner
import scala.collection.mutable.ListBuffer
object prueba {
	var primos = new ListBuffer[Int]()
	println("INTRODUCIR DATO")
	val scanner=new java.util.Scanner(System.in)
	var n = scanner.nextLine()
	var c=1
	var p=2
	var d=2
	println("valor: "+n)
	while (c<=n.toInt) {
	 if (p%d==0) {
	  if(p==d){
	   primos.append(p)
	   c=c+1
	  }
	  d=2
	  p=p+1
	 }
	 else {
	  d=d+1
	 }
	}
	println ("la lista: "+primos.toList)
	
}    