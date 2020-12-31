package ma.cigma.ofty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.ofty.model.Produit;

@Repository
public interface ProduitsRepository extends JpaRepository<Produit, Long> {

}
