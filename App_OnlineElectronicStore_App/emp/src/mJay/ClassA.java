package mJay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ClassA {
	void meth1() {
		System.out.println("Implemanting ArrayList");
		  ArrayList<Object>al=new ArrayList<Object>();
		  al.add("java");
		  al.add(101+101);
		  al.add("java is awesome"+ " this is intersting ");
		  al.add('A'+" Automatice ");
		  al.add(1000/10);
		  
		  System.out.println(al);
		  System.out.println("size: "+al.size());
		  System.out.println("Reterivuing the data by using Iteratar Interface ");
		    Iterator<Object> i = al.iterator();
		    while(i.hasNext()) {
		    	System.out.println(i.next()+" ");
		    }
		    System.out.println("\n\n Reteraving the Data by using Listiterator ");
		    
		          ListIterator<Object>li= al.listIterator();
		            while(li.hasNext()) {
		            	System.out.print(li.next()+" ");
		            }
		            System.out.println("\n \n Back word direction \n ");
		            while(li.hasPrevious()) {
		            	System.out.print(li.previous()+ " ");
		            }
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.meth1();
	}

}
