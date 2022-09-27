package test;

import java.util.Scanner;
//n개의 정수들의 배열에서 최솟값을 찾는 Brute Force 기법
public class FindMinimum {
	//배열의 최솟값을 찾는 함수
	public static int FindMin(int n[]) {
		//최솟값을 찾기위해 변수 min에 배열 0번째 값을 넣는다. 
		int min =n[0];
		//배열의 크기만큼 증가하면서 최솟값을 찾는다.
		for(int i = 1; i<n.length; i++)
			if(min > n[i])
				min = n[i];
		return min; //최솟값 반환
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//숫자를 입력받아 숫자의 크기만큼 배열을 생성한다.
		System.out.println("숫자 입력: ");
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		//배열에 값을 입력한다.
		for(int i = 0; i <n; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = stdIn.nextInt();
		}
		//FindMin()함수를 호출한 값을 출력한다.
		System.out.println("최솟값은 " + FindMin(arr) + "입니다.");
	}
	
}
