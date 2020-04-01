package com.avandal.cdb.webapp;

import com.avandal.cdb.dto.ComputerDto;
import com.avandal.cdb.mapper.ComputerMapper;
import com.avandal.cdb.service.ComputerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/computer")
@Slf4j
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ComputerDto>> findAll() {
        return ResponseEntity.ok(ComputerMapper.toDtos(computerService.findAll()));
    }
}
