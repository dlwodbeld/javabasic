package am;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��� -�ݺ��� - while
		 * 
		 * �߰�ȣ ���� ���� ������ �ݺ������� �����ϴ� �ݺ� ������� ������ �����ϴµ���
		 * �ݺ��� ���ӵȴ�.
		 * 
		 * while(����) {
		 * ���౸��;
		 * }
		 */
//		int sum = 0,num = 0;
//		while(sum < 100) {
//			sum += num;
//			num++;
//		}
//		System.out.println((num-1)+"������ �� = " + sum);
		
//		int a = 0;
//		while(a<10) {
//			System.out.println(a + " ");
//			a++;
//		}
//		System.out.println();
		
//		for(int i = 0; i<10;i++) {
//			System.out.println(i);
//		}
		
//		int c = 0;
//		while(true) {
//			if(c> 10) {
//				break;
//			}
//			System.out.println(c);
//			c++;
//		}
		
		/*
		 * do while
		 * while���� �ſ� ����� �ݺ� ���,
		 * �������� ���ǽ��� �˻�� �ݺ� ������ �������� ���̰�����.
		 * while�� do~while�� ���� ū ��������
		 * while ���౸���� �� �ѹ��� ������ ���� ���������ִٴ� ��������
		 * do~while�� ���౸���� �ݵ�� �ѹ��� ������ �Ǿ�߸� �Ѵٴ� ���̴�.
		 * 
		 * 
		 * do{
		 * ���౸��
		 * ������
		 * }while(���ǽ�);//���ǽ��� �Ʒ��� ��ġ�ϱ⋚���� �ּ�1ȸ�� ������ ����
		 */
//		int a;
//		//while
//		a = 0;
//		while(a<0) {
//			System.out.println(a);//0������
//		}
//		
//		//do~while
//		a = 0;
//		do {
//			System.out.println(a);
//			a++;
//		}while(a<0);		//1���� ������ ����
//		
		//�ʱⰪ�� a = 0�̹Ƿ� ó������ ���ǽ� a<0�� false�̴�.
		//���� while������ �����Ҽ������Ƿ� �� �ѹ��� ��������ʴ´�.
		//�ݸ� do~while���϶��� ������ �Ŀ� ���ǽ��� �˻��ϱ⶧���� 1ȸ�� �ݵ�� ����ȴ�.
		//��ġ do~while���� while������ 1ȸ�� ����ȴٰ� �����Ҽ��������� �װ��� �ƴϴ�.
		
//		int a;
//		//while
//		a = 0;
//		while(a<10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		}while(a<10);
		// 1ȸ �̻� �ݺ��ɶ��� ������ ����� ��Ÿ����.
		
		//����� �ߺ�
		//����� �ٸ������ ������ �� �ִ�.
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0;j<5;j++) {
//				System.out.println(i + " " + j);
//			}
		
		int i = 0;
		while(i<3) {
			int j = 0;
			while(j<5) {
				System.out.println(i + " " + j);

				j++;
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
