package com.viva.aspectjdemo.loginaction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viva.aspectjdemo.customannotation.logResults;

@RestController
public class DemoClass {
	public String result;
	
	@logResults
	@RequestMapping("/hello")
	public void hello() throws InterruptedException {
		System.out.println("hello!");
		 result = "success";
		 Thread.sleep(2000);
		
	}
	
	@logResults
	@RequestMapping("/bye")
	public void bye() throws InterruptedException {
		System.out.println("bye!");
		 result = "failed";
		 
		 Thread.sleep(2000);
		
	}
	
}
