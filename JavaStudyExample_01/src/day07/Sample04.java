package day07;

import java.util.ArrayList;

public class Sample04 {

	public static void main(String[] args) {
		// 자바에서 제공해주는 ArrayList 사용
		// 자바에서 제공해주는 컬렉션 중 하나입니다.
		// 컬렉션은 데이터 처리를 위한 보조 도구 개념
		
		//배열의 상위호환 데이터로 봐도 좋습니다.
		
		//배열(array)와 배열리스트(arrayList)의 공통점과 차이점
		//1. 값을 추가하거나 가져오는 성능은 비슷합니다.
		//2. 중복된 데이터를 저장하는 것이 가능합니다.
		//3. Array는 길이가 고정되어있는 데이터입니다.(ArrayList는 길이 수정 가능)
		
		//그외에 ArrayList는 배열보다 더 다양한 기능을 제공합니다.
		//단점 : 기능이 더 추가되어있기 때문에 같은 성능의 결과라면 array를 쓰는 것이 용량적으로 더 좋습니다.
			
		ArrayList<Integer> a_list = new ArrayList<>();
		//Integer는 정수(int)를 클래스의 형태로 변형한 데이터입니다.(자바2의 Wrapper class 파트에서 개념 확인)
		
		a_list.add(1);
		System.out.println(a_list);
		System.out.println(a_list.size());
		a_list.add(2);
		System.out.println(a_list);
		System.out.println(a_list.size());
		a_list.remove(1); //배열 리스트의 1번째 데이터 삭제(배열의 index 개념)
		System.out.println(a_list);
		System.out.println(a_list.size());
		a_list.add(0,0); //배열 리스트의 0번째 데이터로 0을 추가합니다.
		System.out.println(a_list);
		System.out.println(a_list.size());
		
		if(a_list.contains(1))
		{
			System.out.println("해당 값이 존재합니다.");
		}
		
		
		
		
		
	}

}