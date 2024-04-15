package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

////116.Learn Everything about Java Streams_LastPart
public class collectMethodStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collect method results into list. use map upper case .collect
		 * 
		 * List<String> ls = stream.of(----).filter(s-> s.ends with ("a)).map (s ->
		 * s.Uppercase()).for each (s->sysout(s).collect(collectors.list)
		 * 
		 * ls.get(0). print this.
		 * 
		 * List<Integer> values= Arrays.asList(3,2,2,7,5,1,9,7) //Print unique numbers
		 * //Sort array.-Give 3rd indes. values.stream().distinct().forEach( s _>
		 * print(s));
		 * 
		 */
		//List<Interger> li2 = values.stream().distinct().sorted.collect(collectors.toList())
		//print(li.get(2)

		//Stream.of("Rama", "def", "India", "Ghanika", "Hamsika").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
			//	.forEach(s -> System.out.println(s));

		List<String> ls = Stream.of("sita","Rama", "def", "India", "Ghanika", "Hamsika").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//Print unique number
		//Sort array.-Give 3rd indes
		List<Integer> values= Arrays.asList(3,2,2,7,5,1,9,7) ;
		List<Integer> newValues = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newValues.get(2));

	}

}
