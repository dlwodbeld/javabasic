package pm;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 생성 방법 세가지 총정리
		//방법1
		int[] array1 = new int[3];	//초기화를 했다.
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		System.out.println();
		System.out.println();
		
		
		//방법2
		int[] array3 = new int[] {3,4,5};	//초기화를 생략
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
		
		System.out.println();
		System.out.println();
		
		int[] array4 = new int[] {3,4,5};	//초기화를 생략
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);
		
		System.out.println();
		System.out.println();
		
		//방법3
		int[] array5 = {3,4,5};
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		//배열에서의 초기화 값 정리
		// int, long,short,char,byte - 0으로 초기화
		//boolean - false로 초기화
		//floatm double -  0.0으로 초기화
		//클래스......null
		
		
		int value1;
		//System.out.println(value1);//오류 초기값 없이 출력이 불가능

//		int[] value2;
//		System.out.println(value2);//오류 초기값 없이 출력 불가능
		
		int value3 = 0;	//0으로 초기화하여 오류 미발생
		System.out.println(value3);
		
		int[] value4 = null;
		System.out.println(value4);
		
		boolean[] array6 = new boolean[3];
		System.out.println(array6[0]);
		System.out.println(array6[1]);
		System.out.println(array6[2]);
		for (int i = 0; i<3;i++) {
			System.out.println(array6[i]);
			

		}
		for(boolean j : array6) {
			System.out.println(j);
		}
		
		int[] array7 = new int[3];
		for(int each : array7) {
			System.out.println(each);
		}
		
		String[] array8 = new String[3];
		for (String str : array8) {
			System.out.println(str);
		}
		
		//배열 전체를 출력하는 간단한 방법
		
		System.out.println(Arrays.toString(array6));
		System.out.println(Arrays.toString(array7));
		System.out.println(Arrays.toString(array8));
		
		//배열의 특징
		
		
		
		
	}

}
