package pm;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}		//	변수 value2 가 사라지는 시점

		System.out.println(value1);
		//System.out.println(value2);  //안에서 선언한 변수는 밖에 나와선 동작이 안된다.
		

		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}//  변수 value1 가 사라지는 시점

}
/*
 * 자바에는 8가지 기본 자료형이 있고 나머지는 모두 참조자료형이라고 볼수있다.
 * 참조 자로형은 개발자가 직접 정의할 수도 있어 가짓수가 무한대이다.
 * 
 * 불 	(true/false)
 * 정수	int byte short long
 * 실수	double float
 * 문자	char
 * 
 * 
 * 기본 자료형은 메모리에 생성도니 공간에 실제 ㅂ변수값을 저장한다.
 * 반면 참조 자료형은 실제 데이터값은 메모리에 저장하고 변수 공간에는 실제 변수값이 저장된 메모리의 위치값이 저장된다.
 * 
 * Boolean	1byte	true/false
 * int		4byte	-2^31~2^31-1
 * double	8byte	?
 * char		2byte	
 */


