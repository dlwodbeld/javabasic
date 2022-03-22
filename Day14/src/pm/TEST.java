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
			System.out.print("���� ������ : "); a = sc.nextInt();
			
		}while(a <= 0);
		return a;
	}
	
	//7-10
	static boolean confine() {
		int cont; 
		do {
			System.out.print("�ٽ��ѹ�?<Yes...1/No...0> : ");
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
			
			System.out.print("�ݴ�� ������ : ");
			while(n>0) {
				System.out.print(n%10);
				n /= 10;
			}
			System.out.println("�Դϴ�.");
			do{
				System.out.print("�ٽ��ѹ�?<Yes...1/No...0>: "); a = sc.nextInt();
				
			}while (a != 0&& a!=1);
		}while (a == 1);
		System.out.println();
		
		//7-10
		System.out.println("7-10");
		System.out.println("�ϻ� �Ʒ�!!");
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
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}
		
		}while(confine());
		System.out.println();
		
		//7-15
		System.out.println("7-15");
		System.out.print("��� �� : "); int e = sc.nextInt();
		int[] f = new int[e];
		
		for(int i = 0; i<e;i++) {
			System.out.print("x["+i+"] : ");
			f[i] = sc.nextInt();
		}
		System.out.println("��� ����� ���� "+ sumOf(f) + "�Դϴ�.");
		System.out.println();
		
		//7-16
		System.out.println("7-16");
		System.out.print("��� ���� : ");
		int g = sc.nextInt();
		
		int [] height = new int[g];
		int [] weight = new int[g];
		
		System.out.println(g + "���� ����� ü���� �Է�����.");
		
		for(int i = 0;i<g;i++) {
			System.out.print((i+1) + " ���� ���� : ");
			height[i] = sc.nextInt();
			System.out.print((i+1) + " ���� ü�� : ");
			weight[i] = sc.nextInt();
		}
		System.out.println("���� Ű�� ���� ����� ���� : " + minOf(height) + "cm");
		System.out.println("���� ���� ����� ü�� : " + minOf(weight) + "kg");
		System.out.println();
		
		//7-17
		System.out.println("7-17");
		System.out.print("��� �� : ");
		int h = sc.nextInt();
		int []z = new int[h];
		for(int i = 0; i<h;i++) {
			System.out.print("x["+i+"] : ");
			z[i] = sc.nextInt();
		}
		System.out.print("ã�� �� : ");
		int ky = sc.nextInt();
		
		int idxTop = linearSearch(z,ky);
		int idxBtm = linearSearchR(z,ky);
		if(idxTop == -1)
			System.out.println("�ش簪�� �������� �ʽ��ϴ�.");
		else if(idxTop == idxBtm)
			System.out.println("�ش簪�� x[" + idxTop + "]�� �����մϴ�.");
		else {
			System.out.println("�ش簪�� ��Ұ� ������ �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ���� x[" + idxTop + "]�� �ֽ��ϴ�.");
			System.out.println("���� �ڿ� ��ġ�� ���� x[" + idxBtm + "]�� �ֽ��ϴ�.");
		}
		
	}

}
