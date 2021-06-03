package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long> {

}
