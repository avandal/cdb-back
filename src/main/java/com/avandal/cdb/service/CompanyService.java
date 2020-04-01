package com.avandal.cdb.service;

import com.avandal.cdb.model.Company;
import com.avandal.cdb.persistence.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        log.debug("findAll");
        return companyRepository.findAll();
    }
}
