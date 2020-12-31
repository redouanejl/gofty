package ma.cigma.ofty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.ofty.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
