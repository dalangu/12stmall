package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private Integer status;

    public DeliveryCanceled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanceled() {
        super();
    }
}
