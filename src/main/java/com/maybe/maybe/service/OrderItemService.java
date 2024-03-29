package com.maybe.maybe.service;

import com.maybe.maybe.entity.OrderItem;
import com.maybe.maybe.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    private OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getById(Long id){
        return orderItemRepository.findById(id);
    }
}
