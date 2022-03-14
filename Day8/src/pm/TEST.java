package pm;

import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//4-22-1
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는? : ");
		int m = sc.nextInt();
		for(int i = 0; i <=m ; i++) {
			for(int j = 0; j < i ;j++) {

				System.out.print("*");
			}
			System.out.println();
			if (i== 5) {
				break;
			}
		}
		
		//4-22-2
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는? : ");
		int k = sc.nextInt();
	for(int i = k-1; i >=0 ; i--) {
		for(int j = 0; j <= i ;j++) {

			System.out.print("*");
		}
		System.out.println();
		if (i== 0) {
			break;
		}
	}
	//4-25
	boolean N = false;
	System.out.print("2 이상의 정숫값 : ");
	int num = sc.nextInt();
		if (num<2) {
		System.out.println("2이상의 수가 아닙니다.");
	}	
	for (int i = 2;i<num;i++) {

		if(num% i ==0) {
			N = true;
			break;
		}
	}
	
	if(N) {
		System.out.println("소수가 아닙니다.");
	}else {
		System.out.println("소수입니다.");
	}
	//4-26
	System.out.println("정수를 더합니다.");
	System.out.print("몇개를 더할까요? : "); int a = sc.nextInt();
	int sum = 0;
	int n = 0;
	int sub = 0;
	while(a != 0) {
		System.out.print("정수(0으로 종료) : ");int b = sc.nextInt();
		sum += b;
		sub = sum/a;	
		n++;
					
	if(b==0) {
		System.out.println("시스템을 종료합니다.");
	}
	if(n==a) {
	System.out.println("합계는 " + sum + "입니다.");
	System.out.println("평균은 " + sub + "입니다.");
		break;
	}
	}

	//4-27
	
	System.out.println("정수를 더합니다.");
	System.out.print("몇개를 더할까요? : "); int c = sc.nextInt();
	int sum1 = 0;
	int n1;
	for(n1 = 0;n1<c;n1++) {
		System.out.print("정수 : "); int d = sc.nextInt();
		if(sum1 + d > 1000) {
			System.out.println("합계가 1000을 넘었습니다.");
			System.out.println("마지막 값은 무시합니다.");
			break;
		}
		sum1 += d;
	}
	System.out.println("합계는 " + sum1 + "입니다.");
	if(n1 != 0) {
		System.out.println("평균은 " + sum1/n1 +"입니다.");
	}
	
	//4-28
	System.out.println("정수를 더합니다.");
	System.out.print("몇개를 더할까요? : "); int e = sc.nextInt();
	int sum2 = 0;
	int n2;
	int j = 0;
	for(n2 = 0;n2<e;n2++) {
		System.out.print("정수 : "); int f = sc.nextInt();
		if(f <= 0) {
			System.out.println("음수는 더하지않습니다.");
			j++;	
			continue;
		}
		if(f>0) {
			sum2 += f;			
		}

	}
	System.out.println("합계는 " + sum2 + "입니다.");
	if(n2 != 0) {
		System.out.println("평균은 " + sum2/(n2-j) +"입니다.");
	}
	
	}

}
