package pm;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �迭
		 * ������ �ڷ����� ���� �����ϴ� ������ �ڷ����̴�.
		 * ���� ������ ������ ũ�⸦ ���� ������ �� ���� Ư¡�� �ִ�.
		 *
		 *
		 *
*�迭���� 	- �ڷ���[] ������;		�ڷ��� ������[];
		 *int[] a;		int a[];
		 *double[] b;	double b[];
		 *String[] c;	String c[];
		 *
		 *
		 *�迭�� �����ϰԵǸ� �޸𸮿� ������ ������ �����ϰ� �������� ���ä�� �ϴ� �д�.
		 *
		 *2.�迭 ��ü ����
		 *
		 *new int[3];
		 *new String[5];
		 *
		 *3.�迭 �ڷ��� ������ ��ü �ֱ�
		 *
		 *int[] a = new int[3];
		 *
		 *int �迭 �ڷ����� ������ a ���������� ���ο� int �ڷ��� 3���� �����Ұ��̴�.
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
