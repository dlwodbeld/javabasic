package pm;
class FoolException extends RuntimeException{
	//비워두면 자동으로 디폴트 생성자를 만들어준다.
	//상속을 받고 있으므로 자동우로 부모의 생성자를 호출한다. super();
	
}

public class Exam6_1 {
	
	
	
	
	public void sayNick(String nick) {
		if("fool".equals(nick)) {
			throw new FoolException();
			}
	System.out.println("당신의 별명은 " + nick + "입니다.");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam6_1 sample = new Exam6_1();
		sample.sayNick("fool");	//예외 발생
		sample.sayNick("genious");// 실행조차 되지 않는다.

	}

}
