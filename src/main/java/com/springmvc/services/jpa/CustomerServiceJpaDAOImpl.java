package com.springmvc.services.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.*;
import com.springmvc.services.*;

@Service
@Profile("jpadao")
public class CustomerServiceJpaDAOImpl extends AbstractJpaDAOService implements CustomerService{

	
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
	public void delete(Long id) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Customer.class, id));
		em.getTransaction().commit();
		
	}
}
