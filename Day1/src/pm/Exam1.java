package pm;
/*
��Ű�� �����,�ҽ��� ù�ٷ� �����Ѵ�.
����Ʈ ��Ű���� ����ϰԵǸ� ������ �����Ѵ�.
 */
/*
 * Ŭ���� �����
 * public - ����������(���߿��ڼ��� ����)
 * class Test - Test��� �̸��� class�� ��Ÿ����.
 * Ŭ�������� �ݵ�� ���ϸ�� ��ġ�ؾ��Ѵ�.
 * ���������� ������ �빮�ڷ� ����Ѵ�.
 */
public class Exam1 {
	/*
	 * main �޼���
	 * public - ����������
	 * static - ��ü�� ���������ʰ����� ����
	 * void - return �� ������ �ǹ�
	 * main - �ڹٴ� �ݵ�� 1���� main �޼��尡 �־�߸��Ѵ�.������
	 * String[] - �迭�� �ǹ� args �μ��� �ǹ�
	 */
	public static void main(String[] args) {
		//�ڹٿ����� ���� �ּ�
		System.out.print("hello !");
		System.out.println("world !");
		//System.out.println() �μ��� �ٹٲ��� �ǹ�
		//System.out.print()   �μ��� �� �ȹٲ�
		System.out.println("ȭ��" + "���");
		System.out.println(3.14);
		System.out.println(3+5);
		System.out.println("ȭ��" + 3);
		System.out.println("ȭ��" + 3+5);
		System.out.println(3+5+"ȭ��");
		//int ������ ���� ����
		int a = 3;
		//String ���ڿ� ���� ����
		String b = "ȭ��";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b+"���");
		System.out.println(a + b + "���");
		
		System.out.println(a+"\n"); //���๮��
		System.out.println(b);
		
		//printf()
		System.out.println();
		System.out.println();
		System.out.printf("%d\n",30);
//		System.out.printf("%d\n","���");
//		System.out.printf("%d\n",3.14);
		
		System.out.println("�ȳ�"+5.8);
		System.out.println(3+5+"�氡"+4+2);
		System.out.printf(" %s:%d","ȫ�浿",15);
	}
 
}
