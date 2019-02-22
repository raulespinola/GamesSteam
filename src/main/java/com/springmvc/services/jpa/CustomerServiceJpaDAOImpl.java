package com.springmvc.services.jpa;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.*;
import com.springmvc.repositories.CustomerRepository;
import com.springmvc.services.*;

@Service
@Profile("jpadao")
public class CustomerServiceJpaDAOImpl extends AbstractJpaDAOService implements CustomerRepository{

	
	//private EncryptionService encryptionService;

//	@Autowired
//	private void setEncryptionService(EncryptionService encryptionService) {
//		this.encryptionService = encryptionService;
//	}
	
	
	@Override
	public List<Customer> listAll() {
		
		EntityManager em=emf.createEntityManager();
		return em.createQuery("from Customer", Customer.class).getResultList();
	}

	@Override
	public Customer getById(Long id) {
		
		EntityManager em=emf.createEntityManager();
		
		return em.find(Customer.class, id);
	}

	@Override
	public Customer saveOrUpdate(Customer domainObject) {
		// TODO Auto-generated method stub
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
//		if (domainObject.getUser() != null && domainObject.getUser().getPassword() != null) {
//			domainObject.getUser()
//					.setEncryptedPassword(encryptionService.encryptString(domainObject.getUser().getPassword()));
//		}
		Customer savedCustomer = (Customer) em.merge(domainObject);
		
		em.getTransaction().commit();
		
		return savedCustomer;
	}

	@Override
	public void deleteById(Long id) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Customer.class, id));
		em.getTransaction().commit();
		
	}
	
	@Override
	public void delete(Customer customer) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Customer.class, customer));
		em.getTransaction().commit();
		
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		EntityManager em=emf.createEntityManager();
		
		return em.createQuery("from Customer where lastName='lastName'", Customer.class).getResultList();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Customer> findById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAllById(Iterable<Long> var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S save(S var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> Iterable<S> saveAll(Iterable<S> var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll(Iterable<? extends Customer> var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
