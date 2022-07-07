package chap01;
import java.util.Scanner;
//38페지이 퀴즈 14번
public class Multi99Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단수 : ");
		int num = stdIn.nextInt();
		
		for(int i=1; i <=num; i++) {
			for(int j=1; j <=num; j++)
				System.out.printf(" * ");
				System.out.println();
		}
	}

}
