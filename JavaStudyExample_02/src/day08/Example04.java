package day08;

class ConnectionFailedException extends Exception
{
	public ConnectionFailedException (String message)
	{
		super(message);
	}
}


public class Example04 {

	public static void main(String[] args) throws Exception{
		// 다음은 메이플스토리 월드 플랫폼의 한 인증 실패 출력 결과입니다.
		// 예외 클래스를 만들어서 출력 결과와 같은 처리를 구현하세요.
		
		//화면 출력 결과
		
		//====== 인증 실패 =======
		//    인증에 실패했습니다.
		//   Error Code : 3001
		
		try
		{
			throw new ConnectionFailedException("인증에 실패했습니다.");
		}
		catch(ConnectionFailedException e)
		{
			System.out.println("====== 인증 실패 =======");
			System.out.println("    " + e.getMessage());
			System.out.println("   Error Code : 3001");
		}
		
		
		
		
		
	}

}
