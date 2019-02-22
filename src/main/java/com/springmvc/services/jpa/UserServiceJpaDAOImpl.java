package com.springmvc.services.jpa;

import java.util.List;
import java.util.Optional;

import javax.persistence.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.*;
import com.springmvc.repositories.UserRepository;
import com.springmvc.services.*;

@Service
@Profile("jpadao")
public class UserServiceJpaDAOImpl extends AbstractJpaDAOService  implements UserRepository {


	
	@Override
	public List<User> listAll() {
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
	public void deleteById(Long id) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(User.class, id));
		em.getTransaction().commit();
		
	}
	
	@Override
	public void delete(User user) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(User.class, user));
		em.getTransaction().commit();
		
	}

	@Override
	public Optional<User> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<User> findById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll(Iterable<? extends User> var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
