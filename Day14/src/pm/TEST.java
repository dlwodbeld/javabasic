package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	//7-9
	static int readPlusInt() {
		
		int a;
		do {
			System.out.print("양의 정숫값 : "); a = sc.nextInt();
			
		}while(a <= 0);
		return a;
	}
	
	//7-10
	static boolean confine() {
		int cont; 
		do {
			System.out.print("다시한번?<Yes...1/No...0> : ");
			cont = sc.nextInt();
		}while(cont != 0 && cont != 1);
		return cont ==1;
	}
	
	//7-15
	static int  sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	//7-16
	static int minOf(int[] a) {
		int min = a[0];
		for(int i = 0;i< a.length;i++) 
			if(a[i] < min)
				min = a[i];
			return min;
		
	}
	
	//7-17
	static int linearSearch(int[] a, int key) {
		for(int i = 0;i<a.length;i++)
			if(a[i] == key)
				return i;
		return -1;
	}
	
	static int linearSearchR(int[] a, int key) {
		for(int i = a.length-1;i>=0;i--)
			if(a[i]==key)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//7-9
		System.out.println("7-9");
		int a;
		do {
			int n = readPlusInt();
			
			System.out.print("반대로 읽으면 : ");
			while(n>0) {
				System.out.print(n%10);
				n /= 10;
			}
			System.out.println("입니다.");
			do{
				System.out.print("다시한번?<Yes...1/No...0>: "); a = sc.nextInt();
				
			}while (a != 0&& a!=1);
		}while (a == 1);
		System.out.println();
		
		//7-10
		System.out.println("7-10");
		System.out.println("암산 훈련!!");
		do {
		int b = rand.nextInt(900) + 100;
		int c = rand.nextInt(900) + 100;
		int d = rand.nextInt(900) + 100;
		int pattern = rand.nextInt(4);
		
		int ans;
		switch(pattern) {
		case 0 : ans = b+c+d; break;
		case 1 : ans = b+c-d; break;
		case 2 : ans = b-c+d; break;
		default: ans = b-c-d; break;
		}
		while(true) {
			System.out.print(b + ((pattern < 2) 	? " + " : " - ") +
					c + ((pattern%2==0) 	?	 " + " : " - ") +
					d + " = ");
			int k = sc.nextInt();
			if(k == ans)
				break;
			System.out.println("틀렸습니다!");
		}
		
		}while(confine());
		System.out.println();
		
		//7-15
		System.out.println("7-15");
		System.out.print("요소 수 : "); int e = sc.nextInt();
		int[] f = new int[e];
		
		for(int i = 0; i<e;i++) {
			System.out.print("x["+i+"] : ");
			f[i] = sc.nextInt();
		}
		System.out.println("모든 요소의 합은 "+ sumOf(f) + "입니다.");
		System.out.println();
		
		//7-16
		System.out.println("7-16");
		System.out.print("사람 수는 : ");
		int g = sc.nextInt();
		
		int [] height = new int[g];
		int [] weight = new int[g];
		
		System.out.println(g + "명의 신장과 체중을 입력하자.");
		
		for(int i = 0;i<g;i++) {
			System.out.print((i+1) + " 번의 신장 : ");
			height[i] = sc.nextInt();
			System.out.print((i+1) + " 번의 체중 : ");
			weight[i] = sc.nextInt();
		}
		System.out.println("가장 키가 작은 사람의 신장 : " + minOf(height) + "cm");
		System.out.println("가장 마른 사람의 체중 : " + minOf(weight) + "kg");
		System.out.println();
		
		//7-17
		System.out.println("7-17");
		System.out.print("요소 수 : ");
		int h = sc.nextInt();
		int []z = new int[h];
		for(int i = 0; i<h;i++) {
			System.out.print("x["+i+"] : ");
			z[i] = sc.nextInt();
		}
		System.out.print("찾는 값 : ");
		int ky = sc.nextInt();
		
		int idxTop = linearSearch(z,ky);
		int idxBtm = linearSearchR(z,ky);
		if(idxTop == -1)
			System.out.println("해당값은 존재하지 않습니다.");
		else if(idxTop == idxBtm)
			System.out.println("해당값은 x[" + idxTop + "]에 존재합니다.");
		else {
			System.out.println("해당값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
		}
		
	}

}
