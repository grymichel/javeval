package com.evaluation.eval.DAO;
import java.util.List;
import com.evaluation.eval.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureDAO extends JpaRepository<Voiture, Integer> {

    Voiture findById(int id);
    Voiture findByNom(String nom);
    List<Voiture> findByConstructeur(String constructeur);


    Voiture findByNomIgnoreCase(String nom);
}
