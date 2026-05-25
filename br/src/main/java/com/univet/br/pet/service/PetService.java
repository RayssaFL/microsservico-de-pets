package com.univet.br.pet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.univet.br.pet.model.Pet;
import com.univet.br.pet.repository.PetRepository;

@Service
public class PetService {

    private final PetRepository repository;

    public PetService(PetRepository repository){
        this.repository = repository;
    }

    public List<Pet> listarTodos(){
        return repository.findAll();
    }

    public Pet buscarPorId(String id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Pet não encontrado"));
    }

    public Pet cadastrar(Pet pet){
        if(pet.getNome() == null || pet.getNome().isEmpty()){
            throw new RuntimeException("O nome é obrigatório!");
        }
        if(pet.getEspecie() == null || pet.getEspecie().isEmpty()){
            throw new RuntimeException("A espécie é obrigatória!");
        }
        if(pet.getIdade() != null && pet.getIdade() < 0){
            throw new RuntimeException("Idade inválida");
        }
        if(pet.getPeso() != null && pet.getPeso() <= 0){
            throw new RuntimeException("Peso inválido!");
        }
        return repository.save(pet);
    }

    public Pet atualizar(String id, Pet petAtualizado) {
        Pet pet = buscarPorId(id);
        pet.setNome(petAtualizado.getNome());
        pet.setEspecie(petAtualizado.getEspecie());
        pet.setRaca(petAtualizado.getRaca());
        pet.setIdade(petAtualizado.getIdade());
        pet.setSexo(petAtualizado.getSexo());
        pet.setPeso(petAtualizado.getPeso());
        pet.setHistoricoMedico(petAtualizado.getHistoricoMedico());
        pet.setIdTutor(petAtualizado.getIdTutor());
        return repository.save(pet);
    }

    public void deletar(String id) {
        Pet pet = buscarPorId(id);
        repository.delete(pet);
    }
}
