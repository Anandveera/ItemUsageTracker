package org.item.list;

public class TestLUList {

	public static void main(String[] args) {
		
		LUList<String> list = new LUList<String>();
		
		//operations
		list.put("a");
		list.put("b");
		list.put("c");
		list.get(0);
		list.get(1);
		list.get(2);
		list.put("a");
		list.get(1);
		list.get(2);
		list.get(0);
		list.put("d");
		list.get(0);
		list.get(3);
		list.put("e");
		list.get(4);
		list.get(2);
		list.get(1);
		
		System.out.println(" Recently used list : "+list.getRecentlyUsedList());
		System.out.println(" UnUsed list : "+list.getUnUsedList());
		System.out.println(" Item list : "+list.getList());
		
		
	}

}
