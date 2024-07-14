package com.food.ordering.tech.order.service.domain.valueobject;

import com.food.ordering.tech.domain.valueobject.BaseId;
import com.food.ordering.tech.domain.valueobject.Money;
import com.food.ordering.tech.domain.valueobject.OrderId;
import com.food.ordering.tech.order.service.domain.entity.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemId extends BaseId<Long> {

    protected OrderItemId(Long value) {
        super(value);
    }
}
