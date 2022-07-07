package chap02;
import java.util.Random;
import java.util.Scanner;
//56페이지 연습문제
public class MaxOfArrayRand {
	
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i =0; i< a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람의 수: ");
		int num = 1 + rand.nextInt(6);
		System.out.println(num);
		
		int [] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i =0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height)+"입니다.");
	}

}
