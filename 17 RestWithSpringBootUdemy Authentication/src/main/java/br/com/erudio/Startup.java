package br.com.erudio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm;

@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
		
//		Pbkdf2PasswordEncoder pbkdf2PasswordEncoder = new Pbkdf2PasswordEncoder("", 8, 185000, SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
//
//		Map<String, PasswordEncoder> encoders = new HashMap<>();
//		encoders.put("pbkdf2", pbkdf2PasswordEncoder);
//		DelegatingPasswordEncoder passwordEncoder = new DelegatingPasswordEncoder("pbkdf2", encoders);
//		passwordEncoder.setDefaultPasswordEncoderForMatches(passwordEncoder);
//
//		String result1 = passwordEncoder.encode("teste123");
//		String result2 = passwordEncoder.encode("jpa222");
//		String result3 = passwordEncoder.encode("senha123");
//
//		System.out.println("My hash result1 " + result1);
//		System.out.println("My hash result2 " + result2);
//		System.out.println("My hash result3 " + result2);
	}
}