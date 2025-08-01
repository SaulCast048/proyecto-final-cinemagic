/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.metaphorce.cinemagic2.repositories;

import com.metaphorce.cinemagic2.entidades.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saul_
 */
@Repository
public interface BoletoRepository extends JpaRepository <Boleto, Integer>{
    
}
