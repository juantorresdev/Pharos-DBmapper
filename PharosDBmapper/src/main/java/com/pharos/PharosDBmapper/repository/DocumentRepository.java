package com.pharos.PharosDBmapper.repository;

import com.pharos.PharosDBmapper.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
}
