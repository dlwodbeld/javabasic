package pm;

public class Exam7 {
	
	
	public void sayNick(String nick) {
		try {
		if("fool".equals(nick)) {
			throw new FoolException();
			}
	System.out.println("����� ������ " + nick + "�Դϴ�.");
	}catch(FoolException e) {
		System.out.println("FiikException�� �߻��߽��ϴ�.");
	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam7 sample = new Exam7();
		sample.sayNick("fool");	//���� �߻�
		sample.sayNick("genious");// �������� ���� �ʴ´�.

	}
}
