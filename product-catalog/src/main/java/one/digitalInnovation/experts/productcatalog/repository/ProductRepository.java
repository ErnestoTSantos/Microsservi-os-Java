package one.digitalInnovation.experts.productcatalog.repository;

import one.digitalInnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> { }
