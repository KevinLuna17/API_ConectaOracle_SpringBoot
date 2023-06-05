package com.example.conectaBase.service;

import com.example.conectaBase.entity.MyTableEntity;
import com.example.conectaBase.repository.MyTableRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceMyTableImpl")
@Transactional
public class MyTableServiceImpl implements MyTableService {
    @Autowired
    @Qualifier("repositoryMyTable")
    private MyTableRepository myTableRepository;

    @Override
    public List<MyTableEntity> listAllTables() {
        return (List<MyTableEntity>) myTableRepository.findAll();
    }
}
