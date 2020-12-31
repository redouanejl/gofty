package ma.cigma.ofty.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Client extends Utilisateur{

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "billing_address_id")
	private Adresse billingAdresse;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipping_address_id")
	private Adresse shippingAdresse;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private List<Commande> listeCommandes;
	
}
