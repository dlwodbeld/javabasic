package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rad = new Random();
		//4-30
		System.out.println("숫자마추기 게임시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		int a = rad.nextInt(99);
		for(int i = 6; i<=6;i--) {
			System.out.print("남은 횟수"+i+"회, 어떤 숫자일까? : "); int b = sc.nextInt();
			if(b<a) {
				System.out.println("더 큰 숫자입니다.");
			}
			else if (b>a) {
				System.out.println("더 작은 숫자입니다.");
			}
			else if (b==a) {
				System.out.println((6-i)+"번만에 맞추셨습니다.");
				break;
			}
			if (i==1) {
				System.out.println("총6회 전부 틀렸습니다. 정답은"+a+"입니다.");
				break;
			}
		}
		//6-1
		double d[] = new double[5];
		for(int i = 0; i<=4 ; i++) {
			System.out.println("a["+i+"] = "+d[i]);
		}
		System.out.println();
		
		//6-2

		int e[] ={5,4,3,2,1};
		for(int i = 0; i<=4 ; i++) {
			System.out.println("a["+i+"] = "+e[i]);
		}
		System.out.println();
		//6-3
		double f[] = {1.1,2.2,3.3000000000000003,4.4,5.5};
		for(int i = 0; i<=4 ; i++) {
			System.out.println("a["+i+"] = "+f[i]);
		}
		System.out.println();
		
		//6-6
		System.out.print("요소 수 : ");	int g = sc.nextInt();
		int [] j = new int[g];
		for(int i = 0;i<g;i++) {
			System.out.print("a["+i+"] = ");j[i] = sc.nextInt();
		}
		System.out.print("a = {");
		if (g>=2) {
			for(int i = 0;i<g-1;i++) {
				System.out.print(j[i] + ", ");
			}
		if(g>=1) {
			System.out.print(j[g-1]);
			System.out.println("}");
		}
		}
		

	}

}
