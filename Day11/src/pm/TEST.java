package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		//6-15
		
		String[] monthString = {
				"January","February","March","April","May","June","July","August","September","October","November","December"
		};
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
					
		int retry;
		int last = -1;
		
		do {
			int month;
			do {
				month = ran.nextInt(12);
			}while (month == last);
			last = month;
		
		while(true){
			System.out.print((month+1) + "월: ");
			String s = sc.next();
			
			if(s.equals(monthString[month])) break;
			System.out.println("틀렸습니다.");
		}
		System.out.print("정답입니다. 다시한번?1...Yes/0...No: ");
		retry = sc.nextInt();
	}while(retry == 1);
		
	//6-16
		String[] dayKorean = {"월","화","수","목","금","토","일"};
		String[] dayEnglish = {"monday","tusday","wednesday","thursday","friday","saturday","sunday"};
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		int retry1;
		int last1 = -1;
		
		do {
			int day;
			do {
				day = ran.nextInt(7);
			}while(day == last1);
			last1 = day;
			
			while(true) {
				System.out.print(dayKorean[day]+"요일 : ");
				String s = sc.next();
				
				if(s.equals(dayEnglish[day])) break;
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시한번?1...Yes/0...No: ");
			retry1 = sc.nextInt();
		}while(retry1 == 1);
		
		//6-18
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		System.out.println("행렬 a의 요소를 입력하세요.");
		for(int i = 0; i<4;i++) {
			for(int j = 0; j<3;j++) {
				System.out.printf("a[%d][%d] : ",i,j);
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("행렬 b의 요소를 입력하세요.");
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<4;j++) {
				System.out.printf("b[%d][%d] : ",i,j);
				b[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<4;i++) {
			for(int j = 0; j<4;j++) {
				c[i][j] = 0;
				for(int k = 0;k<3;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("행렬 a 와 b의 곱");
		for(int i = 0;i<4;i++) {
			for(int j = 0; j<4;j++) {
				System.out.printf("%5d",c[i][j]);
			}
			System.out.println();
		}
		
		
		//7-1
		System.out.print("정수 x : ");
		int d = sc.nextInt();
		
		int s = signOf(d);
		System.out.println("signOf(x)는 "+ s +"입니다.");
		
		//7-2
		System.out.print("정수 a : "); int e = sc.nextInt(); 
		System.out.print("정수 b : "); int f = sc.nextInt(); 
		System.out.print("정수 c : "); int g = sc.nextInt(); 
		System.out.println("최솟값은 " + min(e,f,g)+"입니다.");
		
	}
	//7-1
	static int signOf(int n) {
		if(n>0)
			return 1;
		else if (n<0)
			return -1;
		
		return 0;

		
		
	}
	//7-2
	
	static int min(int e,int f,int g) {
		int min = e;
		if(f<min) min = f;
		if(g<min) min = g;
		return min;
	}
}


