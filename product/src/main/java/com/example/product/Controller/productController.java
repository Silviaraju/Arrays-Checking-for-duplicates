package com.example.product.Controller;

import com.example.product.Model.Product;
import com.example.product.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/product")
public class productController {

    @Autowired
    private productRepository productRepository;

    @PostMapping(value="/product1")
    public String saveProduct(@RequestBody Product product){
    productRepository.save(product);
    return "Product saved successfully";
    }

//    @GetMapping(value="/update/{id}")
//    public boolean updateProduct(@PathVariable Integer id){
//        return productRepository.existsById(id);
//
//    }

    @GetMapping(value="/update")
    public Product updateProduct(@RequestBody Product product){
        Product expro = productRepository.findById(product.getProduct_id()).orElse(null);
        expro.setProduct_name(product.getProduct_name());
        expro.setProduct_id(product.getProduct_id());
        expro.setModel_year(product.getModel_year());
        expro.setCost_price(product.getCost_price());
        return productRepository.save(product);

    }


}
