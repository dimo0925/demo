package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.MyTest;
@Repository
public interface MyTestDao {
    List<MyTest> findAll();
}