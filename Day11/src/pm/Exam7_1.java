package pm;


public class Exam7_1 {
	
	
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
		
		Exam7_1 sample = new Exam7_1();
		try {
		sample.sayNick("fool");	//���� �߻������� ó���߱⋚����
		sample.sayNick("genious");// �� ����ȴ�.
		}catch(FoolException e) {
			System.out.println("FoolException �� �߻��߽��ϴ�.");
		}
	}
}