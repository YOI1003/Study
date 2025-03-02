package day04;
//프로그래머스

class Solution{
	public int solution(int n, int k)
	{
		int total = n * 12000 + k * 2000;
		int service = 0;
		if(n >= 10)
		{
			service = (n / 10) * 2000;
		}
		total -= service;
		return total;
	}
}

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s1 = new Solution();
		System.out.println(s1.solution(64, 6));
	}

}
