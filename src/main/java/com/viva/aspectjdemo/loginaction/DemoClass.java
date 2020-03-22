package com.viva.aspectjdemo.loginaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viva.aspectjdemo.customannotation.logResults;
import com.viva.aspectjdemo.entity.Response;

@RestController
public class DemoClass {
	public String result;
	
	@Autowired
	public Response response;
	
	
//	@Autowired
//	public DemoClass(Response response) {
//		this.response=response;
//	}
	
	@logResults
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public void hello() throws InterruptedException {
		System.out.println("hello!");
		 result = "success";
		 response.setSuccess("Success");
		 Thread.sleep(2000);		
	}
	
	@logResults
	@RequestMapping(value = "/bye", method = RequestMethod.POST)
	public void bye(@RequestBody Response res) throws InterruptedException {
		System.out.println("bye!");
		 response.setSuccess("Failed");	 
		 Thread.sleep(2000);
		
	}
	
}
