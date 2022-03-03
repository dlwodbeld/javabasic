package am;

public class Exam2 {

	public static void main(String[] args) {
		// 연산자
		// 산술 연산자 + - * / %
		//증감 연산자 i++      i--
		// 비트 연산자 &(and)	\(or)
		// 비교연산자 <	>	<=	>=	==	!=
		// 대입 연산자 	=	+=	-=	*=	/=
		//삼항 연산자	(조건식) ? true : false
		
		
//		int a = 1;
//		a++; //후위형
//		++a;//전위형
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
		//삼항연산자 : 3개의 피연산가자 있는 연산자
		//(조건식) ? true : false
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
//		System.out.println((value % 2 == 0) ? "짝수" : "홀수");
		
		int score = 85;
		
		char credit = (score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F');
		System.out.println(credit);
 		
		
	}

}
