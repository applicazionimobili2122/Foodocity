package it.univaq.disim.mobile.foodocity.common.spring.security;

import it.univaq.disim.mobile.foodocity.business.FoodocityService;
import it.univaq.disim.mobile.foodocity.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private FoodocityService service;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utente utente = service.findUtenteByEmail(username);
		if (utente == null) {
			throw new UsernameNotFoundException("utente inesistente");
		}
		return new UserDetailsImpl(utente);

	}

}
