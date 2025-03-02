package day03;
//BufferedReader를 사용하려면 다음 3개의 import가 필요합니다.
import java.io.BufferedReader; //버퍼드 리더
import java.io.IOException; //입력 예외 상황 처리
import java.io.InputStreamReader; //입력 스트림 리더

public class Example022 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 2577번 연습문제
		
		//풀이)
		//입력 도구 하나를 추가합니다.(Scanner / BufferedReader)
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//세 정수에 대한 입력을 진행합니다.
		int A = Integer.parseInt(bufferedReader.readLine());
		int B = Integer.parseInt(bufferedReader.readLine());
		int C = Integer.parseInt(bufferedReader.readLine());
		
		//계산식 A X B X C
		int result = A * B * C;
		

		String rtoS = String.valueOf(result);
		//String.valueof(값);은 int값을 문자열로 바꿔주는 문법
		
		//0부터 9까지의 숫자의 사용 횟수를 저장할 배열
		//계산식을 문자열로 변환(숫자 하나하나를 짤라서 보기 쉽기 위함) (로직 1)
		//해당 풀이는 추천
		//이유: 자바 자체에서 제공해주는 기능만으로 적용이 가능
		//아래의 로직 2번의 경우는 아스키 코드라는 개념을 따로 알고있어야하고
		//코드 넘버링도 기억하고 있어야 합니다.
		int[] count = new int[10];
//		for(int i = 0; i <rtoS.length(); i++)
//		{
//			count[Character.getNumericValue(rtoS.charAt(i))]++;
//			//Character.getNumericValue(문자) : 숫자 형태의 char형을 int 형태로 바꿔주는 문법
//			//문자열.charAt(int index)는 해당 인덱스 번호에 있는 단어(char) 하나로 변환합니다.
//			//값이 17037300라면 1,7,0,3,7,3,0,0으로 짤리게 됨.
//			//위에 코드에 의해 count[1]의 값이 1증가, count[7]의 값이 1증가, count[0]의 값이 1 증가...
//		}
//		
		//위의 코드를 모르는 경우면 어떻게 푸나요?(로직 2)
		//해당 풀이는 비추천
		//이유 : 아스키 코드의 값을 알지 못하면 풀지 못함.
		for(int i = 0; i < rtoS.length(); i++)
		{
			for(int j = 0; j < 10; j++)
			{
				//문자 '0'을 빼거나 문자 '48'을 뺏을 경우 원하는 정수 값을 얻을 수 있습니다.
				//* ASCII CODE(아스키 코드)
				//--> 숫자, 문자, 특수문자 등을 0부터 127까지 번호로 값을 저장해 놓은 코드
				//아스키 코드의 0은 10진수 기준으로 48이다.
				if((rtoS.charAt(i) - '0') == j)
				{
					++count[i]; //값 추가
					break; //작업 종료
				}
			}
		}
		
		//이거조차 안된다..? (로직 3) 왜 결과가 이렇게 나오는지 로직 분석을 해오기 (과제)
		//결과값이 0이 될때까지 계속 10으로 나누고, 나머지 값 위치에 값을 추가합니다.
		while(result != 0)
		{
			count[result%10]++;
			result /= 10;
		}
		//위의 3개 중 하나의 코드를 로직으로 활용합니다.
		
		for(int i = 0; i < count.length; i++)
		{
			System.out.println(count[i]);
		}
		
		bufferedReader.close(); //사용 후 종료
	}

}
