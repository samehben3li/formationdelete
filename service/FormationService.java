package tn.isima.formationdelete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.isima.formationdelete.exception.FormationNotFoundException;
import tn.isima.formationdelete.model.Formation;
import tn.isima.formationdelete.repo.FormationRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class FormationService {
    private final FormationRepo formationRepo;

    @Autowired
    public FormationService(FormationRepo formationRepo) {
        this.formationRepo = formationRepo;
    }

    public void deleteFormation(Long id){
        formationRepo.deleteFormationById(id);
    }


}
