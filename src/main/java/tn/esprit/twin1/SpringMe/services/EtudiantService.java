package tn.esprit.twin1.SpringMe.services;

import tn.esprit.twin1.SpringMe.entities.Etudiant;

import java.util.List;

public interface EtudiantService {


List<Etudiant> getAllStudents();
void deleteEtudiant (long idEtudiant);
Etudiant findById(long idEtudiant);
Etudiant saveEtudiant(Etudiant etudiant);

Etudiant updateEtudiant(long idEtudiant ,Etudiant updatedEtudiant);
}