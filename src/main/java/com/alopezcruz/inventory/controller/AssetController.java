package com.alopezcruz.inventory.controller;

import com.alopezcruz.inventory.model.Asset;
import com.alopezcruz.inventory.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activos")
@CrossOrigin(origins = "*") 
public class AssetController {

    @Autowired
    private AssetRepository repository;

    
    @GetMapping
    public List<Asset> listarTodos() {
        return repository.findAll();
    }

    
    @PostMapping
    public Asset guardar(@RequestBody Asset nuevoActivo) {
        return repository.save(nuevoActivo);
    }
}