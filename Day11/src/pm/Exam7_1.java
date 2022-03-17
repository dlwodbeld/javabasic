package pm;


public class Exam7_1 {
	
	
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
		
		Exam7_1 sample = new Exam7_1();
		try {
		sample.sayNick("fool");	//예외 발생했지만 처리했기떄문에
		sample.sayNick("genious");// 잘 실행된다.
		}catch(FoolException e) {
			System.out.println("FoolException 이 발생했습니다.");
		}
	}
}