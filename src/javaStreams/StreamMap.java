package javaStreams;

import java.util.ArrayList;
//116.Learn Everything about Java Streams_Part5 
import java.util.Arrays;
import java.util.List;
//116.Learn Everything about Java Streams_Part4
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhilash");
		names.add("Axar");
		names.add("abc");
		names.add("boulder");
		names.add("Adas");
		names.add("bbc");
		names.add("Animal");
		names.add("abc");

		/*
		 * Stream map.map Now will learn about maps . we will declare stream
		 * Stream.of(afadadfa) //lentht great then 4 and convert to uppper case
		 * 
		 * //last letter a .convert to upper case. --will use map.
		 * 
		 * stream.of(----).filter(s-> s.ends with ("a)).map (s -> s.Uppercase()).for
		 * each (s->sysout(s)
		 * 
		 * Modification means map
		 * 
		 */
		Stream.of("Rama", "def", "India", "Ghanika", "Hamsika").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("###########");

		/*
		 * Terminal opertions Limit Count Sort.
		 * 
		 * List<String> names = Arrays.aslist("abd"---"afads") names.stream().filter(s
		 * -> startswith("a).sorted().map(s->s.touppercase()).foreach(s -> sysout(s);
		 * Run the progream. case sensitive.
		 * 
		 */

		List<String> names1 = Arrays.asList("Abhilash", "Taylor", "Asin", "Arnold", "Aasha");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("###########");

		/*
		 * Merge all elements in list a and b and printing it .
		 * 
		 * and then sort.
		 * 
		 * names and names1 list. Stream<string> newstream =
		 * stream.concat(names.stream,names1.stream) newStream.sorted.foreach(s-> print)
		 * Run the code. Filter , Map and Match .
		 * 
		 */
		Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
		//newstream.sorted().forEach(s -> System.out.println(s));
		System.out.println("###Match#######");
		/*
		 * Match
		 *  boolean flag = newStream .anymatch ( s-> s.equalignorecase("adam");
		 * assert.asserttrue(flag);
		 * 
		 * run . giver some wrong value.
		 * 
		 * Next is collect
		 * 
		 */
		boolean flag = newstream.anyMatch(s -> s.equalsIgnoreCase("A33sin"));
		Assert.assertTrue(flag);
		

	}

}
