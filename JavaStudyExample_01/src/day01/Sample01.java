package day01;
// 이 위치에 적히는 값은 메모용으로 사용됩니다.(한 줄 주석)

/* 여러 줄을 주석 할 때는 
 * 이 형태로 작성합니다.
 * 
 */

/** 파란 주석으로 주석을 달 경우 자바 문서(javadoc)를 만들 때 그 내용이
 * 문서에 포함되게 됩니다.
 *
 */
public class Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Eclipse!!");
		//System.out.println();은 시스템 영역의 출력 스트림으로부터 출력을 진행하는 문법입니다.
		//스트림은 데이터가 지나다니는 영역 정도로 이해합니다.
		//ln은 작업이 끝나면 Enter의 작업을 진행합니다. ln을 안적었을 경우에는 Enter 작업을 하지 않습니다.
		System.out.println();
		// syso + ctrl + space ==> System.out.println();
		System.out.println(10.5);
		System.out.println(10 > 5);
		System.out.println('a');
	}	
	

}

