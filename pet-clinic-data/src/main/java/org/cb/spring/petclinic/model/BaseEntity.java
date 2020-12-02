package org.cb.spring.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    /**
     * We use boxed type / object type Long
     * instead of primitive type long, because it can be null
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
