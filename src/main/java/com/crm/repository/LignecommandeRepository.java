package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.model.Ligne_commande;

public interface LignecommandeRepository extends JpaRepository<Ligne_commande, Long> {

}
