package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//과제 : 브루트 포스 개념을 활용해서 백준 2798번(블랙잭) 풀이

public class Example04 {
	//백준 1759번 도전(브루트 포스 문제)
	// (3 <= L <= C <= 15)
	
	
	//첫째 줄에 정수 L,C가 주어짐
	//L : 암호의 개수 (최소 1개의 모음(a,e,i,o,u) + 최소 2개의 자음으로 구성)
	//C : 암호로 사용할 수 있는 알파벳
	//--> 주어진 알파벳 C개 중 L개를 뽑는다.(중복 허용은 배제합니다.)
	
	//무조건 오름차순
	
	//입력 예시
	//4 6
	//a t c i s w
	
	//설계) 오름차순 해봅시다
	//a c i s t w
	
	//a나 i는 무조건 1개 포함된다.
	//acis 가능
	
	//해당 문제에서 사용할 필드 설계
	static int L,C;
	static char[] wordArray, word;
	
	//임의의 L 길이를 가진 암호를 만드는 코드
	public static void SetCode(int current_idx, int idx)
	{
		//자릿수를 L까지 채우기
		if(idx == L)
		{
			//해당 값이 모음 1개, 자음 2개인지 확인
			if(OneVowelTwoConso(word))
			{
				System.out.println(word);
			}
			return;
		}
		
		for(int i = current_idx; i < C; i++)
		{
			word[idx] = wordArray[i];
			SetCode(i+1, idx+1);
		}
	}
	
	//문자열을 넣고, 모음과 자음의 개수를 체크하는 코드
	public static boolean OneVowelTwoConso(char[] word)
	{
		int vowel = 0; int consonant = 0; //모음과 자음
		
		//word로부터 char c 하나하나에 접근합니다.
		for(char c : word)
		{
			//if 설계
			if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowel++;
			else
				consonant++;
		}
			
//			switch(c)
//			{
//			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
//				vowel++; break;
//			//일반적인 경우라면 consonant ++
//			default :
//				consonant++;	
//			}
//		}
		//모음이 1개이상 자음이 2개이상 찍힌 경우 true
		if(vowel >= 1 && consonant >= 2) 
			return true;
		
		return false; //해당되지 않는 경우(false)
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		L = Integer.parseInt(stringTokenizer.nextToken()); //암호의 길이
		C = Integer.parseInt(stringTokenizer.nextToken()); //문자의 개수
		
		word = new char[L]; //암호 할당
		wordArray = new char[C]; //문자의 개수
		
		stringTokenizer = new StringTokenizer(bufferedReader.readLine()); 
		//암호 문자 입력
		//a t c i s w 순서대로 입력
		
		for(int i = 0; i < C; i++)
		{
			wordArray[i] = stringTokenizer.nextToken().charAt(0);
			//nextToken()은 토크나이저에 등록된 값을 처리 후 다음 값으로 넘어가는 기능을 가지고 있습니다.
		}
		
		//오름차순 정렬
		Arrays.sort(wordArray);
		//코드 생성
		SetCode(0,0);
		
		
	}

}
