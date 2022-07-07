package chap01;
import java.util.Scanner;
//40페이지 연습문제
public class TriangleLB {
	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각향을 출력합니다.");
		for(int i =1; i <=n; i++) {
			for(int j =1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =1; i <= n; i++) {
			for(int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
			
		}
		
	}
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =0; i <= n; i++) {	
			for(int j =0; j < i; j++)
				System.out.print(" ");
			for(int j =n; j >= i; j--)
				System.out.print("*");
			System.out.println();

		}
	}
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래 아래가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =0; i <= n; i++) {	
			for(int j =n; j >= i; j--)
				System.out.print(" ");
			for(int j =0; j < i; j++)
				System.out.print("*");
			System.out.println();

		}
	}
	static void spira(int n) {
		System.out.println("피라미드 삼각형을 출력합니다.");
		for(int i =0; i< n; i++) {
			for(int j = 1; j < n-i; j++)
				System.out.print(" ");
			for(int j = 0; j< i*2+1; j++)
				System.out.print(i+1);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n;
		
			
		do {
			System.out.print("몇 단 삼각형 입니까?");
			n = stdIn.nextInt();
		}while(n <=0);
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		spira(n);
	}

}
