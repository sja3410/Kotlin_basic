package chap02.section3

fun main(){
	var str1 : String? = "Hello Kotlin"
	//?�� ����Ϸ� null�� �����ϰ� ��.
	str1 = null
	println("str1 : $str1")
	println("str: $str1 length : ${str1?.length}")//null�� ����ϸ� length�� ������ ����
	val len = if(str1 != null) str1.length  else -1
	println("str1 : $str1 length : ${len}") //�׳� null�ΰ��� �˻��ؼ� ���
	
}
