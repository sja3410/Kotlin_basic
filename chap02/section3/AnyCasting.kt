package chap02.section3

//Any�� ��� �ڷ����� �Ѹ��̴�. (����Ŭ����)
fun main()
{
	var a : Any =1
	a = 20L
	println("a : $a type : ${a.javaClass}") //����.javaClass--> ������ �ڷ����� ���
}