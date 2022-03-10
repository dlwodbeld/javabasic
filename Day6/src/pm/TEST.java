package pm;

import java.util.Scanner;

public class TEST {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 a : "); int a = sc.nextInt();
//		System.out.println("정수 b : "); int b = sc.nextInt();
//		System.out.println("정수 c : "); int c = sc.nextInt();
//		
//		if(a>c&&b>c) {
//			System.out.println("최소값은 "+c+" 입니다.");
//		}
//		else if(a>b&&c>b) {
//			System.out.println("최소값은 "+b+" 입니다.");
//		}
//		else if(a<b&&a<c) {
//			System.out.println("최소값은 "+a+" 입니다.");
//		}
		
//		System.out.println("몇 월입니까? : "); int d = sc.nextInt();
//		if(d==3||d==4||d==5) {
//			System.out.println("봄");
//		}
//		else if(d==6||d==7||d==8) {
//			System.out.println("여름");
//		}
//		else if(d==9||d==10||d==11) {
//			System.out.println("가을");
//		}
//		else if(d==12||d==1||d==2) {
//			System.out.println("겨울");
//		}
//		else
//			System.out.println("그런 월은 없습니다.");
//		
		
//		while(true) {
//			System.out.println("세자리의 정수값 : "); int e = sc.nextInt();
//			if (e>=100&&e<=999) {
//				System.out.println("입력한 값은 "+ e + " 입니다.");
//				break;
//			}
//			else
//				continue;
//		}
		
//		int f = 0;
//		System.out.println("1부터 n까지의 합을 구합니다.n의값 : ");int n = sc.nextInt();
//		for(int g = 1;g<=n;g++) {
//			f += g;
//			
//		}
//		System.out.println("1부터 "+ n +"까지의 합은 " + f + " 입니다.");
//		

		System.out.println("정방형을 표시합니다.");
		System.out.println("단수는 : "); int h = sc.nextInt();
		for(int i = 1;i<=h;i++) {
			for(int j = 1;j<=h;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
