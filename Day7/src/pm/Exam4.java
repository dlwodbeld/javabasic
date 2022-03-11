package pm;

public class Exam4 {
	public static void main(String[] args) {
		//생성자가 this()를 사용하는 이유
		//객체를 생성하는 것과 생성자의 주요역할은 필드를 초기화하는 것이다.
		
		
		/*
		 * class A{
		 * int m1,m2,m3,m4;
		 * A(){
		 * m1 = 1;
		 * m2 = 2;
		 * m3 = 3;
		 * m4 = 4;
		 * }
		 * A(int a){	//생성자 오버로딩
		 * m1 = a;		//두번째 생성자가 첫번째 생성자와 다른점
		 * m2 = 2;
		 * m3 = 3;
		 * m4 = 4;
		 * }
		 * A(int a,int b){	//생성자 오버로딩
		 * m1 = a;		
		 * m2 = b;			//세번째 생성자가 첫번째 생성자와 다른점
		 * m3 = 3;
		 * m4 = 4;
		 * 
		 * 클래스 A에는 4개의 필드와 3개의 생성자가 있따. 각 생성자에는
		 * 필드들을 초기화하는데 방법이 약간씩 차이가있다. 첫 번째 생성자는 
		 * 4개의 필드를 각각 초기화하고 두번째 필드는 첫번째 필드에만 입력 받은 값을
		 * 대입하고 나머지는 첫번째 생성자와 동일하게 초기화 한다.
		 * 마지막 생성자도 두번째 생성자와 비교했을 때 2개의 필드를 전달받은값으로
		 * 초기화 한다는 점이 다르다.
		 * 
		 * 각 생성자마다 중복되는 코드를 많이 포함하고있다. 만약 20개의 필드라면 각 생성자는
		 * 모두 20줄의 초기화 코드를 포함해야된다.
		 * 
		 * 만약 두번째 생성자에서 첫번째 생성자를 호출할 수 있다면 두 번째 생성자에서는
		 * 1개의 필드만 추가로 초기화하면 된다. 마찬가지로 세번째 생성자도 두번째 생성자를 호출하게되면
		 * 추가로 1개의 필드만 초기화 하면 된다.
		 * 
		 * 이것이 바로 this() 매서드가 사용되는 이유이다.
		 * 
		 * this() 매서드를 이용하면 생성자의 중복을 제거할 수 있다...
		 * }
		 * }
		 */
		
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10,20);
		
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10,20);
		
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		
		b1.print();
		b2.print();
		b3.print();
		System.out.println();
		
		
		
		
	}
		
		
		
		
		
		
		
	}

	class A{
		  int m1,m2,m3,m4;
		  A(){
		  m1 = 1;
		  m2 = 2;
		  m3 = 3;
		  m4 = 4;
		  }
		  A(int a){	//생성자 오버로딩
		 m1 = a;		//두번째 생성자가 첫번째 생성자와 다른점
		  m2 = 2;
		  m3 = 3;
		  m4 = 4;
		 }
		  A(int a,int b){	//생성자 오버로딩
			  this(a);
		  m1 = a;		
		  m2 = b;			//세번째 생성자가 첫번째 생성자와 다른점
		  }
		  
		  void print() {
			  System.out.print(m1 + " ");
			  System.out.print(m2 + " ");
			  System.out.print(m3 + " ");
			  System.out.print(m4 + " ");
			  System.out.println();
			  System.out.println();
		  }
	}
	class B{
		int m1,m2,m3,m4;
		B(){
			m1 = 1;
			m2 = 2;
			m3 = 3;
			m4 = 4;
		}
		B(int a){	//생성자 오버로딩
			this();
			m1 = a;		//두번째 생성자가 첫번째 생성자와 다른점
		}
		B(int a,int b){	//생성자 오버로딩
			m1 = a;		
			m2 = b;			//세번째 생성자가 첫번째 생성자와 다른점
			m3 = 3;
			m4 = 4;
		}
		
		void print() {
			System.out.print(m1 + " ");
			System.out.print(m2 + " ");
			System.out.print(m3 + " ");
			System.out.print(m4 + " ");
			System.out.println();
			System.out.println();
		}
	}