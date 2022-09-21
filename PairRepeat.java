package test;

import java.util.Scanner;
//토끼 번식 수열 반복문
public class PairRepeat {
	//토끼 쌍을 계산하는 함수
	public static int[] Repeat(int n[]) {		
		//arr[0]과 arr[1]값은 미리 정해준다.
		n[0] = 1;
		n[1] = 2;
		//arr[2]부터 arr[5]까지 식을 이용해 계산한다.
		for(int i = 2; i < 6; i++) {
				n[i] = (2*n[i-1]) + (3*n[i-2]);		
		}	
		return n;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//n값 입력
		System.out.print("n값 입력: ");
		int n = stdIn.nextInt();
		//배열을 선언한다.
		int[] arr = new int[n];
		
		//함수호출과 반환된 배열의 값을 출력한다.
		for(int i = 0; i < n; i++) {
			System.out.print( i + "번쩨 달에 존재하는 토끼수 : " + Repeat(arr)[i] + " 쌍");
			System.out.println();
		}

	}

}
