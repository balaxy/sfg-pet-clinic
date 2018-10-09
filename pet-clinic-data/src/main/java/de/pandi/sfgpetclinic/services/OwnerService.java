package de.pandi.sfgpetclinic.services;

import de.pandi.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
