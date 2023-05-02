package com.pharos.PharosDBmapper.repository;

import com.pharos.PharosDBmapper.entities.PasswordHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordHistoryRepository extends JpaRepository<PasswordHistory, Integer> {
}
