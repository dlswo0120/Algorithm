package chap03;
import java.util.Scanner;
//117쪽 연습문제 5번
public class binSearchX {

	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) /2;
			if(a[pc] == key) {  //key값이 a[pc]값하고 같으면 바로 검색 성공
				System.out.println(a[pc]);
				pr = pc ;
				for(int k =0; k < pr; k++) {
					if(a[k] == a[pc])
						return k;
				}
			}
			//	return pc;
			else if(a[pc] < key)  //key값이 더 큰경우 범위를 뒤쪽 절반으로 좁힘
				pl = pc +1;
			else                 //key값이 더 작은경우 범위를 앞쪽 절반으로 좁힘
				pr = pc -1;
			
		}while(pl <=pr);
		return -1; //검색 실패!
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for(int i =1;i <num; i++) {
			do {
				System.out.print("x["+ i+"]: ");
				x[i]= stdIn.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = binSearchX(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 먼저 참조해 있습니다.");
	}

}
