package pm;

public class Exam8{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 쓰래드 사용 2번째 방법
		 * 
		 * 1.Runnable 인터페이스를 구현한 클래스를 정의한다.
		 * 2.run() 을 실제 구현하면서 여기에 쓰레드의 작업 내요을 작성한다.
		 * 3. 앞에서 정의한 클래스를 이용하여 RUnnable 객체를 생성한다.
		 * 
		 * 문제는 Runnable 객체의 내부에는 start()메서드가 존재하지 않기때문에 start() 가진 Thread 객체를 생성해야 한다.
		 * Runnable 객체가 갖고 있으므로 Thread 객체를 생성할 때  Runnable 객체를
		 * 생성자의 매개변수로 넘겨준다. 이렇게 객체를 생성하면 생성된 Thread 객체 내부의 run() 매서드는 생성자 매개변술 ㅗ넘어온 Runnable 객체 내부의
		 * run() 으로 대체된다.
		 * 
		 */
		Runnable smiFileRunnable = new SMIFileRunnable();
		
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("비디오 프레임 " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}

	}

}
class SMIFileRunnable implements Runnable{
	@Override
	public void run() {
		String[] strArray = {"하나","둘","삼","넷","오"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for(String b: strArray) {
			System.out.println("- 자막번호 " + b);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}