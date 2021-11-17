package com.priyanka.yadav;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController()
@RequestMapping("/template")
public class CalculatorAPIConsumer {
	@Autowired
	 RestTemplate restTemplate;
	
	@RequestMapping("/add")
	public String performAdd() {
	      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<String> entity = new HttpEntity<String>(headers);
      return restTemplate.exchange("http://localhost:10001/calculator/add/5/6", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@RequestMapping("/sub")
	public String performSub() {
	      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<String> entity = new HttpEntity<String>(headers);
      return restTemplate.exchange("http://localhost:10001/calculator/sub/5/6", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@RequestMapping("/mul")
	public String performMul() {
	      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<String> entity = new HttpEntity<String>(headers);
      return restTemplate.exchange("http://localhost:10001/calculator/mul/5/6", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@RequestMapping("/div")
	public String performDiv() {
	      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<String> entity = new HttpEntity<String>(headers);
      return restTemplate.exchange("http://localhost:10001/calculator/div/25/4", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@RequestMapping("/sqrt")
	public String performSqrt() {
	      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<String> entity = new HttpEntity<String>(headers);
      return restTemplate.exchange("http://localhost:10001/calculator/sqRoot/25", HttpMethod.GET, entity, String.class).getBody();
	}
	

}
