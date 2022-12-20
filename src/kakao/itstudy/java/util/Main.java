package kakao.itstudy.java.util;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//정수 배열
		int []ar = {60, 30, 20, 87, 56};
		
		//문자열 배열
		String []br = {
				"해블", "현트" , "도란", "레넏"
		};

		//배열의 데이터 확인
		System.out.println(Arrays.toString(ar));
		
		//정수 배열 정렬
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		//문자열 배열 정렬
		Arrays.sort(br);
		System.out.println(Arrays.toString(br));
		
		VO[] datas = new VO[5];
		datas[0] = new VO(1, "매수지", 28);
		datas[1] = new VO(2, "수지", 230);
		datas[2] = new VO(3, "숙지", 200);
		datas[3] = new VO(4, "매실장아", 213);
		datas[4] = new VO(4, "매실장아찌", 213);
		

		System.out.println(Arrays.toString(datas));
		
		Arrays.sort(datas);
	}

}
