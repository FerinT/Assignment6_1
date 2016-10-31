package com.example.ferin.atm.factories.transaction;

import com.example.ferin.atm.domain.transaction.Transaction;
import com.example.ferin.atm.domain.transaction.impl.BalanceEnquiry;
import com.example.ferin.atm.domain.transaction.impl.Transfer;
import com.example.ferin.atm.domain.transaction.impl.Withdraw;
import com.example.ferin.atm.factories.tranaction.TransactionFactory;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class TransactionFactoryTest {

    @Test
    public void testTransfer() throws Exception {
        Transaction transaction = TransactionFactory.getTransaction("transfer");

        Assert.assertEquals(transaction.getClass(), new Transfer().getClass());
    }

    @Test
    public void testBalanceEnquiry() throws Exception {
        Transaction transaction = TransactionFactory.getTransaction("balanceEnquiry");

        Assert.assertEquals(transaction.getClass(), new BalanceEnquiry().getClass());
    }

    @Test
    public void testWithdraw() throws Exception {
        Transaction transaction = TransactionFactory.getTransaction("withdraw");

        Assert.assertEquals(transaction.getClass(), new Withdraw().getClass());
    }
}
