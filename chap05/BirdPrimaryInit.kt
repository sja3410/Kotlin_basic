class Bird(var name: String, var wing: Int, var beak: String, var color: String)
{
	init{
		println("----------�ʱ�ȭ ��� ����----------")
		println("�̸��� $name, �θ��� $beak")
		this.sing(3)
		println("----------�ʱ�ȭ ��� ��----------")
	}
	fun fly() = println("Fly wing: $wing");
	fun sing(vol : Int) = println("Sing vol: $vol")
	
}

fun main(){
	val coco = Bird("mybird", 2, "short", "blue")
	
	coco.color = "yello"
	println("coco.color: ${coco.color}")
	coco.fly()
}