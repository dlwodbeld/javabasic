package pm;

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//길이가 100인 배열을 만들어 for문을 이용하여 배열에 순서대로
		// 1~100까지의 값을 넣으세요. 옆으로 1줄로 전체를 출력하세요. tostring 사용.
		
		int[] arr = new int[100];
		for(int i = 0; i <arr.length;i++) {
			arr[i] = i+1;
			
		}
		System.out.println(Arrays.toString(arr));
		//2.
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		//arr2 = {1,2,3,4,5}
		for (int i = 0; i<arr1.length;i++) {
			int temp=arr1[i];
			arr2[i] = arr1[arr1.length-i-1];
			arr1[i] = temp;
			
			}

			System.out.println(Arrays.toString(arr2));
		}
		
	}


