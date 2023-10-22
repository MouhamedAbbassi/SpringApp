package tn.esprit.twin1.SpringM.services;

import tn.esprit.twin1.SpringM.entities.Etudiant;

import java.util.List;

public interface EtudiantService {


List<Etudiant> getAllStudents();
void deleteEtudiant (long idEtudiant);
Etudiant findById(long idEtudiant);
}