package pm;

public class LedTV implements TV {
	@Override
	public void turnOn() {
		System.out.println("키다");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		System.out.println("끄다");
		// TODO Auto-generated method stub

	}

	@Override
	public void changeVolumn(int volume) {
		System.out.println("볼륨을 조절하다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("채널을 변경하다.");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
