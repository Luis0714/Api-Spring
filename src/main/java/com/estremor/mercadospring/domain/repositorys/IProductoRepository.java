package com.estremor.mercadospring.domain.repositorys;

import com.estremor.mercadospring.domain.Product;

import java.util.List;
import java.util.Optional;

public interface IProductoRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
