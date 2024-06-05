package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Company {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp = new Employee("Apple", 108,534534, "india");
		
		em.persist(emp);//insert
		
//		em.merge(emp); //update
		
		Employee emp2 = em.find(Employee.class, "Apple"); //select
		
		System.out.println(emp2);
		
		em.remove(emp2); //delete
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Data is inserted successfully");
		
		
		
	}
}
