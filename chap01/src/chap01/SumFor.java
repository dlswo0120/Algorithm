package chap01;
import java.util.Scanner;
//33페이지 실습 했음.
public class SumFor {
	static int sumof(int a) {
		int i =0;
		while(a > 0) {
			a /= 10;
			i++;
		}
		return i;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int a;
		System.out.println("양의 정수를 입력하세요.");

		System.out.print("a의 값: ");
		 a = stdIn.nextInt();
	
		
		
		
				
			
		System.out.println( "그 수는" +sumof(a) + "자리입니다.");
	}

}
