package com.example.conectaBase.repository;

import com.example.conectaBase.entity.MyTableEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoryMyTable")
public interface MyTableRepository extends CrudRepository<MyTableEntity, String> {


}
