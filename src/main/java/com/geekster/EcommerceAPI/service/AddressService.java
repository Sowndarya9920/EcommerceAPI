package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Address;
import com.geekster.EcommerceAPI.repository.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressDao addressDao;

    public void addAddress(Address address) {
        addressDao.save(address);
    }
}
