package com.zxx.service;

import com.zxx.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();
    void save(Items items);
}
