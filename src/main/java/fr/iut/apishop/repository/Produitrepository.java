package fr.iut.apishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.iut.apishop.model.Produit;

@RepositoryRestResource
public interface Produitrepository extends JpaRepository<Produit, Long>{

}
