package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread smiVideoThread = new videoThread();
		smiVideoThread.start();
		Thread smiAudioThread = new audioThread();
		smiAudioThread.start();
	}

}
class videoThread extends Thread{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("���� ������ " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}
}
class audioThread extends Thread{
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