package day06;
//예외 처리(Exception Handling) 1
//프로그램의 비정상적인 종료를 방지해 정상적인 실행 상태를 유지할 수 있게 해주는 기능입니다.

//처리 방식
//1. 프로그램에서 따로 정의되어있는 예외 상황에 대해 잡아내고 그에 따른 처리를 설계합니다.
//2. 사용자가 정의한 예외 상황을 특정 상황에 강제로 발생시켜 그 상황에 대해 처리를 설계합니다.

//다양하게 볼 수 있는 예외 상황
//1. 사용자가 입력을 실수한 경우(InputMismatch)
//2. 네트워크 연결의 끊김
//3. 하드웨어 자체의 문제...
//4. 개발자의 코드 실수(잘못된 접근(null 값 , 파일이 없는데 파일을 찾는 경우, 배열 등의 인덱스 범위 실수))

public class Example02 {

	public static void printString(String word)
	{
		System.out.println(word);
	}
	//출력할 문장을 다 대문자로 처리해서 출력합니다.(영단어 기준)
	public static void printStringUpper(String word)
	{
		String result = word.toUpperCase();
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
	
		try //예외 상황이 발생할 수 있는 위치에 try를 작성합니다. 예외가 발생하면 아래의 catch문을 통해 처리를 진행합니다.
		{
			printString(null);	//null에 대한 출력 가능
			printStringUpper(null);
			//null은 값이 없는 상태를 의미하는데 함수 내에서 word에 대한 toUpperCase()를 통해 문장을 대문자화를 진행해서
			//오류가 발생
		}
		catch(NullPointerException e)
		//catch는 해당 오류가 감지되었을 때, catch 내부에 설정한 코드를 실행하는 방식
		//직접적인 해결보다는 우회에 가까운 설계 방식
		{
			System.out.println("현재 전달한 값은 null 값입니다.");
		}
		finally
		{
			System.out.println("예외 처리의 결과와 상관없이 무조건 실행합니다.");
		}

	}

}
