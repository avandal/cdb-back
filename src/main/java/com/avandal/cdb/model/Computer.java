package com.avandal.cdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "computer")
@Data
@NoArgsConstructor
public class Computer {
    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "introduced")
    private LocalDate introduced;

    @Column(name = "discontinued")
    private LocalDate discontinued;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public static class Builder {
        private Computer computer;

        public Builder() {
            this.computer = new Computer();
        }

        public Builder id(Long id) {
            computer.setId(id);
            return this;
        }

        public Builder name(String name) {
            computer.setName(name);
            return this;
        }

        public Builder introduced(LocalDate introduced) {
            computer.setIntroduced(introduced);
            return this;
        }

        public Builder discontinued(LocalDate discontinued) {
            computer.setDiscontinued(discontinued);
            return this;
        }

        public Builder company(Company company) {
            computer.setCompany(company);
            return this;
        }

        public Computer build() {
            return computer;
        }
    }
}
