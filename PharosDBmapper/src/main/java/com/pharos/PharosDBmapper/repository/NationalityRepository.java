package com.pharos.PharosDBmapper.repository;

import com.pharos.PharosDBmapper.entities.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
}
