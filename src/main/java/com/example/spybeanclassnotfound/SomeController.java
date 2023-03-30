package com.example.spybeanclassnotfound;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SomeController {

    private final SomeRepository someRepository;

    public SomeController(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    @GetMapping("/username")
    public ResponseEntity<List<TestEntity>> getUserName() {
       // return "test";
        //return spybeanClassnotfoundRepository.findByName("Jane").orElseThrow().getName();
        List<TestEntity> testEntities = someRepository.findAll();
        return ResponseEntity.ok(testEntities);
    }

}
