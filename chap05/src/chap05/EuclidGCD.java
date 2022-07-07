package chap05;
import java.util.Scanner;

//170 연습문제 포함
public class EuclidGCD {

	static int gcd(int x, int y) {
		if(y ==0)
			return x;
		else
			return gcd(y, x% y);
	}
	
	static int newgcd(int x, int y) {
		int result =x;
		while(y !=0) {
			if((x % y) ==0)
				break;
			else {
				result =x % y; // result = 22 % 8 = 6    result = 8 % 6 =2
				x = y; 
				System.out.print(x + " ");// x = 8     x = 6              
				y =result;    // y = 6     y =2
				System.out.println(y);
			}
	
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : "); int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요 : "); int y = stdIn.nextInt();
		
		System.out.println("최대공약수는 "+newgcd(x,y) + "입니다.");
	}

}
