package com.avandal.cdb.mapper;

import com.avandal.cdb.dto.ComputerDto;
import com.avandal.cdb.model.Computer;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerMapper {
    public static Computer toModel(ComputerDto computerDto) {
        if (computerDto == null) {
            return null;
        }

        return new Computer.Builder()
                .id(computerDto.getId())
                .name(computerDto.getName())
                .introduced(DateMapper.toDate(computerDto.getIntroduced()))
                .discontinued(DateMapper.toDate(computerDto.getDiscontinued()))
                .company(CompanyMapper.toModel(computerDto.getCompany()))
                .build();
    }

    public static List<Computer> toModels(List<ComputerDto> list) {
        if (list == null) {
            return List.of();
        }

        return list.stream().map(ComputerMapper::toModel).collect(Collectors.toList());
    }

    public static ComputerDto toDto(Computer computer) {
        if (computer == null) {
            return null;
        }

        return new ComputerDto.Builder()
                .id(computer.getId())
                .name(computer.getName())
                .introduced(DateMapper.toString(computer.getIntroduced()))
                .discontinued(DateMapper.toString(computer.getDiscontinued()))
                .company(CompanyMapper.toDto(computer.getCompany()))
                .build();
    }

    public static List<ComputerDto> toDtos(List<Computer> list) {
        if (list == null) {
            return List.of();
        }

        return list.stream().map(ComputerMapper::toDto).collect(Collectors.toList());
    }
}
