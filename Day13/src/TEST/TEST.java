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
		case 3: case 4: case 5: System.out.print("��"); break;
		case 6: case 7: case 8: System.out.print("����"); break;
		case 9: case 10: case 11: System.out.print("����"); break;
		case 12: case 1: case 2: System.out.print("�ܿ�"); break;
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
		System.out.print("���� a : "); int a = sc.nextInt();
		System.out.print("���� b : "); int b = sc.nextInt();
		System.out.print("���� c : "); int c = sc.nextInt();
		
		System.out.println("�߰����� "+ med(a,b,c)+"�Դϴ�.");
		System.out.println();
		
		//7-4
		System.out.println("7-4");
		System.out.println("1���� x������ ���� ������.");
		int d;
		do {
			
		System.out.print("x�� �� : "); d = sc.nextInt();
		
		}while(d<=0);
		System.out.println("1���� "+ d + "������ ���� " + sumUp(d) + "�Դϴ�.");
		System.out.println();
		
		System.out.println("7-6");
		int month;
		do {
			System.out.print("�� ���Դϱ�(1~12): "); month = sc.nextInt();
			if(month<1||month>12)
				System.out.println("�ٽ� �Է����ּ���.");
		}while(month<1||month>12);
		System.out.print("�ش� ���� ������ ");
		printSeason(month);
		System.out.println("�Դϴ�. ");
		System.out.println();
		
		//7-7
		System.out.println("7-7");
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ��� : "); int g = sc.nextInt();
		for(int i = 1;i<=g;i++) {
			putStar(i);
			System.out.println();
		}
		System.out.println();
		//7-8
		System.out.println("7-8");
		
		System.out.println("������ �����մϴ�.");
		System.out.print("���Ѱ� : "); int z = sc.nextInt();
		System.out.print("���Ѱ� : "); int x = sc.nextInt();
		System.out.println("������ ������ "+random(z,x)+" �Դϴ�.");
		System.out.println();
		
		
		
		}

}
