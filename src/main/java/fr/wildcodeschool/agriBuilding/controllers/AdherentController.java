package fr.wildcodeschool.agriBuilding.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.wildcodeschool.agriBuilding.entities.Adherent;
import fr.wildcodeschool.agriBuilding.repositories.AdherentRepository;

@Controller
public class AdherentController {
    
    @Autowired
    private AdherentRepository adherentRepository;

    @GetMapping("/adherents")
    public String browse(Model model) {
        List<Adherent> adherents = adherentRepository.findAll();
        model.addAttribute("adherents", adherents);
        return "solution";
    }

    @GetMapping("/adherents/{expertise}")
    public String filterByExpertise(Model model, @PathVariable String expertise) {
        List<Adherent> adherents = adherentRepository.findByExpertise(expertise);
        model.addAttribute("adherents", adherents);
        return "solution";
    }
}