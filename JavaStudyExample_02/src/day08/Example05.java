package day08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example05 {

	public static void main(String[] args) {
		// 자바 스트림(Stream)
		//데이터 소스를 추상화하여 어떤 형태든 같은 방식으로 다룰 수 있게 제공해주는 기능
		//따라서 코드의 재사용성이 매우 높은 사용 방식입니다.
		//스트림은 데이터 소스로부터 데이터를 읽어내는 기능으로, 데이터 소스를 변경하지는 않습니다.
		//스트림은 일회용 기능입니다. 사용 후 다시 사용할 경우 다시 생성해야 합니다.
		//자바 8 이상의 버전에서 제공해주는 기능
		
		//스트림을 이용해 리스트 만들기
		List<String> list = Arrays.asList("apple","banna","cherry","dragonfruit","eggfruit");
		System.out.println(list);
		
		//리스트를 스트림으로 변환합니다.
		Stream<String> list_stream = list.stream();
		System.out.println(list_stream);
		
		
		//리스트를 Stream으로 변환하고, banana를 찾아서 대문자로 변환합니다.
		//원본을 냅두고, 별개의 값을 검색해 데이터로 따로 저장하는 행위와 같습니다.
		
		List<String> search = list.stream()
				.filter(fruit -> fruit.equals("banana"))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		//1. list.stream(): list를 Stream으로 변환하는 메소드
		//2. filter(fruit -> fruit.equals("banana"))
		//   필터는 필터링을 진행할 때 사용하는 메소드로, 인자를 정해주고(fruit), 다음엔 인자를 구분하는 기준을 작성합니다.
		//   여기서는 기준이 fruit가 banana와 동일한 값인지 확인하기 위해 equals를 사용했습니다.
		//3. map(String::toUpperCase)
		//   맵 함수는 filter를 통해 넘어온 값을 특정 기능 참조를 통해 사용합니다.
		//   여기서는 filter로 걸러낸 값을 String 클래스의 toUpperCase() 메소드를 통해 맵핑합니다.
		//4. collect(Collectors.toList());는 위의 작업이 끝난 뒤 리스트의 형태로 모아주는 역할을 합니다.
		
		//스트림의 기본적인 문법
		
		
		
	}

}
