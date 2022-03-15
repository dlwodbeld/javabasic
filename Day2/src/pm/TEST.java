package pm;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 6;

		int[] a = {2,7,11,15};
		int target1 = 9;
		int[] c = new int[4];
		
		int[] b = {3,3};
		int target2 = 6;
		int[] d = new int[2];
		
		Num1 num1 = new Num1();
		num1.num1(a, target1, c);
		Num2 num2 = new Num2();
		num2.num2(b, target2, d);


		}
}
class Num1 {
	void num1(int[] a,int target1,int[] c) {
	for(int i = 0; i<a.length-1;i++) {
		if((a[i]+a[i+1]) == target1) {
			c[0] = i;
			c[1] = i+1;
			System.out.println("["+c[i] + " , " + c[i+1]+"]");
}
	}
	
}
}
class Num2{
	void num2(int[] b,int target2,int[] d) {
		for(int i = 0; i<b.length-1;i++) {
			if((b[i]+b[i+1]) == target2) {

				d[0] = i;
				d[1] = i+1;
				System.out.println("["+d[i] + " , " + d[i+1]+"]");
			}
		}
	}
	
}