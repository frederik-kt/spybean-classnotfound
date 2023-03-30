package com.example.spybeanclassnotfound;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpybeanClassnotfoundController {

    private final SpybeanClassnotfoundRepository spybeanClassnotfoundRepository;

    public SpybeanClassnotfoundController(SpybeanClassnotfoundRepository spybeanClassnotfoundRepository) {
        this.spybeanClassnotfoundRepository = spybeanClassnotfoundRepository;
    }

    @GetMapping("/username")
    public ResponseEntity<List<TestEntity>> getUserName() {
       // return "test";
        //return spybeanClassnotfoundRepository.findByName("Jane").orElseThrow().getName();
        List<TestEntity> testEntities = spybeanClassnotfoundRepository.findAll();
        return ResponseEntity.ok(testEntities);
    }

}
