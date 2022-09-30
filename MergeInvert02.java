package test;

//분할 정복(합병정렬)을 사용하여 도치들의 수를 구하는 프로그램
public class MergeInvert02 {
	
	// 분할함수 MergeSort
	public static int MergeSort(int A[], int low, int high) {
		int cnt = 0,cnt2 = 0,cnt3 = 0;
	    //low값이 high값보다 작다면 아래 코드를 실행한다. 
		if(low < high) {
			int mid = (low + high) / 2; 
			cnt = MergeSort(A, low, mid);   //왼쪽 배열 분할
			cnt2 = MergeSort(A, mid+1, high); //오른쪽 배열 분할
			cnt3 = Merge(A, low, mid, high); //Merge함수 호출
		}
		return (cnt + cnt2 + cnt3);
	}
	
	 //병합함수 Merge
	public static int Merge(int A[], int low, int mid, int high) {
		int[] B =  new int[high+1]; //새 배열 B
		int i = low;      //왼쪽 배열의 처음 인덱스
		int j = mid + 1; //오른쪽 배열의 처음 인덱스
		int h = low;    //B배열의 처음 인덱스
		int count = 0;
		while(i <= mid && j <= high) {
		
			if(A[i] >= A[j]) { // 왼쪽 배열의 첫번째 값이 오른쪽 배열보다 더 클 때
				B[h] = A[j];//B배열에  A[j]값을 삽입한다.
				j++;		//오른쪽 배열의 인덱스를 1 증가시킨다.
				count += (mid - i + 1);
			}
			else {// 오른쪽 배열의 첫번째 값이 왼쪽보다 더 클 때		
				B[h] = A[i];//B배열에  A[i]값을 삽입한다.
				i++;	//왼쪽 배열의 인덱스를 1 증가시킨다.
			}	
			h++;  //B배열의 인덱스를 1 증가 시킨다.
		}

		if(i > mid) { // 왼쪽 배열의 모든 원소가 B배열에 저장되었다면
			for(int k = j; k <=high; k++) {	//오른쪽 배열의 나머지 원소들을 B배열에 넣는다.
				B[h] = A[k];
				h++;		
			}		
		
		}
		else {   //오른쪽 배열의 모든 원소가 B배열에 저장되었다면
			for(int k = i; k <=mid; k++) {//왼쪽 배열의 나머지 원소들을 B배열에 넣는다.
				B[h] = A[k];
				h++;			
			}				
		}
	
		//정렬을 마친 B배열을 다시 A배열에 복사한다.
		for(int k = low; k <= high; k++)
			A[k] = B[k];
		//배열 출력
		System.out.print("정렬된 배열 : ");
		for(int k = low; k <= high; k++) {
			System.out.print(" "+ A[k]);
		}
		System.out.println();
		return count;
	}
	
	public static void main(String[] args) {
		int[] A = {82, 35, 27, 96, 73, 14, 58, 49};
		int n = A.length;
		
		System.out.println("총 도치들의 수: " + MergeSort(A, 0, n-1)); 
	}

}
