package am;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭,�ݺ�, ����,
		//�ּ� , Ŭ����, ��ü
		
		//Q1 ù ������ ���� 2������ ������ ����ϼ���.
		//1,2	2,3	3,4	4,5
		int[] a = {1,2,3,4,5};
		int[] b = {1,3,4,5,6};
		int[] c = new int[2];
		
		for(int i = 0; i<a.length;i++) {
			if(a[i] % 2 == 0) {
			System.out.println(a[i]);				
			}

		}
//		Test t = new Test();
//		t.ex(a);
		
		//Q2 ù ������ ���� 2������ ���� ���� ¦���� �� �ش� ���� 2���� �ε��� ��ȣ�� �迭�� ����� ����ϼ���.
//		Test1 p = new Test1();
//		p.pr(b);
		for(int i = 0; i<b.length-1;i++) {
			if((b[i]+b[i+1])%2 == 0) {
				c[0] = i;
				c[1] = i+1;
				System.out.println(b[i] + "," + b[i+1]);
				System.out.println(c[i] +" , " + c[i+1]);

	}


		}
		}
}
//class Test{
//	void ex(int[] a) {
//		for(int i = 0; i<a.length-1;i++) {
//			System.out.println(a[i] + "," + a[i+1]);
//		}
//	}
//}
//class Test1{
//	void pr(int[] b) {
//		for(int i = 0; i<b.length-1;i++) {
//			if((b[i]+b[i+1])%2 == 0) {
//				System.out.println(b[i] + "," + b[i+1]);
//
//
//			}
//		}
//	}
//}
//

