package it.univaq.disim.mobile.foodocity.business.impl;

import java.util.List;

import it.univaq.disim.mobile.foodocity.business.BusinessException;
import it.univaq.disim.mobile.foodocity.business.FoodocityService;
import it.univaq.disim.mobile.foodocity.business.impl.repositories.PreferenzaRepository;
import it.univaq.disim.mobile.foodocity.business.impl.repositories.RicettaPreferitaRepository;
import it.univaq.disim.mobile.foodocity.business.impl.repositories.UtenteRepository;
import it.univaq.disim.mobile.foodocity.common.Utility;
import it.univaq.disim.mobile.foodocity.domain.Preferenza;
import it.univaq.disim.mobile.foodocity.domain.RicettaPreferita;
import it.univaq.disim.mobile.foodocity.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class FoodocityServiceImpl implements FoodocityService {

	@Autowired
	private UtenteRepository utenteRepository;

	@Autowired
	private PreferenzaRepository preferenzaRepository;

	@Autowired
	private RicettaPreferitaRepository ricettaPreferitaRepository;

	@Override
	public Utente findUtenteByEmail(String email) throws BusinessException {
		return utenteRepository.findByEmail(email);
	}

	@Override
	public Utente updateProfilo(Utente profilo) throws BusinessException {
		Utente utente = utenteRepository.findByEmail(profilo.getEmail());
		utente.setNome(profilo.getNome());
		utente.setCognome(profilo.getCognome());
		return utente;
	}

	@Override
	public Preferenza findPreferenzaById(Long id) throws BusinessException {
		return preferenzaRepository.findById(id).get();
	}

	@Override
	public List<Preferenza> findAllPreferenze(Utente utente) throws BusinessException {
		return preferenzaRepository.findByUtentiConPreferenzaId(utente.getId(), JpaSort.unsafe(Direction.DESC, "tipo"));
	}

	@Override
	public List<RicettaPreferita> findAllRicettaPreferita(Utente utente) throws BusinessException {
		return ricettaPreferitaRepository.findRicettaPreferitaByUtenteId(utente.getId(), JpaSort.unsafe(Direction.DESC, "label"));
	}

	@Override
	public RicettaPreferita findRicettaPreferitaById(long idRicettaPreferita) throws BusinessException {
		return ricettaPreferitaRepository.findById(idRicettaPreferita).get();
	}

	@Override
	public void createRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException {
		ricettaPreferitaRepository.save(ricettaPreferita);
	}

	@Override
	public void updateRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException {
		ricettaPreferitaRepository.save(ricettaPreferita);
	}

	@Override
	public void deleteRicettaPreferita(long idRicettaPreferita) throws BusinessException {
		ricettaPreferitaRepository.deleteById(idRicettaPreferita);
	}

	@Override
	public Utente updatePassword(Utente utente) throws BusinessException {
		Utente utenteDB = utenteRepository.findByEmail(utente.getEmail());
		utenteDB.setPassword(utente.getPassword());
		return utenteDB;
	}

	@Override
	public RicettaPreferita addRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException {
		return ricettaPreferitaRepository.save(ricettaPreferita);
	}

	@Override
	public void deleteRicettaPreferita(RicettaPreferita ricettaPreferita) throws BusinessException {
		ricettaPreferitaRepository.delete(ricettaPreferita);
	}

	@Override
	public Utente addPreferenza(Preferenza preferenza) throws BusinessException {
		Utente u = Utility.getUtente();
		if (u != null) {
			u.addPreferenza(preferenza);
			return utenteRepository.save(u);
		}
		return u;
	}

	@Override
	public void deletePreferenza(Preferenza preferenza) throws BusinessException {
		Utente u = Utility.getUtente();
		if (u != null) {
			u.deletePreferenza(preferenza);
			utenteRepository.save(u);
		}
	}

}
