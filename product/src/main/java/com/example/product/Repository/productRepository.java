package com.example.product.Repository;

import com.example.product.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface productRepository extends JpaRepository<Product, Integer> {
//    @Modifying
//    @Query(value = "update Product p set p.product_name=?1, p.brand_id=?2, p.model_year=?3")
//    void setProductInfoById(String product_name, Integer brand_id, Integer model_id);
}
