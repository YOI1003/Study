package phone_program;

import java.util.Scanner;

public class Viewer {

	public static Scanner sc = new Scanner(System.in);
	
	
	public static void view()
	{
		System.out.println("=======================");
		System.out.println("기능을 선택하세요.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 시스템 종료");
		System.out.println("=======================");
		System.out.print("▶");
	}
	
}
