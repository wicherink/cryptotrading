package com.crypto.dao;

import com.crypto.com.crypto.dao.CurrencyDao;
import org.junit.Test;

import javax.ejb.EJB;

/**
 * Created by nl04990 on 31-3-2015.
 */

public class TestCurrencyDao {

    @EJB private CurrencyDao currencyDao;

    @Test
    public void testAddCurrency() {

      currencyDao.getCurrency("EUR");
    }
}
