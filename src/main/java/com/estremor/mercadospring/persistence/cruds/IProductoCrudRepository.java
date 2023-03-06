package com.estremor.mercadospring.persistence.cruds;

import com.estremor.mercadospring.persistence.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoCrudRepository extends CrudRepository<Producto,Integer> {
}
