package pm;

public interface Meter {
	public void start();
	public void stop(int distance);
	public default void afterMidnight() {
		System.out.println("������ �Ѿ����ϴ�. ������ �ʿ��Ѱ�� �� �޼��带 �������̵��ϼ���.");
	}

}
