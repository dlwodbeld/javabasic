package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rad = new Random();
		//4-30
		System.out.println("���ڸ��߱� ���ӽ���!");
		System.out.println("0���� 99������ ���ڸ� ���߼���.");
		int a = rad.nextInt(99);
		for(int i = 6; i<=6;i--) {
			System.out.print("���� Ƚ��"+i+"ȸ, � �����ϱ�? : "); int b = sc.nextInt();
			if(b<a) {
				System.out.println("�� ū �����Դϴ�.");
			}
			else if (b>a) {
				System.out.println("�� ���� �����Դϴ�.");
			}
			else if (b==a) {
				System.out.println((6-i)+"������ ���߼̽��ϴ�.");
				break;
			}
			if (i==1) {
				System.out.println("��6ȸ ���� Ʋ�Ƚ��ϴ�. ������"+a+"�Դϴ�.");
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
		System.out.print("��� �� : ");	int g = sc.nextInt();
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
