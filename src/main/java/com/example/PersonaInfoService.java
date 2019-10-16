package com.example;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class PersonaInfoService {
	private List<PersonaInfo> personaList = null;
	public PersonaInfoService() {
		personaList = new LinkedList<>();
		PersonaInfo persona1 = new PersonaInfo();
		persona1.setId(1);
		persona1.setName("Peter");
		persona1.setLastName("Jobs");
		persona1.setAddress("Fake Address 1");
		persona1.setPhoneNumber(5454646);
		persona1.setHairColour("black");
		
		PersonaInfo persona2 = new PersonaInfo();
		persona2.setId(2);
		persona2.setName("Alexis");
		persona2.setLastName("Huaiqui");
		persona2.setAddress("Fake Address 2");
		persona2.setPhoneNumber(2345235);
		persona2.setHairColour("brown");
		personaList.add(persona1);
		personaList.add(persona2);
	}
	
	
    public List<PersonaInfo> findAll() {
        return personaList;
    }

    public PersonaInfo buscarPorId(int id) {
		for (PersonaInfo p : personaList){
			if (p.getId() == id){
				return p;				
			}
		}
		return null;
	}

    public void add(PersonaInfo persona) {
    	personaList.add(persona);
    }

    public void delete(PersonaInfo persona) {
    	personaList.remove(persona);
    }
}
