package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
		
//		int n = sc.nextInt(),m;
//		while(true) {
//		System.out.println("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ���>>>");
//		int n = sc.nextInt();
//		int m = (int)(Math.random()*3) +1;
//		if (n==m) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�����ϴ�.\n",n,m);
//		}
//		else if (n==1&&m==3) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�̰���ϴ�.\n",n,m);
//		}
//		else if (n==2&&m==3) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�����ϴ�.\n",n,m);
//		}
//		else if (n==1&&m==2) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�����ϴ�.\n",n,m);
//		}
//		else if (n==3&&m==1) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�����ϴ�.\n",n,m);
//		}
//		else if (n==2&&m==1) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�̰���ϴ�.\n",n,m);
//		}
//		else if (n==3&&m==2) {
//			System.out.printf("����� %d, Ŀ���ʹ� %d �Դϴ�.�̰���ϴ�.\n",n,m);
//		}
//		else if (n ==0) {
//			System.out.println("�ý����� �����մϴ�.");
//		}
//		else {
//			System.out.println("�ٽ��Է����ּ���.");
//		}
//		
//		}
		System.out.println("����(1) ����(2) ��(3) �� �ϳ��� �����ϼ���.");
		
		int pers = sc.nextInt();
		int comp = (int)(Math.random()*3) +1;
		
		switch(pers-comp) {
		case 0:
			System.out.println("�����ϴ�.");
			break;
		case 2: case -1://�Ľ� : ��1��3 , ��2 ��1,��3��2
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:	
			System.out.println("����� �̰���ϴ�.");
			break;
		}
	}

}
