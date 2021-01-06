package com.devsuperior.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.OrderRepository;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

// a Notation @Service serve paara registrar o component ProductService pra poder fazer a injeçõa de dependência
@Service
public class OrderService {
	
	// o @Autowired é um container para injeçãao de dependência forneceido pelo framework 
	@Autowired
	public OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public OrderDTO insert(OrderDTO dto){
		Order order = new Order(null,dto.getAddress(),dto.getLatitude(),dto.getLongitude(),Instant.now(), OrderStatus.PENDING);
		// Esse for serve para associar os produtos ao pedido
		for (ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
	 // Salva o pedido no banco de dados
	 order = repository.save(order);
	 return new OrderDTO(order);
	}
	
	@Transactional
	public OrderDTO setDelivered(Long id){
		Order order = repository.getOne(id);	
	    order.setStatus(OrderStatus.DELIVERED);
	    order = repository.save(order);
	    return new OrderDTO(order);
		
	}
}
