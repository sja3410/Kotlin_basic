package chap04.section1

fun main(){
	print("Enter the score :")
	val score = readLine()!!.toDouble() //readLine�� ���ڿ��� �о���̴� �Լ�, toDouble�� �Ǽ������� �ٲپ���
	//�̶� �Ǽ��� �ٲ��� ���ϴ� ���� �������� ���ܰ� �߻��� �� �ֱ� ������ ���ܸ� �������� !!(non_null)�̶�� ������ȣ�� �޾Ƶ�����,
	//������ non_null�̱� ������ null�� ��� ���ܸ� �߻���ų �� ����
	var grade : Char = 'F'
	
	if(score >= 90.0)
		{
			grade = 'A'
		}else if (score >=80.0 && score <=89.9)
		{
			grade = 'B'
		}
	else if (score >= 70.0 && score <= 79.9)
		{
			grade = 'C'
		}
	
	println("Score : $score, Grade : $grade");
}