package chap04.section1

fun main(){
	val a = 12
	val b = 7
	
	val max = if(a>b){
		println("a ����")
		a
	}
	else{
		println("b ����")
		b
	}
	
	println(max)
}