package it.univaq.disim.mobile.foodocity.common;

import it.univaq.disim.mobile.foodocity.domain.Utente;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import it.univaq.disim.mobile.foodocity.common.spring.security.UserDetailsImpl;

public class Utility {

	private Utility() {

	}

	public static Utente getUtente() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			UserDetailsImpl userDetailsImpl = (UserDetailsImpl) authentication.getPrincipal();
			return userDetailsImpl.getUtente();

		} else {
			return null;
		}
		
	}
}
