package com.j1902.springboot.controller;

import com.j1902.springboot.pojo.Item;
import com.j1902.springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/itemList")
    public List<Item> getItemList(){
        return itemService.getItemAll();
    }
}
