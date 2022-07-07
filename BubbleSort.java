package chap06;
import java.util.Scanner;
//버블 정렬 코드 작성

public class BubbleSort {
	//swap 함수
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//버블 정렬 (처음 맨 오른쪽 부터 크기 비교)
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i< n-1; i++)
			for(int j = n-1; j >i; j--)
				if(a[j-1] > a[j])
					swap(a, j-1, j);
	}
	//버블 정렬 (처음 맨 왼쪽 부터 크기 비교)
	static void bubbleSortPR(int[] a, int n) {
		for(int i = 0; i <n-1; i++)
			for(int k = 0; k < n-1;k++)
				if(a[k] > a[k+1])
					swap(a, k+1, k);
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i <nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSortPR(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i < nx; i++)
			System.out.println("x[" + i + "]= "+x[i]);
	}

}
