package com.pharos.PharosDBmapper.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "GENDER", schema = "pharosdb")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GENDER_ID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "GENDERVAL", nullable = false)
    private String genderval;

    @Size(max = 5)
    @NotNull
    @Column(name = "ENABLE", nullable = false, length = 5)
    private String enable;

    @OneToMany(mappedBy = "gender")
    private Set<Candidate> candidates = new LinkedHashSet<>();

}