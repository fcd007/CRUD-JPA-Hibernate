package com.ufersacc.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ufersacc.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 6L);
		
		em.getTransaction().begin();
		cliente.setNome("Teste12");
		cliente.setIdade(25);
		em.getTransaction().commit();
		
		System.out.println("Cliente atualizado com sucesso!");
		//em.close();
	}

}
