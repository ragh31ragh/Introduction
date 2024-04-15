package javaStreams;
//116.Learn Everything about Java Streams_Part1

import java.util.ArrayList;

public class NamesStartswithA_Basic {

	public static void main(String[] args) {
		/*
		 * //Count the number of names starting with alphabet A in list
		 * 
		 * create a JavaStreams package test class
		 * 
		 * ArrayList<String> names = new ArrayList<String>(); names.add("aba") add 5-6
		 * names. use for loop { names.get(i) String.acual = names.get(i); if (actual
		 * .starts with ("A) { count ++
		 * 
		 * 
		 */
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("abc");
		names.add("bbc");
		names.add("abc");
		names.add("bbc");
		names.add("abc");
		names.add("bbc");
		names.add("abc");
		int count = 0 ;
		for (int i=0;i < names.size();i++) {
			String actual = names.get(i);
			if (actual.startsWith("a")) {
				count = count + 1 ;
			}
		}
		
		System.out.print(count );
		
	}

}
