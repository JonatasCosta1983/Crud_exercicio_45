package com.system.backend.client.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.system.backend.client.Model.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long>{
}