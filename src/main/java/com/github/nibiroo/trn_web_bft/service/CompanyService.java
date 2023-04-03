package com.github.nibiroo.trn_web_bft.service;

import com.github.nibiroo.trn_web_bft.entity.Company;
import com.github.nibiroo.trn_web_bft.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company create(Company requestBodyCompany) {
        return companyRepository.save(requestBodyCompany);
    }
}
