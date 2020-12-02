package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Pet;

import java.util.Set;

public interface IPetService {
    Pet findById(Long id);
    void update(Pet pet);
    Set<Pet> findAll();
}
