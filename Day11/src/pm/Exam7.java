package pm;

public class Exam7 {
	
	
	public void sayNick(String nick) {
		try {
		if("fool".equals(nick)) {
			throw new FoolException();
			}
	System.out.println("당신의 별명은 " + nick + "입니다.");
	}catch(FoolException e) {
		System.out.println("FiikException이 발생했습니다.");
	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam7 sample = new Exam7();
		sample.sayNick("fool");	//예외 발생
		sample.sayNick("genious");// 실행조차 되지 않는다.

	}
}
