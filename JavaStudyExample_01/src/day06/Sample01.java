package day06;

public class Sample01 {

	public static void main(String[] args) {
		
		//2중 for문(for문 + for문)
		//for문 내부에도 for문을 설계할 수 있습니다.
		
		//자주 볼 수 있는 2중 for문의 유형
		//1. 배열 내부에 숫자 규칙적으로 집어넣기
		//2. 별 찍기
		//3. 구구단
		
		//문제 1) 가로와 세로로 배치되어있는 곱셈표를 표현합니다.
		//  1  2  3  4  5  6  7  8  9
		//  2  4  6  8  10 12 14 16 18
		//  3  6  9  12 15 18 21 24 27
		//  4  8  12 16 20 24 28 32 36
		//  5
		
		
		for(int i = 1; i <= 9; i++) //[가로]
		{
			//i가 1일 때 j가 1부터 9까지 반복
			for(int j = 1; j <= 9; j++) //[세로]
			{
				System.out.printf("%3d", i * j); //%숫자d는 공백을 포함한 만큼 값을 출력합니다.
												 //%3d라면 숫자 1은 공백 2개 숫자1, 숫자10은 공백 1개에 숫자 10
			}
			System.out.println();//작업이 끝날 때마다 띄어쓰기
		}
		
		//문제 2) 다음 표를 보고 규칙을 판단하여 코드를 작성하시오.
		//   1  2  3  4  5  6  7  8  9
		//1  2  3  4  5  6  7  8  9  10
		//2  3  4  5  6  7  8  9  10 11
		//3  4  5  6  7  8  9  10 11 12
		//4
		//5
		//힌트) if문을 적절하게 사용해 볼 것
		for(int i = 0; i <= 9; i++)
		{
			if(i == 0)
			{
				System.out.print("   ");
				for(int j = 1; j <= 9; j++)
				{
					System.out.printf("%3d", i + j);
				}
			}
			else
			{
				for(int j = 0; j <= 9; j++)
				{
					System.out.printf("%3d", i + j);
				}
			}
			System.out.println();
		}
		//문제 3) 
		//다음 화면의 *기호를 이용한 도형을 출력해봅시다.(별 찍기 알고리즘)
		
		//사용자는 숫자를 입력합니다.
		//ex) 숫자를 입력해주세요 >> 3
		//[출력]
		//***
		//***
		//***
		
		//규칙: 입력한 숫자만큼 가로와 세로가 출력되는 방식
		//가로와 세로는 for문을 구현합니다.
		//(단, 이번에는 입력은 따로 하지 않고 값을 3으로 설정해서 실행)
		
		System.out.println("숫자를 입력해주세요 >> 3"); 
		int value = 3;
		
		//규칙대로 설계
		for(int i = 1; i <= value; i++)
		{
			for(int j = 1; j <= value; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
