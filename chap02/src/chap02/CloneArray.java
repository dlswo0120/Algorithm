package chap02;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int [] b = a.clone();
		
		b[3] =0;
		System.out.print("a =");
		for(int i =0; i < a.length; i++)
			System.out.print(" " + a[i]);
		
		System.out.print("\nkb =");
		for(int i =0; i< b.length; i++)
			System.out.print(" " + b[i]);
	}

}
