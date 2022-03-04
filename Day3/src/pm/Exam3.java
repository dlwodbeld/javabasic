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
		System.out.printf("당신의 학점은 %c%c 입니다. \n",grade,opt);
		
		
		
		
		
		
		
		
}
}
