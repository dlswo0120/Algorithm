package test;

import java.util.Scanner;
//토끼 번식 수열 재귀호출
public class Pair {
	//토끼 쌍을 구하는 재귀함수
	public static int Pair(int n) {
		//0번째 달에는 1쌍만이 존재
		if(n == 0 ) return 1;
		//첫 번째 달에는 2쌍이 존재
		else if(n == 1) return 2;
		//두 번째 달부터는 재귀호출을 통해 값을 계산한다.
		else {
			return (3* Pair(n-2)) + (2*Pair(n-1));
		}	
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//값을 입력 받는다.
		System.out.print("값을 입력: ");
		int n = stdIn.nextInt();
		//Pair함수를 호출하여 나온 값을 출력한다.
		System.out.println( n +"번쩨 달에 존재하는 토끼수 : "+ Pair(n) + " 쌍");
	}
}
