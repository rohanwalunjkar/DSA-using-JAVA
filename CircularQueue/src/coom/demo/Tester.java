package coom.demo;

public class Tester {

	public static void main(String[] args) {
		
		CircularQueue queue=new CircularQueue(5);
		
		queue.enqueue(12);
		queue.enqueue(34);
		queue.enqueue(35);
		queue.enqueue(67);
		//queue.dequeue();
		
		
		//queue.enqueue(77);
		
		queue.dequeue();
		queue.dequeue();
		
		
		queue.print();
		
		
	}

}
