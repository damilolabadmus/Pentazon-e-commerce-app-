package com.pentagon.product;

import com.pentagon.exceptions.ProductException;

public interface ProductService {
    /**
     * search for product with the specified id
     * @param productId
     * @return product with specified product id
     */

    Product findProductById(String productId) throws ProductException;

}
