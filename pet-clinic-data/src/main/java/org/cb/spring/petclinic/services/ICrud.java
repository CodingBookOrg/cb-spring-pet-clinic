package org.cb.spring.petclinic.services;

import java.util.Set;

public interface ICrud<ElementType, IDType> {
    Set<ElementType> findAll();
    ElementType findById(IDType id);
    void save(IDType id, ElementType element);
    void delete(ElementType element);
    void deleteById(IDType id);
}
