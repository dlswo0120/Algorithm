package chap06;
import java.util.Scanner;

//셸 정렬(버전 2)
public class ShellSort2 {

	static void shellSort2(int[] a, int n) {
		int count=0;
		int h;
		for(h =1; h< n/9; h = h*3 + 1);
		
		for(; h >0; h/=3)
			for(int i=h; i <n; i++) {
				int j;
				int tmp =a[i];
				for(j =i-h; j >=0 &&a[j] >tmp; j -=h) {
					a[j+h] = a[j];
					count++;
					System.out.println("이동한 횟수 =" + count);
				}
					//a[j+h] = a[j];
				a[j+h] =tmp;
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("셸 정렬(버전1)");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		shellSort2(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		
	}

}
