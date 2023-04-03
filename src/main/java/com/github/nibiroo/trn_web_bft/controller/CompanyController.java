package com.github.nibiroo.trn_web_bft.controller;

import com.github.nibiroo.trn_web_bft.entity.Company;
import com.github.nibiroo.trn_web_bft.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/company")
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Company create(@RequestBody Company requestBodyCompany) {
        return companyService.create(requestBodyCompany);
    }

}
