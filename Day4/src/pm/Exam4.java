package pm;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열
		 * 동일한 자료형을 묶어 저장하는 참조형 자료형이다.
		 * 최초 생성시 지정한 크기를 절대 변경할 수 없는 특징이 있다.
		 *
		 *
		 *
*배열선언 	- 자료형[] 변수명;		자료형 변수명[];
		 *int[] a;		int a[];
		 *double[] b;	double b[];
		 *String[] c;	String c[];
		 *
		 *
		 *배열을 선언하게되면 메모리에 변수를 공간만 생성하고 공간안은 비운채로 일단 둔다.
		 *
		 *2.배열 객체 생성
		 *
		 *new int[3];
		 *new String[5];
		 *
		 *3.배열 자료형 변수에 객체 넣기
		 *
		 *int[] a = new int[3];
		 *
		 *int 배열 자료형의 변수명 a 참조변수에 새로운 int 자료형 3개를 저장할것이다.
		 *
		 */
		
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		int[] array3 = new int[3];
		int[] array4;
		array4 = new int[3];
		
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		
		int[] a = new int[3];
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//int[] b = new int[] {3,4,5}; //fm
		
//		int[] b;
//		b = new int[] {3,4,5};
		int[] c = {3,4,5};
		

	}

}
