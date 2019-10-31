package in.gov.master.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import in.gov.master.model.BankModel;

 @Repository
 public interface BankModelDao extends CrudRepository<BankModel, Long> {
   
 }
