package it.univaq.disim.mobile.foodocity.api;

import it.univaq.disim.mobile.foodocity.business.FoodocityService;
import it.univaq.disim.mobile.foodocity.domain.RicettaPreferita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/ricette_preferite")
public class RESTRicettePreferiteController {

    @Autowired
    private FoodocityService service;

    @GetMapping("/{idRicettaPreferita}")
    public RicettaPreferita findRicettaPreferitaById(@PathVariable long idRicettaPreferita) {
        return service.findRicettaPreferitaById(idRicettaPreferita);
    }

    @PostMapping
    public void createRicettaPreferita(@RequestBody RicettaPreferita ricettaPreferita) {
        service.createRicettaPreferita(ricettaPreferita);
    }

    @PutMapping
    public void updateRicettaPreferita(@RequestBody RicettaPreferita ricettaPreferita) {
        service.updateRicettaPreferita(ricettaPreferita);
    }

    @DeleteMapping("/{idRicettaPreferita}")
    public void deleteRicettaPreferita(@PathVariable long idRicettaPreferita) {
        service.deleteRicettaPreferita(idRicettaPreferita);
    }


}
