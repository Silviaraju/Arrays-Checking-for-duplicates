package com.example.product.Repository;

import com.example.product.Model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stockRepository extends JpaRepository<Stocks, Integer> {
}
