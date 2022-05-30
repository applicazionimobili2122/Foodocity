package it.univaq.disim.mobile.foodocity.business;

import java.util.List;

import it.univaq.disim.mobile.foodocity.domain.Preferenza;
import it.univaq.disim.mobile.foodocity.domain.RicettaPreferita;
import it.univaq.disim.mobile.foodocity.domain.Utente;

public interface FoodocityService {

	Utente findUtenteByEmail(String email) throws BusinessException;

	Utente updateProfilo(Utente utente) throws BusinessException;

	Preferenza findPreferenzaById(Long id) throws BusinessException;

	List<Preferenza> findAllPreferenze(Utente utente) throws BusinessException;

	List<RicettaPreferita> findAllRicettaPreferita(Utente utente) throws BusinessException;

	RicettaPreferita findRicettaPreferitaById(long idRicettaPreferita) throws BusinessException;

	void createRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException;

	void updateRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException;

	void deleteRicettaPreferita(long idRicettaPreferita) throws BusinessException;

	Utente updatePassword(Utente utente) throws BusinessException;

	RicettaPreferita addRicettaPreferita(RicettaPreferita ricettaPreferita);

	void deleteRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException;

	Utente addPreferenza(Preferenza preferenza);

	void deletePreferenza(Preferenza preferenza) throws BusinessException;
}
