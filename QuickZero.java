package test;

//0을 기준으로 배열의 원소 중 음수는 왼쪽, 0 포함 양수는 오른쪽으로 이동시키는 프로그램 
public class QuickZero {
	/*//quicksort함수
		 public static int[] quickSort(int A[], int low, int high){
		        if(low < high){
		           int  s = partition(A, low, high); //기준요소 A[low]를 기준으로 분할
		            quickSort(A, low, s-1); //왼쪽 배열을 정렬
		            quickSort(A, s+1, high);//오른쪽 배열을 정렬
		        }
		       return A; //정렬된 배열 반환
		 }
		  */
		 //스왑 함수
		 public static void swap(int[] temp,int a, int b){
		        int tmp = temp[a];
		        temp[a] = temp[b];
		        temp[b] = tmp;
		 }
		
		 //빠른 정렬 함수
		 public static int[] partition(int[] A, int low, int high){

		        int i = low+1; 
		        int j = high;

		        while(i <= j){
		            if(A[i] <= 0) i = i +1; //A[i]가 0보다 작으면 i + 1
		            else if(A[j] > 0) j = j-1;//A[j]가 0보다 크면 j - 1
		            else{ // A[i] > 0 && A[j] <= 0 이면 아래코드를 실행한다.
		            	  System.out.println(i + "번째와 "+ j+ "번쨰의 값을 바꾼다.");
		                swap(A, i, j); //i번째와 j번째의 값을 바꿔준다.
		                // 값이 바뀔때 배열을 출력한다.          
		                for(int h = 0; h < high+1; h++) 
		                	System.out.print(A[h] + " ");   
		                System.out.println();
		                i = i+1; //i <-> j 후에 i + 1
		                j = j-1; //i <-> j 후에 j - 1
		                
		            }
		        }
		        return A; //j 반환
	 }
		public static void main(String[] args) {
		      int A[] = {-2, 1, 4, 0, -3, -4, 5, 6};
		        int size = A.length; //배열 A의 크기
		        int result[] = partition(A, 0, size -1); //정렬된 함수를 저장할 result배열
		        System.out.println("배열"); 
		        for(int i = 0; i< size;i++){ //배열 출력
		        	System.out.print(result[i] + " ");
		        }
		        System.out.println();
		}

}
