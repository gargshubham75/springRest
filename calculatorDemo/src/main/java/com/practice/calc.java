package com.practice;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	import java.lang.Math;
	@RestController
	public class calc {
		@GetMapping("/ADD")
		public int add(@RequestParam("n1")int num1,@RequestParam("n2")int num2) {
			int k=num1+num2;	
			return k;		
		}
		@GetMapping("/SUB")
		public int sub(@RequestParam("n1")int num1,@RequestParam("n2")int num2) {
			int k=num1-num2;	
			return k;		
		}
		@GetMapping("/MUL")
		public int mul(@RequestParam("n1")int num1,@RequestParam("n2")int num2) {
			int k=num1*num2;	
			return k;		
		}
		@GetMapping("/DIV")
		public double div(@RequestParam("n1")int num1,@RequestParam("n2")int num2) {
			double k=num1/num2;	
			return k;		
		}
		@GetMapping("/ROOT")
		public double root(@RequestParam("n1")int num1){
			double k = Math.sqrt(num1);
			return k;		
		}
		

	}

