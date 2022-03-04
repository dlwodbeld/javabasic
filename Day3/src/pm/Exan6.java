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
//			System.out.println("3자리의 양의 정수값(100~999)를 입력하세요>>>");
//			int a = sc.nextInt();
//			
//			
//			System.out.println("다시입력하세요.");
//		}while(a<100 || a>999);
//		
//		System.out.println("입력한 값은 " + a + " 입니다.");
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int no = 10 + rand.nextInt(90);
		int num;
		do{

			System.out.println("어떤숫자일까요?");
			num = sc.nextInt();
			if (num>no) {
				System.out.println("더 작은숫자입니다.");
			}
			else if (num<no) {
				System.out.println("더 큰숫자 입니다.");
			}
		}while(no!=num);
		System.out.println("정답입니다.");

	}

}
