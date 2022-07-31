package chap07;

//int형 집합 
//7/31 까지 공부
public class IntSet {

	private int max;//집합의 최대 개수
	private int num;//집합의 요소 개수
	private int[] set;//집합 본체
	
	//생성자
	public IntSet(int capacity) {
		num =0;
		max = capacity;
		try {
			set =new int[max];
		}
		catch(OutOfMemoryError e) {
			max =0;
		}
	}
	//집합의 최대 개수
	public int capacity() {
		return max;
	}
	// 집합의 요소 개수
	public int size() {
		return num;
	}
	//집합에서 n을 겁색한다.
	public int indexOf(int n) {
		for(int i =0; i <num; i++)
			if(set[i] == n)
				return i;
		return -1;
	}
	
	//집합에 n이 있는지 없는지 확인
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true: false;
	}
	
	//집합에 n을 추가
	public boolean add(int n) {
		if(num > max || contains(n) == true) // 꽉 찼거나 n이 존재함
			return false;
		else {
			set[num++] =n;//가장 마지막 자리에 추가
			return true;
		}
	}
	
	//집합에서 n을 삭제
	public boolean remove(int n) {
		int idx; //n이 저장된 요소의 인덱스
		
		if(num <= 0 || (idx = indexOf(n)) == -1) //비어있거나 n이 존재하지 않음
			return false;
		else {
			set[idx] = set[--num]; //마지막 요소를 삭제한 곳으로 옮긴다.
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
