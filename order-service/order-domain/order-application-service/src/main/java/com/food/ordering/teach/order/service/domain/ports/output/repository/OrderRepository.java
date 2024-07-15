package com.food.ordering.teach.order.service.domain.ports.output.repository;


import com.food.ordering.tech.domain.valueobject.OrderId;
import com.food.ordering.tech.order.service.domain.entity.Order;
import com.food.ordering.tech.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
