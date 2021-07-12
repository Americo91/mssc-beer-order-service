package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by @author stopp on 10/07/2021
 */
public interface BeerService {
    Optional<BeerDto> getBeerById(UUID uuid);
    Optional<BeerDto> getBeerByUpc(String upc);
}
