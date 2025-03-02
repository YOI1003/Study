package day04;

public class Example02 {

	public static void main(String[] args) {
		// 디자인 패턴(싱글톤 패턴)
		// 객체 지향 프로그래밍에서 특정 클래스가 단 하나만의 인스턴스를 생성하여
		// 사용하기 위한 패턴입니다.
		
		// 생성자를 여러번 호출하더라도 인스턴스가 하나만 존재하도록 보장합니다.
		// 이는 애플리케이션 등에서 동일한 객체 인스턴스에 접근할 수 있게 해주는 효과적인 방법 중
		// 하나입니다.
		
		// 사용 목적
		// 인스턴스를 여러개 만들었을 때 불필요한 자원을 사용하게 되는 경우가 존재합니다.
		// ex) 디바이스를 설정하는 객체, 풀, 게임의 옵션 기능
		// 프로그램에서 구조상 단 하나만 존재해야 하고 하나로 둘러쓰는 설계가 필요할 때 사용합니다.
		//Singleton singleton = new Singleton(); //직접적인 생성 방지
		Singleton singleton = Singleton.getInstance(); //getInstance 메소드를 통해 생성
		singleton.check();
		singleton.countUp();
		singleton.check();
		Singleton singleton2 = Singleton.getInstance();
		
		singleton2.check();
		
	}

}
