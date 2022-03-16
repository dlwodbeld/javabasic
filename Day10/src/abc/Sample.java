package abc;

//interface PredatorBarkable extends Predator,Barkable{
//	
//}





abstract class Predator extends Animal{
	abstract String getFood();
	
	void printFood() {
		System.out.printf("my food is %s\n",getFood());
	}

	static int LEG_COUNT = 4;
	static int speed() {
		return LEG_COUNT * 30;
	}
}
interface Barkable{
	void bark();
}

class Animal{
	String name;
	void setName(String name) {
		this.name = name;
	}

	}


class Tiger extends Predator implements Barkable{
	public String getFood() {
		return "apple";
	}
	public void bark() {
		System.out.println("¾îÈï");
	}
}

class Lion extends Predator implements Barkable{	
	public String getFood() {
		return "banana";
	}
	public void bark() {
		System.out.println("À¸¸£··");
	}
}
//class Crocodile extends Animal implements Predator,Barkable{
//	public String getFood() {
//		return "strawberry";
//	}
//}
//
//class Leopard extends Animal implements Predator,Barkable{	
//	public String getFood() {
//		return "orange";
//	}
//}
class ZooKeeper{
	void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
	}
}
//	void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}
//	void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	void feed(Crocodile crokodile) {
//		System.out.println("feed strawberry");
//	}
//	void feed(Leopard leopard) {
//		System.out.println("feed orange");
//	}
//}
class Bouncer{
	void barkAnimal(Barkable animal) {
		animal.bark();
//		if(animal instanceof Tiger) {
//			System.out.println("¾îÈï");
//		}
//		else if(animal instanceof Lion) {
//			System.out.println("À¸¸£··");
//		}
//		else if(animal instanceof Crocodile) {
//			System.out.println("Å©¸£¸ª");
//		}
//		else if(animal instanceof Leopard) {
//			System.out.println("À¸¸£··");
//		}
	}
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predator.speed();
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
//		Crocodile crocodile = new Crocodile();
//		Leopard leopard = new Leopard();
		Bouncer bouncer = new Bouncer();
		zooKeeper.feed(tiger);//¸Þ¼­µå ¿À¹ö·Îµù
		zooKeeper.feed(lion);
//		zooKeeper.feed(crocodile);
//		zooKeeper.feed(leopard);
		bouncer.barkAnimal(lion);
		bouncer.barkAnimal(tiger);
		
		

	}

}
