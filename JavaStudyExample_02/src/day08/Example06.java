package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//STREAM API: stream - filter - sorted - distinct - map - collect

//문법 구조
// 생성 - 가공 - 결과

//생성 : stream()

//가공 : filter() : 특정 조건에 부합하는 stream을 전개합니다. ex) monster -> monster.endsWiht("n")
//      map() : 리스트 내에 있는 모든 값을 대상으로 매핑을 진행합니다. ex) monster -> monster.toUpperCase()라면
//														       모든 값을 대상으로 대문자화를 진행합니다.
//      sorted() : 오름차순으로 정렬합니다.
//      distinct() : 중복을 제거합니다.
//      limit(long maxSize) : 처음부터 maxSize개의 값을 출력합니다.
//      skip(long n) : 처음 n개의 값을 제외한 나머지를 출력합니다.

//결과 : forEach() : 각 요소에 대해 특정 작업을 진행합니다.
//      count() : 결과의 개수를 return 합니다.
//      collect() : 해당 결과를 기반으로 컬렉션에 값을 저장합니다.
//      toArray() : 결과를 배열로서 return 합니다.
//      min() : 숫자에 대한 stream 등에서 최소 값을 표현
//      max() : 숫자에 대한 stream 등에서 최대 값을 표현
//      anyMatch() : 특정 조건을 만족하는 요소가 하나라도 있는지를 확인
//      allMatch() : 현재 스트림의 모든 요소가 해당 조건을 만족하는지 확인



public class Example06 {

	public static void main(String[] args) {
		
		List<String> monsters = Arrays.asList("slime","goblin","oak","dragon","worm");
		
		monsters.stream() //몬스터 스트림 생성
		.filter(monster -> monster.endsWith("n")) //데이터 하나하나(monster)를 대상으로 필터링(단어가 n으로 끝나는)
		.forEach(System.out::println); //데이터 하나하나에 순차적으로 작업을 진행(System.out의 println 메소드)
		
		monsters.stream()
		.map(monster -> monster.toUpperCase())
		.forEach(System.out::println);
		
		List<String> name_list = new ArrayList<String>();
		name_list.add("김철수");
		name_list.add("김철수");
		name_list.add("김철수");
		name_list.add("김철수");
		name_list.add("최유리");
		name_list.add("최유리");
		name_list.add("최유리");
		name_list.add("신짱구");
		name_list.add("신짱구");
		name_list.add("신짱구");
		name_list.add("신짱구");
		
		name_list.stream()
				.distinct()
				.forEach(System.out::println);
		
		name_list.stream()
		.distinct()
		.sorted() //ㄱㄴㄷ순으로 정렬
		.forEach(System.out::println);
		
		monsters.stream()
		.limit(3)
		.sorted()
		.forEach(System.out::println);
		
		
		List<String> database = Arrays.asList("김기태","김철수","이한나","이빛나","최유림","송가람");
		
		//이름이 '김'으로 시작하는 사람
		
		database.stream()
		.filter(name -> name.startsWith("김"))
		.forEach(System.out::println);
		
		
		database.stream()
		.skip(2) //db에서 데이터를 3개 건너뛰고 나머지를 작업하세요.
		.forEach(System.out::println);
		
		int count = (int) database.stream()
				.filter(person -> person.startsWith("이"))
				.count();
		
		System.out.println("현재 이씨 성을 가진 사람은 "+ count + "명입니다.");
		
		
		
		
	}

}
