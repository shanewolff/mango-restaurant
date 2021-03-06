package com.mango.restaurant.controller;

import com.mango.restaurant.model.Supplier;
import com.mango.restaurant.request.ProductInfo;
import com.mango.restaurant.request.SupplierInfo;
import com.mango.restaurant.response.ProductInfoResponse;
import com.mango.restaurant.response.TotalStockLevel;
import com.mango.restaurant.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/supplier")
    public List<Supplier> getAllSuppliers() {
        return inventoryService.getAllSuppliers();
    }

    @GetMapping("/supplier/{id}")
    public Supplier getSupplierById(@PathVariable(value = "id") Integer id) {
        return inventoryService.getSupplierById(id);
    }

    @PatchMapping("/supplier/{id}")
    public String updateSupplierById(@PathVariable(value = "id") Integer id,
                                     @Valid @RequestBody SupplierInfo updatedSupplier) {
        return inventoryService.updateSupplierById(id, updatedSupplier);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/supplier")
    public String addNewSupplier(@Valid @RequestBody SupplierInfo newSupplier) {
        return inventoryService.addNewSupplier(newSupplier);
    }

    @DeleteMapping("/supplier/{id}")
    public String deleteSupplierById(@PathVariable(value = "id") Integer id) {
        return inventoryService.deleteSupplierById(id);
    }

    @GetMapping("/product")
    public List<ProductInfoResponse> getAllProducts() {
        return inventoryService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ProductInfoResponse getProductById(@PathVariable(value = "id") Integer id) {
        return inventoryService.getProductById(id);
    }

    @GetMapping("/product/search")
    public List<ProductInfoResponse> searchProducts(@RequestParam(required = false) String name,
                                                    @RequestParam(required = false) String category,
                                                    @RequestParam(required = false) String supplier) {
        return inventoryService.searchProduct(name, category, supplier);
    }

    @PatchMapping("/product/{id}")
    public String updateProductById(@PathVariable(value = "id") Integer id,
                                    @Valid @RequestBody ProductInfo updatedProductInfo) {
        return inventoryService.updateProductById(id, updatedProductInfo);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/product")
    public String addNewProduct(@Valid @RequestBody ProductInfo newProduct) {
        return inventoryService.addNewProduct(newProduct);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProductById(@PathVariable(value = "id") Integer id) {
        return inventoryService.deleteProductById(id);
    }

    @GetMapping("/stock-level")
    public TotalStockLevel getTotalStockLevel() {
        return inventoryService.getTotalStockLevel();
    }

}
