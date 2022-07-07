package chap03;
import java.util.Scanner;
//117페이지 연습문제 3번
public class SearchIdx {
	static int MAX = 100;
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int sum=0;
		int count =0;
		for(int i =0; i<n;i++) {
			if(a[i] == key) {				
				idx[count] = a[i];
				count++;
				if(i == n)
					return -1;
			}	
		}
		for(int i=0; i< idx.length;i++) {
					
			if(idx[i] == 0) {
				break;
			}
			System.out.println("idx["+ i+"]= " +idx[i]);
			sum ++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		int[] p = new int[MAX];
		
		for(int i =0;i <num; i++) {
			System.out.print("x["+ i+"]: ");
			x[i]= stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = searchIdx(x, num, ky, p );
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "와 일치한 요솟수는 " + idx + "개입니다.");
	}

}
