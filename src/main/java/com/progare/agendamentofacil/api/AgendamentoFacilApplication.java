package com.progare.agendamentofacil.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendamentoFacilApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendamentoFacilApplication.class, args);
	}
	/**Teste de senha**/
	//String senhaEncoded = SenhaUtils.gerarBCrypt ( "123456" );
	//boolean senhaValida = SenhaUtils . senhaValida ( "123456" , senhaEncoded );
}
