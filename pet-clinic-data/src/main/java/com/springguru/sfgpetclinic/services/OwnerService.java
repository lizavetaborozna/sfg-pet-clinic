package com.springguru.sfgpetclinic.services;

import com.springguru.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
