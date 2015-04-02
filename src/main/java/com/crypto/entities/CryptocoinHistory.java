package com.crypto.entities;

import java.util.Date;

/**
 * Created by Jan Wicherink on 31-3-2015.
 */
public class CryptocoinHistory {

    private Integer indx;

    private Date timestamp;
    private TradePair tradePair;
    private Float open;
    private Float low;
    private Float high;
    private Float cloase;
    private Long volume;

    public CryptocoinHistory(Integer indx, Date timestamp, TradePair tradePair, Float open, Float low, Float high, Float cloase, Long volume) {
        this.indx = indx;
        this.timestamp = timestamp;
        this.tradePair = tradePair;
        this.open = open;
        this.low = low;
        this.high = high;
        this.cloase = cloase;
        this.volume = volume;
    }

    public Integer getIndx() {
        return indx;
    }

    public void setIndx(Integer indx) {
        this.indx = indx;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getCloase() {
        return cloase;
    }

    public void setCloase(Float cloase) {
        this.cloase = cloase;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }
}
