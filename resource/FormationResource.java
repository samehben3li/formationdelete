package tn.isima.formationdelete.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.isima.formationdelete.model.Formation;
import tn.isima.formationdelete.service.FormationService;

import java.util.List;

@RestController
@RequestMapping("/formation")
@CrossOrigin(origins = "*")
public class FormationResource {
    private final FormationService FormationService;

    public FormationResource(FormationService formationService) {
        this.formationService = formationService;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFormation(@PathVariable("id") Long id) {
        formationService.deleteFormation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
   

   
}
