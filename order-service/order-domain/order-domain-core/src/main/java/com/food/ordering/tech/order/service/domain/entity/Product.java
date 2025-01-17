package com.food.ordering.tech.order.service.domain.entity;

import com.food.ordering.tech.domain.entity.BaseEntity;
import com.food.ordering.tech.domain.valueobject.BaseId;
import com.food.ordering.tech.domain.valueobject.Money;
import com.food.ordering.tech.domain.valueobject.ProductId;
import lombok.Getter;

@Getter
public class Product extends BaseEntity<ProductId> {

    private String name;
    private Money price;

    public Product(ProductId id, String name, Money price) {
        super.setId(id);
        this.name = name;
        this.price = price;
    }

    public Product(ProductId id) {
        super.setId(id);
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }


}
