package pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.bcd1();
		b.bcd_2();
		
		

	}

}

class MyException extends Exception{//�Ϲ� ����
	MyException(){
	}
		MyException(String s){
			super(s);
			
		
	}
}
class MyRTException extends Exception{//���� ����
	MyRTException(){
	}
	MyRTException(String s){
		super(s);
		
		
	}
}

class B{
	MyException me1 = new MyException();
	MyException me2 = new MyException("���� �޽���:MyException");

	MyException mer1 = new MyException();
	MyException mer2 = new MyException("���� �޽���:MyRTException");
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("���� �۵�");
			}else {
				throw me1; //���ܹ߻�
			}
		}catch(MyException e) {
			System.out.println("���� ó��1");
		}
	}
	void bcd1() {
		abc_1(65);
	}
	void abc_2(int num) throws MyException{
		if(num>70) {
			System.out.println("���� �۵�");
		}else {
			throw me1; //���� ���� �߻�
		}
	}
	void bcd_2() {
		try{
			abc_2(65);
	}catch(MyException e){
		System.out.println("���� ó�� 2");
		}
	}
}


