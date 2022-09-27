package test;

import java.util.Scanner;
//분할정복을 이용한 최솟값 찾기
public class DivideConquer {
	//분할 정복을 이용해 최솟값을 찾는 함수
	public static int Division(int n[] ,int i,int j, int min) { // 배열, 0, n-1, min
		
		if( i == j)  min = n[i]; //1개일때
		else if(i == (j-1)) {     //2개일때
			if(n[i] > n[j])
				min = n[j];
			else
				min = n[i];
		}
		else {
			int mid = (i + j) /2; //mid 는 중간 값을 가리킴
			//int min1 = n[i];
			//int min2 = n[mid + 1];
			int min1 = Division(n, i, mid, min); //반을 나눈 왼쪽 배열
			int min2 = Division(n, mid+1, j, min);//반을 나눈 오른쪽 배열
			if(min1 < min2)
				min = min1;
			else
				min = min2;
		}
		return min;
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
		System.out.println("최솟값은 " + Division(arr, 0, n-1, arr[0]) + "입니다.");
	}
}
