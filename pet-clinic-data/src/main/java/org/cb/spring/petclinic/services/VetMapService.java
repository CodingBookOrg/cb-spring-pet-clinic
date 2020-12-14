package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Vet;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractService<Vet, Long> implements IVetService {}
