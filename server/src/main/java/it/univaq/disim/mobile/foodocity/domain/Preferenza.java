package it.univaq.disim.mobile.foodocity.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "preferenze")
public class Preferenza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PREFERENZA", nullable = false)
	private Long id;

	@Column(name = "NOME", nullable = false, length = 255)
	private String nome;

	@Column(name = "DEFINIZIONE", nullable = false, length = 255)
	private String definizione;

	@Column(name = "API_LABEL", nullable = false, length = 255)
	private String api_label;
	
	@Enumerated(EnumType.STRING)
	private TipologiaPreferenza tipo;

	@ManyToMany(mappedBy = "preferenzeUtente")
	private Set<Utente> utentiConPreferenza = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDefinizione() {
		return definizione;
	}

	public void setDefinizione(String definizione) {
		this.definizione = definizione;
	}

	public String getApi_label() {
		return api_label;
	}

	public void setApi_label(String api_label) {
		this.api_label = api_label;
	}

	public TipologiaPreferenza getTipo() {
		return tipo;
	}

	public void setTipo(TipologiaPreferenza tipo) {
		this.tipo = tipo;
	}

	public Set<Utente> getUtentiConPreferenza() {
		return utentiConPreferenza;
	}

	public void setUtentiConPreferenza(Set<Utente> utentiConPreferenza) {
		this.utentiConPreferenza = utentiConPreferenza;
	}
}
