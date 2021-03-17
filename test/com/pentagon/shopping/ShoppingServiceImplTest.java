package com.pentagon.shopping;

import com.pentagon.exceptions.CheckOutException;
import com.pentagon.product.ProductDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingServiceImplTest {

    @BeforeEach
    void setUp() {
        shoppingService = new ShoppingServiceImpl();
        productDatabase products = new ProductDatabase();
        dozie
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkOutWithNullBuyer() {
        assertThrows(CheckOutException.class);
    }

    @Test
    void checkOutWithEmptyCart() {
        dozie
     assert
    }

    @Test
    void checkOut() {
        try {
            Map<String, Item> cartItems = dozie.get().getItems();
            Order dozieOrder = shoppingService.checkOut(dozie);
            assertNotNull(dozieOrder);
            assertEquals(cartItems, dozieOrder.getOrderItem());
            order.setOrderItems(buyer.getCart().getItems());
            buyer.setCart(null);
            } catch(CheckOutException e){
                e.printStackTrace();
            }
        }

        @Override
    public Order checkOut(Buyer buyer) throws CheckOutException {
        this.isValidCheckOut(buyer);
        Order order = new Order();
        Cart buyerCart = buyer.getCart();
        boolean result = payment
        }
    }
