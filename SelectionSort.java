package chap06;
import java.util.Scanner;

//선택 정렬 코드 만들기
public class SelectionSort {
	//swap 함수
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i < n-1; i++) {
			int min = i; //정렬되지 않은 부분에서 가장 작은 요소의 인덱스값 저장
			for(int j = i+1; j <n; j++)
				if(a[j] < a[min])
					min = j;
			swap(a, i, min); //정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
		}
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
		
		selectionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i < nx; i++)
			System.out.println("x[" + i + "]= "+x[i]);
	}

}
