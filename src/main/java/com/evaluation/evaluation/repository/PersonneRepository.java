package com.evaluation.evaluation.repository;

import com.evaluation.evaluation.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
