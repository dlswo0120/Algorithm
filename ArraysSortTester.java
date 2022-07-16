package chap06;
import java.util.Arrays;
import java.util.Scanner;

//자바 arrays메소드 사용하여 정렬(퀵 정렬)
public class ArraysSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x =new int[num];
		
		for(int i=0; i <num; i++) {
			System.out.print("x[" +i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		Arrays.sort(x); //배열 x를 정렬한다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0 ; i< num; i++)
			System.out.println("x[" + i + "]= "+x[i]);
	}

}
