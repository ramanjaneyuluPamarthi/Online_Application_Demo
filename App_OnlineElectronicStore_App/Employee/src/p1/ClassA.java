package p1;


import java.util.Iterator;
import java.util.PriorityQueue;

public class ClassA
{
	void meth1()
	{
		System.out.println("implementing priorityQueue");
		PriorityQueue<Object>pq=new PriorityQueue<Object>();
		pq.add(10);
		pq.add(40);
		pq.add(21);
		pq.add(10);
		pq.add(67);
		pq.add(1);
		pq.add(true);
		pq.add(99);
		System.out.println(pq);
		System.out.println("poll():"+pq.poll());
		System.out.println(pq);
		System.out.println("remove:"+pq. remove());
		 pq.clear();
		System.out.println("poll():"+pq.poll());
		System.out.println("remove():"+pq.remove());
		System.out.println(pq);
		System.out.println("peek():"+pq.peek());
		System.out.println(pq);
		Iterator<Object>i=pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args)		
		{
			ClassA aobj=new ClassA();
			aobj.meth1();
		}
         
		
	

}
