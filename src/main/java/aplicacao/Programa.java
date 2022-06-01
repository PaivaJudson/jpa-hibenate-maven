package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 1);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!!");
		em.close();
		emf.close();
		
	}
	
	public static void buscarPessoa() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
	}
	
	public static void inserirPessoas() {
		Pessoa p1 = new Pessoa(null, "Judson Paiva", "judsonpaiva16@gmail.com");
		Pessoa p2 = new Pessoa(null, "Leonor Paiva", "leonajose2020@gmail.com");
		Pessoa p3 = new Pessoa(null, "Jéssica Paiva", "jessicavanda@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Início");
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!!");
	}
}
