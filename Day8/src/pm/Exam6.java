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
		  
		  bird.cry(); //卤
		  cat.cry(); //具克
		  dog.cry(); //港港
		  System.out.println();
		  bb.cry(); //卤
		  cc.cry(); //具克
		  dd.cry(); //港港
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
		  System.out.println("卤卤");
		  }
}
class Cat extends Animal{
		  void cry() {
		  System.out.println("具克");
		  }
}
class Dog extends Animal{
		  void cry() {
		  System.out.println("港港");
		  }
}