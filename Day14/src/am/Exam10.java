package am;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드의 이름 = " + curThread.getName());
		System.out.println("현재 동작중인 개수 = " + curThread.activeCount());

	}

}
