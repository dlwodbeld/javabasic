package pm;

public class Exam5 {

	public static void main(String[] args) {
		// Method Overloading
		
//		print(); //인수가 없을때
//		
//		print(3);	//인수가 1개인데 int 형
//		
//		print(5.8);	//인수가 1개인데 double형
//		
//		print(2,5);	//인수가 2개일때
//		
//		print();	//하나의 메서드 명으로 인수의 개수와 형에 따라 동작을 다르게한다.
//		
		

//	}
//	public static void printa() {
//		System.out.println("데이터가 없습니다. ");
//	}
//	public static void printb(int a) {
//		System.out.println(a);
		print();
		print(3);

		}
				public static void print() {
			System.out.println("데이터가 없습니다. ");
				}
		
				public static void print(int a) {
					System.out.println(a);
				}
				
				public static void print(int b,int c) {
					System.out.println(b);
				}

}
