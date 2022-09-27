package test;

//배열 내에 있는 도치들의 수를 억지기법으로 구하는 프로그램
public class Invert {
	//중첩 반복문을 이용해 도치들의 수를 구하는 함수
	public static int Inversion(int A[], int n) {
		int count = 0;//도치인 경우 수를 세는 변수
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i < j) {// i의 값이 j보다 작을때
					if(A[i] > A[j]) //A[i] 값이 A[j]값보다 크면 도치
						count++;
				}
			}
		}
		return count;//count 반환
	}
	
	public static void main(String[] args) {
		int[] NUM = {82, 35, 27, 96, 73, 14, 58, 49};
		int result;//결과 값을 입력받는 변수
		result = Inversion(NUM, NUM.length);
		System.out.println("도치들의 수: " + result); 
	}
}
