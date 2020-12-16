package org.cb.spring.petclinic.bootstrap;

import org.cb.spring.petclinic.model.Owner;
import org.cb.spring.petclinic.model.Vet;
import org.cb.spring.petclinic.services.IOwnerService;
import org.cb.spring.petclinic.services.IVetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final IOwnerService ownerService;
    private final IVetService vetService;

    public DataLoader(IOwnerService ownerService, IVetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(3l);
        owner1.setFirstName("O1");
        owner1.setLastName("OO1");
        ownerService.save(owner1.getId(), owner1);

        Owner owner2 = new Owner();
        owner2.setId(4l);
        owner2.setFirstName("O2");
        owner2.setLastName("OO2");
        ownerService.save(owner2.getId(), owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();
        vet1.setId(3l);
        vet1.setFirstName("V1");
        vet1.setLastName("VV1");
        vetService.save(vet1.getId(), vet1);

        Vet vet2 = new Vet();
        vet2.setId(4l);
        vet2.setFirstName("V2");
        vet2.setLastName("VV2");
        vetService.save(vet2.getId(), vet2);

        System.out.println("Loaded vets");
    }
}
