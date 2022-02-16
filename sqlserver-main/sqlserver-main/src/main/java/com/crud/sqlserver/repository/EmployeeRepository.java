package com.crud.sqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.sqlserver.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
