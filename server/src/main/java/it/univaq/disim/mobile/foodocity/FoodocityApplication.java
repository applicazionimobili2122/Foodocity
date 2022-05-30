package it.univaq.disim.mobile.foodocity;

import it.univaq.disim.mobile.foodocity.business.impl.repositories.PreferenzaRepository;
import it.univaq.disim.mobile.foodocity.business.impl.repositories.RicettaPreferitaRepository;
import it.univaq.disim.mobile.foodocity.business.impl.repositories.UtenteRepository;
import it.univaq.disim.mobile.foodocity.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class FoodocityApplication {

    @Autowired
    private PasswordEncoder passwordEncoder;


    public static void main(String[] args) {
        SpringApplication.run(FoodocityApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(UtenteRepository utenteRepository, PreferenzaRepository preferenzaRepository, RicettaPreferitaRepository ricettaPreferitaRepository) {
        return args -> {

            Preferenza preferenza1 = new Preferenza();
            preferenza1.setTipo(TipologiaPreferenza.Health);
            preferenza1.setNome("Alcohol-Cocktail");
            preferenza1.setApi_label("alcohol-cocktail");
            preferenza1.setDefinizione("Describes an alcoholic cocktail");

            Preferenza preferenza2 = new Preferenza();
            preferenza2.setTipo(TipologiaPreferenza.Health);
            preferenza2.setNome("Alcohol-Free");
            preferenza2.setApi_label("alcohol-free");
            preferenza2.setDefinizione("No alcohol used or contained");

            Preferenza preferenza3 = new Preferenza();
            preferenza3.setTipo(TipologiaPreferenza.Health);
            preferenza3.setNome("Celery-Free");
            preferenza3.setApi_label("celery-free");
            preferenza3.setDefinizione("Does not contain celery or derivatives");

            Preferenza preferenza4 = new Preferenza();
            preferenza4.setTipo(TipologiaPreferenza.Health);
            preferenza4.setNome("Crustcean-Free");
            preferenza4.setApi_label("crustacean-free");
            preferenza4.setDefinizione("Does not contain crustaceans (shrimp, lobster etc.) or derivatives");

            Preferenza preferenza5 = new Preferenza();
            preferenza5.setTipo(TipologiaPreferenza.Health);
            preferenza5.setNome("Dairy-Free");
            preferenza5.setApi_label("dairy-free");
            preferenza5.setDefinizione("No dairy; no lactose");

            Preferenza preferenza6 = new Preferenza();
            preferenza6.setTipo(TipologiaPreferenza.Health);
            preferenza6.setNome("DASH");
            preferenza6.setApi_label("DASH");
            preferenza6.setDefinizione("Dietary Approaches to Stop Hypertension diet");

            Preferenza preferenza7 = new Preferenza();
            preferenza7.setTipo(TipologiaPreferenza.Health);
            preferenza7.setNome("Egg-Free");
            preferenza7.setApi_label("egg-free");
            preferenza7.setDefinizione("No eggs or products containing eggs");

            Preferenza preferenza8 = new Preferenza();
            preferenza8.setTipo(TipologiaPreferenza.Health);
            preferenza8.setNome("Fish-Free");
            preferenza8.setApi_label("fish-free");
            preferenza8.setDefinizione("No fish or fish derivatives");

            Preferenza preferenza9 = new Preferenza();
            preferenza9.setTipo(TipologiaPreferenza.Health);
            preferenza9.setNome("FODMAP-Free");
            preferenza9.setApi_label("fodmap-free");
            preferenza9.setDefinizione("Does not contain FODMAP foods");

            Preferenza preferenza10 = new Preferenza();
            preferenza10.setTipo(TipologiaPreferenza.Health);
            preferenza10.setNome("Gluten-Free");
            preferenza10.setApi_label("gluten-free");
            preferenza10.setDefinizione("No ingredients containing gluten");

            Preferenza preferenza11 = new Preferenza();
            preferenza11.setTipo(TipologiaPreferenza.Health);
            preferenza11.setNome("Immuno-Supportive");
            preferenza11.setApi_label("immuno-supportive");
            preferenza11.setDefinizione("Recipes which fit a science-based approach to eating to strengthen the immune system");

            Preferenza preferenza12 = new Preferenza();
            preferenza12.setTipo(TipologiaPreferenza.Health);
            preferenza12.setNome("Keto-Friendly");
            preferenza12.setApi_label("keto-friendly");
            preferenza12.setDefinizione("Maximum 7 grams of net carbs per serving");

            Preferenza preferenza13 = new Preferenza();
            preferenza13.setTipo(TipologiaPreferenza.Health);
            preferenza13.setNome("Kidney-Friendly");
            preferenza13.setApi_label("kidney-friendly");
            preferenza13.setDefinizione("Per serving – phosphorus less than 250 mg AND potassium less than 500 mg AND sodium less than 500 mg");

            Preferenza preferenza14 = new Preferenza();
            preferenza14.setTipo(TipologiaPreferenza.Health);
            preferenza14.setNome("Kosher");
            preferenza14.setApi_label("kosher");
            preferenza14.setDefinizione("Contains only ingredients allowed by the kosher diet. However it does not guarantee kosher preparation of the ingredients themselves");

            Preferenza preferenza15 = new Preferenza();
            preferenza15.setTipo(TipologiaPreferenza.Health);
            preferenza15.setNome("Low Potassium");
            preferenza15.setApi_label("low-potassium");
            preferenza15.setDefinizione("Less than 150mg per serving");

            Preferenza preferenza16 = new Preferenza();
            preferenza16.setTipo(TipologiaPreferenza.Health);
            preferenza16.setNome("Low Sugar");
            preferenza16.setApi_label("low-sugar");
            preferenza16.setDefinizione("No simple sugars – glucose, dextrose, galactose, fructose, sucrose, lactose, maltose");

            Preferenza preferenza17 = new Preferenza();
            preferenza17.setTipo(TipologiaPreferenza.Health);
            preferenza17.setNome("Lupine-Free");
            preferenza17.setApi_label("lupine-free");
            preferenza17.setDefinizione("Does not contain lupine or derivatives");

            Preferenza preferenza18 = new Preferenza();
            preferenza18.setTipo(TipologiaPreferenza.Health);
            preferenza18.setNome("Mediterranean");
            preferenza18.setApi_label("Mediterranean");
            preferenza18.setDefinizione("Mediterranean diet");

            Preferenza preferenza19 = new Preferenza();
            preferenza19.setTipo(TipologiaPreferenza.Health);
            preferenza19.setNome("Mollusk-Free");
            preferenza19.setApi_label("mollusk-free");
            preferenza19.setDefinizione("No mollusks");

            Preferenza preferenza20 = new Preferenza();
            preferenza20.setTipo(TipologiaPreferenza.Health);
            preferenza20.setNome("Mustard-Free");
            preferenza20.setApi_label("mustard-free");
            preferenza20.setDefinizione("Does not contain mustard or derivatives");

            Preferenza preferenza21 = new Preferenza();
            preferenza21.setTipo(TipologiaPreferenza.Health);
            preferenza21.setNome("No oil added");
            preferenza21.setApi_label("No-oil-added");
            preferenza21.setDefinizione("No oil added except to what is contained in the basic ingredients");

            Preferenza preferenza22 = new Preferenza();
            preferenza22.setTipo(TipologiaPreferenza.Health);
            preferenza22.setNome("Paleo");
            preferenza22.setApi_label("paleo");
            preferenza22.setDefinizione("Excludes what are perceived to be agricultural products; grains, legumes, dairy products, potatoes, refined salt, refined sugar, and processed oils");

            Preferenza preferenza23 = new Preferenza();
            preferenza23.setTipo(TipologiaPreferenza.Health);
            preferenza23.setNome("Peanut-Free");
            preferenza23.setApi_label("peanut-free");
            preferenza23.setDefinizione("No peanuts or products containing peanuts");

            Preferenza preferenza24 = new Preferenza();
            preferenza24.setTipo(TipologiaPreferenza.Health);
            preferenza24.setNome("Pescatarian");
            preferenza24.setApi_label("pecatarian");
            preferenza24.setDefinizione("Does not contain meat or meat based products, can contain dairy and fish");

            Preferenza preferenza25 = new Preferenza();
            preferenza25.setTipo(TipologiaPreferenza.Health);
            preferenza25.setNome("Pork-Free");
            preferenza25.setApi_label("pork-free");
            preferenza25.setDefinizione("Does not contain pork or derivatives");

            Preferenza preferenza26 = new Preferenza();
            preferenza26.setTipo(TipologiaPreferenza.Health);
            preferenza26.setNome("Red-Meat-Free");
            preferenza26.setApi_label("red-meat-free");
            preferenza26.setDefinizione("Does not contain beef, lamb, pork, duck, goose, game, horse, and other types of red meat or products containing red meat.");

            Preferenza preferenza27 = new Preferenza();
            preferenza27.setTipo(TipologiaPreferenza.Health);
            preferenza27.setNome("Sesame-Free");
            preferenza27.setApi_label("sesame-free");
            preferenza27.setDefinizione("Does not contain sesame seed or derivatives");

            Preferenza preferenza28 = new Preferenza();
            preferenza28.setTipo(TipologiaPreferenza.Health);
            preferenza28.setNome("Shellfish-Free");
            preferenza28.setApi_label("shellfish-free");
            preferenza28.setDefinizione("No shellfish or shellfish derivatives");

            Preferenza preferenza29 = new Preferenza();
            preferenza29.setTipo(TipologiaPreferenza.Health);
            preferenza29.setNome("Soy-Free");
            preferenza29.setApi_label("soy-free");
            preferenza29.setDefinizione("No soy or products containing soy");

            Preferenza preferenza30 = new Preferenza();
            preferenza30.setTipo(TipologiaPreferenza.Health);
            preferenza30.setNome("Sugar-Conscious");
            preferenza30.setApi_label("sugar-conscious");
            preferenza30.setDefinizione("Less than 4g of sugar per serving");

            Preferenza preferenza31 = new Preferenza();
            preferenza31.setTipo(TipologiaPreferenza.Health);
            preferenza31.setNome("Sulfite-Free");
            preferenza31.setApi_label("sulfite-free");
            preferenza31.setDefinizione("No Sulfites");

            Preferenza preferenza32 = new Preferenza();
            preferenza32.setTipo(TipologiaPreferenza.Health);
            preferenza32.setNome("Tree-Nut-Free");
            preferenza32.setApi_label("tree-nut-free");
            preferenza32.setDefinizione("No tree nuts or products containing tree nuts");

            Preferenza preferenza33 = new Preferenza();
            preferenza33.setTipo(TipologiaPreferenza.Health);
            preferenza33.setNome("Vegan");
            preferenza33.setApi_label("vegan");
            preferenza33.setDefinizione("No meat, poultry, fish, dairy, eggs or honey");

            Preferenza preferenza34 = new Preferenza();
            preferenza34.setTipo(TipologiaPreferenza.Health);
            preferenza34.setNome("Vegetarian");
            preferenza34.setApi_label("vegetarian");
            preferenza34.setDefinizione("No meat, poultry, or fish");

            Preferenza preferenza35 = new Preferenza();
            preferenza35.setTipo(TipologiaPreferenza.Health);
            preferenza35.setNome("Wheat-Free");
            preferenza35.setApi_label("wheat-free");
            preferenza35.setDefinizione("No wheat, can have gluten though");

            Preferenza preferenza37 = new Preferenza();
            preferenza37.setTipo(TipologiaPreferenza.Diet);
            preferenza37.setNome("Balanced");
            preferenza37.setApi_label("balanced");
            preferenza37.setDefinizione("Protein/Fat/Carb values in 15/35/50 ratio");

            Preferenza preferenza38 = new Preferenza();
            preferenza38.setTipo(TipologiaPreferenza.Diet);
            preferenza38.setNome("High-Fiber");
            preferenza38.setApi_label("high-fiber");
            preferenza38.setDefinizione("More than 5g fiber per serving");

            Preferenza preferenza39 = new Preferenza();
            preferenza39.setTipo(TipologiaPreferenza.Diet);
            preferenza39.setNome("High-Protein");
            preferenza39.setApi_label("high-protein");
            preferenza39.setDefinizione("More than 50% of total calories from proteins");

            Preferenza preferenza40 = new Preferenza();
            preferenza40.setTipo(TipologiaPreferenza.Diet);
            preferenza40.setNome("Low-Carb");
            preferenza40.setApi_label("low-carb");
            preferenza40.setDefinizione("Less than 20% of total calories from carbs");

            Preferenza preferenza41 = new Preferenza();
            preferenza41.setTipo(TipologiaPreferenza.Diet);
            preferenza41.setNome("Low-Fat");
            preferenza41.setApi_label("low-fat");
            preferenza41.setDefinizione("Less than 15% of total calories from fat");

            Preferenza preferenza42 = new Preferenza();
            preferenza42.setTipo(TipologiaPreferenza.Diet);
            preferenza42.setNome("Low-Sodium");
            preferenza42.setApi_label("low-sodium");
            preferenza42.setDefinizione("Less than 140mg Na per serving");

            preferenza1 = preferenzaRepository.save(preferenza1);
            preferenza2 = preferenzaRepository.save(preferenza2);
            preferenza3 = preferenzaRepository.save(preferenza3);
            preferenza4 = preferenzaRepository.save(preferenza4);
            preferenza5 = preferenzaRepository.save(preferenza5);
            preferenza6 = preferenzaRepository.save(preferenza6);
            preferenza7 = preferenzaRepository.save(preferenza7);
            preferenza8 = preferenzaRepository.save(preferenza8);
            preferenza9 = preferenzaRepository.save(preferenza9);
            preferenza10 = preferenzaRepository.save(preferenza10);
            preferenza11 = preferenzaRepository.save(preferenza11);
            preferenza12 = preferenzaRepository.save(preferenza12);
            preferenza13 = preferenzaRepository.save(preferenza13);
            preferenza14 = preferenzaRepository.save(preferenza14);
            preferenza15 = preferenzaRepository.save(preferenza15);
            preferenza16 = preferenzaRepository.save(preferenza16);
            preferenza17 = preferenzaRepository.save(preferenza17);
            preferenza18 = preferenzaRepository.save(preferenza18);
            preferenza19 = preferenzaRepository.save(preferenza19);
            preferenza20 = preferenzaRepository.save(preferenza20);
            preferenza21 = preferenzaRepository.save(preferenza21);
            preferenza22 = preferenzaRepository.save(preferenza22);
            preferenza23 = preferenzaRepository.save(preferenza23);
            preferenza24 = preferenzaRepository.save(preferenza24);
            preferenza25 = preferenzaRepository.save(preferenza25);
            preferenza26 = preferenzaRepository.save(preferenza26);
            preferenza27 = preferenzaRepository.save(preferenza27);
            preferenza28 = preferenzaRepository.save(preferenza28);
            preferenza29 = preferenzaRepository.save(preferenza29);
            preferenza30 = preferenzaRepository.save(preferenza30);
            preferenza31 = preferenzaRepository.save(preferenza31);
            preferenza32 = preferenzaRepository.save(preferenza32);
            preferenza33 = preferenzaRepository.save(preferenza33);
            preferenza34 = preferenzaRepository.save(preferenza34);
            preferenza35 = preferenzaRepository.save(preferenza35);
            preferenza37 = preferenzaRepository.save(preferenza37);
            preferenza38 = preferenzaRepository.save(preferenza38);
            preferenza39 = preferenzaRepository.save(preferenza39);
            preferenza40 = preferenzaRepository.save(preferenza40);
            preferenza41 = preferenzaRepository.save(preferenza41);
            preferenza42 = preferenzaRepository.save(preferenza42);
            Set<Preferenza> preferenze = new HashSet<>();
            preferenze.add(preferenza7);
            preferenze.add(preferenza8);
            preferenze.add(preferenza10);


            Utente utente = new Utente();
            utente.setPassword(passwordEncoder.encode("utente"));
            utente.setNome("Utente");
            utente.setCognome("Di Prova");
            utente.setEmail("utente.diprova@univaq.it");
            utente.setPreferenzeUtente(preferenze);
            utente = utenteRepository.save(utente);

            RicettaPreferita ricettaPreferita1 = new RicettaPreferita();
            ricettaPreferita1.setUtente(utente);
            ricettaPreferita1.setUri("http://www.edamam.com/recipe/salsa-alla-capricciosa-7d7507c42b61a3f20c9483c1f9b45a18/");
            ricettaPreferita1.setLabel("Salsa Alla Capricciosa");
            ricettaPreferita1 = ricettaPreferitaRepository.save(ricettaPreferita1);

            RicettaPreferita ricettaPreferita2 = new RicettaPreferita();
            ricettaPreferita2.setUtente(utente);
            ricettaPreferita2.setUri("http://www.edamam.com/recipe/capricciosa-pizza-b2616c52996ae7c2e02e8f26bdc8f262/");
            ricettaPreferita2.setLabel("Capricciosa pizza");
            ricettaPreferita2 = ricettaPreferitaRepository.save(ricettaPreferita2);
        };
    }

}