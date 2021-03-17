package com.pentagon.shopping;

import com.pentagon.customer.Address;
import com.pentagon.exceptions.ProductException;
import com.pentagon.payments.PaymentCard;
import com.pentagon.product.Product;
import com.pentagon.product.ProductService;
import com.pentagon.product.ProductServiceImpl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Logger;

public class Cart {
    private Logger logger = Logger.getLogger(Cart.class.getName());
    private Map<String, Item> items;
    private ProductService productService;
    private BigDecimal total = BigDecimal.ZERO;
    private PaymentCard paymentCard;
    private Address deliveryAddress;

    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(PaymentCard paymentCard) {
        this.paymentCard = paymentCard;
    }

    public Cart() {
        items = new HashMap<>();
        productService = new ProductServiceImpl();
    }

    public void addtoCart(Product product) {
        if (product != null) {
            if (verifiedProduct(product)) {
                Item item = items.get(product.getProductId());
                if(item == null) {
                    item = new Item(product);
                }
                item.addItems(BigInteger.ONE.intValue());
                items.put(product.getProductId(), item);
                }
            }
        }

    public void addtoCart(Product product, int quantity) {
        if (product != null) {
            if (verifiedProduct(product)) {
            Item item = items.get(product.getProductId());
            if(item == null) {
                item = new Item(product);
            }
            item.addItems(quantity);
            items.put(product.getProductId(), item);
        }
    }
}

    private boolean verifiedProduct(Product product) {
        boolean verified = false;
        if (product != null) {
            try {
                Product verifiedProduct = productService.findProductById(product.getProductId());
                verified = true;
            } catch (ProductException ex) {
                //@todo add log message
                // logger.log(System.Logger.Level.INFO, ex.getMessage());
            }
        }

        return verified;
    }


    public boolean removeFromCart(Product product) {
        boolean removed = false;
        if (product != null) {
            items.remove(product.getProductId());
            removed = true;
        }
        return removed;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal calculateCartTotal() {
        if (!items.isEmpty()) {
            this.total = BigDecimal.ZERO;
            Iterator<Item> cartItems = items.values().iterator();

            while(cartItems.hasNext()) {
               this.total = this.total.add(cartItems.next().getTotal());
            }
        }
        return this.getTotal();
    }


    public Map<String, Item> getItems() {
        return items;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
