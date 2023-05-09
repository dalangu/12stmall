package stmall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmall.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderPlacements",
    path = "orderPlacements"
)
public interface OrderPlacementRepository
    extends PagingAndSortingRepository<OrderPlacement, Long> {}
