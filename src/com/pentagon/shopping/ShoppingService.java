package com.pentagon.shopping;

import com.pentagon.customer.Buyer;
import com.pentagon.exceptions.CheckOutException;

public interface ShoppingService {
    public boolean checkout(Buyer customer) throws CheckOutException;
}
