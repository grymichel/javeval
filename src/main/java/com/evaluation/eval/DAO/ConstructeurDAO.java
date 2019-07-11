package com.evaluation.eval.DAO;



import java.util.List;
import com.evaluation.eval.model.Constructeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructeurDAO extends JpaRepository<Constructeur, Integer> {
    ConstructeurDAO findById(int id);
    ConstructeurDAO findByNom(int nom);
}
