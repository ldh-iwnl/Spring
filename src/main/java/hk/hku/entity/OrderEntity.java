package hk.hku.entity;

public class OrderEntity {
    private String orderId;
    private String orderName;

    public OrderEntity(String orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public OrderEntity() {
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
