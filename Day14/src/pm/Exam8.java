package pm;

public class Exam8{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ ��� 2��° ���
		 * 
		 * 1.Runnable �������̽��� ������ Ŭ������ �����Ѵ�.
		 * 2.run() �� ���� �����ϸ鼭 ���⿡ �������� �۾� ������ �ۼ��Ѵ�.
		 * 3. �տ��� ������ Ŭ������ �̿��Ͽ� RUnnable ��ü�� �����Ѵ�.
		 * 
		 * ������ Runnable ��ü�� ���ο��� start()�޼��尡 �������� �ʱ⶧���� start() ���� Thread ��ü�� �����ؾ� �Ѵ�.
		 * Runnable ��ü�� ���� �����Ƿ� Thread ��ü�� ������ ��  Runnable ��ü��
		 * �������� �Ű������� �Ѱ��ش�. �̷��� ��ü�� �����ϸ� ������ Thread ��ü ������ run() �ż���� ������ �Ű����� �ǳѾ�� Runnable ��ü ������
		 * run() ���� ��ü�ȴ�.
		 * 
		 */
		Runnable smiFileRunnable = new SMIFileRunnable();
		
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("���� ������ " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}

	}

}
class SMIFileRunnable implements Runnable{
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