
package Springweb.repository;


import Springweb.*;
import Springweb.entity.Vegetable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author caothanh
 */
@Repository
public interface VegetableRepository extends CrudRepository<Vegetable, Integer>{
    
    
}
