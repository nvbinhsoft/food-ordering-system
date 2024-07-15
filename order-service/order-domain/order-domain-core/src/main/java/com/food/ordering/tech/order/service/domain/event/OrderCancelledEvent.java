package com.food.ordering.tech.order.service.domain.event;

import com.food.ordering.tech.domain.event.DomainEvent;
import com.food.ordering.tech.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {
    public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
