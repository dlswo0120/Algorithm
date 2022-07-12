package chap06;
import java.util.Scanner;

//퀵 정렬 코드 구현
public class QuickSort1 {

	//배열요소 idx1과 idx2의 요솟값을 바꾸는 스왑 함수
	static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
	//퀵 정렬 함수에서 배열을 나누는 과정을 출력함.
	static void quickSort(int[] a, int left, int right) {
			int pl = left;
			int pr = right;
			int x = a[(pl + pr) /2];
			
			//배열을 나누는 과정 출력
			System.out.printf("a[%d]~a[%d] : {", left,right);
			for(int i=left; i <right;i++)
				System.out.printf("%d , ",a[i]);
			System.out.printf("%d}\n",a[right]);
			
			do {
				while(a[pl] < x)pl++;
				while(a[pr] > x)pr--;
				if(pl <= pr)
					swap(a, pl++,pr--);
			}while(pl <= pr);
			
			if(left < pr) quickSort(a,left, pr);
			if(pl < right) quickSort(a,pl,right);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("퀵 정렬.");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i+"] : ");
			x[i] = stdIn.nextInt();
		}
		quickSort(x, 0, nx-1);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i <nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}

}
