package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockReachedMinimumException extends Exception {

    public BeerStockReachedMinimumException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed reached the min stock allowed: %s", id, quantityToDecrement));
    }

}
