package ASM.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import ASM.entity.Order;

public interface OrderService {

	public Order create(JsonNode orderData);

	public Order findById(Long id);

	public List<Order> findByUsername(String username);

}