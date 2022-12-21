package kakao.itstudy.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		/*
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
		datas[3] = new VO(4, "매실장", 213);
		datas[4] = new VO(4, "매실장아찌", 213);
		

		System.out.println(Arrays.toString(datas));
		
		Arrays.sort(datas);
		
		String [] names = {
				"치히", "알하임", "ㅇㅅㅇ", "굳"
		};
		
		System.out.println(Arrays.toString(names));
		
		//복사본 만들기
		String [] copy = Arrays.copyOf(names, names.length);
		Arrays.sort(copy);
		System.out.println(Arrays.toString(copy));
		
//		Arrays.sort(copy, new Comparator<String>()){
//			public int compare(String o1, String o2) { 
//
//		}
		
		*/
		
		/*int [] ar = {30,20,50,10,40};
		//정렬을 수행하지 않고 하면 논리적인 오류가 발생
		System.out.println(Arrays.binarySearch(ar, 20));
		Arrays.sort(ar);
		System.out.println(Arrays.binarySearch(ar, 20));
		//sort가 된 상태이므로 0이 아니고 2가 맞다.
		System.out.println(Arrays.binarySearch(ar, 30));
		*/
		
		/* ------
	
		//정수를 저장하기 위한 ArrayList
		List <Integer> al = new ArrayList<>();
		//정수를 저장하기위한 LinkedList
		List <Integer> li = new LinkedList<>();
		
		al.add(1);
		al.add(3);
		
		li.add(1);
		li.add(3);
		
		
		
		for( int i = 0; i < 100000; i++) {
			al.add(i);
			li.add(i);
			
		}
		long start;
		long end;
		
		start = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			al.add(1, 2);
			
		}
		
		end = System.currentTimeMillis();
	
		
		System.out.println("ArrayList조회시간 :" + (end - start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			Integer integer = li.get(i);
			
		}
		
		end = System.currentTimeMillis();
	
		
		System.out.println("LinkedList조회시간 :" + (end - start));
		*/
		
		/* ------
		List <String> list = new ArrayList<>();
		
		list.add("a");
		list.add("good");
		list.add("gg");
		list.add("gobayashi");
		
		//순회
		for(String temp : list) {
			System.out.println(temp);
			
		}
		*/
		
		/*
		Stack <String> stack = new Stack<>();
		//스택에 데이터 추가
		stack.push("마리오");
		stack.push("마라도나");
		stack.push("메시");
		stack.push("디마리아");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/
		
		/*
		//데이터를 sort된것 처럼 저장   ----
		Queue <String> queue = new PriorityQueue<>();
		queue.offer("슈퍼마리오");
		queue.offer("도우너");
		queue.offer("둘리 ");
		queue.offer("오리");
		System.out.println(queue);
		System.out.println(queue.poll());
		*/

		/*
		//저장 순서를 알수없는 set
		Set <String> set = new HashSet<>();
		//데이터 추
		set.add("김");
		set.add("감자");
		set.add("고구마");
		set.add("피망");
		set.add("미역");
		//동일한 데이터를 삽입 - equals메서드로 비교해서 
		//true이면 삽입하지 않는다.
		///set은 데이터 삽입에 실패하ㅕㄴ false를 리턴하고
		//성공하면 true를 리턴한다.
		set.add("김");
		System.out.println(set);
		set.add("오이");
		System.out.println(set);
		*/
		
		/*
		
		//로또 번호 생성기 처럼
		//1-45까지의 숫자 6개를 입력 받아서 저장한 후 출력
		//입력을 받을 때 1 ~45사이의 숫자가 아니면 다시 입력하도록 
		//중복된ㄴ 숫자를 입력하면 다시 입력하도록 한다.
		//데이터를 출력할 때는 정렬을 해서 출력
		
		//숫자 6개를 저장할 공간을 생성
		//중복 검사가 수원라고 정렬을 수행하면서 삽입하는 treeSet을 이용
		
		//배열을 이용하는 경우
		
		//입력받기 윈한 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		//6개의 정수를 저장할 배열을 생성
		int [] lotto =new int[6];
		
		int len = lotto.length;
		for (int i = 0; i < len; i++) {
			try {
				System.out.print2("로또번호 입력:");
				lotto[i] =sc.nextInt();
				
				//1부터 45사이의 숫자만 입력받도록 하기
				if(lotto[i] < 1 || lotto[i] > 45) {
					System.out.println("1-45사이의 숫자만 입력하세요 ");
				}
				//데이터 중복 검사
				//첫번째 브터 현재 데이터앞까지 비교
				
				//중복이 발생했는지 체크하기위한 변수
				boolean flag = false;
				int j = 0;
				for (; j < i; j++) {
					//2개의 데이터가 같음
					if(lotto[i]==lotto[j]) {
						flag = true;
						break;
					}
				}
				//중복된 경우
				if(flag == true) {
					System.out.println("중복된숫자입니다.");
					i--;
					//중복검사를 하지않고 패스하기 위해서
					continue;
				}
			} catch (Exception e) {
				// 에러발생시 무호화 시켜주는 작업 (인덱스 변수 하나 줄여주는것)
				i--; 
				sc.nextLine();
				System.out.println("숫자를 넣으세요!");
			}
		}
		
		//배열의 데이터 정렬
		Arrays.sort(lotto);
		//배열의 데이터를 출력
		System.out.println(Arrays.toString(lotto));
		
		sc.close();
		*/
		
		
		/* -----try catch 해보기
		//set을 이용해서 구현
		//입력받기위한 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new TreeSet<>();
		//set에 6개의 데이터가 저장되지 않은 경우
		while(set.size() < 6) {
			System.out.print("로또번호 입력:");
				int temp = sc.nextInt();
				if(temp < 1 || temp > 45) {
					System.out.println("1부터 45사이의 숫자를 입력하시오");
					continue;
				}
				//중복 검사
				boolean result = set.add(temp);
				//삽입에 실패하면 - 증복데이터라면
				if(result == false) {
					System.out.println("중복된 숫자입니다.");
				}
			
		}
		
		System.out.println(set);
		
		sc.close();
		*/
		
		//Map의 활용
		//데이터의 종류는 1가지라면 Object대신에 그 자료형을 기재해도 된다.
		Map<String, Object> map = new HashMap<>();
		
		//데이터 추가
		map.put("name", "adam");
		//데이터 가져오기
		System.out.println(map.get("name"));
		//중복된 키를 이용한 데이터 삽입
		map.put("name", "군");
		System.out.println(map.get("name"));
		//없는 키를 이용해서 가져왔을 때 - 자바는 null
		System.out.println(map.get("num"));
		
		//Value를 Object로 설정했을 떄 사용
		//Value를 삽입할 때 String이지만
		//Map을 만들 대  Value의 Type을 Object로 설정했기 떄문에
		//get을 해서 데이털를 원상복구하고자 하면 강제 형 변환을 해야한다.
		String value = (String)map.get("name");
		
		//모든 키를 가져오는것
		Set <String> keys = map.keySet();
		System.out.println(keys);
		
	}

}
