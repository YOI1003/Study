package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//해당 문제의 팁
//1. Set 활용(중복 제거)
//2. ArrayList 활용(Set로 표현 못하는 순서를 적용하기 위해)
//3. 랜덤 활용(임의의 값을 적용하기 위함)

public class Example01 {

	public static void main(String[] args) {
		// day01 Example03에 대한 답안
		
		//로또 프로그램 만들기(1줄 기준)
		
		//로또 1줄을 구매하면 숫자 6개가 랜덤으로 중복 없이 선택됩니다.
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		//정답의 경우는 숫자 6개와 보너스 숫자 1개로 구성이 됩니다.
		int[] result = {3,6,13,15,16,22,32};
		int bonus_number = result[result.length-1]; //마지막 번호 = 길이 - 1
		
		//로또 번호 6개를 랜덤으로 넣어줍니다.
		while(lotto.size() != 6)
		{
			//set이기 때문에 같은 숫자가 나온다면 추가해도 로또에서 중복을 알아서 제거해줍니다.
			int random_number = (int)(Math.random()*45) + 1;
			lotto.add(random_number);
		}
		
		//[Tip]
		//로또는 화면에 보통 오름차순으로 처리됩니다.
		//하지만 Set는 순서의 개념이 없어서 이 작업을 하기가 불편함.
		//따라서 Set의 데이터를 기반으로 ArrayList를 만들어서 정렬합니다.
		
		ArrayList<Integer> sorted_lotto = new ArrayList<Integer>(lotto);
		
		Collections.sort(sorted_lotto);
		
		System.out.print("1148회 로또 번호: ");
		for(int i = 0; i < result.length -1; i++)
		{
			System.out.print(result[i] + " ");
		}
		System.out.println("보너스 번호: " + bonus_number);
		System.out.println("작성한 로또 번호: " + sorted_lotto);
		
		//등수 출력
		int correct = 0;
		int bonus = 0;
		
		for(int i = 0; i < lotto.size(); i++)
		{
			if(lotto.contains(result[i]))
			{
				if(result[i] == bonus_number)
				{
					bonus++;
				}
				else
				{
					correct++;
				}
			}
		}
		System.out.println("맞춘 개수(보너스 제외): " + correct);
		System.out.println("보너스 번호: " + bonus);
		
		String[] rank = {"1등","2등","3등","4등","5등","꽝"};
		String rank_result = "";
		if(correct == 6)
		{
			rank_result = rank[0];
		}
		else if(correct + bonus == 6)
		{
			rank_result = rank[1];
		}
		else if(correct + bonus == 5)
		{
			rank_result = rank[2];
		}
		else if(correct + bonus == 4)
		{
			rank_result = rank[3];
		}
		else if(correct + bonus == 3)
		{
			rank_result = rank[4];
		}
		else if(correct + bonus == 4)
		{
			rank_result = rank[5];
		}
		
		
	}

}
