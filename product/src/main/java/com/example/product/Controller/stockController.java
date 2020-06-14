package com.example.product.Controller;

import com.example.product.Model.Stocks;
import com.example.product.Repository.stockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/stocks")
public class stockController {

    @Autowired
    private stockRepository stockRepository;

    @PostMapping(value="/stocks1")
    public String saveStocks(@RequestBody Stocks stocks){
        stockRepository.save(stocks);
        return "Stocks saved successfully";
    }
}
