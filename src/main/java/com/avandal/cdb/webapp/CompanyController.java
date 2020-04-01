package com.avandal.cdb.webapp;

import com.avandal.cdb.dto.CompanyDto;
import com.avandal.cdb.mapper.CompanyMapper;
import com.avandal.cdb.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
@Slf4j
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CompanyDto>> findAll() {
        log.debug("findAll");
        return ResponseEntity.ok(CompanyMapper.toDtos(companyService.findAll()));
    }
}
