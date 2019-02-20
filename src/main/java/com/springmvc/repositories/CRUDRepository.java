package com.springmvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;



public interface CRUDRepository<T,ID> extends Repository<T, ID> {

   <S extends T> S save (S var1);
   
   T saveOrUpdate(T BaseEntity);
   
   <S extends T> Iterable<S> saveAll (Iterable <S> var1);
   
   Optional<T> findByid(ID var1);
   
   boolean existsById(ID var1);
   
   List<?>listAll();
   
   Iterable<T> findAll();
   
   Iterable<T> findAllById(Iterable<ID> var1);
   
   long count();
   
   void deleteById(ID var1);
   
   void delete(T var1);   
   
   void deleteAll(Iterable<? extends T> var1);
   
   void deleteAll();
}
