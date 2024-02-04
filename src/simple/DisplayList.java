package simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DisplayList {
	public static void main(String[] args) {
		List<Integer> list=List.of(1,52,5,64);
		System.out.println(list);
	
	List<Integer>	odd=list.stream().filter(a->a%2==1).collect(Collectors.toList());//.forEach(System.out::println); 
	System.out.println(odd);
	
	
	}

}
