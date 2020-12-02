package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Owner;

import java.util.Set;

public interface IOwnerService {
    Owner findById(Long id);
    void update(Owner owner);
    Set<Owner> findAll();
}
