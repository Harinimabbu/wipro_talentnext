package oops;

import java.util.Optional;

public class NamesOptional {

	public static void main(String[] args) {
		String names[] = new String [5];
		names[0] = "Harini";
		Optional<String> optionalName = Optional.ofNullable(names[0]);
		
		
		if(optionalName.isPresent()) {
			System.out.println("Length: "+optionalName.get().length());
		}
		else {
			System.out.println("Value is null, cannot get length.");
		}
	}

}