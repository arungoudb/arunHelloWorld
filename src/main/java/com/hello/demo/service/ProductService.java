package com.hello.demo.service;


import com.hello.demo.vo.ProductVO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductVO getProducts(String productId) {

        ProductVO productVO=new ProductVO();
        productVO.setProductId(String.valueOf(1l));
        productVO.setProductName("Apple Iphone 15");
        productVO.setDescription("Iphone Pro version");
        productVO.setPrice(100000);
        return productVO;
    }
}
