package com.remembrall.remembrall.repositories;

import com.remembrall.remembrall.entities.Forest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ForestRepository extends JpaRepository<Forest, UUID> {
}
