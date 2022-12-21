package kakao.itstudy.java.util;

import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {

		// 배열의 배열 - 2차원 배열 : matrix - 태그가 없음
		String[] doro = { "뭐", "임마", "ㅋ" };
		String[] sds = { "삼성", "스페이스", "ㄷㄷ" };
		String[] ginseng = { "gg", "ee", "qq" };

		// 이차원 배열 생성
		String[][] volley = { doro, sds, ginseng };

		int i = 0;

//		for (String[] temp : volley) {
//			if (i == 0) {
//				System.out.print("연습 : \t");
//			} else {
//				System.out.print("sam: ");
//			}
//			for (String imsi : temp) {
//				System.out.print(imsi + "\t");
//			}
//			System.out.println();
//		}
		
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("name", "연습:");
		map1.put("team", doro);

		Map<String, Object> map2 = new HashMap<>();
		map2.put("name", "뭐:");
		map2.put("team", sds);

		Map[] v = { map1, map2 };
		
		for(Map map : v) {
			System.out.print(map.get("name") +"\t");
			String [] temp = (String [])map.get("team");
			for(String imsi : temp) {
				System.out.print(imsi + "\t");
			}
				System.out.println();
		}
	}

}
