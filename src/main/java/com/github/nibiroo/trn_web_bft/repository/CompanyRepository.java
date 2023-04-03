package com.github.nibiroo.trn_web_bft.repository;

import com.github.nibiroo.trn_web_bft.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findByNameContains(String name);
}
