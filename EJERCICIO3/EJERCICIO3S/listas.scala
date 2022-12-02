import java.util.Scanner
import scala.collection.mutable.ListBuffer
object pruebalist {
	var l1 = new ListBuffer[Int]()
	var l2 = new ListBuffer[Int]()
	var c=0
	var c2=0
	val scanner=new java.util.Scanner(System.in)
	println("INTRODUCIR NUM DE LISTA 1")
	var n1 = scanner.nextInt()
	println("INTRODUCIR DATOS DE LISTA 1")
	while (n1>c){
	 var n = scanner.nextInt()
	 l1.append(n)
	 c=c+1
	}
	println(l1.toList)
	println("INTRODUCIR NUM DE LISTA 2")
	var n2 = scanner.nextInt()
	println("INTRODUCIR DATOS DE LISTA 2")
	while (n2>c2){
	 var n3 = scanner.nextInt()
	 l2.append(n3)
	 c2=c2+1
	}
	println(l2.toList)
	var l3=l1.intersect(l2)
	if(l3.length==l2.length){
	 println("VERDAD")
	}
	else{ 
	 println("FALSO")
	}
	
	
}    