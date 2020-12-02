package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Vet;

import java.util.Set;

public interface IVetService {
    Vet findById(Long id);
    void update(Vet vet);
    Set<Vet> findAll();
}
