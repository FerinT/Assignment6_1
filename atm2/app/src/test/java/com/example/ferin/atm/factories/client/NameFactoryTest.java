package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.Name;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class NameFactoryTest {

    Name name;

    @Before
    public void setUp() throws Exception {
        name = new Name.Builder()
                .firstName("kim")
                .secondName("passible")
                .lastName("taylor")
                .title("miss")
                .build();
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(name);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals("kim", name.getFirstName());
    }

    @Test
    public void testUpdate() throws Exception {
        Name nameUpdate = new Name.Builder()
                .copy(name)
                .firstName("fer")
                .build();

        Assert.assertEquals(nameUpdate.getFirstName(), "fer");

    }
}
