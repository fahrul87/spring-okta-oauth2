package com.fahrul.springoktaoauth2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringOktaOauth2Application {

	@GetMapping("/")
	public String welcome(Principal principal) {
		return "Halo : " + principal.getName() + " Istimiwir kiwir kiwir";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOktaOauth2Application.class, args);
	}

}
