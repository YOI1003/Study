package day03;

public class Example03 {
	
	//찾기를 진행할 텍스트를 전달받고, 찾을 패턴을 전달받습니다.
	//ex) Welchs Grape -> elch를 찾아라
	//e  01234567891011
	//   Welchs Grape
	//0 -> W 일치하지 않습니다.
	//1 -> e 일치합니다.
	//2 -> l 일치하지 않습니다.
	//l W, e, l
	
	public static int bruteForce(String text, String pattern)
	{
		//전체 텍스트의 찾을 텍스트의 길이를 뺀 만큼 반복을 진행합니다.
		for(int i = 0; i <= text.length() - pattern.length(); i++)
		{
			int j; //j를 for문에 안만든 이유는 반복 후에 j의 값을 통해 패턴이 발견됬을 경우 return하기 위해서
			for(j = 0; j < pattern.length(); j++)
			{
				//찾는 패턴이 다를 경우 break
				if(text.charAt(i+j) != pattern.charAt(j))
				{
					break;
				}
			}
			//j의 길이가 패턴의 길이와 일치하다면
			if(j == pattern.length())
			{
				return i; //그 패턴이 발견된 위치를 return합니다.
			}
		}
		
		return -1; //-1이 뜨는 경우 패턴이 발견되지 않았음을 의미합니다.
	}
	
	public static void main(String[] args) {
		// 브루트 포스(Brute Force)
		// 모든 경우의 수를 탐색해서 요구 조건에 충족하는 결과만 가져오는 방법
		
		int result = bruteForce("Welchs Grape", "elch");
		
		if(result != -1)
			System.out.println("패턴이 발견된 위치: " + result);
		else
			System.out.println("패턴이 발견되지 않았습니다.");
		
	}

}
