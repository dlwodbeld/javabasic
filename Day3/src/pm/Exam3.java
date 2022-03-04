package pm;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 하나 입력하세요.");
//		
//		int inp = sc.nextInt();
//		
//		if(inp == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		}else{
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}

		System.out.println("점수를 입력하세요>>>");
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

		System.out.printf("당신의 학점은 %c%c 입니다. \n",grade,opt);
		
		
		
		
		
		
		
		
}
}
