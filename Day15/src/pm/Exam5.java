package pm;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods1 = new Goods();
		goods1.set(new Apple());
		Apple apple = (Apple)goods1.get();
		
		Goods goods2 = new Goods();
		goods2.set(new Pencil());
		Pencil pencil = (Pencil)goods2.get();

//		Goods goods3 = new Goods();
//		goods3.set(new Apple());
//		Pencil pencil2 = (Pencil)goods3.get();
		//���� ���� �߻� ClassCastExction
		
	}

}


class Apple {}
class Pencil {}
/*
 Object�� ��� Ÿ���� ��ü ���� ���������� �̶� ������ ���� �ִ�.
 �����͸� �����Ҷ��� ��������� ����� �����͸� ������ Ÿ������ ������ ���ؼ���
 ����� ���·� ĳ�����ؾ��Ѵ�.
 �ʵ� ��ü�� Object Ÿ���̱⶧���� get() �ż���� �������� Ÿ�� ���� �׻� ObjectŸ���̴�.
 ���� Apple ��ü�� ������������ get()�޼���� ������ Object �� AppleŸ�� Ȥ�� Pencil��ü�� ������������
 ������ Object Ÿ���� �� PencilŸ������ ���� ĳ�����ؾ��Ѵ�.
 
 ������ �Ǽ��� �����δ� Apple ��ü�ε� �����ö��� Pencil��ü�� ĳ������ �ϰԵǸ� �߸�ĳ���������� �߻��ϴ� ������ ClassCastException �� ���࿹���̱⶧����
 ���������� �߻����� �ʴ´�.�߸��� ĳ������ �����߿� ���ܸ� �߻��ϰ� �ȴ�.
 ���α׷��� ���� ����ɰ��̴�.
  
 �� ��ǰ���� ������ Ŭ������ �����ϴ� ��� �ֻ���� Ŭ������ Object Ÿ���� �ʵ带 �����ϸ� ��� Ÿ���� �����Ҽ��� �ִ�. ������ ����.
 �ٸ� ��ü�� get()�ż���� �������� ��� ������ Ÿ������ �ٿ�ĳ������ �����ؾ߸� �Ѵ�.
 �̶� �߸��� ĳ�������� ���� ���ܰ� �߻��Ҽ� �ְ� ���α׷��� ��������Ǵ� ������ �߻��Ѵ�. �̷��� ���������� �ذ����ִ� ���� �ٷ� ���׸��̴�.
 
 */
class Goods{ // Object ��� Ÿ���� ��ü ���� ����
	private Object object = new Object();
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object = object;
		
	}
	
	
	
	
	
	
}
