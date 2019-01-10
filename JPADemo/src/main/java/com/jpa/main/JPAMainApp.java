package com.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Alien;

public class JPAMainApp {

	public static void main(String[] args) {
		
		//factory design pattern
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlienPU"); //inside double quotes we have to mentioned persistent unit name
		EntityManager em = emf.createEntityManager() ;
		
		System.out.println("Fetching the value from table using JPA");
		Alien alien = em.find(Alien.class, 4);
		
		System.out.println(alien);
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Saving object using JPA");
		Alien alien1 = new Alien();
		alien1.setId(7);
		alien1.setName("Alien7");
		alien1.setPlanet("Planet 7");
		
		em.getTransaction().begin();
		em.persist(alien1);
		em.getTransaction().commit();
		System.out.println(alien1);
	}

}
