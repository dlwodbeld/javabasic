
import java.util.Random;
import java.util.Scanner;

public class TEST {
	//7-18
	static void aryRmv(int[] a,int idx) {
		if(idx >= 0&& idx<a.length) {
			for(int i = idx;i<a.length;i++) {
				a[i] = a[i+1];
			}
		}
	}
//	
//	//7-19
//	static void aryRmv(int[] a,int idx,int n) {
//		if(n>0&&idx >= 0&&idx + n<a.length) {
//			int idx2 = idx + n - 1;
//			if(idx2 > a.length - n - 1)
//				idx2 = a.length - n - 1;
//			for(int i = idx; i<=idx2; i++) {
//				a[i] = a[i+n];
//			}
//		}
//	}
//	
//	//7-20
//	static void aryIns(int[] a, int idx, int x) {
//		if(idx >= 0 && idx < a.length) {
//			for(int i = a.length-1;i>idx;i++)
//				a[i] = a[i-1];
//			a[idx] = x;
//		}
//	}
//	
//	//7-21
//	static void aryExchng(int[]a,int[] b) {
//		int n = a.length<b.length ? a.length : b.length;
//		for (int i = 0; i<n;i++) {
//			int t = a[i]; a[i] = b[i]; b[i] = t;
//			
//		}
//	}
//	
//	//7-22
//	
	
	
	
	
	
	public static void main(String[] args, int n) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//7-18
		System.out.println("7-18");
		System.out.print("요소 수: "); int b = sc.nextInt();
		int [] a = new int[b];
		
		for(int i = 0;i<b;i++) {
			System.out.print("a["+ i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : "); int idx = sc.nextInt();
		aryRmv(a,idx);
		for(int i = 0; i< b;i++)
			System.out.println("a["+ i + "] = " + a[i]);
		System.out.println();
		
//		//7-19
//		System.out.println("7-19");
//		System.out.print("요소 수 : "); int c = sc.nextInt();
//		int [] d = new int[c];
//		for(int i = 0; i<c;i++) {
//			System.out.print("a["+ i + "] : ");
//			d[i] = sc.nextInt();
//		}
//		System.out.print("삭제를 시작할 인덱스 : ");
//		int idx1 = sc.nextInt();
//		
//		System.out.print("삭제할 요소의 수 : "); int e = sc.nextInt();
//		
//		aryRmv(a,idx,n );
//		for(int i = 0;i<c;i++)
//			System.out.println("a["+ i + "] = " + d[i]);
//		
//		System.out.println();
//		
//		//7-20
//		System.out.println("7-20");
//		int f = sc.nextInt();
//		int [] g = new int[f];
//		
//		for(int i = 0;i<f;i++) {
//			System.out.print("a["+ i + "] : ");
//			g[i] = sc.nextInt();
//		}
//		System.out.print("삽입할 요소의 인덱스 : "); int h = sc.nextInt();
//		
//		aryIns(a,idx,n);
//		for(int i = 0;i<f;i++) {
//			System.out.println("a["+ i + "] = " + g[i]);
//		}
//		System.out.println();
//		//7-21
//		System.out.println("7-21");
//		System.out.print("배열 a의 요소 수 : "); int l = sc.nextInt();
//		int [] j = new int[l];
//		for(int i = 0;i<l;i++) {
//			System.out.print("a["+ i + "] : ");
//			j[i] = sc.nextInt();
//		}
//		
//		System.out.print("배열 b의 요소 수 : ");
//		int m = sc.nextInt();
//		int [] o = new int[m];
//		for(int i = 0; i < m;i++) {
//			System.out.print("b["+ i + "] : ");
//			o[m] = sc.nextInt();
//		}
//		
//		aryExchng(j,o);
//		System.out.println("배열a와 배열 b의 전체 요소를 교환했습니다.");
//		for(int i = 0;i<l;i++)
//			System.out.println("a["+ i + "] = " + j[i]);
//		for(int i = 0; i<m;i++)
//			System.out.println("b["+ i + "] = " + o[i]);
//		
//		
//		
//		
	}

}
