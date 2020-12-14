package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractService<Pet, Long> implements IPetService {}
