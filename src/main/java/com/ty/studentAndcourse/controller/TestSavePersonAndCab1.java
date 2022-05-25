package com.ty.studentAndcourse.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.studentAndcourse.dto.Cab;
import com.ty.studentAndcourse.dto.Person;

public class TestSavePersonAndCab1 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person1=new Person();
		person1.setName("prashant");
		person1.setEmail("p@gmail.com");
		person1.setAge(21);
		
		Person person2=new Person();
		person2.setName("ram");
		person2.setEmail("r@gmail.com");
		person2.setAge(22);
		
		Person person3=new Person();
		person3.setName("mahadev");
		person3.setEmail("m@gmail.com");
		person3.setAge(25);
		
		Cab cab1=new Cab();
		cab1.setDriverName("rajesh");
		cab1.setCost(100);
		
		Cab cab2=new Cab();
		cab2.setDriverName("manju");
		cab2.setCost(100);
		
		Cab cab3=new Cab();
		cab3.setDriverName("deepak");
		cab3.setCost(100);
		
		List<Cab> cabs=new ArrayList<Cab>();
		cabs.add(cab1);
		cabs.add(cab3);
		
		List<Cab> cabs1=new ArrayList<Cab>();
		cabs1.add(cab2);
		cabs1.add(cab1);
		cabs1.add(cab3);
		
		List<Cab> cabs2=new ArrayList<Cab>();
		cabs2.add(cab2);
		cabs2.add(cab3);
		
		person1.setCabs(cabs);
		person2.setCabs(cabs1);
		person3.setCabs(cabs2);
		
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		entityManager.persist(cab3);
		entityTransaction.commit();
	}
}
