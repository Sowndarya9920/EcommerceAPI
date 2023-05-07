package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends JpaRepository<Address,Integer> {
}
