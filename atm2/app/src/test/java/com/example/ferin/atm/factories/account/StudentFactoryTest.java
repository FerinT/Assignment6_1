package com.example.ferin.atm.factories.account;

import com.example.ferin.atm.domain.account.impl.Student;
import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class StudentFactoryTest {
    Student student;

    @Before
    public void setUp() throws Exception {
        Client client = new Business.Builder().build();
        student = StudentFactory.createCredit("123", new Double(250.50), new Double(100.00), "123", client);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(student);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(student.getPin(), "123");
    }

    @Test
    public void testUpdate() throws Exception {
        Student studentUpdate;

        studentUpdate = new Student.Builder()
                .copy(student)
                .pin("456")
                .build();

        Assert.assertEquals(studentUpdate.getPin(), "456");

    }
}
