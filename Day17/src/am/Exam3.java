package am;

public class Exam3 {
	/*
	 * Quiz 1 class D를 만드세요.
	 * 
	 * D d = new D();
	 * 
	 * d.print();	->입력값이 없습니다.
	 * d.print(3);	-> 정수값 : 3
	 * d.print(5.8); -> 실수 입력값 : 5.8
	 * d.print("안녕");
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F f = new F();
		
		int[] data1 = new int[] {1,2,3};
		int[] data2 = {1,2,3};
		System.out.println(f.arraySum(data1));
		System.out.println(f.arraySum(data2));
		
//		System.out.println(f.arraySum({1,2,3})) ;
		System.out.println(f.arraySum(new int[] {1,2,3}));
	}

}

class D{
	void print(){
		System.out.println("입력값이 없습니다.");
	}
	void print(int m) {
		System.out.println(m);
	}
	void print(float m) {
		System.out.println(m);
	}
	void print(double m) {
		System.out.println(m);
	}
}
class F {
    int arraySum(int[] array) {
        int sum = 0;
        for(int each: array) {
            sum += each;
        }
        return sum;
    }
}