package pm;

public class Exam7 {

	public static void main(String[] args) {
		// ������ constructor
		//��ü�� ���� �����Ҷ� �ڵ����� ȣ��Ǿ� ����ȴ�.
		//1.�����ڴ� �ݵ�� Ŭ���� ��� ������ �̸��̾�߸� �Ѵ�.
		//2.�����ڴ� ����Ÿ�Ե� ���� ���ϵ� ����.
		
		//���ݱ��� �����ڸ� ���帮 �ʾҴ�. �����ڸ� ������ �ʾҾ ����������
		//��ü�� �����ƴ�. ������ �����ڰ� �����ڸ� ���� ������ ������
		//�ڹٰ� �⺻ ������ default constructor �� �ڵ����� �������ֱ� �����̴�.
		//�����ڰ� �ϳ��� ������ �ڹٴ� �⺻�����ڸ� �߰��� �������� �ʴ´�.
		
		
		
//		A a = new A();
//		B b = new B();
		H h = new H();
		I i = new I();
		J j = new J(3);	//�ַ��߻�, why! �����ڿ� int �ϳ��� �ְ� �Ǿ��ִ�.
		
		
//		a.work();
//		b.work();
		h.work();
		i.work();
		j.work();
		

	}

}

//class A{
//	int m;
//	void work() {
//		System.out.println(m);
//	}
//}
//class B{
//	int m;
//	void work() {
//		System.out.println(m);
//	}
//}
class H{
//	H(){	//�����ڰ� ���� �����ڸ� ������ ������ �ڹٰ� �ڵ����� �⺻�����ڸ� �����.
//		
//	}
	int m;
	void work() {
		System.out.println(m);
	}
}
class I{
	I(){
		//�ƹ��� ����� ���� ����Ʈ ������ default constructor
	}
	int m;
	void work() {
		System.out.println(m);
	}
}

class J{
	J(int a){
		m = a;
		
	}
	
	int m;
	void work() {
		System.out.println(m);
	}
}

