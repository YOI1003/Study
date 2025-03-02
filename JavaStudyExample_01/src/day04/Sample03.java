package day04;

import java.util.Arrays;

public class Sample03 {

	public static void main(String[] args) {
		//
		
		//배열 순서대로 정렬하기
		//1. 정렬 로직을 구현해서 배열을 정렬한다.
		//2. 자바에서 제공해주는 Arrays 기능을 이용해 정렬한다.
		
		//1. Arrays로 정렬하기
		int [] arr = {9,8,4,5,6,2,1,3,7,10};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //배열을 문장 형태로 표현하는 기능
		
		//2. 정렬 알고리즘(7종류)
		//요소를 일정한 순서대로 열거하는 알고리즘
		//이때는 시간 복잡도(소요되는 시간)과 공간 복잡도(메모리 사용량)에 따라 골라서 사용합니다.
		
		//유형별 소개
		//이름		시간			원리
		//버블		O(n^2)		모든 값을 순차적으로 비교해서 크기 비교해서 정렬합니다.
		//선택		O(n)		맨 앞부터 순차적으로 선택해 비교해서 정렬합니다.
		//삽입		O(n)		값들이 들어갈 위치를 찾아 교환하는 방식입니다.
		//셀			O(n^1.5)	간격을 정하고 배열을 나누고 정렬
		//합병		O(nlogn)	배열의 길이가 1이 될때까지 배열 분할, 분할 후 합병 모든 부분배열이 합병될 때까지 반복
		//힙			O(nlogn)	최대 힙(Heap)을 통해 배열을 구현하면 0번째 값이 가장 큰 수이다. 이를 이용해 정렬을 진행한다.
		//퀵			O(nlogn)	피봇(pivot)이 들어가는 위치에 따라 효율이 안좋아질 수 있다.(합병처럼 분할 반복 진행)
		//           (함수의 그래프이다) + (최악의 경우일때)
		
		//빅 오 표현법(BIG O)
		//n이 커질 때 알고리즘의 단계가 얼마나 증가하는가를 표현한 방법
		//알고리즘의 성능이 최악인 경우를 나타낼 때 사용하는 표기법
		
		//O(n): 입력 값(n)이 증가하는 속도만큼 수행 속도가 증가합니다.
		//O(nlogn): 로그 함수 사용을 했지만 수행시간이 O(n)보다 클 수 있음.
		//O(n^2): 입력 값(n)에 대해 제곱으로 수행 시간이 늘어납니다.
		//O(logn): 입력 값이 증가하는 속도보다 수행 속도가 천천히 증가하는 방식입니다.
		
		//정렬 알고리즘 (거품 정렬) 구현
		//데이터를 비교하면서 찾는 비교 정렬
		//정렬 데이터 이외에 별도의 공간을 요구하지않는 제자리 정렬
		//앞에서 부터 순차적으로 비교하는 안정 정렬
		
		//장점: 정렬 알고리즘 중 구현이 가장 쉬움.
		//단점: 성능적인 부분에서 좋지 못함.
		
		//구현 과정 순서
		//1. 앞에서부터 현재의 원소와 다음 원소를 비교합니다.
		//2. 비교해서 현재 값이 다음 값보다 크다면 교환합니다.
		//3. 다음 원소로 이동해서 같은 작업을 반복합니다.
		
		
		//예시로 보는 시나리오
		
		//8 3 7 4 5 2
		//3 8 7 4 5 2
		//3 7 8 4 5 2
		//3 7 4 8 5 2
		//3 7 4 5 8 2
		//3 7 4 5 2 8
		//... 이 과정을 데이터 개수만큼 반복하면 결과적으로 정렬이 될 것입니다.
		
		int [] bubble = {8,3,7,4,5,2};
		
		//반복은 배열의 크기 -1 만큼 진행
		for(int i = 1; i < bubble.length; i++)
		{
			//각 반복당 비교 횟수는 배열의 크기와 현재 반복만큼을 뺀 만큼 비교합니다.
			for(int j = 0; j < bubble.length - i; j++)
			{
				//현재의 값이 다음 값보다 클 경우 교환합니다.
				if(bubble[j] > bubble[j+1])
				{
					int temp = bubble[j]; //현재의 값을 임시로 저장(값 교환을 위해)
					bubble[j] = bubble[j+1]; //현재의 위치에 다음 값을 대입
					bubble[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(bubble));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
