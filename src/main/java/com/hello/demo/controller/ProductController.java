package com.hello.demo.controller;


import com.hello.demo.service.ProductService;
import com.hello.demo.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProducts/{productId}")
    public ResponseEntity<ProductVO> getProduct(@PathVariable("productId") String productId) {

        ProductVO product = productService.getProducts(productId);
        return ResponseEntity.ok(product);

    }

   /* @Autowired
    private HeaderGenerator headerGenerator;

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody @Valid ProductVO productVO, HttpServletRequest request){

        ProductVO product = productService.createProduct(productVO);

        return new ResponseEntity<>(
                productVO,
                headerGenerator.getHeadersForSuccessPostMethod(request, product.getProductId()),
                HttpStatus.CREATED);
    }


    @GetMapping("/{productId}")
    public ResponseEntity<ProductVO> getProduct(@PathVariable("productId") String productId) {

        ProductVO product = productService.getProduct(productId);
        return ResponseEntity.ok(product);

    }

    @GetMapping("/readProps")
    public ResponseEntity<String> readProps() {

        MyConfigurations myConfigurations=new MyConfigurations();
        return ResponseEntity.ok(myConfigurations.getErrorCodes());

    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable("productId") String productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody @Valid ProductVO productVO) {

        productService.updateProduct(productVO);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts(@RequestParam(value = "sort", required = false) String sort,
                                                     @RequestParam(value = "page", required = false) Integer page,
                                                     @RequestParam(value = "size", required = false) Integer size) {

        Page<ProductVO> list = productService.getAllProducts(sort, page, size);
        return ResponseEntity.ok(list);

    }*/
}
