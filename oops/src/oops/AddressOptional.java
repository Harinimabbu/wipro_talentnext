package oops;

import java.util.Optional;

public class AddressOptional {
	//String address = "Judicial colony, kurnool";
	String address;
	String default_value ="India";

	public static void main(String[] args) {
		AddressOptional ad = new AddressOptional();
		
		Optional<String> n = Optional.ofNullable(ad.address);
		
		System.out.println(n.orElse(ad.default_value));
	}

}