package com.crypto.entities;

/**
 * Represents a trading by the cryptocoin trader
 * Created by Jan Wicherink on 31-3-2015.
 */
public class Trading {

    private Integer id;
    // the minimum crypto coins accepted for trading
    private Float minTradingCryptoCurrency;

    // the maximum percentage to be used while trading coins
    private Float maxTradingCoinsPerc;

    // The maximum percentage to be used while trading crypto coins
    private Float maxTradingCryptoCoinsPerc;

    // The percentage to be refunded to the wallets when an trading has taken place
    private Float refundPercentage;

    // Check on bad buying situations while trading
    private Boolean checkBadBuy;

    // Check on bad selling situations while trading
    private Boolean checkBadSell;

    private Boolean checkBadSellWallet;

    // The minimum profit desired when trading
    private Float minProfitPercentage;

    // Boolean indicating if the trading is enabled (active) or disabled (inactive)
    private Boolean enabled;

    // Boolean indicating if logging is desired.
    private Boolean logging;

    // The number of retries to sell of buy cryptocoins.
    private Integer retries;

    // The trading pair.
    private TradePair tradePair;

    public Trading(Integer id, Float minTradingCryptoCurrency, Float maxTradingCoinsPerc, Float maxTradingCryptoCoinsPerc, Float refundPercentage, Boolean checkBadBuy, Boolean checkBadSell, Boolean checkBadSellWallet, Float minProfitPercentage, Boolean enabled, Boolean logging, Integer retries, TradePair tradePair) {
        this.id = id;
        this.minTradingCryptoCurrency = minTradingCryptoCurrency;
        this.maxTradingCoinsPerc = maxTradingCoinsPerc;
        this.maxTradingCryptoCoinsPerc = maxTradingCryptoCoinsPerc;
        this.refundPercentage = refundPercentage;
        this.checkBadBuy = checkBadBuy;
        this.checkBadSell = checkBadSell;
        this.checkBadSellWallet = checkBadSellWallet;
        this.minProfitPercentage = minProfitPercentage;
        this.enabled = enabled;
        this.logging = logging;
        this.retries = retries;
        this.tradePair = tradePair;
    }

    public Float getMinTradingCryptoCurrency() {
        return minTradingCryptoCurrency;
    }

    public Float getMaxTradingCoinsPerc() {
        return maxTradingCoinsPerc;
    }

    public Float getMaxTradingCryptoCoinsPerc() {
        return maxTradingCryptoCoinsPerc;
    }

    public Float getRefundPercentage() {
        return refundPercentage;
    }

    public Boolean getCheckBadBuy() {
        return checkBadBuy;
    }

    public Boolean getCheckBadSell() {
        return checkBadSell;
    }

    public Boolean getCheckBadSellWallet() {
        return checkBadSellWallet;
    }

    public Float getMinProfitPercentage() {
        return minProfitPercentage;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Boolean getLogging() {
        return logging;
    }

    public Integer getRetries() {
        return retries;
    }

    public TradePair getTradePair() {
        return tradePair;
    }
}
