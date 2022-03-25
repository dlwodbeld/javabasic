package am;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		G g1 = new G(0);
//		G g2 = new G(0.0, 0.1);

		
		G g = new G();
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(g.d);
		
		
	}

}
//
//class G{
//	G(int k){
//		
//	}
//	G(double a, double b){
//		
//	}
//}
//

class G{
	int a,b,c,d;
	G(){
		 this(5);
	}
	G(int k){
		a = k;
		b = k;
		c = k;
		d = k;
	}
}