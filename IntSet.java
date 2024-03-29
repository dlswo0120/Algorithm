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
	
	//집합 s에 복사한다.
	public void copyTo(IntSet s) {
		int n = (s.max < num) ? s.max : num;
		for(int i=0; i < n; i++)
			s.set[i] = set[i];
		s.num =n;
	}
	
	//집합 s를 복사한다.
	public void copyFrom(IntSet s) {
		int n =(max < s.num) ? max : s.num;
		for(int i =0; i < n; i++)
			set[i] = s.set[i];
		num = n;
	}
	//집합 s와 같은지 확인한다.
	public boolean equalTo(IntSet s) {
		if(num != s.num)
			return false;
		
		for(int i =0; i < num; i++) {
			int j =0;
			for(; j <s.num; j++)
				if(set[i] == s.set[j])
					break;
			if(j == s.num)
				return false;
		}
		return true;
	}
	
	//집합 s1과 s2의 합집합을 복사한다.
	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1);
		for(int i =0; i < s2.num; i++)
			add(s2.set[i]);
	}
	//{"a,b,c"}형식의 문자열로 표현을 바꾼다.
	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for(int i =0; i < num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
	
	//공집합인지 확인한다.
	public boolean isEmpty(IntSet s) {
		if(s.num == 0 ) //집합 s가 비어있다면 공집합
			return true; 
		else//비어있지 않다면 false를 반환
			return false;
	}
	//집합이 가득 찼는지 확인한다.
	public boolean isFull(IntSet s) {
		if(s.num == max || s.num > max) //가득 찼으면 true를 반환
			return true;
		else  //가득 차지 않았으면 false를 반환
			return false;
	}
	//집합을 초기화 한다.(모든 요소를 삭제)
	public void clear() {
		for(int i = num; i >=0; i--)
			set[i-1] = set[i];
	}
	

}
