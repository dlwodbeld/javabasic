package pm;

class AA{
	void checkScore(int score) throws MinusException, OverException{
		if(score<0) {
			throw new MinusException("예외발생 : 음수값 입력");
		}else if (score > 100) {
			throw new OverException("예외 발생 : 100점 초과");
		}else {
			System.out.println("정상적인 값입니다.");
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
