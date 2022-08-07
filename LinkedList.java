package chap09;
import java.util.Comparator;

//연결 리스트 클래스 
public class LinkedList<E> {
	
	//노드
	class Node<E> {
		private E data; //데이터
		private Node<E> next; //다음 데이터를 가리키는 포인터
		
		//생성자
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head; //머리 노드
	private Node<E> crnt; //선택 노드
	
	
	//생성자
	public LinkedList() {
		head = crnt = null; //처음 값은 null로 초기화
	}
	
	//노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;
		
		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) { //검색 성공
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;  //다음 노드를 선택
		}
		return null; //검색 실패
	}
	
	//머리에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head;  //삽입 전의 머리 노드
		head = crnt = new Node<E>(obj, ptr);
	}
	
	//꼬리에 노드 삽입
	public void addLast(E obj) {
		if(head == null)   //리스트가 비어있으면
			addFirst(obj);  //머리에 삽입
		else {
			Node<E> ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			//while문을 거치면서 ptr은 꼬리노드를 가리키됨
			ptr.next = crnt = new Node<E>(obj, null); //꼬리노드ptr의 next에 새 노드를 연결 시킨다.
		}
	}
	
	//머리 노드를 삭제
	public void removeFirst() {
		if(head != null) //리스트가 비어있지 않으면
			head = crnt = head.next;
	}
	//꼬리 노드를 삭제
	public void removeLast() {
		if(head != null) {
			if(head.next == null) //노드가 하나만 있으면
				removeFirst();    //머리 노드를 삭제
			else {
				Node<E> ptr = head; //스캔중인 노드
				Node<E> pre = head; //스캔중인 노드의 앞쪽 노드
				
				while(ptr.next != null) {
					pre = ptr;
					ptr = ptr.next; //포인터를 이동
				}
				//while문을 거치면 ptr은 꼬리노드에 위치, pre는 꼬리노드 앞전에 위치하게됨
				pre.next = null; //pre -> ptr에서 pre.next = null을 하여 ptr의 노드를 삭제 시킨다.
				crnt = pre; //현재 포인터는 pre를 가리킨다.
			}
		}
	}
	
	//노드 p를 삭제
	public void remove(Node p) {
		if(head != null) {
			if(p == head)
				removeFirst();
			else {
				Node<E> ptr = head; //스캔중인 노드
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) return; //p가 리스트에 없습니다.
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	
	//선택 노드를 삭제
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	//모든 노드를 삭제
	public void clear() {
		while(head != null) //노드에 아무것도 존재하지 않을 때까지
			removeFirst(); // 머리노드를 삭제
		crnt = null;  //리스트가 비어있게 되므로 선택노드 crnt 값도 null로 업데이트 된다.
	}
	
	//선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if(crnt == null || crnt.next == null)
			return false; //이동할 수 없음
		crnt = crnt.next;
		return true;
	}
	
	//선택 노드를 출력
	public void printCurrentNode() {
		if(crnt == null)
			System.out.println("선택한 노드가 없습니다.");
		else
			System.out.println(crnt.data);
	}
	
	//모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) { //ptr이 꼬리노드의 null값을 만날때 까지 실행
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	

}
