package com.avandal.cdb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
public class Company {
    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
//    private Set<Computer> computers;

    public static class Builder {
        private Company company;

        public Builder() {
            this.company = new Company();
        }

        public Builder id(Long id) {
            this.company.setId(id);
            return this;
        }

        public Builder name(String name) {
            this.company.setName(name);
            return this;
        }

        public Company build() {
            return company;
        }
    }
}
