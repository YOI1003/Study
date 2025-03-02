package day07;

import java.util.Stack;

public class Example01 {

	public static void main(String[] args) {
		// 자료구조 Stack
		//데이터를 순차적으로 쌓아서 저장하는 자료구조
		//먼저 들어간 데이터가 가장 마지막에 꺼내게 되는 형태(Last In First Out : LIFO(후입선출))
		
		//ex) 푸쉬 (push) : 스택에 데이터를 추가하는 것을 의미합니다.
		//  0   0   0   3
		//  0   0   2   2
		//  0   1   1   1
		//넣는 순서에 따라 쌓이고, 마지막 값이 항상 최상단(top)에 보이게 됩니다.
		
		//ex) 팝(pop) : 스택에서 마지막 데이터를 사용하고, 데이터를 제거하는 것을 의미합니다.
		// 3   -   -   -
 		// 2   2   -   -
		// 1   1   1   - (empty)
		
		//스택을 사용하는 대표적인 예시) 인터넷 브라우저 뒤로 가기, 앞으로 이동 같은 기능
		//						 역순 문자열 만들기
		
		//자바에서 제공해주는 Stack<T> 클래스
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1); //스택에 데이터 추가
		stack.push(2);
		System.out.println(stack);         //stack 그 자체를 출력할 경우는 [값,값2,...] 순서로 출력됩니다.
		System.out.println(stack.peek());  //맨 위의 데이터를 return하는 기능
		System.out.println(stack.pop());   //맨 위의 데이터 return 후 데이터 제거
		System.out.println(stack); 
		System.out.println(stack.isEmpty()); //스택 안에 데이터가 존재하면 false, 아니면 true (boolean 형태의 return 값)
		System.out.println(stack.size()); //스택의 길이(데이터의 개수)		
	}
}