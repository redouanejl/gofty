package ma.cigma.ofty.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Livreur extends Utilisateur {
	
	private String matricule;
	
	private String lattitude;
	
	private String longitude;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "livreur")
	private List<Stock> listeStockes;
	
	@OneToMany(mappedBy = "livreur")
	private List<Commande> listeCommandes;
	
}
