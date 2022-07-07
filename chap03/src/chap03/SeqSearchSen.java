package chap03;
import java.util.Scanner;
//선형검색 (보초법)
//115페이지 연습문제로 코드 바뀜
public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
			
		a[n] = key;	
		
		for(int i = 0; i <n; i++) {
			if(a[i] == key) {
				if(i != n)
					return i;
				
			}				
		}
	     return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		for(int i =0;i <num; i++) {
			System.out.print("x["+ i+"]: ");
			x[i]= stdIn.nextInt();
		}
		
		System.out.print("검색할 값");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
	
	}

}
