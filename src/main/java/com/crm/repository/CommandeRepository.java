package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
		
		/*
		@Query("select numcommande, mntcommande, datecommande from commande where client=:id")
		public List<Commande> findcmdbyclt(@Param("id") long id);*/
}
