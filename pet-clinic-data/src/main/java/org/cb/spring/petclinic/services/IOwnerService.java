package org.cb.spring.petclinic.services;

import org.cb.spring.petclinic.model.Owner;

public interface IOwnerService extends ICrud<Owner, Long>{
    Owner findByLastName(String lastName);
}
