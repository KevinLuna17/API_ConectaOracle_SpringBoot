package com.example.conectaBase.controller;

import com.example.conectaBase.entity.MyTableEntity;
import com.example.conectaBase.service.MyTableServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/my_table")
@CrossOrigin(origins = "*")
public class MyTableController {
    @Autowired
    @Qualifier("serviceMyTableImpl")
    private MyTableServiceImpl serviceMyTable;

    @GetMapping(path = "/list/", produces = {"application/json"})
    public List<MyTableEntity> ListMyTableEntity(){
        return serviceMyTable.listAllTables();
    }
}
