package stmall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmall.config.kafka.KafkaProcessor;
import stmall.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_NotifyToUserStatus(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener NotifyToUserStatus : " + orderPlaced + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCalceled'"
    )
    public void wheneverOrderCalceled_NotifyToUserStatus(
        @Payload OrderCalceled orderCalceled
    ) {
        OrderCalceled event = orderCalceled;
        System.out.println(
            "\n\n##### listener NotifyToUserStatus : " + orderCalceled + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStarted'"
    )
    public void wheneverDeliveryStarted_NotifyToUserStatus(
        @Payload DeliveryStarted deliveryStarted
    ) {
        DeliveryStarted event = deliveryStarted;
        System.out.println(
            "\n\n##### listener NotifyToUserStatus : " +
            deliveryStarted +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCanceled'"
    )
    public void wheneverDeliveryCanceled_NotifyToUserStatus(
        @Payload DeliveryCanceled deliveryCanceled
    ) {
        DeliveryCanceled event = deliveryCanceled;
        System.out.println(
            "\n\n##### listener NotifyToUserStatus : " +
            deliveryCanceled +
            "\n\n"
        );
        // Sample Logic //

    }
}
