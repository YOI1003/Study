package day08;

//사용자 예외 클래스 만들기
//Exception 클래스를 extends로 상속해 만들면 가능합니다.
//만드는 이유: 직관적으로 예외를 볼 수 있음.

class NotEnoughMineralException extends Exception
{
	public NotEnoughMineralException(String message)
	{
		super(message); //super()는 부모의 형태
	}
}
//class ConnectionFailedException extends Exception
//{
//	public ConnectionFailedException (String message)
//	{
//		super(message);
//	}
//}

public class Example03 {
	
	
	//메소드 내부에서 처리를 요구하는 경우
	public static void throwExample(int a, int b)
	{
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("함수에서 예외 상황을 잡아내겠습니다.");
		}
	}
	
	//호출한 쪽에서 처리를 요구하는 경우
	public static void throwExample2(int[] array,int index) throws ArrayIndexOutOfBoundsException
	{
		System.out.println(array[index]);
	}
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		try
		{
			//예외가 발생하게 되면 catch 코드로 이동되게 때문에 그 다음 코드는 진행되지 않습니다.
			//System.out.println(array[1] / array[0]); //Arithmetic
			//System.out.println(array[3]); //Index
			//throwExample(0,0);
			//throwExample2(array,4);
			throw new NotEnoughMineralException("자원이 부족합니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) //인덱스 범위가 문제가 있을경우 캐치
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) //수학적 오류 발생 시 캐치
		{
			System.out.println(e.getMessage());
		}
		catch(NotEnoughMineralException nem)
		{
			System.out.println(nem.getMessage());
		}

	}

}
