package tn.isima.formationdelete.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.isima.formationdelete.model.Formation;

import java.util.Optional;

public interface FormationRepo extends JpaRepository<Formation, Long> {
    void deleteFormationById(Long id);

    Optional<Employee> findFormationById(Long id);
}
