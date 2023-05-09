package stmall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stmall.OrderApplication;
import stmall.domain.OrderCalceled;
import stmall.domain.OrderPlaced;

@Entity
@Table(name = "OrderPlacement_table")
@Data
public class OrderPlacement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String userId;

    private Integer qty;

    private Long productId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderCalceled orderCalceled = new OrderCalceled(this);
        orderCalceled.publishAfterCommit();

        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderPlacementRepository repository() {
        OrderPlacementRepository orderPlacementRepository = OrderApplication.applicationContext.getBean(
            OrderPlacementRepository.class
        );
        return orderPlacementRepository;
    }

    public static void notifyToWatingUser(StockIncreased stockIncreased) {
        /** Example 1:  new item 
        OrderPlacement orderPlacement = new OrderPlacement();
        repository().save(orderPlacement);

        */

        /** Example 2:  finding and process
        
        repository().findById(stockIncreased.get???()).ifPresent(orderPlacement->{
            
            orderPlacement // do something
            repository().save(orderPlacement);


         });
        */

    }

    public static void updateOrderStatus(DeliveryCanceled deliveryCanceled) {
        /** Example 1:  new item 
        OrderPlacement orderPlacement = new OrderPlacement();
        repository().save(orderPlacement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCanceled.get???()).ifPresent(orderPlacement->{
            
            orderPlacement // do something
            repository().save(orderPlacement);


         });
        */

    }

    public static void updateOrderStatus(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        OrderPlacement orderPlacement = new OrderPlacement();
        repository().save(orderPlacement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(orderPlacement->{
            
            orderPlacement // do something
            repository().save(orderPlacement);


         });
        */

    }
}
