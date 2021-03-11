package com.cg.jpal.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static final String PERSISTENCE_UNIT_NAME = "postgrePU";
	private static EntityManager entityManager;
	private static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager() {
		
		if(emf == null){
			
			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			entityManager = emf.createEntityManager();
			
		}
		
		return entityManager;
		
	}
	
	public static void shutdown() {
		
		if(entityManager != null) {
			
			entityManager.close();
			if(emf != null) {
				
				emf.close();
				
			}
			
		}
		
	}


}
