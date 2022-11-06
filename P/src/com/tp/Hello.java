package com.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Hello {

//Types of cursor in java
//1. Enumerator
//2. Iterator
//3. ListIterator

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);

		System.out.println("This is vector : " + v);

//1. Enumeration can only perform to read the elements and it can only be applied on the legacy classes

		Enumeration<Integer> e = v.elements();

		while (e.hasMoreElements()) {

			Integer i = e.nextElement();

			System.out.println(i);
		}

System.out.println("+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+");



//2. Iterator: - can perform read and remove operation at desired elements but addition and replace cannot done in iterator



		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		ArrayList<Integer> arrayList = new ArrayList<Integer>(list);

		Iterator<Integer> itr = arrayList.iterator();

		while (itr.hasNext()) {

			int i = itr.next();

			if (i % 2 == 0) {
				System.out.println("The even numbers in list are : " + i);
			} else {

				itr.remove();
			}
		}

		System.out.println("At the last the final arrayList is : " + arrayList);

		
System.out.println("+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+");


//3. ListIterator: - can perform read, remove, add and replace operation in forward as well as backw


		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(list2);

		ListIterator<Integer> listIterator = arrayList2.listIterator();

		while (listIterator.hasNext()) {

			int i = listIterator.next();

			if (i % 2 != 0) {

				listIterator.remove();
			}
		}
		System.out.println(arrayList2);

System.out.println("+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+");

		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6);

		ArrayList<Integer> arrayList3 = new ArrayList<Integer>(list3);

		ListIterator<Integer> listIterator2 = arrayList3.listIterator(arrayList3.size());

		while (listIterator2.hasPrevious()) {

			System.out.print(listIterator2.previous() +" ");
		}
	}
}
