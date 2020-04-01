package com.avandal.cdb.dto;

import com.avandal.cdb.model.Company;
import lombok.Data;

@Data
public class CompanyDto {
    private Long id;
    private String name;

    public static class Builder {
        private CompanyDto company;

        public Builder() {
            this.company = new CompanyDto();
        }

        public Builder id(Long id) {
            this.company.setId(id);
            return this;
        }

        public Builder name(String name) {
            this.company.setName(name);
            return this;
        }

        public CompanyDto build() {
            return company;
        }
    }
}
