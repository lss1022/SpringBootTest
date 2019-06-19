package com.j1902.springboot.service.impl;

import com.j1902.springboot.mapper.ItemMapper;
import com.j1902.springboot.pojo.Item;
import com.j1902.springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> getItemAll() {
        return itemMapper.selectByExample(null);
    }
}
