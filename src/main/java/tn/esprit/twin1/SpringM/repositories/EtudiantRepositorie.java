package tn.esprit.twin1.SpringM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin1.SpringM.entities.Etudiant;

@Repository
public interface EtudiantRepositorie extends JpaRepository<Etudiant,Long>
{

}
