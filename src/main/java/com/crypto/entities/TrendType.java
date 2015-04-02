package com.crypto.entities;

/**
 * A trendtype, defines the kind of a trend in a currency exchange rate development
 *
 * Created by Jan Wicherink on 25-3-2015.
 */
public enum TrendType {

    MOVING_AVERAGE("MA"),
    EXPONENTIAL_MOVING_AVERAGE("EMA"),
    SMOOTHING_MOVING_AVERAGE("SMA");

    private String code;

    TrendType(String code) {
        this.code = code;
    }

    @Override
    public String toString () {
        return this.code;
    }
}
