package com.spring.batch.bank.Repository;

import com.spring.batch.bank.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
