package cn.itcast.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.itcast.springboot.properties.ItcastProperties;

@SpringBootApplication
@EnableConfigurationProperties(ItcastProperties.class)
public class Application {
	
	@Autowired

	public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
	}

}
