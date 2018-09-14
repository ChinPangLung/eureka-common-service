package com.example.eurekabussnissserviceuser.elasticsearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @Title: GoodsInfo
 * @Author: long-zp
 * @Date: 2018/7/30 15:19
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/

/**indexName索引名称 可以理解为数据库名 必须为小写
 * 不然会报org.elasticsearch.indices.InvalidIndexNameException异常
 * type类型 可以理解为表名
 */
@Data
@NoArgsConstructor //注解在类上；为类提供一个无参的构造方法
@AllArgsConstructor //注解在类上；为类提供一个全参的构造方法
@Document(indexName = "testgoods", type = "goods")
public class GoodsInfo implements Serializable {

    private Long id;

    private String name;

    private String description;

}
