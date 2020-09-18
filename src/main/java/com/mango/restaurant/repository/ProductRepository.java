package com.mango.restaurant.repository;

import com.mango.restaurant.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select product from Product product where upper(product.category) like concat('%', upper(:category), '%')" +
            " and " +
            "upper(product.name) like concat('%', upper(:name), '%')")
    List<Product> searchProduct(@Param("category") String category, @Param("name") String name);

    @Query("select sum(product.stockLevel) from Product product")
    Float getTotalStockLevel();
}
