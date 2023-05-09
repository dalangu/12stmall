package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class OrderPlacementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<OrderPlacement>> {

    @Override
    public EntityModel<OrderPlacement> process(
        EntityModel<OrderPlacement> model
    ) {
        return model;
    }
}
