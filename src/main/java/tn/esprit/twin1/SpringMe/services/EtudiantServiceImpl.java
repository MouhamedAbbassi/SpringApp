package tn.esprit.twin1.SpringMe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin1.SpringMe.entities.Etudiant;
import tn.esprit.twin1.SpringMe.repositories.EtudiantRepositorie;

import java.util.List;

@Service
public class EtudiantServiceImpl  implements EtudiantService{

    @Autowired
    private EtudiantRepositorie etudiantRepositorie ;

    @Override
    public List<Etudiant> getAllStudents() {
        return etudiantRepositorie.findAll();
    }

    @Override
    public void deleteEtudiant(long idEtudiant) {
        etudiantRepositorie.deleteById(idEtudiant);

    }


    @Override
    public Etudiant findById(long idEtudiant) {
        return etudiantRepositorie.findById(idEtudiant).get();
    }

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepositorie.save(etudiant);

    }
}