package chap02;
import java.util.Scanner;
//64페이지 연습문제
public class ArrayEqual {
	
	static void swap(int []a, int idx1, int idx2) { //역순을 위한 swap함수
		int p = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = p; 
	}
	
	static void copy(int[] a, int[] b) { //배열 b의 요솟값들을 배열 a에 복사하는 함수
		int [] copyB = b.clone();
		
		for(int i=0;i<copyB.length;i++)
			System.out.print(copyB[i]);
	}
	
	static void rcopy(int []a, int[] b) {
		for(int i=0; i < b.length /2; i++) {
			swap(b,i,b.length -i -1); //배열 b의 요솟값들을 역순으로 바꿈 
		}
		copy(a,b); //역순으로 바뀐 배열값들을 배열 a로 복사
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i=0;i <a.length; i++)
			if(a[i] !=b[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 a의 요솟수: ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for(int i =0; i<na;i++) {
			System.out.print("a["+i+"]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 b의 요솟수: ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for(int i =0; i<nb;i++) {
			System.out.print("b["+i+"]: ");
			b[i] = stdIn.nextInt();
		}
		System.out.println("배열 a와 b는 "+ (equals(a,b) ? "같습니다.":"같지 않습니다."));
		
		System.out.println("배열 a에 b를 복사한 배열 a의 요솟값들은");
		copy(a,b);
		System.out.println();
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사한 값은");
		rcopy(a,b);
	}

}
