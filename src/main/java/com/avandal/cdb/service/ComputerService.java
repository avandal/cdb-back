package com.avandal.cdb.service;

import com.avandal.cdb.model.Computer;
import com.avandal.cdb.persistence.ComputerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ComputerService {
    private final ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> findAll() {
        return computerRepository.findAll();
    }
}
