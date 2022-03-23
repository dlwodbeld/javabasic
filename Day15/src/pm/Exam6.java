package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 제네릭을 사용하면 모든 타입의 상품을 저장할수도 있으면서도 잘못된 캐스팅을 할때 문법 오류를 발생시키는 문제를 사전에 예방할수 있다.
		 
		 제네릭 클래스와 제네킥릭 인터페이스 정의
		 
		 public class MyClass<T>{
		 private T t;
		 public T get() {
		 return t;
		 }
		 public void set(T t){
		 this.t = t;
		 }
		 }
		 public interface MyInterface<K,V>{
		 public abstract void setKey(K k);
		 public abstract void setValue(V v);
		 public abstract K getKey();
		 public abstract V getValue();
		 }
		 
		 제네릭 클랫인 MyClass<T> 는 제네릭 테입 변수 1개를 가지고있다.
		 이 제네릭 타입은 필드타입 getter 메서드의 리턴타입 setter매서드의 입력 타입에 사용됬다.
		 
		 제네릭 인터페이스인 MyInterface<K,Y> 는 2개의 제네릭 타입변수를 갖고 있고
		 각각 setter 와 getter 매서드의 입력과 리턴타입으로 사용됬다.
		 
		 제네릭 클래스라고 해도 역시 클래스의 객체생성등의 기능을 모두 갖고 있다.
		 다만 클래스명 다음에 제네릭 타입을 명시한다는 점에서 차이가 있다.
		 즉 객체를 생성할때 제네릭 타입 변수에 실제 타이븡ㄹ 대입하게 되는 것이다.
		 
		 MyClass<String> mc2 = new MyClass<String>();
		 //String 타입을 저장하거나 꺼내올 수 있는 객첼로 지정.
		  * 
		 
		 */
		
		 MyClass<String> mc1 = new MyClass<String>();
		 mc1.set("안녕");
		 System.out.println(mc1.get());
		
		 MyClass<Integer> mc2 = new MyClass<>();
		 mc2.set(100);
		 System.out.println(mc2.get());
		 System.out.println(mc2);

		 MyClass<Integer> mc3 = new MyClass<>();
//		 mc3.set("안녕");	//오류발생
		 System.out.println(mc3.get());
		 System.out.println(mc3);
/*
 단순하게 하나의 클래스로 다양한 타입의 객체를 저장하고 관리할수 있도록 하는것은 Object 타입의 필드를 사용하는 것만으로도 가능하다.
 하지만 모든 객체는 Object 타입이기 떄문에 실수로 엉뚱한 객체를 저장하더라도 오류를 발생하지는 않는다.
 getter 매서드로 꺼내온 값도 Object 타입이므로 항상 다운 캐스팅을 수행해야만 했다.
 하지만 제네릭 클래스를 사용한 mc1,mc2객체 생성 예를 보면 입출력이 각각 객체를 생성할 떄 정해진 타입으로 확정되기떄문에 setter 매서드를 사용할 때 입력 타입을
 정확히 확인할수도 있고 출력도 해당 타입으로 리턴이 되기떄문에 다운 캐스팅 자체가 필요없어진다.
  
 */
		
		
		
	}

}
class MyClass<T>{
private T t;
public T get() {
return t;
}
public void set(T t){
this.t = t;
}
}

