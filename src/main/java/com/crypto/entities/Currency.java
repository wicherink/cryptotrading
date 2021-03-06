package com.crypto.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Currency represents a country's currency
 *
 * Created by Jan Wicherink on 25-3-2015.
 */
@Entity
public class Currency {

    @Id
    private String code;

    private String description;
    private String symbol;

    /**
     * @param code the code representing the currency
     * @param description description of the currency
     * @param symbol the symbol representing the currency
     */
    public Currency (String code, String description, String symbol) {
        this.code = code;
        this.description = description;
        this.symbol = symbol;
    }

    public Currency() {
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
