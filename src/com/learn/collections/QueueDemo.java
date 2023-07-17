package com.learn.collections;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) { //FIFO
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(20);
		q.add(30);
		q.add(10);
		q.add(40);
		q.add(70);
		q.add(90);
		q.add(300);
		
		//peek & poll
		System.out.println(q.peek());//head element 
		
	}
}
