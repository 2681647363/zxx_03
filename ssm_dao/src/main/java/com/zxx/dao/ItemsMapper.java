package com.zxx.dao;

import com.zxx.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itemsMapper")
public interface ItemsMapper {

    List<Items> findAll();

    int save (Items items);


}
