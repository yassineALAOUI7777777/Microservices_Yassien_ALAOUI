package org.EMSI.ClientService.Repository;

import org.EMSI.ClientService.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ClientRepository  extends JpaRepository<Client,Long > {
}
