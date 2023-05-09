package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class OrderCalceled extends AbstractEvent {

    private Long id;
    private String productName;
    private String userId;
    private Integer qty;
    private Long productId;
    private String status;

    public OrderCalceled(OrderPlacement aggregate) {
        super(aggregate);
    }

    public OrderCalceled() {
        super();
    }
}
