package day08;
//예외 처리2: 사용자가 직접 예외 클래스를 만들어 사용합니다.

//1. 예외의 구조

//1) Throwable(예외 계층 구조의 최상위 클래스)

//1-1) Exception(Extends Throwable) : 프로그램에서 발생할 수 있는 예외

//== Unchecked Exception ==
//런타임에 발생하는 예외로 예외 처리를 강제하지 않습니다. 따라서 사용자는 해당 예외상황이 나오지 않도록 잘 설계해주셔야 합니다.
//상황에 맞게 try-catch문을 사용합니다.
//1-1-1) Runtime Exception(Extends Exeption) ***
//1-1-1-1) ArthmeticException(Extends RuntimeException) : 수학적 예외 상황(0으로 나누는 경우)
//1-1-1-2) ClassCastExeption : 클래스에 대한 캐스팅 에러
//1-1-1-3) IllegalArgumentExeption : 인자 값 오류
//1-1-1-4) IllegalStateException : 대상 객체의 상태가 호출된 메서드를 수행하기 적절하지 않을 경우 발생
//1-1-1-5) ArrayIndexOutOfBoundsException : 배열에서 index 범위를 초과했을 경우
//1-1-1-6) NoSuchElementException : 요소를 찾을 수 없는 상황
//1-1-1-7) NullPointerException : 참조 값 에러(Null 값 참조) , NPE라고 많이 표현하며 가장 많이 발생할 수 있는 예외


//== checked Exeption ==
//컴파일 타임에 체크되는 예외로 반드시 예외를 처리해야 사용할 수 있습니다.
//1-1-2) IOExeption(Extends Exception)
//1-1-2-1) EOFException(Extends IOException)
//1-1-2-2) FilleNotFoundException 
//1-1-2-3) MalformedURLException
//1-1-2-4) UnknownHostException

//1-1-3) SQEXception(Extends Exception)


//1-2) Error(Extends Throwable): 시스템 레벨에서 발생하는 심각한 오류
//ex) OutOfMemoryError, StackOverflowError....



public class Example02 {
	
	public int age;
	
	public void setAge(int age)
	{
		if(age < 0)
			throw new IllegalArgumentException("나이는 음수가 될 수 없습니다");
		//throw new 예외(메세지);
		//throw는 오류를 발생시키는 키워드입니다.
		//특정 상황이 생겼을 때 오류임을 알리고, 다음 작업으로 넘어가게 설계할 수 있어 편하게 코드를 짤 수 있습니다.
		
		this.age = age;
		System.out.println("변경된 나이: " + age);
	}
	
	//자바의 예외 처리 방법
	//1. try - catch: 다른 작업으로 흐름을 유도합니다.(Checked Exception) - catch 부분에 예외를 적어서 잡아내는 것
	
	//2. throws: 호출을 진행할 쪽(부모)이 예외 처리를 진행하도록 설정합니다.
	
	//3. throw: 예외를 발생시킵니다. 바로 처리하세요 라는 뜻으로 주로 개발자들이 비즈니스 로직에서 처리하는 방식(UncheckedException)
	
	public static void main(String[] args) {
		
		try
		{
		Example02 example = new Example02();
		example.setAge(12);
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println(iae.getMessage());
		}
	}

}
