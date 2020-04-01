package com.avandal.cdb.dto;

import lombok.Data;

@Data
public class ComputerDto {
    private Long id;
    private String name;
    private String introduced;
    private String discontinued;
    private CompanyDto company;

    public static class Builder {
        private ComputerDto computer;

        public Builder() {
            this.computer = new ComputerDto();
        }

        public Builder id(Long id) {
            computer.setId(id);
            return this;
        }

        public Builder name(String name) {
            computer.setName(name);
            return this;
        }

        public Builder introduced(String introduced) {
            computer.setIntroduced(introduced);
            return this;
        }

        public Builder discontinued(String discontinued) {
            computer.setDiscontinued(discontinued);
            return this;
        }

        public Builder company(CompanyDto company) {
            computer.setCompany(company);
            return this;
        }

        public ComputerDto build() {
            return computer;
        }
    }
}
