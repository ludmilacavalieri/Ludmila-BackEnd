/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backPortfolio.Ludmila.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author LUDMILA
 */
@Entity
public class Educacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private String descEdu;
    private String imagenEdu;
    
    public Educacion(){
    
    }
        
public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }
    
    public Long getIdEdu(){
        return idEdu;
    }
    
    public void setIdEdu(Long idEdu) {
        this.idEdu= idEdu;
    }
    
    public String getTituloEdu(){
        return tituloEdu;
    }
    
    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu= tituloEdu;
    }
    
       public int getFechaEdu(){
        return fechaEdu;
    }
    
    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu= fechaEdu;
    }
    
    public String getDescEdu(){
        return descEdu;
    }
    
    public void setDescEdu(String descEdu) {
        this.descEdu= descEdu;
    }
    public String getImagenEdu(){
        return imagenEdu;
    }
    
    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu= imagenEdu;
    }
        
    
}
