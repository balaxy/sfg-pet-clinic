package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirstName("M");
        owner1.setLastName("w");

        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2l);
        owner2.setFirstName("M2");
        owner2.setLastName("w2");

        ownerService.save(owner2);
        System.out.println("Owners loaded");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("s");
        vet1.setLastName("v");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("s2");
        vet2.setLastName("v2");

        vetService.save(vet2);
        System.out.println("Vets loaded");
    }
}
