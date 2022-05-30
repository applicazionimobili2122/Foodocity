package it.univaq.disim.mobile.foodocity.business.impl.repositories;

import it.univaq.disim.mobile.foodocity.domain.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
	Utente findByEmail(String email);
}
