package practice;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("끝말잇기 시작!");
		System.out.print("단어를 입력해주세요 >> ");
		String word = sc.next();
		int score = 0;
		
		while(true)
		{
			System.out.printf("입력한단어: %s\n", word);
			char last_letter = word.charAt(word.length()-1);
			System.out.print("다음 단어를 입력해주세요 >> ");
			String word2 = sc.next();
			if(word2.charAt(0) == last_letter)
			{
				word = word2;
				score += 1;
			}
			else
			{
				System.out.println("잘못된 단어를 입력하셨습니다.");
				System.out.println("최종점수: " + score);
				break;
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
