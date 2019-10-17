package com.example;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
@RestController
@RequestMapping("/api/v1/persona")
public class PersonaInfoAPI {
	private PersonaInfoService personaInfoService;
	
	@GetMapping
    public ResponseEntity<List<PersonaInfo>> findAll() {
        return ResponseEntity.ok(personaInfoService.findAll());
    }
	
	

    @GetMapping("/{id}")
    public ResponseEntity<PersonaInfo> findById(@PathVariable int id) {
        PersonaInfo personaInfo = personaInfoService.findById(id);
        if (personaInfo == null) {
            System.out.print("Id " + id + " does not exist");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(personaInfo);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PersonaInfo> update(@PathVariable int id, @Valid @RequestBody PersonaInfo personaInfo) {
        if (personaInfoService.findById(id) == null) {
        	System.out.print("Id " + id + " does not exist");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(personaInfo);
    }
}
