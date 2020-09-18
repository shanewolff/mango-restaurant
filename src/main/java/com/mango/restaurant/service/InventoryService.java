package com.mango.restaurant.service;

import com.mango.restaurant.exception.ProductNotFoundException;
import com.mango.restaurant.exception.SupplierNotFoundException;
import com.mango.restaurant.model.Product;
import com.mango.restaurant.model.Supplier;
import com.mango.restaurant.repository.ProductRepository;
import com.mango.restaurant.repository.SupplierRepository;
import com.mango.restaurant.request.ProductInfo;
import com.mango.restaurant.request.SupplierInfo;
import com.mango.restaurant.response.ProductInfoResponse;
import com.mango.restaurant.response.TotalStockLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Integer id) {
        return supplierRepository.findById(id).orElseThrow(() -> new SupplierNotFoundException(id));
    }

    public String updateSupplierById(Integer id, SupplierInfo updatedSupplier) {
        Supplier supplier =
                supplierRepository.findById(id).orElseThrow(() -> new SupplierNotFoundException(id));
        supplier.setCode(updatedSupplier.getCode());
        supplier.setName(updatedSupplier.getName());
        supplier.setEmail(updatedSupplier.getEmail());
        supplier.setContact(updatedSupplier.getContact());
        supplierRepository.save(supplier);
        return String.format("The supplier of id %d has been updated successfully.", id);
    }

    public String addNewSupplier(SupplierInfo newSupplier) {
        Supplier supplier = new Supplier();
        supplier.setCode(newSupplier.getCode());
        supplier.setName(newSupplier.getName());
        supplier.setEmail(newSupplier.getEmail());
        supplier.setContact(newSupplier.getContact());
        supplierRepository.save(supplier);
        return "New supplier saved successfully";
    }

    public String deleteSupplierById(Integer id) {
        Supplier supplier =
                supplierRepository.findById(id).orElseThrow(() -> new SupplierNotFoundException(id));
        supplierRepository.delete(supplier);
        return String.format("Supplier of id %d has been successfully deleted", id);
    }

    public List<ProductInfoResponse> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        List<ProductInfoResponse> productInfoResponseList = new ArrayList<>();
        productList.forEach(product -> {
            ProductInfoResponse productInfoResponse = new ProductInfoResponse();
            productInfoResponse.setId(product.getId());
            productInfoResponse.setCode(product.getCode());
            productInfoResponse.setName(product.getName());
            productInfoResponse.setCategory(product.getCategory());
            productInfoResponse.setDescription(product.getDescription());
            productInfoResponse.setQuantity(product.getQuantity());
            productInfoResponse.setStockLevel(product.getStockLevel());
            productInfoResponse.setSupplierId(product.getSupplier().getId());
            productInfoResponse.setSupplierName(product.getSupplier().getName());
            productInfoResponseList.add(productInfoResponse);
        });
        return productInfoResponseList;
    }

    public ProductInfoResponse getProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new SupplierNotFoundException(id));
        return new ProductInfoResponse(
                product.getId(),
                product.getCode(),
                product.getName(),
                product.getCategory(),
                product.getDescription(),
                product.getQuantity(),
                product.getStockLevel(),
                product.getSupplier().getId(),
                product.getSupplier().getName());
    }

    public List<ProductInfoResponse> searchProduct(String category, String name) {
        List<Product> productList = productRepository.searchProduct(category, name);
        List<ProductInfoResponse> productInfoResponseList = new ArrayList<>();
        productList.forEach(product -> productInfoResponseList.add(new ProductInfoResponse(
                product.getId(),
                product.getCode(),
                product.getName(),
                product.getCategory(),
                product.getDescription(),
                product.getQuantity(),
                product.getStockLevel(),
                product.getSupplier().getId(),
                product.getSupplier().getName())));
        return productInfoResponseList;
    }

    public String updateProductById(Integer id, com.mango.restaurant.request.ProductInfo updatedProductInfo) {
        Product product =
                productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        Supplier supplier =
                supplierRepository.findById(updatedProductInfo.getSupplierId()).orElseThrow(() -> new SupplierNotFoundException(updatedProductInfo.getSupplierId()));
        product.setCode(updatedProductInfo.getCode());
        product.setName(updatedProductInfo.getName());
        product.setCategory(updatedProductInfo.getCategory());
        product.setDescription(updatedProductInfo.getDescription());
        product.setQuantity(updatedProductInfo.getQuantity());
        product.setStockLevel(updatedProductInfo.getStockLevel());
        product.setSupplier(supplier);
        productRepository.save(product);
        return String.format("The product of id %d has been updated successfully.", id);
    }

    public String addNewProduct(ProductInfo newProduct) {
        Supplier supplier =
                supplierRepository.findById(newProduct.getSupplierId()).orElseThrow(() -> new SupplierNotFoundException(newProduct.getSupplierId()));
        Product product = new Product();
        product.setCode(newProduct.getCode());
        product.setName(newProduct.getName());
        product.setCategory(newProduct.getCategory());
        product.setDescription(newProduct.getDescription());
        product.setQuantity(newProduct.getQuantity());
        product.setStockLevel(newProduct.getStockLevel());
        product.setSupplier(supplier);
        productRepository.save(product);
        return "New product saved successfully";
    }

    public String deleteProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.delete(product);
        return String.format("Product of id %d has been successfully deleted", id);
    }

    public TotalStockLevel getTotalStockLevel() {
        Float value = productRepository.getTotalStockLevel();
        return new TotalStockLevel(value);
    }
}
