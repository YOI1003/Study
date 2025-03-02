package day06;

public class Example01 {

	public static int solution(int [] numbers, int n)
	{
		int answer = 0;
        for(int i = 0 ; i < numbers.length; i++)
        {
            if(answer <= n)
            {
                answer += numbers[i];
            }
        }        
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {34,5,71,29,100,34};
		
		System.out.println(solution(numbers, 123)); //139
		
		numbers = new int[] {58,44,27,10,100}; //배열 새롭게 초기화
	
		System.out.println(solution(numbers,139));  //239
	
	}
	

}
