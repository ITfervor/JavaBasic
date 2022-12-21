package kakao.itstudy.java.util;

import java.util.Arrays;

public class QuickSortMain {
	
	//quick sort를 위한 메서드
	//left는 비교의 시작위치 right는 비교의 반대편 끝위치
	//data가 정렬할배열
	public static void quickSort(int left, int right, int []data) {
		//데이터 출력
		System.out.println(Arrays.toString(data));
		
		
		//기준점 설정 - 설명할 때는 임의의 위치나 중앙이라고 하는데 
		//구현할 때는 맨 왼쪽을 기준으로 설
		int pivot = left;
		//큰데이터를 찾기위한 인덱스
		int i = left + 1;
		//작은 데이터를 찾기위한 인덱스는 right
		//나중에 데이터를 교체하기 때문에 피봇의 위치 저장
		int j =pivot;
		
		//배열의 데이터가 2개이상인 경우만 사용
		//배열의 데이터가 1개이면 left right가 같아짐
		if(left<right) {
			for (; i<= right; i = i+1) {
				if(data[i] < data[pivot]) {
					//swap : 데이터 교환
					j = j + 1;
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
			
			//pivot위치의 데이터를 자신의 위치로 이동
			int temp = data[left];
			data[left] = data[j];
			data[j]= temp;
			
			//pivot위 위치를 비교가 끝난 자리로 수정
			pivot = j;
			//pivot의 왼쪽부분을 재귀적으로 다시 quick sort
			quickSort(left, pivot-1,data);
			//pivot의 오른쪽 부분을 재귀적으로 다시 quick sort
			quickSort(pivot + 1, right ,data);
		}
	}
	
	public static void main(String[] args) {
			int ar[] = {78, 87, 99, 100, 20, 39, 91};
			quickSort(0, ar.length-1, ar);
			System.out.println("오름차순 정렬 후");
			System.out.println(Arrays.toString(ar));
	}

}
