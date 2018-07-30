package com.example.eurekabussnissserviceuser.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Component;

/**
 * @Title: GoodsRepository
 * @Author: long-zp
 * @Date: 2018/7/30 15:25
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Component
public interface GoodsRepository  extends ElasticsearchCrudRepository<GoodsInfo,Long> {

}
