package ma.cigma.ofty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nom;
	
	private String image;
	
	private float prix;
	
	private String statut;
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
}
