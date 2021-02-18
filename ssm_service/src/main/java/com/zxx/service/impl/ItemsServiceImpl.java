package com.zxx.service.impl;

import com.zxx.pojo.Items;
import com.zxx.dao.ItemsMapper;
import com.zxx.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;


    public List<Items> findAll() {
        List<Items> list = itemsMapper.findAll();
        System.out.println("list=="+list);
        return list;
    }

    public void save(Items items) {
        int save = itemsMapper.save(items);
        System.out.println("save=="+save);
    }
}
