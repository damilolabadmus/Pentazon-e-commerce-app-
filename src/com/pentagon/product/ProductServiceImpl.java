package com.pentagon.product;

import com.pentagon.exceptions.ProductException;

public class ProductServiceImpl implements ProductService {
    /**
     * search directory with the specified id
     * @param productId
     * @return product with specified
     */

    private ProductRepoMock productRepo = new ProductRepoMock();

    @Override
    public  Product findProductById(String productId) throws ProductException {
        return productRepo.getProductById(productId);

    }
}
