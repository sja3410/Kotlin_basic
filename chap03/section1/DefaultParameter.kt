package chap03.section1

fun main(){
	val name = "ȫ�浿"
	val email = "hong@example.kr"
	
	add(name)
	add(name, email)
	add("�Ѹ�", "dooly@example.kr")
	defaultArgs()
	defaultArgs(200)
}

fun add(name : String, email : String = "defalut"){
	val output = "${name}���� �̸����� ${email}�Դϴ�."
	println(output)
	
}

fun defaultArgs(x : Int = 100, y : Int = 200){
	println(x+y)
}