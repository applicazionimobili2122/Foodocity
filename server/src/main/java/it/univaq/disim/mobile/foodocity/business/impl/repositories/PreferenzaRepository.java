package it.univaq.disim.mobile.foodocity.business.impl.repositories;

import it.univaq.disim.mobile.foodocity.domain.Preferenza;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreferenzaRepository extends JpaRepository<Preferenza, Long>{

    List<Preferenza> findByUtentiConPreferenzaId(Long idUtente, Sort sort);

}
