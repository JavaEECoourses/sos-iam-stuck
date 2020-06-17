package com.formationjee.sosiamstuck.controller;

import com.formationjee.sosiamstuck.bo.Depanneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.formationjee.sosiamstuck.services.DepanneurServices;

import java.util.List;

@RestController
public class DepanneurController {
    @Autowired
    DepanneurServices depanneurServices;

    @PostMapping("/addDepanneur")
    public Depanneur addDepaneur(@RequestBody Depanneur dep){
        return depanneurServices.saveDepanneur(dep);
    }

    @GetMapping("/AllDepanneurs")
    public List<Depanneur> getAllDepanneur(){
        return depanneurServices.getAllDepanneur();
    }

    @GetMapping("/Depanneur/{nom}")
    public Depanneur getDepanneurByNom(@PathVariable String nom){
        return  depanneurServices.getDepanneurByNom(nom);
    }

    @PutMapping("/updateDepanneur")
    public Depanneur updateDepanneur(@RequestBody Depanneur dep){
        return  depanneurServices.updateDepanneur(dep);
    }

}