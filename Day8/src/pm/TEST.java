package pm;

import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//4-22-1
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ���? : ");
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
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ���? : ");
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
	System.out.print("2 �̻��� ������ : ");
	int num = sc.nextInt();
		if (num<2) {
		System.out.println("2�̻��� ���� �ƴմϴ�.");
	}	
	for (int i = 2;i<num;i++) {

		if(num% i ==0) {
			N = true;
			break;
		}
	}
	
	if(N) {
		System.out.println("�Ҽ��� �ƴմϴ�.");
	}else {
		System.out.println("�Ҽ��Դϴ�.");
	}
	//4-26
	System.out.println("������ ���մϴ�.");
	System.out.print("��� ���ұ��? : "); int a = sc.nextInt();
	int sum = 0;
	int n = 0;
	int sub = 0;
	while(a != 0) {
		System.out.print("����(0���� ����) : ");int b = sc.nextInt();
		sum += b;
		sub = sum/a;	
		n++;
					
	if(b==0) {
		System.out.println("�ý����� �����մϴ�.");
	}
	if(n==a) {
	System.out.println("�հ�� " + sum + "�Դϴ�.");
	System.out.println("����� " + sub + "�Դϴ�.");
		break;
	}
	}

	//4-27
	
	System.out.println("������ ���մϴ�.");
	System.out.print("��� ���ұ��? : "); int c = sc.nextInt();
	int sum1 = 0;
	int n1;
	for(n1 = 0;n1<c;n1++) {
		System.out.print("���� : "); int d = sc.nextInt();
		if(sum1 + d > 1000) {
			System.out.println("�հ谡 1000�� �Ѿ����ϴ�.");
			System.out.println("������ ���� �����մϴ�.");
			break;
		}
		sum1 += d;
	}
	System.out.println("�հ�� " + sum1 + "�Դϴ�.");
	if(n1 != 0) {
		System.out.println("����� " + sum1/n1 +"�Դϴ�.");
	}
	
	//4-28
	System.out.println("������ ���մϴ�.");
	System.out.print("��� ���ұ��? : "); int e = sc.nextInt();
	int sum2 = 0;
	int n2;
	int j = 0;
	for(n2 = 0;n2<e;n2++) {
		System.out.print("���� : "); int f = sc.nextInt();
		if(f <= 0) {
			System.out.println("������ �������ʽ��ϴ�.");
			j++;	
			continue;
		}
		if(f>0) {
			sum2 += f;			
		}

	}
	System.out.println("�հ�� " + sum2 + "�Դϴ�.");
	if(n2 != 0) {
		System.out.println("����� " + sum2/(n2-j) +"�Դϴ�.");
	}
	
	}

}
