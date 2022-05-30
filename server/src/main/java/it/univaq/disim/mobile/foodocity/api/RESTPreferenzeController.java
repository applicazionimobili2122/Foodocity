package it.univaq.disim.mobile.foodocity.api;

import java.util.List;

import it.univaq.disim.mobile.foodocity.business.FoodocityService;
import it.univaq.disim.mobile.foodocity.domain.Preferenza;
import it.univaq.disim.mobile.foodocity.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.univaq.disim.mobile.foodocity.common.Utility;


@RestController
@RequestMapping("/api/preferenze")
public class RESTPreferenzeController {

	@Autowired
	private FoodocityService service;
	
	@GetMapping
	public List<Preferenza> list() {
		Utente utente = Utility.getUtente();
		return service.findAllPreferenze(utente);
	}
	
}
