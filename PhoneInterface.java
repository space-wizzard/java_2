package inheritance;

interface Phone{
	final int timeout =1000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** phone **");
	}
}

interface MobliePhoneInterface extends Phone{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public void calculate(int x, int y) {
		System.out.println(x+y);
	}
}

class SmartPhone extends PDA implements MobliePhoneInterface,MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override 
	public void receiveSMS() {
		System.out.println("문자왔어요");
	}
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
class Samsungphone implements Phone {
	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

abstract class Shape{
	public Shape() {}
	public void paint() {
		draw();
	}
	abstract public void draw();
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

public class PhoneInterface{
	public static void main(String[] args) {
		Samsungphone s = new Samsungphone();
		SmartPhone phone = new SmartPhone();
		PDA da;
		SmartPhone p = new SmartPhone();
		//업캐스팅
		da = p;
		da.calculate(10, 50);
		// 추상 클래스 사용
		Line l = new Line();
		l.draw();
		// 인터페이스 사용
		phone.calculate(10, 20);
		phone.sendCall();
		phone.sendSMS();
		phone.receiveCall();
		phone.schedule();
		s.printLogo();
		s.sendCall();
		s.receiveCall();
		s.flash();
	}
}


