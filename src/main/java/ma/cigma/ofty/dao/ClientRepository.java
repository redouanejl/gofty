package ma.cigma.ofty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.ofty.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
