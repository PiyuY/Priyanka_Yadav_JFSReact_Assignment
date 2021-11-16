package com.priyanka.yadav;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

		@GetMapping("/getAddress/{zip}")
		public Address getAddressByZip(@PathVariable("zip") int zipCode) {
			Address address = new Address(99501, "AK", "US", "ANCHORAGE");
			
			if(zipCode==99501) {
				return address;
			}else {
				return null;
			}
		}
	
}
