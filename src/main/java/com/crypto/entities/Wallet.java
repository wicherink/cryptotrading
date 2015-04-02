package com.crypto.entities;

/**
 * The wallet containing coins and cryptocoins intended for trading.
 *
 * Created by Jan Wicherink on 31-3-2015.
 */
public class Wallet {

    // The trading of this wallet
    private Trading trading;

    // The number of coins in the wallet
    private Float coins;

    // The number of cryptocoins in the wallet
    private Float cryptoCoins;

    // The currency of the coins
    private Currency currency;

    // The currency of the crypto coins
    private CryptoCurrency cryptoCurrency;

    // The exchange rate, for exchanging coins to 1 cryptocoin
    private Float exchangeRate;

    public Wallet(Trading trading, Float coins, Float cryptoCoins, Currency currency, CryptoCurrency cryptoCurrency, Float exchangeRate) {
        this.trading = trading;
        this.coins = coins;
        this.cryptoCoins = cryptoCoins;
        this.currency = currency;
        this.cryptoCurrency = cryptoCurrency;
        this.exchangeRate = exchangeRate;
    }

    public void addCoins (Float coinsToBeAdded) {
        this.coins = this.coins + coinsToBeAdded;
    }

    public void addCryptoCoins (Float cryptoCoinsToBeAdded) {
        this.cryptoCoins = this.cryptoCoins + cryptoCoinsToBeAdded;
    }

    public Float determineMaxTradingCryptoCoins (Float maxTradingCryptoCoinsPerc) {

        final Float maxCryptoCoins = this.cryptoCoins * maxTradingCryptoCoinsPerc / 100;

        return maxCryptoCoins;
    }

    public Float determineMaxTradingCoins ( Float maxTradingCoinsPerc) {

        final Float maxCoins = this.coins * maxTradingCoinsPerc/ 100;

        return maxCoins;
    }

    public Float getTotalValue() {

        final Float value = this.coins + this.cryptoCoins * this.exchangeRate;

        return value;
    }

    public Trading getTrading() {
        return trading;
    }

    public Float getCoins() {
        return coins;
    }

    public Float getCryptoCoins() {
        return cryptoCoins;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CryptoCurrency getCryptoCurrency() {
        return cryptoCurrency;
    }

    public Float getExchangeRate() {
        return exchangeRate;
    }


}
