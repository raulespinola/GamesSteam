package com.springmvc.services.jpa;

import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.*;
import com.springmvc.services.*;

@Service
@Profile("jpadao")
public class UserServiceJpaDAOImpl extends AbstractJpaDAOService  implements UserService {


//	private EncryptionService encryptionService;
	

//	@Autowired
//	public void setEncryptionService(EncryptionService encryptionService) {
//		this.encryptionService = encryptionService;
//	}

	
	
	@Override
	public List<?> listAll() {
		EntityManager em= emf.createEntityManager();
		
		return em.createQuery("from User", User.class).getResultList();
	}

	@Override
	public User getById(Long id) {
		EntityManager em=emf.createEntityManager();
		
		return em.find(User.class, id);
	}

	@Override
	public User saveOrUpdate(User domainObject) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

//		if (domainObject.getPassword() != null) {
//			domainObject.setEncryptedPassword(encryptionService.encryptString(domainObject.getPassword()));
//		}
		User savedUser =  em.merge(domainObject);
		em.getTransaction().commit();

		return savedUser;
	}

	@Override
	public void delete(Long id) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(User.class, id));
		em.getTransaction().commit();
		
	}
}
