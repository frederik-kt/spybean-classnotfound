package com.example.spybeanclassnotfound;

import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Table(name = "TEST_ENTITY")
public interface SpybeanClassnotfoundRepository extends JpaRepository<TestEntity, Integer> {

    Optional<TestEntity> findByName(String name);

    List<TestEntity> findAll();
}
