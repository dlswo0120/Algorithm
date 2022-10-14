//빠른 정렬 프로그램
public class QuickSort {

    public static void quickSort(int A[], int low, int high){
        if(low < high){
           int  s = partition(A, low, high);
            quickSort(A, low, s-1);
            quickSort(A, s+1, high);
        }
        for(int k = low; k < high+1; k++)
            System.out.print(A[k]+ " ");
        System.out.println();
    }
    public static void swap(int[] temp,int a, int b){
        int tmp = temp[a];
        temp[a] = temp[b];
        temp[b] = tmp;
    }

    public static int partition(int[] A, int low, int high){

        int i = low+1;
        int j = high;

        while(i <= j){
            if(A[i] <= A[low]) i = i +1;
            else if(A[j] > A[low]) j = j-1;
            else{ // A[i] > p && A[j] <= p
                swap(A, i, j);
                i = i+1;
                j = j-1;
            }
        }
        swap(A, low,j);
       // for(int k = low; k < high+1; k++)
       //     System.out.print(A[k]);
      //  System.out.println();
        return j;
    }

    public static void main(String[] args) {
        int A[] = {43, 51, 76, 10, 73, 82, 36, 98};
        int size = A.length;
        quickSort(A, 0, size -1);
    }
}
