package com.pentagon.payments;

import java.math.BigDecimal;

public interface PaymentService {

    public boolean pay(PaymentCard, BigDecimal amount);

}
