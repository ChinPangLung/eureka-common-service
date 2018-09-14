package com.example.elasticsearechdemo.elasticsearch;

import com.example.elasticsearechdemo.elasticsearch.model.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Title: EmployeeRepository
 * @Author: long-zp
 * @Date: 2018/7/27 15:32
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo, Long> {

    GoodsInfo queryGoodsInfoById(Long id);
}
