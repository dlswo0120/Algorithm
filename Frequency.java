package test;

import java.util.Scanner;

//숫자 내에 반복되는 특정 숫자 찾기
public class Frequency {
	//입력받은 양의 정수내에 특정숫자의 갯수를 구하는 재귀함수 
	public static int FrequencyOfNum(int n, int key) {
		//n이 10보다 작을 때
		if(n < 10) {
			if(n == key) //n이 key값과 같으면 1을 반환한다.
				return 1;
			else return 0;//같지 않으면 0을 반환한다.
		}
		else {
			if((n % 10) == key)// n % 10 값이 key값과 같으면 FrequencyOfNum를 재귀호출하면서 + 1을 반환한다.
				return FrequencyOfNum( (n / 10) , key) +1;
			else//같지 않으면 FrequencyOfNum을 재귀호출한다.
				return FrequencyOfNum( (n / 10), key);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int result ;//결과값을 입력받는 변수
		//숫자를 입력받는다.
		System.out.print("숫자 입력: ");
		int n = stdIn.nextInt();
		//찾으려는 숫자를 입력받는다.
		System.out.print("찾으려는 숫자 입력: ");
		int key = stdIn.nextInt();
		//FrequencyOfNum함수를 호출하여 결과값을 받는다.
		result = FrequencyOfNum(n, key);
		//결과 값을 출력한다.
		System.out.println(key + "는 총 " + result + "개 있습니다.");

	}

}
