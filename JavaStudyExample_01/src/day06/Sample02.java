package day06;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		// 배열 관련 연습 문제
		//1. 배열의 길이가 10인 정수형 배열 arr을 생성(선언)합니다.
		//2. 그 후 1부터 10까지의 값을 순서대로 반복문을 이용하여 배열 인덱스에 추가합니다.
		
		//이 문제의 의도: 배열의 크기를 설정하고, 규칙적인 값을 넣을 수 있는지를 확인하는 문제
		
		int[] arr = new int[10];
		int start = 1;
		
		
		for(int i = 0; i < arr.length; i++)
		{
			//arr[i] = i + 1;
			//arr[i] = start++;
			arr[i] = start;
			start += 1;
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("%3d", arr[i]);
		}
		System.out.println();
		//문제 2) 다음과 같은 숫자를 저장하고 있는 배열 arr2를 만드시오.
		//단 값은 직접 넣을 수 없으며, 반복문을 이용해서 넣어주시기 바랍니다.
		//10 9 8 7 6 5 4 3 2 1
		
		int[] arr2 = new int[10];
		int start2 = arr2.length;
		
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = start2;
			start2 -= 1;
		}
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.printf("%3d", arr2[i]);
		}
		System.out.println();
		
		//문제 3)
		//주민등록번호 성별 자리 이후부터 *을 가리고 출력하는 프로그램을 구현합니다.
		//ex) 주민등록번호를 -을 포함해서 14자리를 입력하세요.
		//    123456-1234567
		//출력) 123456-1******
		
		//문제의 풀이 방법
		//문장에서 특정 위치의 단어 하나씩을 조사합니다.
		//뒷자리 6개를 *로 대신 출력합니다.
		
		//문자열(String)을 문자(char)로 표현하는 방법을 알고 있어야 합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호를 -을 포함해서 14자리를 입력하세요.");
		
		String RRN = sc.next();
		char[] numbers = new char[14];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = RRN.charAt(i);
			//charAt()은 문자열의 ()안에 넣어준 숫자 번호(인덱스 번호)에 해당하는 문자 하나를 받아오는 문법
		}
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(i < 8)
			{
				System.out.print(numbers[i]);
			}
			else
			{
				System.out.print("*");
			}
		}
		
		
		sc.close();
	}

}
