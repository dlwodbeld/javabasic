package pm;

public class Exam6  extends Thread{//Thread Ŭ������ ��ӹ޾Ƽ� �����߰�
/*
 * ������ Ŭ������ ��ӹ޾Ƽ� run()�޼��带 �������̵�
 * step1 Ŭ���� ����
 * step2 ��ü�� ����
 * step3 ������ ����
 */
	@Override
	public void run() {
		String[] strArray = {"�ϳ�","��","��","��","��"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for(String b: strArray) {
			System.out.println("- �ڸ���ȣ " + b);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		Thread smiFileThread = new Exam6();
		smiFileThread.start();			//��ü�� �����Ͽ� start()�޼���� �����ߴ�.
		int[] intArray = {1,2,3,4,5};
		for(int a: intArray) {
			System.out.print("���� ������ " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
		
		
	
	}

}
/*
 * ������ ���� ������� �����ߴ� ���� �����Ӱ� �ڸ��� ����ϴ� ���α׷��� ��Ƽ ������� �����Ͽ���.
 * ����ϰ��� �ϴ� �۾��� ���� �������� ��ȣ�� �ڸ��� ���� ����̴�.
 * ���α׷��� ó�� ����ɶ� �̹� main�����尡 ����ǰ� �����Ƿ� �� 2���� �۾��� ���ÿ� �����ϱ� ���ؼ��� ��� �ϳ� �̻��� �����带 �߰���
 * �����Ͽ� �����ؾ� �Ѵ�.
 * 
 * main ������� smiFileThread �� ����Ͽ� ���� ���� ��ȣ�� �ڸ���ȣ�� ����ߴ�.
 * ����� ��Ƽ ������� ���������� ����Ǳ⋚�������� start()�ż���� ȣ���� �Ǿ��� �ϴ��� 
 * ���߿� ����� �����庸�� �ʰ� ����ɼ� �ִ�.
 * �̷� ������ �ڸ���ȣ�� �׻� ���� ��ȣ �ڿ� �������� �����忡 Thread.sleep(10)�� �߰��ؼ� 0.01�� �ʰ� ��µǵ��� �ߴ�.
 */
