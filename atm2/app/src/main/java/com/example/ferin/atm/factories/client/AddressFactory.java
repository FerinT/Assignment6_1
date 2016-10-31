package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.Address;

/**
 * Created by Ferin on 2016-10-31.
 */
public class AddressFactory {

    public static Address createAddress(String areaCode, String street, String houseNumber){
        Address address = new Address.Builder()
                .street(street)
                .houseNumber(houseNumber)
                .areaCode(areaCode)
                .build();

        return address;
    }

}
