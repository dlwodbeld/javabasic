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
//		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요>>>");
//		int n = sc.nextInt();
//		int m = (int)(Math.random()*3) +1;
//		if (n==m) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.비겼습니다.\n",n,m);
//		}
//		else if (n==1&&m==3) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.이겼습니다.\n",n,m);
//		}
//		else if (n==2&&m==3) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.졌습니다.\n",n,m);
//		}
//		else if (n==1&&m==2) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.졌습니다.\n",n,m);
//		}
//		else if (n==3&&m==1) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.졌습니다.\n",n,m);
//		}
//		else if (n==2&&m==1) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.이겼습니다.\n",n,m);
//		}
//		else if (n==3&&m==2) {
//			System.out.printf("당신은 %d, 커뮤터는 %d 입니다.이겼습니다.\n",n,m);
//		}
//		else if (n ==0) {
//			System.out.println("시스템을 종료합니다.");
//		}
//		else {
//			System.out.println("다시입력해주세요.");
//		}
//		
//		}
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 선택하세요.");
		
		int pers = sc.nextInt();
		int comp = (int)(Math.random()*3) +1;
		
		switch(pers-comp) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 2: case -1://컴승 : 컴1사3 , 컴2 사1,컴3사2
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:	
			System.out.println("당신이 이겼습니다.");
			break;
		}
	}

}
