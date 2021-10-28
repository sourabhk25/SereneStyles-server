package com.sourkul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourkul.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
