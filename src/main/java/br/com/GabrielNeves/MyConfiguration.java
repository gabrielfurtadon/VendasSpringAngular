package br.com.GabrielNeves;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // Spring vai aplicar a configuração da classe na aplicação
public class MyConfiguration { 

	@Bean(name = "digaMeuNome")
	public String digaMeuNome() {
		return "Gabriel Neves";
	}
	
	
}
