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
			}
		}else if(num >= 80) {
			grade = 'B';
		}else if(num >= 70) {
			grade = 'C';
		}else if(num >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		if(num == 100) {
			opt = '+';
		}
		else if (num % 10 == 0) {
			opt = ' ';
		}
		else if (num <=59) {
			opt = ' ';
		}
		else if(num % 10 >=7 ) {
			opt = '+';
		}else if(num%10 <4) {
			opt = '-';
		}

		System.out.printf("����� ������ %c%c �Դϴ�. \n",grade,opt);
		
		
		
		
		
		
		
		
}
}
