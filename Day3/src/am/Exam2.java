package am;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break ���� Ű����
		
		//break {} �� Ż���ϴ� ���� Ű�����̴�. �Ϲ������� �ݺ������� Ư�� ������ �����ϴ� ��� �ݺ����� Ż���ϴµ� ���ȴ�.
//		for(int i = 0; i < 10; i++) {
//			if (i == 5) {
//				break;
//			}// if�������� break Ű���带 ������ ������ ����
//			System.out.println(i);
//		}//break�� �������ϰԵǴ¤� �ٰ�ȣ
		
		//�� ����ؾ��ϴ����� break�� �̿��� Ż���ϴ°��� if���� ������ ���� ����� �߰�ȣ��°��̴�.
		//���� ���� �������� �ߺ��� for������ break�� ����Ұ�� ���� for���� Ż���ϰԵȴ�.

//		for(int i = 0; i< 10; i++) {
//			for (int j =0;j < 10;j++) {
//				if (j ==3) {
//					break;
//				}
//				System.out.println(i + " " + j);
//			}	//break�� Ż���ϰԵǴ� �߰�ȣ
//		}
//		
		//j�� 3�̵Ǹ� break�� Ż���ϰԵǴ� �ݺ����� ������ for�̴�.
		//Ż���� �� �ڤ����� �ٱ��� for���� ���ο� �ֱ� ������ i���� ��ȭ�� ���� �ݺ��� ������ ��ȿ�ϰ� �ȴ�.
		
		//�׷��ٸ� �ѹ��� ��� �ݺ����� Ż���ϴ� ����� ������...
		
//	out:	//��ġ���� ���̺�
//	for(int i = 0; i< 10; i++) {
//		for (int j =0;j < 10;j++) {
//			if (j ==3) {
//				break out;	//out�� ����for�� �ۿ� �����Ƿ� �� ��ġ�� �����Եȴ�.
//			}
//			System.out.println(i + " " + j);
//		}	//break�� Ż���ϰԵǴ� �߰�ȣ
//	}
	
		//continue ����Ű����
		//�ݺ��������� Ư�������� ���������ʰ� �ǳʶٴ� �뵵�� ���ȴ�.
		
//		for (int i = 0;i<10;i++) {
//			if(i%2 == 0) 
//				continue;
//			System.out.println(i + " ");
//			 
//		}
		
//		for (int i = 0; i <5 ; i++) {
//			for(int j = 0; j< 5;j++) {
//				if (j ==3) {
//				continue;
//				}
//				System.out.println(i + " , " + j);
//			}
//		}
//		for (int i = 10; i > 0; i-= 2) {
//			System.out.println(i);
//		}
//		int i = 10;
//		while(i > 0) {
//			System.out.println(i);
//			i -=2;
//		}
//		out:
//		for ( int i = 0; i< 10;i++) {
//			for (int j = 0; j< 5; j++) {
//				if (i==3&j==2) {
//					break out;
//			
//				}
//
//				System.out.println(i + " " + j);
//			}
//		}

		
		//#1. ���̺��� ����Ͽ� i = 3, j =2 �ϋ� ����for���� �ѹ��� Ż��
		
		
		
		//�Ŵ�����	1)���/2)Ÿ��/3)���
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���ϴ� �Ŵ��� �����ϼ���.");
		int n = 0;
		out:
		while(n == 0) {
			
			System.out.println("1)���");
			System.out.println("2)Ÿ��");
			System.out.println("3)���");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("�����Ͻ� �Ŵ��� " + menu + "�� ����Դϴ�.");	
				continue;
			}
			if(menu == 2) {
				System.out.println("�����Ͻ� �Ŵ��� " + menu + "�� Ÿ���Դϴ�.");	
				continue;
			}
			if(menu == 3) {
				System.out.println("�����Ͻ� �Ŵ��� " + menu + "�� ����Դϴ�.");	
				continue;
			}
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break out;
			}
		}
		
		
		

	}

}
