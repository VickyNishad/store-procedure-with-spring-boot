package com.crud.sqlserver.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.sqlserver.model.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EntityManager eManager;
	
	@SuppressWarnings("unchecked")
	public List<Employee> getList()
	{
		return eManager.createNamedStoredProcedureQuery("getAllEmpl").getResultList();
	}
//
//	public int getList() {
//		// TODO Auto-generated method stub
//		return eManager.createNamedStoredProcedureQuery("getAllEmpl").getFirstResult();
//	}

}
