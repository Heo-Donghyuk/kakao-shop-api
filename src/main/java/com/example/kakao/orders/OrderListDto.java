package com.example.kakao.orders;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderListDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    public static class Request {
        private int id;
        private int optionId;
        private int quantity;
        private int price;

        private int orderId;

        public OrderList toEntity() {
            return OrderList.builder()
                    .id(id)
                    .optionId(optionId)
                    .quantity(quantity)
                    .price(price)
                    .orderId(orderId)
                    .build();
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private int id;
        private int optionId;
        private int quantity;
        private int price;

        private int orderId;
        private String productName;
        private String optionName;

        public Response(OrderList orderList) {
            this.id = orderList.getId();
            this.optionId = orderList.getOptionId();
            this.quantity = orderList.getQuantity();
            this.price = orderList.getPrice();
            this.orderId = orderList.getOrderId();
        }


        public Response(OrderListDto.Response response) {
            this.id = response.getId();
            this.optionId = response.getOptionId();
            this.quantity = response.getQuantity();
            this.price = response.getPrice();
            this.orderId = response.getOrderId();
            this.productName = response.getProductName();
            this.optionName = response.getOptionName();
        }
    }
}
