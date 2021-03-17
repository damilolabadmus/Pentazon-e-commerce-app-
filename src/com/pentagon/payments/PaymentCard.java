package com.pentagon.payments;

import java.time.LocalDate;
import java.util.Date;

public class PaymentCard {
    private String cardNumber;
    private String name;
    private LocalDate expiry;
    private LocalDate issued;

    public PaymentCard(String cardNumber, String name, LocalDate expiry) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expiry = expiry;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getExpiry() {
        return expiry;
    }
    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }
    public LocalDate getIssued() {
        return issued;
    }
    public void setIssued(LocalDate issued) {
        this.issued = issued;
    }
}
