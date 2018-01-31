package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.properties.ItcastProperties;

@RequestMapping("test")
@RestController
public class HelloController {
	
	@Autowired
	private Environment environment;
	
	@Value("${cn.itcast.name}")
	private String itcastName;
	@Value("${cn.itcast.url}")
	private String itcastUrl;
	@Value("${com.itheima.name}")
	private String itheimaName;
	
	@Autowired
	private ItcastProperties itcast;
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("a-name="+environment.getProperty("cn.itcast.name"));
		System.out.println("b-url="+environment.getProperty("cn.itcast.url"));
		System.out.println("name="+environment.getProperty("com.itheima.name"));
		
		System.out.println("==============================");
		System.out.println("itcastName"+itcastName);
		System.out.println("itcastUrl"+itcastUrl);
		System.out.println("itheimaName"+itheimaName);
		
		System.out.println("=======================");
		
		System.out.println(itcast);
		
		return "Hello World";
	}

}
