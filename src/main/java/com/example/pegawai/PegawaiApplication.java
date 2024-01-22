package com.example.pegawai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.pegawai")
public class PegawaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegawaiApplication.class, args);
	}

}
