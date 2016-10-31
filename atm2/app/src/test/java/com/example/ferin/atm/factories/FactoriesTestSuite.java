package com.example.ferin.atm.factories;

import com.example.ferin.atm.factories.account.CreditFactoryTest;
import com.example.ferin.atm.factories.account.SavingsFactoryTest;
import com.example.ferin.atm.factories.account.StudentFactoryTest;
import com.example.ferin.atm.factories.client.AddressFactoryTest;
import com.example.ferin.atm.factories.client.BusinessFactoryTest;
import com.example.ferin.atm.factories.client.ContactDetailsFactoryTest;
import com.example.ferin.atm.factories.client.NameFactoryTest;
import com.example.ferin.atm.factories.client.PremiumFsctoryTest;
import com.example.ferin.atm.factories.client.StandardFactoryTest;
import com.example.ferin.atm.factories.transaction.TransactionFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Ferin on 2016-10-31.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreditFactoryTest.class,
        SavingsFactoryTest.class,
        StudentFactoryTest.class,
        AddressFactoryTest.class,
        BusinessFactoryTest.class,
        ContactDetailsFactoryTest.class,
        NameFactoryTest.class,
        PremiumFsctoryTest.class,
        StandardFactoryTest.class,
        TransactionFactoryTest.class
})

public class FactoriesTestSuite {
}
