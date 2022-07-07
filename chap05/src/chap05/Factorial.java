package chap05;
import java.util.Scanner;

//170 연습문제 포함
public class Factorial {
	//실습 5-1
	static int factorial(int n) {
		if(n >0)
			return n * factorial(n-1);
		else
			return 1;
	}
	//연습문제 풀이
	static int newfact(int n) {
		int result = n;
		for(int i=n; i >1;i--)
			result *= i-1;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + newfact(x) + "입니다.");
	}

}
