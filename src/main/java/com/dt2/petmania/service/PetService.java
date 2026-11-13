package com.dt2.petmania.service;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> mostrarPet(){
        List<Pet> petsList = new ArrayList<>();
        return petsList = repository.findAll();
    }

    public Pet buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void cadastrarPet(Pet animation) {
        Pet pet = new Pet();
        pet.setNome(animation.getNome());
        pet.setEspecie(animation.getNome());
        pet.setRaca(animation.getRaca());
        pet.setIdade(animation.getIdade());
        pet.setSexo(animation.getSexo());
        pet.setPorte(animation.getPorte());
        pet.setPersonalidade(animation.getPersonalidade());
        pet.setFoto(animation.getFoto());
        pet.setDisponivel(animation.isDisponivel());
        repository.save(pet);
    }
}



