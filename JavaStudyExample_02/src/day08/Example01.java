package day08;

import java.util.Arrays;
import java.util.Comparator;

//1. Arrays.sort(array) 오름차순
//2. Arrays.sort(array,Collection.reverseOrder()); 내림차순
//3. Arrays.sort(array,front,end); 일부만 정렬 ex) (array,0,3)

class Solution
{
	public int solution(int[] array)
	{
		int answer = 0;
		Arrays.sort(array);
		answer = array[array.length/2];
		return answer;
	}
}

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
