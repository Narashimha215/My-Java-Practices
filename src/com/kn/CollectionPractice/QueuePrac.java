package com.kn.CollectionPractice;

import java.util.*;

public class QueuePrac {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<>();
		p.offer("Narashimha");
		p.add("Siva");
		p.offer("Ganesh");
		p.add("Sidhu");
		System.out.println(p);
	//	while(!p.isEmpty())
		//	System.out.println(p.poll());
	//	p.clear();
	//	p.poll();  //Delete first value
		System.out.println(p.peek());  //Display first value
		System.out.println(p.remove());  //Delete first value
		System.out.println(p);
		
	//	Queue<String> ad = new ArrayDeque<>();
		//Addition - offer, add
		//Retrieval - peek
		//Removal - poll, remove
		
		LinkedList<String> l = new LinkedList<>();
		l.add("Banana");
		l.addFirst("Cherry");
		l.addLast("Apple");
		l.offer("Pear");
		l.offerFirst("Kiwi");
		l.offerLast("Mango");
//		[Kiwi, Cherry, Banana, Apple, Pear, Mango]
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.pollFirst());
		System.out.println(l);
		System.out.println(l.pollLast());
		System.out.println(l);
		System.out.println(l.size());
		//Addition - offer, add,addFirst,addLast,offerFirst,offerLast
	}
}
/*Queue :PriorityQueue vs ArrayList vs LinkedList
 * default capacity= 11(PQ),17(AQ),LL(0)
 * Initial capacity = 11(PQ),17(AQ),LL(0)
 * Does it allow duplicate elements = Yes(PQ),Yes(AQ),Yes(LL)
 * Does it allow null values = No(PQ),No(AQ),Yes(LL)
 * Does it Maintain the insertion order = Yes(PQ),No(AQ),Yes(LL)
 * Does it Maintain the sorted order = No(PQ),No(AQ),No(LL)
 * Does it offer the random access of elements = No(PQ),No(AQ),Yes(LL)
 * Is it synchronised = No(PQ),No(AQ),No(LL)
 * What is it good at = 
 */