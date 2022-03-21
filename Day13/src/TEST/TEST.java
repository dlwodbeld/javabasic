package TEST;

import java.util.Random;
import java.util.Scanner;

public class TEST {
	//7-3
	static int med(int a,int b,int c) {
		if (a >=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if (b>c)
			return c;
		else
			return b;
	}
	//-------------------------------------------------------------------
	//7-4

	static int sumUp(int n) {
		int sum = 0;
		for(int i = 0;i<=n;i++) {
			sum += i;
		}
		return sum;
	}
	//-------------------------------------------------------------------
	//7-6
	
	static void printSeason(int e) {
		switch(e) {
		case 3: case 4: case 5: System.out.print("봄"); break;
		case 6: case 7: case 8: System.out.print("여름"); break;
		case 9: case 10: case 11: System.out.print("가을"); break;
		case 12: case 1: case 2: System.out.print("겨울"); break;
		}
	}
	//-------------------------------------------------------------------
	//7-7
	static void putChar(String f,int g) {
		while (g-- > 0)
			System.out.print(f);
	}
	static void putStar(int g) {
		putChar("*",g);
	}
	//-------------------------------------------------------------------
	//7-8
	static int random(int h,int l) {
		if(l<= h)
			return h;
		else {
			Random rand = new Random();
			return h + rand.nextInt(l-h+1);
		}
			
			
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		//7-3
		System.out.println("7-3");
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		System.out.print("정수 c : "); int c = sc.nextInt();
		
		System.out.println("중간값은 "+ med(a,b,c)+"입니다.");
		System.out.println();
		
		//7-4
		System.out.println("7-4");
		System.out.println("1부터 x까지의 합을 구하자.");
		int d;
		do {
			
		System.out.print("x의 값 : "); d = sc.nextInt();
		
		}while(d<=0);
		System.out.println("1부터 "+ d + "까지의 합은 " + sumUp(d) + "입니다.");
		System.out.println();
		
		System.out.println("7-6");
		int month;
		do {
			System.out.print("몇 월입니까(1~12): "); month = sc.nextInt();
			if(month<1||month>12)
				System.out.println("다시 입력해주세요.");
		}while(month<1||month>12);
		System.out.print("해당 월의 계절은 ");
		printSeason(month);
		System.out.println("입니다. ");
		System.out.println();
		
		//7-7
		System.out.println("7-7");
		System.out.println("왼쪽 아래가 직각인 이등벼 삼각형을 표시합니다.");
		System.out.print("단수는 : "); int g = sc.nextInt();
		for(int i = 1;i<=g;i++) {
			putStar(i);
			System.out.println();
		}
		System.out.println();
		//7-8
		System.out.println("7-8");
		
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값 : "); int z = sc.nextInt();
		System.out.print("상한값 : "); int x = sc.nextInt();
		System.out.println("생성한 난수는 "+random(z,x)+" 입니다.");
		System.out.println();
		
		
		
		}

}
