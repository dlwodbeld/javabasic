package pm;

class superA{
	superA() {
		System.out.println("A������");
	}
}
class superB extends superA{
	superB() {
		super();	//�����ϸ� �ڹٰ� �ڵ����� ������ش�.
		System.out.println("A������");
	}
}

class superC{
	superC(int a){
		System.out.println("C������");
	}
}
class superD extends superC{

	superD(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	superD(){
		super(3);
	}
}





public class Exam7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superA sa = new superA();
		System.out.println();
		
		superB sb = new superB();

	}

}
