package day06;
//함수(Function)
//자바에서는 클래스 내부에서 설계되어 메소드(method)라고 부릅니다.
//특정 기능에 대한 묶음(명령 집합체)

public class Sample03 {
	
	public static void Welcome()
	{
		System.out.println("Welcome to SBS Academy Bupyeong JAVA Class!");
		System.out.println("Java is a high level language!");
		System.out.println("Java is so long...");
	}
	public void NicetoMeetYou(int count) //count를 넣으면 count 횟수만큼 NicetoMeetYou를 호출할 것이다.
	{
		for(int i = 1; i <= count; i++)
		{
			System.out.println("Nice to meet you!");
		}
	}
	
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++)
		{
			Welcome();
		}
		//NicetoMeetYou함수는 인스턴스 함수이고 현재 Sample03의 클래스 안의 함수이기 때문에 Sample03클래스를 통해 호출을 해야한다.
		Sample03 sample = new Sample03();
		sample.NicetoMeetYou(5);
		
		
	}

}
