package pm;
class FoolException extends RuntimeException{
	//����θ� �ڵ����� ����Ʈ �����ڸ� ������ش�.
	//����� �ް� �����Ƿ� �ڵ���� �θ��� �����ڸ� ȣ���Ѵ�. super();
	
}

public class Exam6_1 {
	
	
	
	
	public void sayNick(String nick) {
		if("fool".equals(nick)) {
			throw new FoolException();
			}
	System.out.println("����� ������ " + nick + "�Դϴ�.");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam6_1 sample = new Exam6_1();
		sample.sayNick("fool");	//���� �߻�
		sample.sayNick("genious");// �������� ���� �ʴ´�.

	}

}
