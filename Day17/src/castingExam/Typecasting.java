package castingExam;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ac = new C();		//A ac = (A) new C();
		A ac2 = (A) new C();	//업캐스팅
		
		B bc = new C();
		A a = new B();
		
		B bb = new B();
		A a1 = bb;	//A a = (A)BB; 업케스팅은 언제나가능하다!
		
		A aa = new A();
		//B b = a; //B b = (B)aa; 다운캐스팅 불가능...
		//C c = aa; //불가능
		
		B bd = new D();
		D d = (D) bd; //다운캐스팅 가능
		 
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
		
		
	}

}

class A{}
class B extends A{}
class C extends B{}
class D extends B{}