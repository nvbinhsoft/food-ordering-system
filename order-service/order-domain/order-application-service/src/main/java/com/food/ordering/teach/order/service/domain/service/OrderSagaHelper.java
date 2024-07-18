package com.food.ordering.teach.order.service.domain.service;

import com.food.ordering.teach.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.tech.domain.valueobject.OrderId;
import com.food.ordering.tech.domain.valueobject.OrderStatus;
import com.food.ordering.tech.order.service.domain.entity.Order;
import com.food.ordering.tech.order.service.domain.exception.OrderNotFoundException;
import java.util.Optional;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderSagaHelper {

    private final OrderRepository orderRepository;

    public OrderSagaHelper(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    Order findOrder(String orderId) {
        Optional<Order> orderResponse = orderRepository.findById(new OrderId(UUID.fromString(orderId)));
        if (orderResponse.isEmpty()) {
            log.error("Order with id: {} could not be found!", orderId);
            throw new OrderNotFoundException("Order with id " + orderId + " could not be found!");
        }
        return orderResponse.get();
    }

    void saveOrder(Order order) {
        orderRepository.save(order);
    }

//    SagaStatus orderStatusToSagaStatus(OrderStatus orderStatus) {
//        switch (orderStatus) {
//            case PAID:
//                return SagaStatus.PROCESSING;
//            case APPROVED:
//                return SagaStatus.SUCCEEDED;
//            case CANCELLING:
//                return SagaStatus.COMPENSATING;
//            case CANCELLED:
//                return SagaStatus.COMPENSATED;
//            default:
//                return SagaStatus.STARTED;
//        }
//    }
}
