package com.example;
import org.springframework.stereotype.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping(value="/peliculas")
public class PersonaInfoController {
	
	@Autowired
	private PersonaInfoService personaInfoService;
	
	@GetMapping(value = "/index")
	public String showIndex(Model model) {
		List<PersonaInfo> lista = personaInfoService.findAll();
		model.addAttribute("personas", lista);
		return "persona";
	}
	@GetMapping(value = "/delete/{id}")
	public String eliminar(@PathVariable("id") int id, RedirectAttributes attributes) {
		PersonaInfo personaInfo = personaInfoService.findById(id);		
		
		personaInfoService.delete(id);
		
		return "redirect:/persona";
	}
}
