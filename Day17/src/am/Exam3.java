package am;

public class Exam3 {
	/*
	 * Quiz 1 class D�� ���弼��.
	 * 
	 * D d = new D();
	 * 
	 * d.print();	->�Է°��� �����ϴ�.
	 * d.print(3);	-> ������ : 3
	 * d.print(5.8); -> �Ǽ� �Է°� : 5.8
	 * d.print("�ȳ�");
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
		System.out.println("�Է°��� �����ϴ�.");
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