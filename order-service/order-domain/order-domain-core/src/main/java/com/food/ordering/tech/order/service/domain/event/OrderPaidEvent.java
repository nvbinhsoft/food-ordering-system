package com.food.ordering.tech.order.service.domain.event;

import com.food.ordering.tech.domain.event.DomainEvent;
import com.food.ordering.tech.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {
    public OrderPaidEvent(Order order,
                          ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}

