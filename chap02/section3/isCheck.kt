package chap02.section3

//�ڷ��� �˻��ϱ� is

fun main(){
	val num = 256
	if(num is Int)
		{
			print(num)
		}
	else if(num !is Int) //�ƴҶ��� ���Ѵ� ǥ�� �����ؼ� ����
		{
			print("Not a Int");
		}
}