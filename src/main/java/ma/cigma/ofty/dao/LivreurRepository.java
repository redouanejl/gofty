package ma.cigma.ofty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.ofty.model.Livreur;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur, Long> {

}
