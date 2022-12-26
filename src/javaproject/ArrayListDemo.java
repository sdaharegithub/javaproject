package javaproject;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("snehal");
		list.add("achal");
		list.add("kiran");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
