package com.pharos.PharosDBmapper.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PASSWORD_HISTORY", schema = "pharosdb")
public class PasswordHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PASSWORD_ID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;

    @Size(max = 5)
    @NotNull
    @Column(name = "ENABLE", nullable = false, length = 5)
    private String enable;

    @NotNull
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;

    @NotNull
    @Column(name = "LATEST", nullable = false)
    private Boolean isLatest;

    @OneToMany(mappedBy = "passwordHistory")
    private Set<Candidate> candidates = new LinkedHashSet<>();

}
