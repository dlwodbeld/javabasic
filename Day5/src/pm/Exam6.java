package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "�� �̸��� [���繮]�Դϴ�. ���̴� [15]�� �Դϴ�."
		//��� ���ڿ��� ������ String �ż��带 ����Ͽ�
		//String name -> "���繮" int age -> 15 �� ����ǵ���
		//�ڵ带 �ۼ��ϼ���.
		//�� indexOf() lastIndexOf() substring() �ݵ�� ���.
		
		String str = "�� �̸��� [���繮]�Դϴ�. ���̴� [15]�� �Դϴ�.";
		System.out.println();
		System.out.println(str.indexOf("���繮"));
		System.out.println();
		System.out.println(str.lastIndexOf("15"));
		System.out.println();
		System.out.println("�̸� : " + str.substring(7,10));
		System.out.println("���� : "+str.substring(21,23));
		System.out.println();
		int name1 = str.indexOf('[')+1;
		System.out.println(name1);
		
		int age1 = str.lastIndexOf('[')+1;
		System.out.println(age1);
		 
		
	}

}
