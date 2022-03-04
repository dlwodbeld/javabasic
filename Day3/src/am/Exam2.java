package am;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break 제어 키워드
		
		//break {} 를 탈출하는 제어 키워드이다. 일반적으로 반복문에서 특정 조건을 만족하는 경우 반복문을 탈출하는데 사용된다.
//		for(int i = 0; i < 10; i++) {
//			if (i == 5) {
//				break;
//			}// if구문으로 break 키워드를 실행할 조건을 설정
//			System.out.println(i);
//		}//break로 ㅏㄹ출하게되는ㄴ 줄괄호
		
		//꼭 기억해야하는점은 break를 이용해 탈출하는것은 if문을 제외한 가장 가까운 중괄호라는것이다.
		//따라서 만약 이중으로 중복된 for문에서 break를 사용할경우 안쪽 for문만 탈출하게된다.

//		for(int i = 0; i< 10; i++) {
//			for (int j =0;j < 10;j++) {
//				if (j ==3) {
//					break;
//				}
//				System.out.println(i + " " + j);
//			}	//break로 탈출하게되는 중괄호
//		}
//		
		//j가 3이되면 break로 탈출하게되는 반복문은 안쪽의 for이다.
		//탈출을 한 뒤ㅏ에도 바깥쪽 for문ㅇ 내부에 있기 떄문에 i값의 변화에 따른 반복은 여전히 유효하게 된다.
		
		//그렇다면 한번에 모든 반복문을 탈출하는 방법은 없을까...
		
//	out:	//위치지정 레이블
//	for(int i = 0; i< 10; i++) {
//		for (int j =0;j < 10;j++) {
//			if (j ==3) {
//				break out;	//out이 이중for문 밖에 있으므로 그 위치로 나가게된다.
//			}
//			System.out.println(i + " " + j);
//		}	//break로 탈출하게되는 중괄호
//	}
	
		//continue 제어키워드
		//반복과정에서 특정구문을 실행하지않고 건너뛰는 용도로 사용된다.
		
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

		
		//#1. 레이블을 사용하여 i = 3, j =2 일떄 이중for문을 한번에 탈출
		
		
		
		//매뉴선택	1)빅맥/2)타코/3)백반
		
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 매뉴를 선택하세요.");
		int n = 0;
		out:
		while(n == 0) {
			
			System.out.println("1)빅맥");
			System.out.println("2)타코");
			System.out.println("3)백반");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("선택하신 매뉴는 " + menu + "번 빅맥입니다.");	
				continue;
			}
			if(menu == 2) {
				System.out.println("선택하신 매뉴는 " + menu + "번 타코입니다.");	
				continue;
			}
			if(menu == 3) {
				System.out.println("선택하신 매뉴는 " + menu + "번 백반입니다.");	
				continue;
			}
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break out;
			}
		}
		
		
		

	}

}
