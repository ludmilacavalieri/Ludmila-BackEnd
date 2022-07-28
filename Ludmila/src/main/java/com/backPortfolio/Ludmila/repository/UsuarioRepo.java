/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backPortfolio.Ludmila.repository;

import com.backPortfolio.Ludmila.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LUDMILA
 */
public interface UsuarioRepo extends JpaRepository<Usuario,Long>{
    
}
