package pm;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �ϳ� �Է��ϼ���.");
//		
//		int inp = sc.nextInt();
//		
//		if(inp == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
//		}else{
//			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
//		}

		System.out.println("������ �Է��ϼ���>>>");
		int num = sc.nextInt();
		
		char grade = ' ',opt = ' ';
		
		if (num >= 90) {
			grade = 'A';
			if(num>=97) {
				opt = '+';
			}else if(num< 94) {
				opt = '-';
			}
		}else if(num >= 80) {
			grade = 'B';
			if(num>=87) {
				opt = '+';
			}else if(num< 84) {
				opt = '-';
			}
		}else if(num >= 70) {
			grade = 'C';
			if(num>=77) {
				opt = '+';
			}else if(num< 74) {
				opt = '-';
			}
		}else if(num >= 60) {
			grade = 'D';
			if(num>=67) {
				opt = '+';
			}else if(num< 64) {
				opt = '-';
			}
		}else {
			grade = 'F';
		}
		System.out.printf("����� ������ %c%c �Դϴ�. \n",grade,opt);
		
		
		
		
		
		
		
		
}
}
