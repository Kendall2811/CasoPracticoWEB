/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entity.Peliculas;
import java.util.List;

/**
 *
 * @author kbalt
 */
public interface IPeliculasService {
    public List<Peliculas> getAllPeliculas();
    public Peliculas getPeliculasById (long id);
    //public Concierto deleteConciertoById (long id);
    public void savePeliculas(Peliculas peliculas);
    public  void delete (long id);
}
