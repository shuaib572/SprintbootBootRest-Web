package com.coding.Service;

import java.util.List;
import java.util.Optional;

import com.coding.model.Product;

public interface IProductService {

	public Integer saveProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Integer id);
	public Optional<Product> getOneProduct(Integer id);
	public List<Product> getAllProducts();
	public boolean isProductExist(Integer id);
}
