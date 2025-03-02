package day04;

public class Singleton 
{
	private static Singleton instance;
	//정적(static) 참조(reference type) 변수(variable)
	//외부에서 접근 불가
	
	public int count = 0;
	
	public void check()
	{
		System.out.println("현재의 count : " + count);
	}
	
	public void countUp()
	{
		count++;
	}
	
	//private 생성자
	//외부에서 생성 불가
	private Singleton()
	{
		
	}
	
	//싱글톤 생성을 위한 메소드(정적 참조 변수)
	//외부에서 해당 메소드를 통해 인스턴스 생성을 진행합니다.
	public static Singleton getInstance()
	{
		//현재 생성된 값이 없다면(null 상태)
		if(instance == null)
		{
			//인스턴스 생성
			instance = new Singleton();
		}
		//일반적인 경우라면 현재 참조 변수를 return합니다.
		return instance;
	}
	
	
}
