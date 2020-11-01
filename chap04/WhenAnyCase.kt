package chap04.section1
fun main()
{
	cases("Hello")
	cases(1)
	cases(System.currentTimeMillis()) //���� �ð��� Long�� ������ ��ȯ
	cases(true) 
}
fun cases(obj : Any) ///Any�� ������ �Ű������� ����
{
	when(obj)
	{
		1 -> println("Int : $obj")
		"Hello" -> println("String : $obj")
		is Long -> println("Long : $obj")
		!is String -> println("Not a String")
		else -> println("Unknown")
	
	}
}
//���⼭ �˰� �� ���� --> when�� �� ���ǿ��� �Ʒ��������� �̵��Ͽ� �˻縦 �ϴµ�, ������ �ϳ��� ������ break�� �������ͼ�
// �Ʒ��� �´� ������ �ִ��� ������ ���� �ʴ´�. 