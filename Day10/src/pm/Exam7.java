package pm;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ���� ó�� ������ ũ�� 3���� ��ҷ� �����ȴ�.
		 try{
		 �Ϲ� ����,���� ���� �߻� ���� �ڵ�
		 }catch (���ܸ�){
		 ���ܰ� �߻����� �� ó��
		 }finally{
		 ���� �߻� ���οʹ� ������� �׻� ������ ����
		 }
		 
		 try{
		 System.out.println(3/0);
		 System.out.println("���α׷� ����");
		 } catch (ArithmeticException e){
		 System.out.println("���ڴ� 0���� ������ �����ϴ�.");
		 System.out.println("���α׷� ����");
		 }
		 
		 try{
		 System.out.println(3/0);
		 } catch (ArithmeticException e){
		 System.out.println("���ڴ� 0���� ������ �����ϴ�.");
		 }finally{
		 System.out.println("���α׷� ����");
		 }
		 
		 
		 */
		
		/*
		 * 
		 ����ó�� ����
		 
		 ���� ���������� ���ܰ� ó���Ǵ�  ������ �ڼ��� �˾ƺ���.
		 		 try{
		 System.out.println(3/0);	-------->���ܹ߻� ------> �ڹ� (���� Ŭ������ ��ü ����)
											| ArithmeticException excep = new ArithmeticException();
		 } catch (ArithmeticException e){	<--------------
		 System.out.println("���ڴ� 0���� ������ �����ϴ�.");
		 }finally{
		 System.out.println("���α׷� ����");
		 }
		 
		 
		 ���� try ������ ����Ǿ� ���� ���ܰ��߻����������� catch�� ������� �ʴ´�. �׸��� finally ��� ������ �����Ѵ�.
		 �׷��� try ������ ����Ǿ� ���� ���ܰ� �߻��ϸ� �ڹٰ� ���� �����Ͽ� ���� Ÿ���� ��ü�� �����Ͽ� catch�� �Ű������� �����Ѵ�.
		 �̰��� ��ġ �ڹٰ� catch()��� �̸��� �ż��带 ȣ���ϴ°Ͱ� ����ϴ�. ���� �ڹٰ� �����ؼ� �Ѱ��� ��üŸ���� catch����� ó���Ҽ� ������
		 �� �ش� ��ü�� ���� catch() ��� �������� ������ ����ó���� ���� �ʴ´�.
		 
		 �����Ӹ� �׷��� ���� �ż���� �ƴϴ�......������ �ż��尡 �پ��� �Է� �Ű����� Ÿ������ �����ε��� �� �ִ� ��ó��
		 catch()��ϵ� ���� Ÿ�Կ� ���� �������� ������ �� �ִ�.
		 
		 		 try{
		 �Ϲ� ����,���� ���� �߻� ���� �ڵ�
		 }catch (���ܸ�Ÿ��1){
		 ���ܰ� �߻����� �� ó��
		 }
		 }catch (���ܸ�Ÿ��2){
		 ���ܰ� �߻����� �� ó��
		 }finally{
		 ���� �߻� ���οʹ� ������� �׻� ������ ����
		 }
		 
		 //2���� try-catch ������ 1���� ���� catch ���� ��
		  * 
		 
		 //1.���� try-catch
		 	try {
			System.out.println(3/0);
		}catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ������ ����.");
		}finally {
			System.out.println("���α׷� ����");
		}
		 
		 //2. ���� try-catch
		 
		 
		 */
//		try {
//			System.out.println(3/0);
//			int num = Integer.parseInt("10A");
//		}catch(ArithmeticException e) {
//			System.out.println("���ڴ� 0���� ������ ����.");
//		}catch(NumberFormatException e) {
//			System.out.println("���ڷ� �ٲܼ� �����ϴ�.");
//		}finally {
//			System.out.println("���α׷� ����");
//		}
//		���߿���ó�� ������ �ۼ��� ������ ������ try() �������� ���ܰ� �߻��ϰ�
//		�������� catch()������ �־ ����Ǵ� catch()������ �׻� ���������� Ȯ���Ѵٴ°��̴�.
//		�̰��� �� ��ġ if-else if - else �������� ���ǽ��� ���������� �˻��ϴ� �Ͱ� ����.
		
		
//		1���� catch() ������� 2���� ���ܸ� ���ÿ� ó���ϵ��� �����غ���. ���� ����ܰ� �߻��ص� ���
//		�ϳ��� ����ó���� �ذ��� �� �ִ�.
		
		try {
		System.out.println(3/1);
		int num = Integer.parseInt("10A");
	}catch(ArithmeticException | NumberFormatException e) {
		System.out.println("���ܰ� �߻��߽��ϴ�.");
	}finally {
		System.out.println("���α׷� ����");
	}
		//finally�� �׻� ����Ǵ� ����̴�. �׷��� �� �ٸ� ����� ���ҽ��� �����ϴ� ���̴�.
		//���ҽ� ������ ���̻� ������� �ʴ� �ڿ��� �ݳ��ϴ� ���� �ǹ��Ѵ�.
		//������� ������ ��� ����� �� �ڿ� �ݾƾ� �ٸ� ���α׷��� �� ������ ����Ҽ� �ִ�.
		//finally{}��Ͽ��� ���ҽ��� �����ϴ� ���ҷε� ����� �ȴ�.
		
		
		
		
		
		
		
		
	}

}
