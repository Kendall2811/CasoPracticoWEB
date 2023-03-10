/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.controller;

import com.Cinelitas.entity.Peliculas;
import com.Cinelitas.entity.Salas;
import com.Cinelitas.service.IPeliculasService;
import com.Cinelitas.service.ISalasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author kbalt
 */
@Controller
public class PeliculasController {
    
    @Autowired
    private IPeliculasService peliculasService;

    @Autowired
    private ISalasService salasService;

    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Peliculas> listaPeliculas = peliculasService.getAllPeliculas();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
    }
    
    @GetMapping("/peliculasN")
    public String crearPeliculas(Model model) {
        List<Salas> listaSalas = salasService.listSalas();
        model.addAttribute("peliculas", new Peliculas());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPeliculas(@PathVariable("id") Long idPeliculas) {
        peliculasService.delete(idPeliculas);
        return "redirect:/peliculas";
    }

    @PostMapping("/save")
    public String guardarPeliculas(@ModelAttribute Peliculas peliculas) {
        peliculasService.savePeliculas(peliculas);
        return "redirect:/peliculas";
    }

    @GetMapping("/editPeliculas/{id}")
    public String editarPeliculas(@PathVariable("id") Long idPeliculas, Model model) {
        Peliculas peliculas = peliculasService.getPeliculasById(idPeliculas);
        List<Salas> listSalas = salasService.listSalas();
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("salas", listSalas);
        return "crear";
    }
}
