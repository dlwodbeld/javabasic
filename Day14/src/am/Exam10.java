package am;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread curThread = Thread.currentThread();
		System.out.println("���� �������� �̸� = " + curThread.getName());
		System.out.println("���� �������� ���� = " + curThread.activeCount());

	}

}
