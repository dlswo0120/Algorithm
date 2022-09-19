package test;
import java.util.Scanner;

//빠진 번호 찾기
public class FindNumber {

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("N의 크기를 입력하세요: ");
		
		int N = stdIn.nextInt(); //N의 크기를 임의로 11로 둠
		int[] arr =  new int[N];;//빠진 숫자 자리에 중복숫자가 있는 11크기의 배열
		int[] FindNum = new int[N]; //빠진 숫자를 찾기위한 11크기의 배열
		
		System.out.println("숫자를 입력하세요.");
		//arr배열에 숫자를 입력받는다.
		
		for(int i = 0; i <N; i++) {
			System.out.print("arr["+ i+"]: "); //1, 2, 3, 4, 5, 5, 7, 8, 9, 10, 11
			arr[i] = stdIn.nextInt();
		}
		// FindNum배열의 arr[i]값 - 1 번째에 1을 넣는다.
		for(int i = 0; i < N; i++) {
			FindNum[arr[i]-1] = 1;
		}
		//빠진 숫자가 있으면 인덱스 자리에 공백인 0이 들어가 있다.
		for(int i = 0; i < N; i++) {
		//	System.out.print(FindNum[i]);	
			if(FindNum[i] == 0) {
				System.out.println("빠진 숫자가 존재합니다.");
				System.out.println("빠진 숫자는 "+ (i + 1) +"입니다.");
			}			
		}
	}
		
}
