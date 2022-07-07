package chap02;
import java.util.Scanner;
//61페이지 연습문제 2번, 3번 합침
public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void Reverse(int[] a) { 
		for(int i=0; i < a.length /2 ; i++) {
			System.out.println("a["+i+"]과(와)"+"a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a,i,a.length -i -1);
			for(int k = 0; k <a.length; k++) {
				System.out.print(a[k] + " ");
				
			}
			System.out.println();
		}
	}
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i< a.length; i++) {
			sum +=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i < num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = stdIn.nextInt();
		}
		
		int sum =sumOf(x); //요솟값 의 총 합 구하는 함수호출후 값 대입
		Reverse(x);//요솟값을 역순으로 정렬하는 함수호출
		
		
	//	for(int i=0;i<num;i++) {
			
		//	System.out.print( x[i]+" ");
	//	}
			
			
		System.out.println("역순 정렬을 마쳤습니다.");
		System.out.println("요솟값의 총 합은 " + sum +"입니다.");
	}

}
