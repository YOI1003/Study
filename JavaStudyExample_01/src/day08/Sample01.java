package day08;
import java.util.ArrayList;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// 5명 정도의 사람의 이름을 입력을 받아서
		// name 리스트에 저장하고, 이들 중에서 '김'씨 성을 가진 사람이 총 몇 명인지 출력하세요.
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList();
		int total = 0;
		
		//이름 5번 입력
		for(int i = 0; i < 5; i++)
		{
			System.out.print("이름을 입력해주세요(띄어쓰기 하지 않습니다.) : ");
			name.add(sc.next());
		}
		
		//이름 조사
		//1. 리스트로부터 값 하나를 얻어와야 합니다.(get기능 필요)
		//2. 문자열이 김으로 시작해야 합니다.(startsWith) (endsWith도 있다 끝나는 문자 찾을때사용) 잘 이용하면 끝말잇기 프로그램도 만들 수 있다.
		//																			  한번 해보는것도 나쁘지 않을 듯
		//3. 현재 리스트 전체를 대상으로 진행을 해야 합니다.
		
		for(int i = 0; i < 5; i++)
		{
			String search_name = name.get(i);
			
			//if(search_name.indexof(0) == "김")
			//if(search_name.charAt(0) == '김')
			if(search_name.startsWith("김"))
			{
				total++;
			}
		}
		//결과 출력
		System.out.printf("김씨 성을 가진 사람은 모두 %d명 입니다.\n", total);
		
		
		
		//스캐너 사용 종료
		sc.close();
	}

}
