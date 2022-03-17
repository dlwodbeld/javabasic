package pm;

class AA{
	void checkScore(int score) throws MinusException, OverException{
		if(score<0) {
			throw new MinusException("���ܹ߻� : ������ �Է�");
		}else if (score > 100) {
			throw new OverException("���� �߻� : 100�� �ʰ�");
		}else {
			System.out.println("�������� ���Դϴ�.");
		}
	}
}
class OverException extends Exception{
	public OverException(String message) {
		super(message);
	}
}
class MinusException extends Exception{
	public MinusException(String message) {
		super(message);
	}
}
public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA aa = new AA();
		try {
		aa.checkScore(85);
		aa.checkScore(110);
		
		
		}catch(MinusException | OverException e){
			System.out.println(e.getMessage());
			
		}
		
	}

}
