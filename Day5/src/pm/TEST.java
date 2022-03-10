package pm;
import java.util.Random;
import java.util.Scanner;

class TEST {
  public static void main(String[] args){
    //2-11
	 Scanner sc = new Scanner(System.in);
	 Random rd = new Random();
//
//    int m = (int)(Math.random() *9) + 1;
//    System.out.println(m);
//    //2-14
//    System.out.print("성 : "); String k = sc.next();
//    System.out.print("이름 : "); String ㅣ = sc.next();
//    System.out.println("안녕하세요."+k+ㅣ+" 씨");
    //3-3
//    System.out.println("변수 A : ");int t = sc.nextInt();
//    System.out.println("번수 B : ");int w = sc.nextInt();
//    if (t%w ==0) {
//    	System.out.println("B는 A의 약수입니다.");
//    }
//    else {
//    		System.out.println("B는 A의 약수가 아닙니다.");
//    	}
    //3-5
    System.out.println("정수값 : ");int y = sc.nextInt();
    if(y < 0)
    	System.out.println("값이 음수입니다.");
    else if (y == 0)
    	System.out.println("값이 0입니다.");
    else
    	System.out.println("값이 양수입니다.");
    System.out.println("변수 a : ");int a = sc.nextInt();
    System.out.println("변수 b : ");int b = sc.nextInt();
    if (a>b)
    	System.out.println("a가 크다.");
    else if (b>a)
    	System.out.println("b가 크다.");
    else if(a==b)
    	System.out.println("a와 b가 같다.");
    
    
  }
  
}