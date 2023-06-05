package com.example.conectaBase.service;

import java.util.List;
import com.example.conectaBase.entity.MyTableEntity;

public interface MyTableService {
    public abstract List<MyTableEntity> listAllTables();
}
