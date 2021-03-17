package com.pentagon.shopping;

import com.pentagon.customer.Buyer;
import com.pentagon.exceptions.CheckOutException;
import com.pentagon.payments.PayStack;
import com.pentagon.payments.PaymentService;

import java.util.Map;

public class ShoppingServiceImpl implements ShoppingService {
    private PaymentService paymentService;

    public ShoppingServiceImpl() {
        paymentService = new PayStack();
    }

    @Override
    public boolean checkOut(Buyer buyer) throws CheckOutException {
        if(buyer == null) {
            throw new CheckOutException("No buyer found at check out");
        }

        public boolean is(Buyer buyer) throws CheckOutException {
        if(buyer == null) {
            throw new CheckOutException("No buyer found at check out");
        }

        if(buyer.getCart() == null) {
            //Todo log error
            throw new CheckOutException("No cart found at check out");
        }

        if(buyer.getCart().getItems().isEmpty()) {
            //Todo log error
            throw new CheckOutException("Cart is empty at check out");
        }
        return false;
    }
        @Override
        public Order checkOut(Buyer buyer) throws CheckOutException {
            Order order = new Order
        }

        @Test
                void checkOutWithExpiredPaymentCard() {
            try {
                Map<String, Item> cartItems = dozie.getCart().getItems();
                Address deliveryAddress = dozie.getCart().getDeliveryAddress
            }
        }
}
