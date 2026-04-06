package com.alopezcruz.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity 
@Data   
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;        
    private String tipo;          
    private String serie;        
    private String estado;        
    private String asignadoA;     
}