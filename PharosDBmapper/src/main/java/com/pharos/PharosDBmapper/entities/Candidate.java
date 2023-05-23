package com.pharos.PharosDBmapper.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CANDIDATE", schema = "pharosdb")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CANDIDATE_ID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "PHAROS_ID", nullable = false)
    private String pharosId;

    @Size(max = 255)
    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = "LASTNAME", nullable = false)
    private String lastname;

    @NotNull
    @Column(name = "BIRTHDATE", nullable = false)
    //private LocalDate birthdate;
    private Date birthdate;

    @Size(max = 255)
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Size(max = 255)
    @NotNull
    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Size(max = 10)
    @NotNull
    @Column(name = "GENDER", nullable = false)
    private String gender;

    @Size(max = 255)
    @NotNull
    @Column(name = "STATUS", nullable = false)
    private String status;

    @Size(max = 5)
    @NotNull
    @Column(name = "ENABLE", nullable = false, length = 5)
    private String enable;

    @Size(max = 255)
    @Column(name = "ACTIVATIONCODE")
    private String activationcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NATIONALITY_ID")
    private Nationality nationality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_ID")
    private Document document;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PASSWORD_ID")
    private PasswordHistory passwordHistory;
}