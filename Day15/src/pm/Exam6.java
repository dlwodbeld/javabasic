package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���׸��� ����ϸ� ��� Ÿ���� ��ǰ�� �����Ҽ��� �����鼭�� �߸��� ĳ������ �Ҷ� ���� ������ �߻���Ű�� ������ ������ �����Ҽ� �ִ�.
		 
		 ���׸� Ŭ������ ����ű�� �������̽� ����
		 
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
		 
		 ���׸� Ŭ���� MyClass<T> �� ���׸� ���� ���� 1���� �������ִ�.
		 �� ���׸� Ÿ���� �ʵ�Ÿ�� getter �޼����� ����Ÿ�� setter�ż����� �Է� Ÿ�Կ� �����.
		 
		 ���׸� �������̽��� MyInterface<K,Y> �� 2���� ���׸� Ÿ�Ժ����� ���� �ְ�
		 ���� setter �� getter �ż����� �Է°� ����Ÿ������ �����.
		 
		 ���׸� Ŭ������� �ص� ���� Ŭ������ ��ü�������� ����� ��� ���� �ִ�.
		 �ٸ� Ŭ������ ������ ���׸� Ÿ���� ����Ѵٴ� ������ ���̰� �ִ�.
		 �� ��ü�� �����Ҷ� ���׸� Ÿ�� ������ ���� Ÿ�̕��� �����ϰ� �Ǵ� ���̴�.
		 
		 MyClass<String> mc2 = new MyClass<String>();
		 //String Ÿ���� �����ϰų� ������ �� �ִ� ��ÿ�� ����.
		  * 
		 
		 */
		
		 MyClass<String> mc1 = new MyClass<String>();
		 mc1.set("�ȳ�");
		 System.out.println(mc1.get());
		
		 MyClass<Integer> mc2 = new MyClass<>();
		 mc2.set(100);
		 System.out.println(mc2.get());
		 System.out.println(mc2);

		 MyClass<Integer> mc3 = new MyClass<>();
//		 mc3.set("�ȳ�");	//�����߻�
		 System.out.println(mc3.get());
		 System.out.println(mc3);
/*
 �ܼ��ϰ� �ϳ��� Ŭ������ �پ��� Ÿ���� ��ü�� �����ϰ� �����Ҽ� �ֵ��� �ϴ°��� Object Ÿ���� �ʵ带 ����ϴ� �͸����ε� �����ϴ�.
 ������ ��� ��ü�� Object Ÿ���̱� ������ �Ǽ��� ������ ��ü�� �����ϴ��� ������ �߻������� �ʴ´�.
 getter �ż���� ������ ���� Object Ÿ���̹Ƿ� �׻� �ٿ� ĳ������ �����ؾ߸� �ߴ�.
 ������ ���׸� Ŭ������ ����� mc1,mc2��ü ���� ���� ���� ������� ���� ��ü�� ������ �� ������ Ÿ������ Ȯ���Ǳ⋚���� setter �ż��带 ����� �� �Է� Ÿ����
 ��Ȯ�� Ȯ���Ҽ��� �ְ� ��µ� �ش� Ÿ������ ������ �Ǳ⋚���� �ٿ� ĳ���� ��ü�� �ʿ��������.
  
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

