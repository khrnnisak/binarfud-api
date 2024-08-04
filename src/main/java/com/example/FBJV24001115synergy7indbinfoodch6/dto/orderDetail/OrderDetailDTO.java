package com.example.FBJV24001115synergy7indbinfoodch6.dto.orderDetail;

import java.util.UUID;

import com.example.FBJV24001115synergy7indbinfoodch6.dto.order.OrderResponse;
import com.example.FBJV24001115synergy7indbinfoodch6.dto.product.ProductResponse;
import com.example.FBJV24001115synergy7indbinfoodch6.models.Order;
import com.example.FBJV24001115synergy7indbinfoodch6.models.Product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDetailDTO {
    private UUID id;
    private Integer quantity;
    private Double totalPrice;
    private OrderResponse order;
    private ProductResponse product;
}
