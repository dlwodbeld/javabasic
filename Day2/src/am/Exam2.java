package am;

public class Exam2 {

	public static void main(String[] args) {
		// ������
		// ��� ������ + - * / %
		//���� ������ i++      i--
		// ��Ʈ ������ &(and)	\(or)
		// �񱳿����� <	>	<=	>=	==	!=
		// ���� ������ 	=	+=	-=	*=	/=
		//���� ������	(���ǽ�) ? true : false
		
		
//		int a = 1;
//		a++; //������
//		++a;//������
//		System.out.println(a);
//		
//		int a = 3;
//		int b = ++a;
//		System.out.println(a);			//4
//		System.out.println(b);			//4
//		
//		int c = 3;
//		int d = a++;
//		System.out.println(c);			//3
//		System.out.println(d);			//4
//		
		//���׿����� : 3���� �ǿ��갡�� �ִ� ������
		//(���ǽ�) ? true : false
//		
//		int a = (false)? 1 : 2;
//		System.out.println(a);
		
//		int a = 2;
//		int b;
//		if (a % 2 ==0) {
//			b = 10;
//		}else {
//			b = 20;
//		}
//		System.out.println(b);
//		
//		int value = 3;
//		System.out.println((value % 2 == 0) ? "¦��" : "Ȧ��");
		
		int score = 85;
		
		char credit = (score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F');
		System.out.println(credit);
 		
		
	}

}
