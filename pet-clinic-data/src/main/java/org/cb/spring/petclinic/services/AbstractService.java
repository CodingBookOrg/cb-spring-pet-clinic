package org.cb.spring.petclinic.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractService<ElementType, IDType> implements ICrud<ElementType, IDType> {
    private Map<IDType, ElementType> elements;

    public AbstractService() {
        this.elements = new HashMap<>();
    }

    @Override
    public Set<ElementType> findAll() {
        return new HashSet<>(elements.values());
    }

    @Override
    public ElementType findById(IDType id) {
        return elements.get(id);
    }

    @Override
    public void save(IDType id, ElementType element) {
        elements.put(id, element);
    }

    @Override
    public void delete(ElementType element) {
        elements.entrySet().removeIf(entry -> entry.equals(element));

    }

    @Override
    public void deleteById(IDType id) {
        elements.remove(id);
    }
}
