package castingExam;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ac = new C();		//A ac = (A) new C();
		A ac2 = (A) new C();	//��ĳ����
		
		B bc = new C();
		A a = new B();
		
		B bb = new B();
		A a1 = bb;	//A a = (A)BB; ���ɽ����� �����������ϴ�!
		
		A aa = new A();
		//B b = a; //B b = (B)aa; �ٿ�ĳ���� �Ұ���...
		//C c = aa; //�Ұ���
		
		B bd = new D();
		D d = (D) bd; //�ٿ�ĳ���� ����
		 
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
		
		
	}

}

class A{}
class B extends A{}
class C extends B{}
class D extends B{}