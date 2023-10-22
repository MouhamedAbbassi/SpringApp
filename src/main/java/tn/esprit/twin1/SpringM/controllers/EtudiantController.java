package tn.esprit.twin1.SpringM.controllers;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin1.SpringM.entities.Etudiant;
import tn.esprit.twin1.SpringM.services.EtudiantService;

import java.util.List;
@RestController
@RequestMapping("/etudiant")
@CrossOrigin(origins = "http://localhost:4200")
public class EtudiantController
{
    @Autowired
    private EtudiantService etudiantService ;

    @GetMapping("/getAll")
    public ResponseEntity<List<Etudiant>> getAllEtudiant(){
        List<Etudiant> etudiants=etudiantService.getAllStudents();
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idEtudiant}")
    public ResponseEntity<String> deleteEtudiantC(@PathVariable long idEtudiant) {
        try {
           Etudiant etudiant = etudiantService.findById(idEtudiant);
            if(etudiant !=null){
            etudiantService.deleteEtudiant(idEtudiant);
            return new ResponseEntity<>( HttpStatus.OK);
            }
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // Handle other exceptions with a 500 Internal Server Error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}


