package com.food.ordering.tech.order.service.domain.valueobject;

import com.food.ordering.tech.domain.valueobject.BaseId;
import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    protected TrackingId(UUID value) {
        super(value);
    }
}
