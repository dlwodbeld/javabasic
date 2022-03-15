package pm;

public class Exam5_1 {

	public static void main(String[] args) {
		// abstract 추상- 구체적이지 않다.
		//abstract method -중괄호가 없는 매서드, 매서드의 기능이 정의되지않는다. 그냥 ; 끝난다.
		//abstract 리턴타입 매서드명();
		// abstract class
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();

	}

}
abstract class Animal{
	abstract void cry();
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}
