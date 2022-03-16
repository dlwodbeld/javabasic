package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		//6-8
		System.out.print("요소 수 : "); int z = sc.nextInt();
		int [] a = new int[z];
		for(int i = 0;i<a.length; i++) {
			System.out.print("a["+ i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("찾을 숫자 : "); int ans = sc.nextInt();
		int x;
		for (x = 0; x<z;x++)
			if(a[x] == ans) {
				break;
			}
		if(x<z) {
			System.out.println("그값은 a[" + x + "]에 있습니다.");
		}else
			System.out.println("해당 값이 존재하지 않습니다.");
		
		//6-11
		System.out.print("요소수 : "); int b = sc.nextInt();
		int [] c = new int[b];
		
		c[0] = 1 + ran.nextInt(10);
		for(int i = 1;i<b;i++) {
			do {
				c[i] = 1 + ran.nextInt(10);
			}while(c[i]==c[i-1]);
			
		}
		for(int i = 0;i<b;i++) {
			System.out.println("a[" + i + "] = " + c[i]);
		}
		
		//6-12
	
		int d;
		do {
		System.out.print("요소수 : ");		d = sc.nextInt();
		if(d>10)
			System.out.println("10을 넘겼습니다. 다시이력하세요.");
		}while(d>10);

		int [] e = new int[d];
		
		for(int i = 0;i<d;i++) {
			int j;
			do {
				j = 0;
				e[i] = 1 + ran.nextInt(10);
				for(;j<i;j++) {
					if(e[j] ==  e[i])break;
				}
			}while(j<i);
			
		}
		for(int i = 0;i<d;i++) {
			System.out.println("a[" + i + "] = " + e[i]);
		}
		
		//6-13
		System.out.print("요소수 : ");	int f = sc.nextInt();
		int [] g = new int[f];
		
		for(int i = 0; i<f;i++) {
			System.out.print("a[" + i + "] = "); g[i]=sc.nextInt();			
		}
		for(int i = f-1; i>0;i--) {
			int j = ran.nextInt(i+1);
			if(i != j) {
				int t = g[i];
				g[i] = g[j];
				g[j] = t;
			}
		}
		System.out.println("요소를 섞었습니다.");
		
		for (int i = 0;i<f;i++) {
			System.out.println("a[" + i + "] = " + g[i]);
		}
		
		//6-14
		System.out.print("요소 수 : "); int h = sc.nextInt();
		int [] m = new int[h];
		int [] n = new int[h];
		
		for(int i = 0;i<h;i++) {
			System.out.print("a[" + i + "] = "); m[i] = sc.nextInt();
		}
		for(int i = 0;i<h;i++) {
			n[i] = m[h-i-1];
		}
		System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
		
		for(int i = 0; i<h;i++) {
			System.out.println("b[" + i + "] = " + n[i]);
		}
		
		
		
		
	}

}
