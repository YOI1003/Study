package day07;

import java.util.ArrayList;
import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/42586

public class Example02 {

    public static int[] solution(int[] progresses, int[] speeds) {
    	int[] answer = {}; //시작 값
    	Stack<Integer> stack = new Stack<Integer>(); //개발 시간을 담을 스택
    	
    	//개발에 대한 마지막 값 --> 첫번째까지 역순으로 처리
    	for(int i = progresses.length-1; i >=0; i--)
    	{
    		int ing = 100 - progresses[i]; //100은 전체 완성 , progresses[i]는 현재의 남은 개발 진행도
    		
    		if(ing % speeds[i] > 0)
    		{
    			stack.push(ing / speeds[i] + 1); //남은 진행도에서 speed를 나눈 값 == 남은 개발 진행
    		}
    		else
    		{
    			stack.push(ing / speeds[i]); //제대로 나눠진다는 건 더이상 작업할 값이 없다는 뜻(그 값을 그대로 추가)
    			//몫을 추가
    		}		
    	}
    	
    	ArrayList<Integer> alist = new ArrayList<Integer>(); //작업 후 answer에 전달하기 위해 사용할 배열 리스트
    	
    	//스택에 값이 존재하는 동안 작업 진행
    	while(!stack.isEmpty())
    	{
    		int count = 1; //시작 카운트 1
    		int number = stack.pop(); //값 하나 사용하고 데이터 제거
    		//System.out.println("현재의 값 : " + number); //과정 확인용 코드(실전에서는 제거합니다.)
    		
    		while(!stack.isEmpty())
    		{
    			int number2 = stack.peek(); //최상단의 값
    			if(number < number2)
    				break;
    			else
    			{
    				count++;
    				stack.pop();
    			}
    		}  		
    		//작업이 끝난 후 횟수 추가
    		alist.add(count);
    	}
    	
    	answer = new int[alist.size()]; //스택에서 처리한 데이터만큼을 가지는 배열로 생성
    	
    	for(int i = 0; i <alist.size(); i++) //alist의 값을 answer로 옮기기
    	{
    		answer[i] = alist.get(i);
    	}
        return answer; //작업이 다 끝난 배열
    }
	
    public static void toString(int[] arrays)
    {
    	//테두리 출력
    	System.out.print("[");
    	for(int i = 0 ; i < arrays.length; i++)
    	{
    		//배열의 길이만큼 출력 진행
    		//1. 기본 값일 경우 숫자,로 출력
    		//2. 마지막 값일 경우 숫자로 출력      
    		if(i < arrays.length-1)
    			System.out.print(arrays[i] + ",");
    		else
    			System.out.print(arrays[i]);
    	}
    	//마무리
    	System.out.println("]");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progresses01 = {93, 30, 55};
		int[] speeds01 = {1, 30, 5}; 
		
		//93의 경우 하루 1씩 작업이 가능 --> 7일 후 배포 가능		
		//30의 경우 하루 30씩 작업이 가능 --> 3일 후 배포 가능
		//55의 경우 하루 5씩 작업이 가능
		
		//94 95 96 97 98 99 100 --> 7
		//60 90 120(100) --> 3
		//60 65 70 75 80 85 90 95 100 --> 9
		
		//조건) 뒤의 기능이 앞의 기능보다 먼저 개발될 경우
		//뒤에 있는 기능은 앞의 기능이 배보될 때 같이 배포됩니다.
		
		//따라서 해당 작업은 7일차에 2개의 작업이 배포
		//               9일차에 1개의 작업이 배포
		//return [2,1]
		
		
		//System.out.println(solution(progresses01, speeds01)); //	[2, 1]
		toString(solution(progresses01, speeds01));
		
		int[] progresses02 = {95, 90, 99, 99, 80, 99};
		int[] speeds02 = {1, 1, 1, 1, 1, 1};
		//System.out.println(solution(progresses02,speeds02));//      [1, 3, 2]
		toString(solution(progresses02, speeds02));
	}

}