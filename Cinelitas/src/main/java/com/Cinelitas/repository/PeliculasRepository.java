/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.repository;

import com.Cinelitas.entity.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;





/**
 *
 * @author kbalt
 */
@Repository
public interface PeliculasRepository extends CrudRepository <Peliculas, Long>{
    
}
