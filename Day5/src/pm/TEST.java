package pm;
import java.util.Random;
import java.util.Scanner;

class TEST {
  public static void main(String[] args){
    //2-11
	 Scanner sc = new Scanner(System.in);
	 Random rd = new Random();
//
//    int m = (int)(Math.random() *9) + 1;
//    System.out.println(m);
//    //2-14
//    System.out.print("�� : "); String k = sc.next();
//    System.out.print("�̸� : "); String �� = sc.next();
//    System.out.println("�ȳ��ϼ���."+k+��+" ��");
    //3-3
//    System.out.println("���� A : ");int t = sc.nextInt();
//    System.out.println("���� B : ");int w = sc.nextInt();
//    if (t%w ==0) {
//    	System.out.println("B�� A�� ����Դϴ�.");
//    }
//    else {
//    		System.out.println("B�� A�� ����� �ƴմϴ�.");
//    	}
    //3-5
    System.out.println("������ : ");int y = sc.nextInt();
    if(y < 0)
    	System.out.println("���� �����Դϴ�.");
    else if (y == 0)
    	System.out.println("���� 0�Դϴ�.");
    else
    	System.out.println("���� ����Դϴ�.");
    System.out.println("���� a : ");int a = sc.nextInt();
    System.out.println("���� b : ");int b = sc.nextInt();
    if (a>b)
    	System.out.println("a�� ũ��.");
    else if (b>a)
    	System.out.println("b�� ũ��.");
    else if(a==b)
    	System.out.println("a�� b�� ����.");
    
    
  }
  
}