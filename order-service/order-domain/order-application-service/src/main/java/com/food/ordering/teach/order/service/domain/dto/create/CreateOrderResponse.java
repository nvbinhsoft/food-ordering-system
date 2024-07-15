package com.food.ordering.teach.order.service.domain.dto.create;

import com.food.ordering.tech.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public record CreateOrderResponse(
        @NotNull UUID orderTrackingId,
        @NotNull OrderStatus orderStatus,
        @NotNull String message
) {}
