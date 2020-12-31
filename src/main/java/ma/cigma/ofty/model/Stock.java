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
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private float quantite;
	
	@ManyToOne
	@JoinColumn(name = "livreur_id")
	private Livreur livreur;
	
	@ManyToOne
	@JoinColumn(name = "produit_id")
	private Produit produit;

}
