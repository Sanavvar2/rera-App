package in.gov.master.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.master.model.User1;

@Repository
public interface MasterDao extends CrudRepository<User1, Long>  {

}
