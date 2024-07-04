package coom.demo;

public class CircularQueue {

	private int arr[];

	private int rear;
	private int front;
	private int size;

	public CircularQueue(int size) {
		super();
		this.size = size;
		this.arr = new int[size];
		this.rear = -1;
		this.front = -1;

	}

	void enqueue(int val) {
		if (front == 0 && rear == size - 1 || rear == (front - 1) % (size - 1))
			System.out.println("Queue is full");
		else if (front == -1)
			front = rear = 0;
		else if (front != 0 && rear == size - 1)
			rear = 0;
		else
			rear++;

		arr[rear] = val;

	}

	void dequeue() {
		if (front == -1)
			System.out.println("Queue is Empty");
		else if (front == rear)
			front = rear = -1;
		else if (front == size - 1)
			front = 0;
		else
			front++;

	}

	void print() {
		
		
		while(front!=rear)
		{
			System.out.println(arr[front]);
			if(front!=rear)
				front++;
			else
				front=0;
		}
		System.out.println(arr[front]);
	}

}
