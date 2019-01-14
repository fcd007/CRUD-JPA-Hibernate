package com.ufersacc.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ufersacc.modelo.Cliente;

public class RemovendoPrimeiroObjeto {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 3L);
		
		if(cliente != null){
			em.getTransaction().begin();
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Objeto removido com sucesso");
		}else
		{
			System.out.println("Cliente não encontrado");
		}
		
	}

}
