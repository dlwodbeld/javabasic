package pm;

public class Exam4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �޼���
		 * �޼���� Ŭ������ ��ɿ� �ش��ϴ� ��Ҵ�.
		 * ��� Ŭ������� �Ա�,���ڱ�,�����ϱ�...
		 * �ڵ��� Ŭ������� �����ΰ���,�����ϱ�,�����ϱ�...
		 * 
		 * ������ ��ȯŸ�� �ż����(�μ�){
		 * 
		 * }
		 * public static int sum(int a,intb){
		 * }
		 * �Է°����� int�� a,b 2���� �Է¹޾Ƽ� ó���Ѵ�.
		 * 
		 *�������� ������ ��ȯŸ��
		 *
		 *1.input�� ���� return �� ����
		 *void print(){
		 *System.out.println("Hi");
		 *
		 *}//����Ÿ���� void(������ ����.)�μ��� ����.
		 *
		 *2.input�� ���� return�� �ִ�.
		 *int print(){
		 *			return 0;
		 *System.out.println("Hi");
		 *
		 *}//����Ÿ���� void(������ ����.)�μ��� ����.
		 *
		 *3.input�� �ְ� return�� ����.
		 *void print(String name){
		 *System.out.println("Hi");
		 *
		 *}
		 *4.input�� �ְ� return�� �ִ�.
		 *String print(String name){
		 *			return;
		 *System.out.println("Hi");
		 *
		 *}
		 *
		 *�޼��� ȣ��
		 *�޼��带 ����Ϸ��� ���� ��ü�� �����ؾ� �Ѵ�.
		 *A a = new A();
		 *a.method();
		 *
		 */

		C c = new C();
		c.print();
		int k = c.data();
		System.out.println(k);
		double result = c.sum(3, 5.2);
		System.out.println(result);
		c.printMonth(5);
		c.printMonth(15);
	}

}
class C{
	// no unput no output
	void print(){
		System.out.println("�ȳ�");
	}
	//no input yes output
	int data() {
		return 3;
	}
	//yes input yes ouput
	double sum(int a,double b) {
		return  a + b;
		
	}
	void printMonth(int m) {//void ������ ����.
		if(m <= 0 || m > 12) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
			return; //�ż��带 ���������� ���� return
			
		}
		System.out.println(m+" �� �Դϴ�.");
	}
}
