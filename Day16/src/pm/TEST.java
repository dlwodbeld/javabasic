package pm;

import java.util.Random;
import java.util.Scanner;

public class TEST {
	
	//7-23
	static int[] arraySrchIdx(int[] a,int x) {
		int count = 0;
		for(int i = 0;i<a.length;i++)
			if(a[i] == x)
				count++;
		int[] c = new int[count--];
		for(int i = a.length-1;count >=0;i++){
			if(a[i] == x)
				c[count--] = i;
		}
		return c;
	}
	
	//7-24
	static int[] arrayRmvOf(int[] a,int idx) {
		if(idx<0&&idx<a.length-1)
			return a.clone();
		else {
			int[] c = new int[a.length-1];
			int i = 0;
			for(;i<idx;i++)
				c[i] = a[i];
			for(;i<a.length-1;i++)
				c[i] = a[i+1];
			return c;
		}
	}
	
	
	//7-25
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		if(n<0||idx<0||idx > a.length)
			return a.clone();
		else {
			if(idx + n > a.length)
				n = a.length - idx;
			int[] c = new int[a.length-n];
			int i = 0;
			for(; i<idx;i++)
				c[i] = a[i];
			for(;i<a.length-n;i++)
				c[i] = a[i+n];
			return c;
		}
	}
	
	
	//7-26
	static int[] arrayInsOf(int[]a , int idx, int x) {
		if(idx < 0||idx>a.length)
			return a.clone();
		else {
			int[] c = new int[a.length+1];
			int i = 0;
			for(;i<idx;i++)
				c[i] = a[i];
			for(;i<a.length;i++)
				c[i+1] = a[i];
			c[idx] = x;
			return c;
		}
	}
	
	
	
	//7-27
	static boolean addMatrix(int[][] x,int[][] y,int[][] z) {
		if(x.length != y.length || y.length != z.length)
			return false;
		for(int i = 0;i<x.length;i++)
			if(x[i].length !=y[i].length || y[i].length != z[i].length)
				return false;
		for(int i = 0; i<x.length;i++)
			for(int j = 0; j<x.length; j++)
				z[i][j] = x[i][j] + y[i][j];
		return true;
	}
	static void printMatrix(int[][]m) {
		for(int i = 0; i<m.length;i++) {
			for(int j = 0; j<m[i].length;j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//7-23
		System.out.println("7-23");
		System.out.print("요소수 : ");	int a = sc.nextInt();
		int[] b = new int[a];
		
		for(int i = 0;i<a;i++) {
			System.out.print("x[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		System.out.print("탐색할 값 : ");
		int c =sc.nextInt();
		int[] d = arraySrchIdx(b,c);
		
		if(b.length==0)
			System.out.println("일치하는 요소가 없습니다.");
		else {
			System.out.println("일치하는 요소의 인덱스");
			for(int i = 0;i<d.length;i++)
				System.out.println(d[i]);
		}
		System.out.println();
		
		//7-24
		System.out.println("7-24");
		int e = sc.nextInt();
		int[] f = new int[e];
		
		for(int i = 0; i< e;i++) {
			System.out.print("x[" + i + "] : ");
			f[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		int g = sc.nextInt();
		
		int[] h = arrayRmvOf(f,g);
		for(int i = 0;i<h.length;i++)
			System.out.println("y[" + i + "] = " + h[i]);
		
		System.out.println();
		
		//7-25
		System.out.println("7-25");
		
		System.out.print("요소 수 : "); int l = sc.nextInt();
		int[] m = new int[l];
		
		for(int i = 0;i<l;i++) {
			System.out.print("x[" + i + "] : "); m[i] = sc.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스 : "); int n = sc.nextInt();
		System.out.print("삭제할 요소의 개수 : "); int o = sc.nextInt();
		
		int[] p = arrayRmvOfN(m,n,o);
		
		for(int i  = 0;i<p.length;i++)
			System.out.println("y[" + i + "] = " + p[i]);
		
		System.out.println();
		
		//7-26
		System.out.println("7-26");
		
		System.out.print("요소 수 : "); int q = sc.nextInt();
		int[] r = new int[q];
		
		for(int i =0;i<q;i++) {
			System.out.print("x[" + i + "] : ");
			r[i] = sc.nextInt();
		}
		System.out.print("삽입할 인덱스 : "); int s = sc.nextInt();
		System.out.print("삽입할 값 : "); int t = sc.nextInt();
		
		int[] u = arrayInsOf(r,s,t);
		
		for(int i = 0;i<u.length;i++)
			System.out.println("y[" + i + "] = " + u[i]);
		
		System.out.println();
		
		//7-27
		System.out.println("7-27");
		
		int [][] v = {{1,2,3},{4,5,6}};
		int [][] w = {{6,3,4},{5,1,2}};
		int [][] x = new int[2][3];
		
		if (addMatrix(v,w,x)) {
			System.out.println("행렬a");	printMatrix(v);
			System.out.println("\n행렬b");	printMatrix(w);
			System.out.println("\n행렬c");	printMatrix(x);
			
		}
		
		
		
		
	
		
		
		

	}

}
