package pm;
/*
페키지 선언부,소스의 첫줄로 선언한다.
디폴트 페키지를 사용하게되면 선언은 생략한다.
 */
/*
 * 클래스 선언부
 * public - 접근지정사(나중에자세히 설명)
 * class Test - Test라는 이름의 class를 나타낸다.
 * 클래스명은 반드시 파일명과 일치해야한다.
 * 관용적으로 시작을 대문자로 사용한다.
 */
public class Exam1 {
	/*
	 * main 메서드
	 * public - 접근지정가
	 * static - 객체를 생성하지않고도실행 가능
	 * void - return 이 없음을 의미
	 * main - 자바는 반드시 1개의 main 메서드가 있어야만한다.시작점
	 * String[] - 배열을 의미 args 인수를 의미
	 */
	public static void main(String[] args) {
		//자바에서의 한줄 주석
		System.out.print("hello !");
		System.out.println("world !");
		//System.out.println() 인쇄후 줄바꿈을 의미
		//System.out.print()   인쇄후 줄 안바꿈
		System.out.println("화면" + "출력");
		System.out.println(3.14);
		System.out.println(3+5);
		System.out.println("화면" + 3);
		System.out.println("화면" + 3+5);
		System.out.println(3+5+"화면");
		//int 정수형 변수 선언
		int a = 3;
		//String 문자열 변수 선언
		String b = "화면";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b+"출력");
		System.out.println(a + b + "출력");
		
		System.out.println(a+"\n"); //개행문자
		System.out.println(b);
		
		//printf()
		System.out.println();
		System.out.println();
		System.out.printf("%d\n",30);
//		System.out.printf("%d\n","출력");
//		System.out.printf("%d\n",3.14);
		
		System.out.println("안녕"+5.8);
		System.out.println(3+5+"방가"+4+2);
		System.out.printf(" %s:%d","홍길동",15);
	}
 
}
