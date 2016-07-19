package com.niit.shoppingcart;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListModelEx {

	public static void main(String[] args) {

		LinkedList<Empl> list = new LinkedList<Empl>();
		list.add(new Empl("tim", 3000));
		list.add(new Empl("tam", 4000));
		list.add(new Empl("him", 5000));
		list.add(new Empl("tiu", 6000));
		Collections.sort(list, new MySalaryComp());
		System.out.println("");
		for (Empl e : list) {
			System.out.println(e);
		}
	}

}
class MySalaryComp implements Comparator<Empl>
{
	public int compare(Empl e1,Empl e2)
	{
		if(e1.getSalary()<e2.getSalary())
		{
			return 1;
		}
		else{
			return-1;
			
		}
		
		
		
				}
	}
