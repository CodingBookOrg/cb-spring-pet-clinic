package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractService<Owner, Long> implements  IOwnerService { }
