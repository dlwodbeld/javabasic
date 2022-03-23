package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 제네릭 타입 변수가 2개일때를 생각해보자. 제네릭 타입변수가 2개인점만 제외하면 전시간에 살펴본 변수가 1개일떄와 완벽하게 동일하다.
		 객체를 생성할때 사용한 실제 제네릭 타입은 순서대로 각각의 제네릭 타입 변수로 치환된다.
		 
		 */
//		KeyValue<String, Integer> kv1 = new KeyValue<>();
//		kv1.setKey("사과");
//		kv1.setValue(1000);
//		
//		String key1 = kv1.getKey();
//		int value1 = kv1.getValue();
//		
//		System.out.println(key1 + "," + value1);
//
//		KeyValue<Integer, String> kv2 = new KeyValue<>();
//		kv2.setKey(404);
//		kv2.setValue("Nout Found(요청한 페이지를 찾을수 없습니다.)");
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
 사과와 연필 저장 예로 들어가보자.
 결국 ㅜ리가 원하는것은
 1. 추가 클래스 생서 없이 어떤 상품도 저장 관리할 수 있어야 한다는것
 2. setter메서드에 잘못된 객체를 입력했을때 바로 문법으로 확인 할수있어야하고
 3. getter메서드의 리턴타입도 다운캐스팅이 필요 없어야 한다는것이다.
 
 1의 경우에는 Object 타입으로 선언을 통해 가능해지지만
 2/3 의 경우까지 만족 시키기 유일한 방법이 바로 제네릭이다.
 
 */



