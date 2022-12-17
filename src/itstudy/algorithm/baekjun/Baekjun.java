package itstudy.algorithm.baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a = sc.nextInt();
		
		for(int i = 0; i < a; i ++) {
			b = sc.nextInt();
			String arr[] = new String[b];
			for (int j = 0; j < b; j++) {
				arr[j] = sc.nextLine();
			}System.out.println(Arrays.toString(arr));
		}
	}
}