package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		//6-8
		System.out.print("��� �� : "); int z = sc.nextInt();
		int [] a = new int[z];
		for(int i = 0;i<a.length; i++) {
			System.out.print("a["+ i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("ã�� ���� : "); int ans = sc.nextInt();
		int x;
		for (x = 0; x<z;x++)
			if(a[x] == ans) {
				break;
			}
		if(x<z) {
			System.out.println("�װ��� a[" + x + "]�� �ֽ��ϴ�.");
		}else
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		
		//6-11
		System.out.print("��Ҽ� : "); int b = sc.nextInt();
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
		System.out.print("��Ҽ� : ");		d = sc.nextInt();
		if(d>10)
			System.out.println("10�� �Ѱ���ϴ�. �ٽ��̷��ϼ���.");
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
		System.out.print("��Ҽ� : ");	int f = sc.nextInt();
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
		System.out.println("��Ҹ� �������ϴ�.");
		
		for (int i = 0;i<f;i++) {
			System.out.println("a[" + i + "] = " + g[i]);
		}
		
		//6-14
		System.out.print("��� �� : "); int h = sc.nextInt();
		int [] m = new int[h];
		int [] n = new int[h];
		
		for(int i = 0;i<h;i++) {
			System.out.print("a[" + i + "] = "); m[i] = sc.nextInt();
		}
		for(int i = 0;i<h;i++) {
			n[i] = m[h-i-1];
		}
		System.out.println("a�� ��� ��Ҹ� �������� �����߽��ϴ�.");
		
		for(int i = 0; i<h;i++) {
			System.out.println("b[" + i + "] = " + n[i]);
		}
		
		
		
		
	}

}
