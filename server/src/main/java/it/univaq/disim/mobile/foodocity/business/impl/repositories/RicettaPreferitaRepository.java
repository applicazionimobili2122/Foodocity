package it.univaq.disim.mobile.foodocity.business.impl.repositories;

import java.util.List;

import it.univaq.disim.mobile.foodocity.domain.RicettaPreferita;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RicettaPreferitaRepository extends JpaRepository<RicettaPreferita, Long>{

	List<RicettaPreferita> findRicettaPreferitaByUtenteId(Long idUtente, Sort sort);

}
