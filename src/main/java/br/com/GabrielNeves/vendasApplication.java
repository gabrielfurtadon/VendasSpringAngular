package br.com.GabrielNeves;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class vendasApplication {
	
	
	@Autowired
	@Qualifier("digaMeuNome")
	private String digaMeuNome;
	
	
	
	
	@GetMapping("/hello")
	public String HelloWorld() {
		return digaMeuNome;
	}
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(vendasApplication.class, args);
		
	}
}
