package am;

public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable audioRunnable = new audioThread();
		
		Thread thread1 = new Thread(audioRunnable);
		
		thread1.start();
		
		Runnable videoRunnable = new videoThread();
		
		Thread thread2 = new Thread(videoRunnable);
		
		thread2.start();
		
		
		
		
		
		
		
	}

}

class videoThread implements Runnable{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("���� ������ " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}
}
class audioThread implements Runnable{
	@Override
	public void run() {
		String[] strArray = {"�ϳ�","��","��","��","��"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for(String b: strArray) {
			System.out.println("- �ڸ���ȣ " + b);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}