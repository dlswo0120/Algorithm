package chap05;
import java.util.Scanner;

//recur 메소드
public class Recur {

	static void recur(int n) {
		if( n> 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}	
	}
	
	static void recur2(int n) {
		if(n > 0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print ("정수를 입력하세요 : ");
		int x =stdIn.nextInt();
		
		recur2(x);
	}

}
