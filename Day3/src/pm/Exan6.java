package pm;

import java.util.Random;
import java.util.Scanner;

public class Exan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a;
//		
//		do {
//			System.out.println("3�ڸ��� ���� ������(100~999)�� �Է��ϼ���>>>");
//			int a = sc.nextInt();
//			
//			
//			System.out.println("�ٽ��Է��ϼ���.");
//		}while(a<100 || a>999);
//		
//		System.out.println("�Է��� ���� " + a + " �Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int no = 10 + rand.nextInt(90);
		int num;
		do{

			System.out.println("������ϱ��?");
			num = sc.nextInt();
			if (num>no) {
				System.out.println("�� ���������Դϴ�.");
			}
			else if (num<no) {
				System.out.println("�� ū���� �Դϴ�.");
			}
		}while(no!=num);
		System.out.println("�����Դϴ�.");

	}

}
