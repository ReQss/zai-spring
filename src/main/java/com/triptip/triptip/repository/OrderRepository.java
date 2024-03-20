package com.triptip.triptip.repository;

import com.triptip.triptip.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findAllByAddressId(int id);
}
