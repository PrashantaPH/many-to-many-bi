package com.ty.studentAndcourse.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.studentAndcourse.dto.Course;
import com.ty.studentAndcourse.dto.Student;

public class TestSaveStudentAndCourse {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction  entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("prashant");
		student.setAge(21);
		
		Student student1=new Student();
		student1.setName("ram");
		student1.setAge(22);
		
		Student student2=new Student();
		student2.setName("ravi");
		student2.setAge(22);
		
		Course course1=new Course();
		course1.setName("Java");
		course1.setDuration(3);
		
		Course course2=new Course();
		course2.setName("Python");
		course2.setDuration(3);
		
		Course course3=new Course();
		course3.setName("C");
		course3.setDuration(2);
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		student.setCourses(courses);
		student1.setCourses(courses);
		student2.setCourses(courses);
		
		List<Student> students=new ArrayList<Student>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		course1.setStudent(students);
		course2.setStudent(students);
		course3.setStudent(students);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();

		
		
	}
}
