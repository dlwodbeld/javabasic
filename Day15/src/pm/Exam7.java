package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���׸� Ÿ�� ������ 2���϶��� �����غ���. ���׸� Ÿ�Ժ����� 2�������� �����ϸ� ���ð��� ���캻 ������ 1���ϋ��� �Ϻ��ϰ� �����ϴ�.
		 ��ü�� �����Ҷ� ����� ���� ���׸� Ÿ���� ������� ������ ���׸� Ÿ�� ������ ġȯ�ȴ�.
		 
		 */
//		KeyValue<String, Integer> kv1 = new KeyValue<>();
//		kv1.setKey("���");
//		kv1.setValue(1000);
//		
//		String key1 = kv1.getKey();
//		int value1 = kv1.getValue();
//		
//		System.out.println(key1 + "," + value1);
//
//		KeyValue<Integer, String> kv2 = new KeyValue<>();
//		kv2.setKey(404);
//		kv2.setValue("Nout Found(��û�� �������� ã���� �����ϴ�.)");
//		
//		int key2 = kv2.getkey();
//		String value2 = kv2.getValue();
//		
//		System.out.println(key2 + "," + value2);
//		
//		
	}

}



class KeyValue<K,V>{
	private K key;
	public KeyValue(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public void setValue(String string) {
		// TODO Auto-generated method stub
		
	}
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setValue(int i) {
		// TODO Auto-generated method stub
		
	}
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		
	}
}


/*
 ����� ���� ���� ���� ������.
 �ᱹ �̸��� ���ϴ°���
 1. �߰� Ŭ���� ���� ���� � ��ǰ�� ���� ������ �� �־�� �Ѵٴ°�
 2. setter�޼��忡 �߸��� ��ü�� �Է������� �ٷ� �������� Ȯ�� �Ҽ��־���ϰ�
 3. getter�޼����� ����Ÿ�Ե� �ٿ�ĳ������ �ʿ� ����� �Ѵٴ°��̴�.
 
 1�� ��쿡�� Object Ÿ������ ������ ���� ������������
 2/3 �� ������ ���� ��Ű�� ������ ����� �ٷ� ���׸��̴�.
 
 */



