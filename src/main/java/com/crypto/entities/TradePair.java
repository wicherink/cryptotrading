package com.crypto.entities;

/**
 * Created by Jan Wicherink on 31-3-2015.
 */
public class TradePair {

    private Integer id;
    private String tradingSite;
    private Currency currency;
    private CryptoCurrency cryptoCurrency;
    private Float tradingFee;

    public TradePair(Integer id, String tradingSite, Currency currency, CryptoCurrency cryptoCurrency, Float tradingFee) {
        id = id;
        this.tradingSite = tradingSite;
        this.currency = currency;
        this.cryptoCurrency = cryptoCurrency;
        this.tradingFee = tradingFee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getTradingSite() {
        return tradingSite;
    }

    public void setTradingSite(String tradingSite) {
        this.tradingSite = tradingSite;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public CryptoCurrency getCryptoCurrency() {
        return cryptoCurrency;
    }

    public void setCryptoCurrency(CryptoCurrency cryptoCurrency) {
        this.cryptoCurrency = cryptoCurrency;
    }

    public Float getTradingFee() {
        return tradingFee;
    }

    public void setTradingFee(Float tradingFee) {
        this.tradingFee = tradingFee;
    }
}
