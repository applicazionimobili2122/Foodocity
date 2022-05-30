package it.univaq.disim.mobile.foodocity.domain;

import javax.persistence.*;

@Entity
@Table(name = "ricetta_preferita")
public class RicettaPreferita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RICETTAPREFERITA", nullable = false)
    private Long id;

    @Column(name = "URI", nullable = false, length = 255)
    private String uri;

    @Column(name = "LABEL", nullable = false, length = 255)
    private String label;

    @ManyToOne
    @JoinColumn(name = "ID_UTENTE", nullable = false)
    private Utente utente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}

