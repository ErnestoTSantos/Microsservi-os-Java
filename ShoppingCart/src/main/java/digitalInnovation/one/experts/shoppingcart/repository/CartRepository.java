package digitalInnovation.one.experts.shoppingcart.repository;

import digitalInnovation.one.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> { }