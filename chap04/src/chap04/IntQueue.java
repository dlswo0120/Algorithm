package chap04;
import java.util.Scanner;

//int형 큐 구현
//158페이지 실습하고 합쳤음.
public class IntQueue {

	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueExeption extends RuntimeException{
		public EmptyIntQueueExeption() {}
		}
	 
	public class OverflowQueueException extends RuntimeException{
		public OverflowQueueException() {}
	}
	
	public int enque(int x) throws OverflowQueueException{
		if(num >= max) 
			throw new OverflowQueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	public int deque() throws EmptyIntQueueExeption{
		if(num <= 0)
			throw new EmptyIntQueueExeption();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	public int peek() throws EmptyIntQueueExeption{
		if(num <= 0)
			throw new EmptyIntQueueExeption();
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i <num;i++) {
			int idx = (i + front) % max;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <=0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i = 0; i <num; i++)
				System.out.println(que[(i + front) % max] + " ");
			System.out.println();//
		}
	}
	
	public IntQueue(int capacity) {
		num = front = rear= 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.print("1.인큐 2.디큐 3.피크 "+ "4.덤프 0.종료: ");
			
			int menu = stdIn.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x =stdIn.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				}catch(IntQueue.EmptyIntQueueExeption e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");	
				}catch(IntQueue.EmptyIntQueueExeption e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}

}
