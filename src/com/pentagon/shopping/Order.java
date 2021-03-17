package com.pentagon.shopping;

import com.pentagon.customer.Address;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

public class Order {

    private String orderId;
    private Map<String, Item> orderItem;
    private BigDecimal orderTotal;
    private LocalDate deliveryDate;
    private LocalDate orderDate;
    private Address deliveryAddress;
    private boolean paid;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Map<String, Item> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Map<String, Item> orderItem) {
        this.orderItem = orderItem;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
