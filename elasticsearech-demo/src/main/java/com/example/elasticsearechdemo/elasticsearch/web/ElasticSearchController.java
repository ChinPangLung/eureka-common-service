package com.example.elasticsearechdemo.elasticsearch.web;

import com.example.elasticsearechdemo.elasticsearch.GoodsRepository;
import com.example.elasticsearechdemo.elasticsearch.model.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ElasticSearchController
 * @Author: long-zp
 * @Date: 2018/7/27 15:34
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RestController
public class ElasticSearchController {

    @Autowired
    private GoodsRepository goodsRepository;

    //增加
    @RequestMapping("/add")
    public String add(){

        GoodsInfo goodsInfo = new GoodsInfo(1L, "test", "desc");
        goodsRepository.save(goodsInfo);

        System.out.println("add a obj");

        return "success";
    }
}

