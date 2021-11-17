package com.priyanka.yadav;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creditcard")
public class CreditCradController {
	
	//EX. http://localhost:10004/creditcard/validate/214900000000456
	@RequestMapping("/validate/{cardnum}")
	public String validateCard(@PathVariable("cardnum") String cardNo) {

		if (cardNo.length() == 15 && (cardNo.substring(0, 4).equals("2014") || cardNo.substring(0, 4).equals("2149"))) {
			return "Your Card is validated as enRoute...!";
		}

		if ((cardNo.length() >= 15 && cardNo.length() <= 19) && (Integer.parseInt(cardNo.substring(0, 4)) >= 3528
				&& Integer.parseInt(cardNo.substring(0, 4)) <= 3589)) {
			return "Your Card is validated as JCB...!";
		}

		if (cardNo.length() == 16 && ((Integer.parseInt(cardNo.substring(0, 6)) >= 510000
				&& Integer.parseInt(cardNo.substring(0, 6)) <= 559999)
				|| (Integer.parseInt(cardNo.substring(0, 6)) >= 222100
						&& Integer.parseInt(cardNo.substring(0, 6)) <= 272099))) {
			return "Your Card is validated as MasterCard...!";
		}

		if ((cardNo.length() >= 15 && cardNo.length() <= 19) && cardNo.charAt(0)=='4') {
			return "Your Card is validated as Visa...!";
		}
		
		return "Card is Not Valid..! Please check once again.";

	}

}
