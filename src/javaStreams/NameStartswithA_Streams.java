package javaStreams;

//116.Learn Everything about Java Streams_Part2 and 3 
import java.util.ArrayList;
import java.util.stream.Stream;

public class NameStartswithA_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("abhilash");
		names.add("bbc");
		names.add("abc");
		names.add("boulder");
		names.add("abc");
		names.add("bbc");
		names.add("animal");
		names.add("abc");
		// Long c = names.stream().filter(s -> s.startsWith("A).count()
		//long c = names.stream().filter(s -> s.startsWith("a")).count();
		long c =names.stream().filter(s -> s.startsWith("a")).count();
		System.out.println("Streams example");
		System.out.println(c);

		// another way to create stream
		/*
		 * Stream.of ( "abc","edr","eafd","afc") java.util.stream
		 * 
		 * Stream.of ( "abc","edr","eafd","afc").filter(s-> s.startswith("a").count()
		 * 
		 * long d = Stream.of ( "abc","edr","eafd","afc").filter(s-> { s.startswith("a")
		 * return false }.count ();
		 * 
		 * 
		 */

		// long d = Stream.of("abc","def","ghi","lmn").filter(s ->
		// s.startsWith("a")).count();

		long d = Stream.of("abc", "def", "ghi", "lmn").filter(s -> {
			s.startsWith("a");
			return false;
		}).count();
		System.out.println("d");
		System.out.println(d);
		/*
		 * //print names length great then 4 names.stream().filter ( s -> s,lenght()>4
		 * ).foreach(s - system print (s));
		 * 
		 * 
		 */
		names.stream().filter(s -> s.length() > 4 ).forEach(s -> System.out.println(s));

	}

}
