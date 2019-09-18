package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.*;

@Repository
public interface CategoryProductRepo extends CrudRepository <CategoryProduct, Long> {
}