package pm;

import java.util.Arrays;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String - ���ڿ� �ڷ���, �ڹٿ��� ���� ���� ���Ǵ� �ڷ���
//		
//		int a = 12;
//		String b = "swift";
//		String c = new String("swift");
		
//		String str1 = new String("����");
//		System.out.println(str1);
//
//		String str2 = "�ȳ�";
//		System.out.println(str2);
		
		//String �� Ư¡ - 1. �ѹ� ���ǵ� ���ڿ��� ������ �� ����.
		// ���� ���ڿ��� ������ �����ϸ� �ڹٰ� ���� ���ڿ��� �����ϴ°��� �ƴ϶�
		// ���ο� ���ڿ��� �����Ͽ� ����ϰ� �ȴ�.
		//������ ��ü�� ������.
		//2. ���ڿ��� �Է��Ͽ� ��ü�� �����Ҷ� ���� ���ڿ� ���� ��ü�� �����Ѵ�.
		//�̰��� �޸��� ȿ���� �����̴�.
		//
		
//		String str1 = new String("�ȳ�");
//		String str2 = str1;
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		str1 = "�ȳ��ϼ���";
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		int[] arr1 = new int[] {3,4,5};
//		int[] arr2 = arr1;
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		
//		
//		arr1[0] = 6;
//		arr1[1] = 7;
//		arr1[2] = 8;
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
		/*
		 str1			100����
		 |------------->"�ȳ�"

		 
		 str1			100����
		 |------------->"�ȳ�"
		 str2			100����

		 
		 str1			200����				100����
		 |------------->"�ȳ��ϼ���"			"�ȳ�"
		 str2----------------------------------
		 
		 */
		
		String str1 = new String("�ȳ�");
		String str2 = "�ȳ�";
		String str3 = "�ȳ�";
		String str4 = new String("�ȳ�");
		String str5 = new String("�ȳ�");
		
		/*
		 * str1 ----------->100����"�ȳ�"
		 * str3 -----------> "�ȳ�"
		 * str2 -------------------------------> 200����"�ȳ�"
		 * str4 --------------------->400���� "�ȳ�"
		 * str5 ------------->"�ȳ�"
		 * 
		 * new�� �����ҋ��� ������ ���ڿ� ��ü�� �뤶����� ������ ���ο� ��ü�� �����Ѵ�.
		 * new�� ������� �ʾ������� �̹� ������ ���� ���ڿ��� ������ �� ��ü�� �����Ѵ�.
		 */
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);
 		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
		
		
		
		
		

	}

}
