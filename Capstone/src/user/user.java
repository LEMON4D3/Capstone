package user;

import java.util.LinkedList;

import lib.lib;

public class user {

	public static LinkedList<lib.item> item = new LinkedList<lib.item>();
	
	public static String name = "Ryan", date, orderNo;
	
	public static double totalCost, userCash;
	
	public static void add(lib.item items) {
		
		item.add(items);
		
	}
	
	 
	
}
