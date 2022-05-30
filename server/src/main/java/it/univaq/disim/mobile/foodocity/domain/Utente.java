package it.univaq.disim.mobile.foodocity.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "utenti")
@DiscriminatorValue("utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UTENTE", nullable = false)
	private Long id;

	@Column(name = "NOME", nullable = false, length = 255)
	private String nome;

	@Column(name = "COGNOME", nullable = false, length = 255)
	private String cognome;

	@Column(name = "EMAIL", nullable = false, length = 255, updatable = false, unique = true)
	private String email;

	@JsonIgnore
	@Column(name = "PASSWORD", nullable = false, length = 255)
	private String password;

	@ManyToMany
	@JoinTable(name="UTENTI_PREFERENZE",
			joinColumns={@JoinColumn(name="ID_UTENTE")},
			inverseJoinColumns={@JoinColumn(name="ID_PREFERENZA")})
	private Set<Preferenza> preferenzeUtente = new HashSet<>();


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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Preferenza> getPreferenzeUtente() {
		return preferenzeUtente;
	}

	public void setPreferenzeUtente(Set<Preferenza> preferenzeUtente) {
		this.preferenzeUtente = preferenzeUtente;
	}

	public void addPreferenza(Preferenza preferenza) {
		this.preferenzeUtente.add(preferenza);
	}

	public void deletePreferenza(Preferenza preferenza) {
		this.preferenzeUtente.remove(preferenza);
	}

}
