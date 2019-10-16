package com.example;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/persona")
public class PersonaInfoAPI {
	private PersonaInfoService personaInfoService;
	
	@GetMapping
    public ResponseEntity<List<PersonaInfo>> findAll() {
        return ResponseEntity.ok(personaInfoService.findAll());
    }
}
