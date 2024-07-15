package com.food.ordering.teach.order.service.domain.ports.input.message.listener.customer;


import com.food.ordering.teach.order.service.domain.dto.message.CustomerModel;

public interface CustomerMessageListener {

    void customerCreated(CustomerModel customerModel);
}
