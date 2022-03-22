package pm;

public class Exam6  extends Thread{//Thread 클래스를 상속받아서 정의했고
/*
 * 스레드 클래스를 상속받아서 run()메서드를 오버라이딩
 * step1 클래스 정의
 * step2 객체를 생성
 * step3 쓰래드 실행
 */
	@Override
	public void run() {
		String[] strArray = {"하나","둘","삼","넷","오"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for(String b: strArray) {
			System.out.println("- 자막번호 " + b);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		//객체 생성 및 시작
		Thread smiFileThread = new Exam6();
		smiFileThread.start();			//객체를 생성하여 start()메서드로 실행했다.
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("비디오 프레임 " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
		
		
	
	}

}
/*
 * 이전에 단일 쓰레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티 쓰래드로 변경하였따.
 * 출력하고자 하는 작업은 비디오 프레임의 번호와 자막의 동시 출력이다.
 * 프로그램이 처음 실행될때 이미 main쓰레드가 실행되고 있으므로 이 2개의 작업을 동시에 실행하기 위해서는 적어도 하나 이상의 쓰래드를 추가로
 * 생성하여 실행해야 한다.
 * 
 * main 쓰래드와 smiFileThread 를 사용하여 각각 비디오 번호와 자막번호를 출력했다.
 * 참고로 멀티 쓰레드는 독립적으로 실행되기떄문에먼저 start()매서드로 호출이 되었다 하더라도 
 * 나중에 실행된 쓰레드보다 늦게 실행될수 있다.
 * 이런 이유로 자막번호가 항상 비디오 번호 뒤에 나오도록 쓰레드에 Thread.sleep(10)을 추가해서 0.01초 늦게 출력되도록 했다.
 */
