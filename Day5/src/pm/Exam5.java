package pm;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "�ȳ�"+"�ϼ���"+"!";
//		System.out.println(str1);
//		
//		String str2 = "�ݰ�";
//		str2 += "���ϴ�";
//		str2 += "!";
//		System.out.println(str2);
		
		//String ��ü�� ������ �����Ҽ� ���⶧���� �޸𸮿��� ������
		//��ü�� �Ź� ������ �ȴ�.ó��"�ȳ�"+"�ϼ���" ���� �� ��ü��
		//���Ӱ� ��������� "�ȳ��ϼ���" + "!" ������ ��ü�� ��
		//�����ȴ�. �������� �Ǹ����� ��ü�� ��ġ���� ����ǰ� �ȴ�.
		
		//���ڿ� ���� �ż��� ����
//		
//		//length() ���ڿ� ����
//		String str1 = "Hello Java"; //��ĭ�� ���ڷ� count�Ѵ�.
//		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�."; //�ѱ�,���� ��� �ѹ��ڴ� �ϳ��� �ν��Ѵ�.
//		System.out.println(str1.length());
//		System.out.println(str2.length());
//		System.out.println();
//		
//		//charAt() ���ڿ� �˻�
//		System.out.println(str1.charAt(1));//�ε��� 1��ġ�� ���ڸ� �˻�.
//		System.out.println(str1.charAt(2));//�ε��� 2��ġ�� ���ڸ� �˻�.
//		System.out.println();
//		//indexOf() ���ڰ� ��ġ�� �ε����� ��ȯ(�տ�������)
//		System.out.println(str1.indexOf("a"));//�տ������� ù���������ϴ� 'a'�� ��ġ�� �ε���
//		System.out.println();
//		//lastIndexOf() ���ڰ� ��ġ�� �ε����� (��ȯ �ڿ�������)
//		System.out.println(str1.lastIndexOf("a"));
//		System.out.println();
//		//String.valueOf �⺻ �ڷ��� -> ���ڿ��� ��ȯ
//		String str3 = String.valueOf(2.3);
//		String str4 = String.valueOf(false);
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println();
//		//concat() ���ڿ��� ����
//		String str5 = str3.concat(str4);
//		System.out.println(str5);
//		System.out.println();
//		
//		//toLowerCase() | toUpperCase() ��ҹ��� ��ȯ
//		String str6 = "Java Study";
//		System.out.println(str6.toLowerCase());
//		System.out.println(str6.toUpperCase());
//		System.out.println();
//		
//		//replace() ���ڿ� ����
//		System.out.println(str6.replace("Study", "����"));
//		System.out.println();
//		
//		//substring ���ڿ����� �����̽�
//		System.out.println(str1.substring(0,5)); //0��°���� 5 �̸����� �����̽�
//		System.out.println();
//		
//		// trim ���� ����
//		System.out.println("     austin       ".trim());
//		System.out.println();
//		
		//���ڿ��� ����� : ���ڿ��� ���Ҷ��� ==�� �������� .equals() �� �������.
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		System.out.println(str2 == str3);	//���� ��ü�ʹ� ������� ���� �޸� �ּ������� ���θ� Ȯ���Ѵ�.
		System.out.println(str3 == str4);
		System.out.println(str2 == str4);
		System.out.println(str2.equals(str3));//�޸��� ��ġ�ʹ� ������� ���� ��ü���� ���Ѵ�.
		System.out.println(str3.equals(str4));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4)); //��ҹ��ڿ� ������� ��
		
		//5���� ���Ұ� �ִ� 1���� �迭�Ǹ�� ���Ҹ� ������� ����ϴ� �ڵ带 for-each���� ����Ͽ� �ۼ��ϼ���.
		int[] a = new int[] {1,2,3,4,5};
		
		for (int each:a) {
			System.out.println(each);
		}
		System.out.println();
		//b��� �̸��� 2�����迭 ��ü�� �����ϼ���.
		
		int[][] b = {{1,3,5},{7,9}};

		//����for���� ����Ͽ� 2���� �迭�� ��� ���Ҹ� ����ϼ���.
		for(int i = 0;i<b.length;i++) {
			for(int j = 0; j< b[i].length;j++) {
				System.out.println(b[i][j]);
			}

			
		}
		


	}

}
