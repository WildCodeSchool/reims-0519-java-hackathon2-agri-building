package fr.wildcodeschool.agriBuilding.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.wildcodeschool.agriBuilding.entities.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
    
    @Query(value="SELECT * FROM adherent where first_expertise = ?1 OR second_expertise = ?1", nativeQuery = true)
    public List<Adherent> findByExpertise(String expertise);
}