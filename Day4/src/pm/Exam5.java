package pm;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ���� ��� ������ ������
		//���1
		int[] array1 = new int[3];	//�ʱ�ȭ�� �ߴ�.
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		System.out.println();
		System.out.println();
		
		
		//���2
		int[] array3 = new int[] {3,4,5};	//�ʱ�ȭ�� ����
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
		
		System.out.println();
		System.out.println();
		
		int[] array4 = new int[] {3,4,5};	//�ʱ�ȭ�� ����
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);
		
		System.out.println();
		System.out.println();
		
		//���3
		int[] array5 = {3,4,5};
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		//�迭������ �ʱ�ȭ �� ����
		// int, long,short,char,byte - 0���� �ʱ�ȭ
		//boolean - false�� �ʱ�ȭ
		//floatm double -  0.0���� �ʱ�ȭ
		//Ŭ����......null
		
		
		int value1;
		//System.out.println(value1);//���� �ʱⰪ ���� ����� �Ұ���

//		int[] value2;
//		System.out.println(value2);//���� �ʱⰪ ���� ��� �Ұ���
		
		int value3 = 0;	//0���� �ʱ�ȭ�Ͽ� ���� �̹߻�
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
		
		//�迭 ��ü�� ����ϴ� ������ ���
		
		System.out.println(Arrays.toString(array6));
		System.out.println(Arrays.toString(array7));
		System.out.println(Arrays.toString(array8));
		
		//�迭�� Ư¡
		
		
		
		
	}

}
