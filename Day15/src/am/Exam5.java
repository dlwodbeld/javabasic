package am;



public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generic ���׸�
		 * 
		 * �ڹٿ����� �پ��� ���� Ŭ������ �������̽��� �����Ѵ�. �̷� Ŭ������ �������̽��� ���� �ɹ����� Ȱ���ϴ�
		 * Ŭ������ �ۼ��ҋ��� �����Ǵ� Ŭ������ �������̽��� �پ缺��ŭ ���� �������� Ŭ������ �����ؾ� �Ѵ�.
		 * ���� ������ �̸��� �ż��尡 �پ��� Ÿ���� �Ű������� ������ �ֵ��� �Ϸ��� ����ϴ�
		 * �Է� �Ű����� Ÿ���� ����ŭ �����ε��� �����ؾ� �Ѵ�. �׷��� �̷��� ��ȿ������ �ѹ��� �ذ��ϴµ� �ʿ���
		 * ���� ��Ұ� �ٷ� ���׸��̴�.
		 * 
		 * 1 . ���ʸ��� ��������ʰ� ���� ��ü�� �����ϴ� Ŭ������ �ۼ�
		 * 
		 class Apple{}
		  
		 class Goods1{
		 private Apple apple = new Apple();
		 public Apple get(){
		 return apple;
		 }
		 }
		 public void set(Apple apple){
		 this.apple = apple;
		 }
		 
		  
		 class Pencil{}
		  
		 private Pencil pencil = new Pencil();
		 public Pencil get(){
		 return pencil;
		 }
		 public void set(Pencil pencil){
		 this.pencil = pencil;
		 
		 } 
		  //����� ����setter�ϰ� �������� getter
		  Goods1 goods1 = new Goods1();
		  goods1.set(new Apple());
		  Apple apple = goods1.get();
		  //������ ���� setter�ϰ� �������� getter
		  Goods2 goods2 = new Goods2();
		  goods.set(new Pencil());
		  Pencil pencil = goods.get();
		  
		  ���� Ŭ����(Goods1dms AppleŸ���� �ʵ�, �� �ʵ� ���� ���� �ִ� getter�޼���� setter�ż��带 �����ֵ�.
		  ���� �� Ŭ������ ��ü�� ���������� ����� ����setter ����� ����� �������� get����� �����Ҽ��ִ�.
		  
		  Ŭ���� Goods2�� ������ �����ϰ� �����Ҽ��ִ� Ŭ������ �ʵ尡 pencil Ÿ���̶�� �͸� �����ϸ�
		 Ŭ���� Goods1�� �����ϴ�.
		 
		 �׷��ٸ� ���ο� ��ǰ�� �߰��ɋ����� ���ο� Ŭ������ �����ؾ� �Ѵ�.
		 1���� ��ǰ ũ������ ��� Ÿ���� ��ǰ�� �����ϰ� �����Ҽ� ������...
		 
		 ������ �ذ�å�� ��� �ڹ��� �ֻ��� Ŭ������ Object 
		 �� ����� ������ �����ϰ� �����ϱ� ���� ������ ����� �����ϴ� Ŭ������ 2�� ������ �ߴ� ���̴�.
		 
		  
		 */
		 //����� ����setter�ϰ� �������� getter
	
		 

	}

}
