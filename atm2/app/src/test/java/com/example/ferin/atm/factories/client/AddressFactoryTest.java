package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.Address;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class AddressFactoryTest {

    Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address.Builder()
                .areaCode("7441")
                .houseNumber("45")
                .street("black smith")
                .build();

    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(address);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals("7441", address.getAreaCode());
    }

    @Test
    public void testUpdate() throws Exception {
        Address addressUpdate = new Address.Builder()
                .copy(address)
                .areaCode("1234")
                .build();

        Assert.assertEquals("1234", addressUpdate.getAreaCode());

    }
}
