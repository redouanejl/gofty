package ma.cigma.ofty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.ofty.model.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
