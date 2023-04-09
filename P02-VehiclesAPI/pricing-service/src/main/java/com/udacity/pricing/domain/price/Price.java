package com.udacity.pricing.domain.price;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;
    private String currency;
    private BigDecimal priceValue;

    public Price() {
    }

    public Price(String currency, BigDecimal priceValue, Long vehicleId) {
        this.currency = currency;
        this.priceValue = priceValue;
        this.vehicleId = vehicleId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(BigDecimal price) {
        this.priceValue = price;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
