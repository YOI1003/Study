package day07;

import java.util.Arrays;

//차원(dimension) : 수학적으로 공간의 성질을 의미합니다.
//배열의 경우 숫자가 1,2,3,4,5처럼 나열되어잇는데 이 모습이 하나의 선과 비슷하게 보여
//1차원 배열이라고도 부릅니다.(직선 배열)

//2차원 배열은 가로와 세로의 개념을 가지고 있는 배열
// 1 2 3
// 4 5 6 의 경우 가로 3줄, 세로 2줄로 구성되어 있음.

//2차원 배열은 배열의 요소가 배열인 배열
//ex) {{1,2,3}, {4,5,6}}
public class Sample01 {

	public static void main(String[] args) {
		// 2차원 배열(N차원 배열)
		// 자료형 [][] 배열명; or 자료형 배열명 [][]; <- 2차원 배열의 선언 방법		
		int [][] iarray;
		int array2 [][];
		int [] array3 []; //가능은 하지만 헷갈리기 때문에 자주 사용되지는 않습니다.
		//이게 가능한 이유 : 자료형에 대한 배열 ([])과 기존 배열에 대한 표현([])			
		//2차원 배열에 길이를 넣고 생성
		String [][] menu = new String[2][3]; //세로 2, 가로 3인 String 형태의 2차원 배열	
		//배열 위치에 값 넣기
		menu[0][0] = "연필";
		menu[0][1] = "지우개";
		menu[0][2] = "자";
		//menu[0][3] = "축구공";
		//현재 배열은 세로가 0~1까지 가로가 0~2까지 제공되는 배열입니다.
		//해당 값은 범위를 벗어난 값(오류)	
		menu[1][0] = "샤프";
		menu[1][1] = "샤프심";
		menu[1][2] = "볼펜";
		
		//배열 출력
		for(int i = 0; i < 2; i++) //세로 열 반복
		{
			for(int j = 0; j <3; j++) //가로 열 반복
			{
				System.out.print(menu[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//2차원 배열에 요소의 값을 넣어서 생성합니다.
		//이 경우에는 배열의 [][]부분에 길이를 따로 작성하지 않아도 됩니다. 넣은 값을 기준으로 가로 세로가 형성 됩니다.
		int [][] scores = {
				{1,2,3}
				,
				{4,5,6}
				,
				{7,8,9}
		};
		
		
		for(int i = 0; i < scores.length; i++) //배열에서 세로열의 길이 = 배열명.length
		{
			for(int j = 0; j < scores[i].length; j++) //배열에서 가로열의 길이 = 배열명[인덱스].length;
			{
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
				
		//가변 배열(jagged Array) : 각 배열마다 가지고 있는 요소의 개수가 다른 배열
		int [][] jaggedArray = {
				{1,2}
				,
				{3,4,5,6}
				,
				{7,8,9}
				,
				{10}
		};
		
		for(int i = 0; i < jaggedArray.length; i++) 
		{
			for(int j = 0; j < jaggedArray[i].length; j++)  //각 배열의 길이를 기준으로 잡아야 가변 배열을 그대로 뽑을 수 있습니다.
			{
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
		
		//자바식 접근법
		
		for(int i = 0; i < jaggedArray.length; i++)
		{
			System.out.println(Arrays.toString(jaggedArray[i]));			
		}
		//Arrays.toString은 배열을 문자 형태로 변환해주는 기능
		
		//2. enhanced for 문 
		//stream으로 출력하는 only read만 가능한 for문(배열 형태에서 사용할 수 있는 for문)
		
		//작성 방법 
//		1차원 배열 형태의 ehanced for문
//		for(분해한 자료형 변수명 : 배열명) 
//		{
//			
//		}
//		
//		2차원 배열의 enhanced for문
//		for(배열 형태 변수명 : 2차원 배열명)
//		{
//			for(자료형 변수명 : 위에서 처리한 배열명)
//			{
//				
//			}
//		}		
		for(int[] array_element : jaggedArray) //2차원 배열인 jagged로부터 각각의 값(array_element)로 처리
		{	
			for(int element : array_element) //처리한 값(array_element : 1차원 배열)로부터 각각의 값(element) 처리
			{
				System.out.print(element + "+"); //인덱스의 개념을 사용하지 않고 순번대로 처리합니다.
			}
			System.out.println();
		}	
		
	}

}