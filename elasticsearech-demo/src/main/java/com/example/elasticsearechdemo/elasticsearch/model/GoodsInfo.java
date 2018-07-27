package com.example.elasticsearechdemo.elasticsearch.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Title: GoodsInfo
 * @Author: long-zp
 * @Date: 2018/7/27 15:30
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/

// indexName ：索引名字（对应mysql的数据库名字）
//type:类型（对应mysql的表名）
@Document(indexName = "goodsdb",type = "goods")
@Data
public class GoodsInfo {

    private Long id;

    private String name;

    private String desc;

    public GoodsInfo(Long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public GoodsInfo() {
    }


}
