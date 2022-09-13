package com.tjdiego.TesteRocketWave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TesteRocketWaveApplication {


	@GetMapping("/main")
	public static void main(String[] args) {
		SpringApplication.run(TesteRocketWaveApplication.class, args);
		teste();
	}

	@GetMapping("/teste")
	public static String teste (){
			return "Ta ok!";


	}

}
