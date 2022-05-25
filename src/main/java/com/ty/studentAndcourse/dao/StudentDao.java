package com.ty.studentAndcourse.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.studentAndcourse.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction  entityTransaction=entityManager.getTransaction();
	
	public Student saveStudent(Student student)
	{
		return student;
		
	}
}
