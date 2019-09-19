package fr.wildcodeschool.agriBuilding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.wildcodeschool.agriBuilding.entities.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
    
}