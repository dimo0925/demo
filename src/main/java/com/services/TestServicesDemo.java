package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyTestDao;
import com.entity.MyTest;

@Service
public class TestServicesDemo implements ITestServices{
    @Autowired
    private MyTestDao testDao;;

    @Override
    public List<MyTest> findAll() {
        return testDao.findAll();
    }

}

