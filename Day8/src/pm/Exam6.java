package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubclass Animal{

		

		  
		Animal bird = new Bird();
		Animal cat = new Cat();
		Animal dog = new Dog();
		  Animal bb = new Bird();
		  Animal cc = new Cat();
		  Animal dd = new Dog();
		  
		  bird.cry(); //��±
		  cat.cry(); //�߿�
		  dog.cry(); //�۸�
		  System.out.println();
		  bb.cry(); //��±
		  cc.cry(); //�߿�
		  dd.cry(); //�۸�
		  System.out.println();
		  Animal[] animals = {bb,cc,dd};
		  
		  for(Animal ani : animals) {
			  ani.cry();
		  }

	}

}

class Animal{
	void cry() {}
}

class Bird extends Animal{
		  void cry() {
		  System.out.println("±±");
		  }
}
class Cat extends Animal{
		  void cry() {
		  System.out.println("�߿�");
		  }
}
class Dog extends Animal{
		  void cry() {
		  System.out.println("�۸�");
		  }
}