package day07;

interface Sample
{
	void method01(); //자바에서 인터페이스 내부에 만들어진 메소드는 public static으로 설정됩니다.
}

interface Sample2
{
	int method02(int x);
	//int method03(int x, int y); //람다식을 사용하는 경우 메소드는 1개만 가질 수 있습니다.
	//void method02();
}

//@FunctionalInteface는 해당 인터페이스가 함수형 인터페이스임을 프로그램에 안내해주는 어노테이션(Annotation)입니다.
//해당 어노테이션이 붙으면 인터페이스를 반드시 함수형 인터페이스로 설계해야 합니다.
//함수형 인터페이스란? 1개의 추상 메소드를 가지는 인터페이스
@FunctionalInterface
interface Sample3
{
	void method();
	//void method02(); //추상 메소드를 2개이상 만들면 어노테이션에 의해 바로 오류임을 체크해줍니다.
}

interface Upgrade
{
	int result(int x);
}

public class Example05 {

	//람다식을 통해 Upgrade가 가진 result를 읽어내 오류 없이 코드를 편하게 작성하는 것이 가능합니다.
	//람다식 기반으로 원하는 메소드를 만들 수 있습니다.
	//함수형 인터페이스에서 리턴값 == 함수
	public static Upgrade Success()
	{
		System.out.println("업그레이드 성공!");
		return (x) -> x+1;
	}
	public static Upgrade Fail()
	{	
		System.out.println("업그레이드 실패!");
		//x가 0보다 작은 값이면 그냥 0 그게 아니면 x-1
		return  (x) -> x <= 0 ? 0 : x-1;
	}
	
	
	public static void main(String[] args) {
		//인터페이스도 익명 함수로 구현이 가능합니다.
		Sample s = new Sample()
				{
					//오버라이드도 대표적인 어노테이션입니다.
					//해당 어노테이션은 오버라이드에 대한 체크를 진행합니다.
					//반드시 존재하는 메소드에 대해서 작업합니다.
					@Override
					public void method01() {
						System.out.println("인터페이스도 익명 함수 기반으로 구현이 가능합니다.");
						System.out.println("인터페이스를 자식클래스로 따로 구현하지 않고 바로 기능을 만들어서 사용할 수 있어 편리합니다.");
					}
				};
				
				s.method01();		
		//람다 표현식(lamda expression)
		//자바의 메소드를 간결한 함수식으로 표현하는 방식
		//클래스/인터페이스명 변수명 = (매개변수) -> 구현할 내용; (람다식 1줄 구현법)
				
		//단점 1 : 코드 자체가 가독성이 매우 떨어지게 설계될 가능성이 큽니다.
		//  이유 : 비슷하게 생긴 함수를 중복적으로 설계하는 상황이 계속 이어지기 때문
		//      : 람다식의 로직이 2~3줄만 넘어가도 실행부의 코드가 읽기가 매우 불편함.
		
		//단점 2 : stream 기반의 람다를 사용하는 경우 for문보다 성능이 떨어집니다.(12/22일 수업 확인)
		
		//단점 3 : 람다는 내부에서 수행하는 작업이 더 많아서 디버깅(오류 확인)과정의 콜백(실행된 위치 추적)
		//		  이 더 복잡하며 이는 성능 저하로 이어질 수 있습니다.
				
		//단점 4 : 코드 자체로 동작이 명확하게 설명되지 않게 짤 경우 람다는 이름이 없기 때문에
		//		  클래스처럼 문서화할수 없어서 불편합니다.
				
		//특징 : 람다식 기반으로 재귀함수를 구축할 경우 컴파일 에러가 발생합니다.
			
		//그럼에도 사용하는 이유??
		//간결하게 하나의 로직을 표현하기가 너무 좋기 때문
			
		//람다식을 알아야하는 이유?
		//설계자가 람다로 짯을 경우 이해해야 하기 때문
				
		s = () -> System.out.println("한 줄로 간단히 표현");
		s.method01();	
	
		Sample2 s1 = (x) ->  x * 3;  //공식만 작성하는 것이 가능합니다.
		System.out.println(s1.method02(5));
		s1 = (x) -> 
		{
			for(int i = 0 ; i < 5; i++)
			{
				++x;
			}
			return x;
		}; //{return 값;};의 형태로 작성하는 것도 가능합니다. (람다식 여러 줄 구현 방법)
		System.out.println(s1.method02(0));
		
		Success();
		Fail();
		
		
	}

}