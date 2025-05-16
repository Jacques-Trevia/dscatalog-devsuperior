package com.devsuperior.dscatalog.repositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.tests.Factory;

@DataJpaTest
public class ProductRepositoryTests {

	@Autowired
	private ProductRepository repository;
	
	private Long exintingId;
	private Long nonExintingId;
	private Long countTotalProducts;
	
	@BeforeEach
	void setUp() throws Exception {
		exintingId = 1L;
		nonExintingId = 1000L;
		countTotalProducts = 25L;
	}
	
	@Test
	public void saveShouldPersisWithAutoIncrementWhenIdIsNull() {
		
		Product product = Factory.createdProduct();
		product.setId(null);
		
		product = repository.save(product);
		
		Assertions.assertNotNull(product.getId());
		Assertions.assertEquals(countTotalProducts + 1, product.getId());
	}
	
	@Test
	public void deleteShouldDeleteObjectWhenIdExist() {
		
		long exentingId = 1L;
		
		repository.deleteById(exintingId);
		
		Optional<Product> result = repository.findById(exentingId);
		
		Assertions.assertFalse(result.isPresent());
	}
	
	@Test
	public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
		
		Optional<Product> result = repository.findById(exintingId);
		
		Assertions.assertTrue(result.isPresent());
	}
	
	@Test
	public void findByIdShouldReturnNonEmptyOptionalWhenIdDoesNotExists() {
		
		Optional<Product> result = repository.findById(nonExintingId);
		
		Assertions.assertTrue(result.isEmpty());
	}
}
