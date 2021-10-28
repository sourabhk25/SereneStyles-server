package com.sourkul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourkul.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
