package it.univaq.disim.mobile.foodocity.api;

import javax.servlet.http.HttpServletResponse;

import it.univaq.disim.mobile.foodocity.business.FoodocityService;
import it.univaq.disim.mobile.foodocity.common.Utility;
import it.univaq.disim.mobile.foodocity.domain.Preferenza;
import it.univaq.disim.mobile.foodocity.domain.RicettaPreferita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import it.univaq.disim.mobile.foodocity.common.spring.security.JWTTokenUtil;
import it.univaq.disim.mobile.foodocity.common.spring.security.UserDetailsImpl;
import it.univaq.disim.mobile.foodocity.domain.Utente;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTUtenteController {

	@Value("${jwt.token.header}")
	private String tokenHeader;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTTokenUtil jwtTokenUtil;

	@Autowired
	private FoodocityService foodocityService;

	@PostMapping("/login")
	public UtenteResponse login(@RequestBody AuthenticationRequest authenticationRequest, HttpServletResponse response) throws AuthenticationException {
		// Effettuo l'autenticazione
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);

		// Genero Token e lo inserisco nell'header di risposta
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		String token = jwtTokenUtil.generateToken(userDetails);
		response.setHeader(tokenHeader, token);

		// Ritorno l'utente
		return new UtenteResponse(((UserDetailsImpl) userDetails).getUtente());
	}

	@PostMapping("/utente/updateprofilo")
	public UtenteResponse updateProfilo(@RequestBody Utente utente) {
		Utente nuovoUtente = foodocityService.updateProfilo(utente);
		return new UtenteResponse(nuovoUtente);
	}

	@PostMapping("/utente/updatepassword")
	public UtenteResponse updatePassword(@RequestBody Utente utente) {
		Utente nuovoUtente = foodocityService.updatePassword(utente);
		return new UtenteResponse(nuovoUtente);
	}

	@GetMapping("/utente/ricette_preferite")
	public List<RicettaPreferita> getRicettePreferiteUtente(){
		return foodocityService.findAllRicettaPreferita(Utility.getUtente());
	}

	@PostMapping("/utente/ricette_preferite")
	public RicettaPreferita addRicettaPreferita(@RequestBody RicettaPreferita ricettaPreferita) {
		ricettaPreferita.setUtente(Utility.getUtente());
		return foodocityService.addRicettaPreferita(ricettaPreferita);
	}

	@DeleteMapping("/utente/ricette_preferite/{id}")
	public void deleteRicettaPreferita(@PathVariable("id") long idRicettaPreferita) {
		foodocityService.deleteRicettaPreferita(idRicettaPreferita);
	}

	@GetMapping("/utente/preferenze")
	public List<Preferenza> getPreferenzeUtente(){
		return foodocityService.findAllPreferenze(Utility.getUtente());
	}

	@PostMapping("/utente/preferenze")
	public Utente addPreferenza(@RequestBody Preferenza preferenza) {
		return foodocityService.addPreferenza(preferenza);
	}

	@DeleteMapping("/utente/preferenze/{id}")
	public void deletePreferenza(@PathVariable("id") long idPreferenza) {
		Preferenza preferenza = foodocityService.findPreferenzaById(idPreferenza);
		foodocityService.deletePreferenza(preferenza);
	}

}
