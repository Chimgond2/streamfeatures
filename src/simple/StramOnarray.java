package simple;

import java.util.stream.Stream;

public class StramOnarray {

	public static void main(String[] args) {
		
		String[] name= {"chandu","teju","deepu"};
		Stream<String> list=Stream.of(name);
		list.forEach(e->System.out.println(e));
	}
}
