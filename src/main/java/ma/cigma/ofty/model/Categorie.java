package ma.cigma.ofty.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	
	//	should i delete all products by deleting a categorie?
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categorie")
	private List<Produit> listeProduits;

}
