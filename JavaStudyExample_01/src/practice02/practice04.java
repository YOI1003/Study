package practice02;

import java.util.ArrayList;

public class practice04 {

	public static void main(String[] args) {
		
		int [][] arr = new int [4][4]; // 4 * 4 형식의 배열 생성
		int start = 16;  //시작 값
		for(int i = 0; i < arr.length; i++) // 가로줄
		{
			for(int j = 0; j < arr.length; j++) // 세로줄
			{
				arr[i][j] = start--; // 입력이 된 후 1씩 빼준다
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println(); // 줄 바꿈
		}

	}

}
