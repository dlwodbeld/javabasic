package pm;

public class Exam5 {

	public static void main(String[] args) {
		// ��ü�� Ÿ�� ��ȯ
		/*
		 * �⺻ �ڷ������� �õ��� �ڹٴ� '='�� ����Ͽ� ���ʰ� �������� �ڷ����� ��ġ�ؾ��Ѵ�.
		 * ���� �ڷ����� �ٸ��� �ڹٰ� �ڵ����� Ÿ���� ��ȯ���ְų�
		 * �����ڰ� ���������� Ÿ���� ��ȯ�ؾ��Ѵ�. ��ü�� ���������� Ÿ�Ժ�ȯ�� �Ͼ��.
		 * 
		 * ��ü������ �ڽ� Ŭ�������� �θ� Ŭ���������� ��ȯ�Ǵ� ���� ��ĳ����
		 * �� �ݴ�� �ٿ� ĳ�����̴�.
		 * ��ü�� �׻� ��ĳ������ �׻� �Ҽ������Ƿ� ���������� �������� �ʾƵ� �ڹٰ� ������ش�.
		 * ������ ��ü ���������� ����ֵ� �ٿ�ĳ���� ��ü�� �ȵɶ����ִ�.
		 * �߸��� �ٿ�ĳ������ �����ϸ� ClassCastException �� �߻��ϰ� ���α׷��� ����ȴ�.
		 * 
		 * ���	�л��� ����̴�.	(������ OK)		���ɽ���
		 * �л� 	����� �л��̴�.	(�������� �ƴϴ�)		�ٿ��ɽ���
		 * 
		 * ��� human1 = new ���();	�л��� �л��� �ƴ� ��� ��� ���ԵǴ� �����ü
		 * ��� human2 = new �л�();	�л��� ��� ��ü
		 * 
		 * ���() �����ڸ� �̿��� ��ü�� �����ϰ� ��� �ڷ����� �����ߴ�.
		 * �л�() �����ڸ� �̿��Ͽ� ��ü�������ϰ� ���� ��� �ڷ����� �����ߴ�.
		 * �Ѵ� ��� Ÿ���� �ڷ����̴�. ������ ���� �ٸ���.
		 * 
		 * ù��° human1��ü�� ��� Ŭ������ ������� ������ ���⿡�� ����� ����� �Ӽ��� ��ɵ鸸 ���ԵǾ��ִ�. �׷��⋚���� �л������� �ٿ�ĳ������ �Ұ����ϴ�.
		 * �ݸ鿡 human2�� ���� �л�() �����ڷ� ��ü�� ���������Ƿ� ��ü ���ο��� ����� ����� Ư�� �Ӹ� �ƴ϶� �л����� �Ӽ��� ��ɵ��� ���ԵǾ��ִ�.
		 * Ư�� ���� �ƴ϶� �л����� �Ӽ��� ��ɵ��� ���ԵǾ��ִ�. ���� human2�� ��� �ڷ������� ����Ǿ������� �л����� �ٿ�ĳ������ �����ϴ�.
		 * 
		 * class A{}	//�Ҿƹ���
		 * class B extends A{}		//�ƹ���
		 * class C extends B{}		//����
		 * 
		 *��ĳ���� - �л��� ������ ����� �� �� �ִ�.
		 * B b1 = new B();
		 * A a1 = (A) b1;		A a1 = b1; ok
		 * 
		 * C c2 = new c();
		 * B B2 = (B) c2;		B b2 = c2; ok
		 * A a2 = (A) c2;		A a2 = c2; ok
		 * 
		 * �ٿ�ĳ����
		 * A a1 = new A();
		 * B b1 = (B) a1;//�ַ��߻�
		 * 
		 * A a2 = new B();
		 * B b2 = (B) a2; //���� , �ٿ�ĳ������ ��쿡 ���� �ɼ����ִ�.
		 * C c2 = (C) a2; //����
		 * 
		 * ���� Ÿ������ ������ִ����� �߿������ʰ� � �����ڷ� �����Ǵ����� �߿��ϴ�.
		 * B()�����ڷ� ��������� A�� ĳ�����Ҽ��ְ� C()�� ������ٸ� A�� B�� ĳ�����Ҽ��ִ�.
		 * 
		 * 
		 */

	}

}