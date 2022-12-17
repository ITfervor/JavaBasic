package itstudy.algorithm.baekjun;

import java.util.Scanner;

public class Baekjun8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int put;

		put = sc.nextInt();
		String arr[] = new String[put];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}

		for (int q = 0; q < arr.length; q++) {
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			String str = arr[q];
			String[] var = str.split("");
			for (int i = 0; i < var.length; i++) {
				if (var[i] == "O") {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}

	}
}
