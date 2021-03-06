package com.crypto.com.crypto.dao;

import com.crypto.entities.Currency;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Jan Wicherink on 30-3-2015.
 */

@Stateful
public class CurrencyDao implements com.crypto.CurrencyDao {

    @PersistenceContext(unitName = "cryptoPersistencetUnit")
    EntityManager em;

    /**
     * Add a new currency to the database
     * @param code the currency code
     * @param description the description of the currency
     * @param symbol the symbol representing the currency
     * @return the persisted currency in the database
     */
    public Currency addCurrency (final String code, final String description, final String symbol) {
        final Currency currency = new Currency(code, description, symbol);

        em.persist(currency);

        return currency;
    }

    /**
     * Update an existing currency in the database
     * @param currency the currency to be updated
     */
    public void updateCurrency (Currency currency) {
        em.merge(currency);
    }

    /**
     * Get a currency with a given code from the database
     * @param code the code of the currency
     * @return the fetched currency with the given code.
     */
    public Currency getCurrency (final String code) {

        final Currency currency = em.find(Currency.class, code);

        return currency;
    }
}
