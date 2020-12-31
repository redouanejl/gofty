package ma.cigma.ofty.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "titre_social")
	private String TitreSocial;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	@Column(name = "mot_de_passe")
	private String motDePasse;
	
	@Column(name = "date_naissance")
	private Date dateNaissance;
	
	private String statut;
	
	@CreationTimestamp
	private Date dateEnregistrement;
	
	@ManyToOne
	@JoinColumn(name = "authorite_id")
	private Authorite authorite;

}
