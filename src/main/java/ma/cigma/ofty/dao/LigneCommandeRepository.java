package ma.cigma.ofty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.cigma.ofty.model.LigneCommande;

@RepositoryRestResource(collectionResourceRel = "LigneCommande",path = "lignes-commandes")
public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {

}
