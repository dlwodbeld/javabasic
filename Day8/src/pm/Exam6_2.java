package pm;

public class Exam6_2 {
	public static void main(String[] args) {
		/*
		 * class A{
	void print1() {
		System.out.println("AŬ���� print 1");
	}
	void print2() {
		System.out.println("AŬ���� print 2");
	}
}
class B extends A{
	void print1() { //<----�޼��� �������̵�
		System.out.println("BŬ���� print 1");
	}
	void print2(int a) {	//<----�ż��� �����ε�
		System.out.println("BŬ���� print 2");
	}
}






		 */
		P p = new P();
		p.print1();
		p.print2();
		System.out.println();
		
		O o = new O();
		o.print1();
		o.print2();
		o.print2(3);
		System.out.println();
		
		P po = new O();
		po.print1();
		po.print2();
		//po.print2(3);//����
		
		
		
		
		
		
	}

}
class P{
	//@Override // @ �ֳ����̼��� ��ǻ�͵� �д� �ּ�
	void print1() {
		System.out.println("PŬ���� print 1");
	}
	void print2() {
		System.out.println("PŬ���� print 2");
	}
}
class O extends P{
	void print1() { //<----�޼��� �������̵�
		System.out.println("OŬ���� print 1");
	}
	void print2(int a) {	//<----�ż��� �����ε�
		System.out.println("OŬ���� print 2");
	}
}
// Ŭ���� B�� �� ��� �ż��带 ����Ҽ�������



