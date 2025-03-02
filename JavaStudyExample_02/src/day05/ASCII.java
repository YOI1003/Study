package day05;

public class ASCII {

	public static void main(String[] args) {
		// 아스키 코드(ASCII)
		// American Standard Code for Information Interchange(미국 정보 교환 표준 부호)
		
		//특징) 000(0x00) ~ 127(0x7F)까지 총 128개의 부호가 사용됩니다.
		
		//자주 사용되는 아스키 코드 값
		//1. 'A' = 65
		//대문자 알파벳은 10진수 65 ~ 90까지
		//2. 'a' = 97
		//소문자 알파벳은 10진수 97 ~ 122까지
		
		//문자 --> 아스키 코드
		char c = 'A';
		System.out.println((int)c); //char -> int casting
		System.out.println( c - 'a'); 
		//문자 - 문자를 진행할 경우 문자가 가지고 있는 아스키코드의 
		//10진수끼리의 값으로 계산이 진행됩니다.
		//==> 문자끼리 크기 비교가 가능합니다.
		
		boolean same = c == 65 ? true : false;
		System.out.println(same);
		
		//아스키 코드 --> 문자
		int value = 97;
		char d = (char)value; //int -> char casting
		System.out.println(d);
		
		//캐스팅(casting)
		//데이터 타입을 다른 데이터 타입으로 변환하는 경우
		
		//int -> char
		//char -> int
		//float -> int
		//int -> float
		
		//데이터 크기가 큰 타입에서 작은 타입으로 변환하는 경우 값 손실이 발생할 수 있습니다.
		//ex) int(4byte) -> byte(1byte)
		
		//데이터 크기가 작은 타입에서 큰 타입으로 변환하는 경우는 값 손실이 발생하지 않습니다.
		//ex) byte(1byte) -> int(4byte)
		
		//정수에서 실수로 변환할 때 정밀도 차이를 고려할 수 있습니다.
		//float(소수점 7자리까지 오차가 없음)
		//double(소수점 15자리까지 오차가 없습니다.)
		
		
		
	}

}
