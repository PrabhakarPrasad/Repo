package DemoForGit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Demo1 {
	public static void ArreyList() {
		//good for search
		System.out.println("ArreyList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(1);
		al.add(5);
		al.add(7);
		al.add(6);
		System.out.println("old list=" + al);
		Collections.sort(al);
		System.out.println("After sort" + " "+al);
		int a=Collections.max(al);
		System.out.println("highest number in List is" +" " + a);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(12);
		al2.add(2);
		al2.add(4);
		al.addAll(al2);
		System.out.println("after merge=" + al);
		Collections.sort(al);

		// using iterator
		System.out.println("After sort=" + al);
		System.out.println(al.size());
		System.out.println(al.get(2));

	}

	public static void LinkedList() {
		//good for remove and insert
		System.out.println("Linkedlist");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Sachin");
		ll.add("Brian");
		ll.add( "Yuraj");
		ll.add( "Dhoni");
		ll.add( "Dhoni");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Before LinkedList =" + ll);
		
		for(int i=ll.size()-1;i>=0;i--){
			
			for(int j=i-1;j>=0;j--)
			if(ll.get(i)==ll.get(j)){
				System.out.println("The duplicate is"+ " " +ll.get(j));
			}
		}
		
	}

	public static void Vector() {
		//it is synchronized and does not support multithreading
		System.out.println("Vector");
		Vector<Object> vec = new Vector<Object>();
		vec.addElement(2);
		vec.addElement('*');
		vec.add(2, "prabhakar");
		vec.set(0, 3);
		System.out.println(vec.capacity());
		System.out.println(vec.size());
		System.out.println(vec);
		Iterator<Object> it = vec.iterator();
		System.out.println(it.hasNext());

	}

	public static void stack() {
		//it inherit vector class
		System.out.println("stack");
		Vector<Object> vec = new Vector<Object>();
		Stack<Object> st = new Stack<Object>();
		st.push("prabhakar");
		st.push("poonam");
		st.pop();// remove item from top of the stack
		st.peek();// look at the item without removing
		Iterator<Object> it = st.iterator();
		System.out.println(it.hasNext());
		
	}

	public static void main(String[] args) {
		ArreyList();
		//LinkedList();
		//Vector();
		//stack();
		
	}


}
