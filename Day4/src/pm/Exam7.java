package pm;

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���̰� 100�� �迭�� ����� for���� �̿��Ͽ� �迭�� �������
		// 1~100������ ���� ��������. ������ 1�ٷ� ��ü�� ����ϼ���. tostring ���.
		
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


