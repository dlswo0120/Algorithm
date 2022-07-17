package chap06;
import java.util.Scanner;

//힙 정렬 구현
public class HeapSort {
	
	
	//배열요소 idx1과 idx2의 요솟값을 바꾸는 스왑 함수
	static void swap(int[] a, int idx1, int idx2) {
				int t = a[idx1];
				a[idx1] = a[idx2];
				a[idx2] = t;
		}
	//a[left] ~ a[right]를 힙으로 만든다.
	static void downHeap(int[] a, int left, int right) {
		int temp =a[left];//루트
		int child; //큰 값을 가지는 노드
		int parent;//부모
		
		for(parent =left; parent <(right + 1) /2; parent =child) {
			int cl =parent *2 +1;
			int cr =cl +1;
			child =(cr <= right && a[cr] > a[cl]) ? cr: cl;
			if(temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	static void heapSort(int[] a, int n) {
		for(int i=(n-1)/2; i>=0; i--)
			downHeap(a, i, n-1);
		for(int i =n-1; i >0; i--) {
			swap(a,0,i);
			downHeap(a,0,i-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("힙 정렬.");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i+"] : ");
			x[i] = stdIn.nextInt();
		}
		heapSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i <nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}

}
