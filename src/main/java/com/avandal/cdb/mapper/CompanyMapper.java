package com.avandal.cdb.mapper;

import com.avandal.cdb.dto.CompanyDto;
import com.avandal.cdb.model.Company;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyMapper {
    public static Company toModel(CompanyDto companyDto) {
        if (companyDto == null) {
            return null;
        }

        return new Company.Builder()
                .id(companyDto.getId())
                .name(companyDto.getName())
                .build();
    }

    public static List<Company> toModels(List<CompanyDto> list) {
        if (list == null) {
            return List.of();
        }

        return list.stream().map(CompanyMapper::toModel).collect(Collectors.toList());
    }

    public static CompanyDto toDto(Company company) {
        if (company == null) {
            return null;
        }

        return new CompanyDto.Builder()
                .id(company.getId())
                .name(company.getName())
                .build();
    }

    public static List<CompanyDto> toDtos(List<Company> list) {
        if (list == null) {
            return List.of();
        }

        return list.stream().map(CompanyMapper::toDto).collect(Collectors.toList());
    }
}
