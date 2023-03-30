package com.example.spybeanclassnotfound;

import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Table(name = "TEST_ENTITY")
public interface SomeRepository extends JpaRepository<TestEntity, Integer> {

    List<TestEntity> findAll();
}
