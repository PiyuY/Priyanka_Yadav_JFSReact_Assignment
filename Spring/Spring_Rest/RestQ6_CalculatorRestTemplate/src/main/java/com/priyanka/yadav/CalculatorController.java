package com.priyanka.yadav;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@GetMapping("/add/{num1}/{num2}")
	public int addition(@PathVariable("num1") int no1, @PathVariable("num2") int no2) {
		return no1 + no2;
	}

	@GetMapping("/sub/{num1}/{num2}")
	public int subtraction(@PathVariable("num1") int no1, @PathVariable("num2") int no2) {
		return no1 - no2;
	}

	@GetMapping("/mul/{num1}/{num2}")
	public int multiplication(@PathVariable("num1") int no1, @PathVariable("num2") int no2) {
		return no1 * no2;
	}

	@GetMapping("/div/{num1}/{num2}")
	public Double division(@PathVariable("num1") double no1, @PathVariable("num2") double no2) {
		try {
			return (double) (no1 / no2);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} catch (Exception e) {
			System.out.println("e");
		}
		return (Double) null;
	}

	@GetMapping("/sqRoot/{num1}")
	public double squareRoot(@PathVariable("num1") int no1) {
		return (double) Math.sqrt(no1);
	}

}
