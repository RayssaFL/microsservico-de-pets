package com.univet.br.pet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univet.br.pet.model.Pet;
import com.univet.br.pet.service.PetService;

@RestController
@RequestMapping("/pets")
@CrossOrigin(origins = "*")
public class PetController {
    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }
    @GetMapping
    public List<Pet> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pet buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Pet cadastrar(@RequestBody Pet pet){
        return service.cadastrar(pet);
    }

    @PutMapping("/{id}")
    public Pet atualizar(@PathVariable String id, @RequestBody Pet pet){
        return service.atualizar(id, pet);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){
        service.deletar(id);
    }
    @GetMapping("/status")
    public String status() {
        return "Pet Service online";
    }
}
