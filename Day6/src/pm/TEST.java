package pm;

import java.util.Scanner;

public class TEST {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("���� a : "); int a = sc.nextInt();
//		System.out.println("���� b : "); int b = sc.nextInt();
//		System.out.println("���� c : "); int c = sc.nextInt();
//		
//		if(a>c&&b>c) {
//			System.out.println("�ּҰ��� "+c+" �Դϴ�.");
//		}
//		else if(a>b&&c>b) {
//			System.out.println("�ּҰ��� "+b+" �Դϴ�.");
//		}
//		else if(a<b&&a<c) {
//			System.out.println("�ּҰ��� "+a+" �Դϴ�.");
//		}
		
//		System.out.println("�� ���Դϱ�? : "); int d = sc.nextInt();
//		if(d==3||d==4||d==5) {
//			System.out.println("��");
//		}
//		else if(d==6||d==7||d==8) {
//			System.out.println("����");
//		}
//		else if(d==9||d==10||d==11) {
//			System.out.println("����");
//		}
//		else if(d==12||d==1||d==2) {
//			System.out.println("�ܿ�");
//		}
//		else
//			System.out.println("�׷� ���� �����ϴ�.");
//		
		
//		while(true) {
//			System.out.println("���ڸ��� ������ : "); int e = sc.nextInt();
//			if (e>=100&&e<=999) {
//				System.out.println("�Է��� ���� "+ e + " �Դϴ�.");
//				break;
//			}
//			else
//				continue;
//		}
		
//		int f = 0;
//		System.out.println("1���� n������ ���� ���մϴ�.n�ǰ� : ");int n = sc.nextInt();
//		for(int g = 1;g<=n;g++) {
//			f += g;
//			
//		}
//		System.out.println("1���� "+ n +"������ ���� " + f + " �Դϴ�.");
//		

		System.out.println("�������� ǥ���մϴ�.");
		System.out.println("�ܼ��� : "); int h = sc.nextInt();
		for(int i = 1;i<=h;i++) {
			for(int j = 1;j<=h;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
