package pm;
import java.util.Scanner;
public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월을 입력하세요 >>>");
//		int mon = sc.nextInt();
//		
//		switch(mon) {
//		case 1: System.out.println("Jan"); break;
//		case 2: System.out.println("Feb"); break;
//		case 3: System.out.println("Mar"); break;
//		case 4: System.out.println("Apr"); break;
//		}
//		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
//		int j;
//		for(j=0; j<= 10;j++) {
//			System.out.println(j);
//		}
//		for (int i = 0,j = 0; i <= 10; i++,j++) {
//			System.out.println(i+j);
//		}
		
//		for (int i = 0;		;i++) //무한루프
//		{	
//			System.out.println(i + " ");
//		}
//		
		for (int i = 1; i <= 3; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.println(i + "일차 " + j + "교시");
			}
		}
		// for each
		
		String[] names = {"홍길동","이몽룡","성춘향"};
		int[] numbers = {1,2,3,4,5};
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
		
	}

}
