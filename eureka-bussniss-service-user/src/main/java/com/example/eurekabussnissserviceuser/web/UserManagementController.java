package com.example.eurekabussnissserviceuser.web;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title: UserManagementController
 * @Author: long-zp
 * @Date: 2018/7/16 15:20
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RestController
@RefreshScope
public class UserManagementController {

    @Value("${server.port}")
    String serverPort;

    @Value("${server.time}")
    String testValue;

    @GetMapping("/listUsers")
    public String ListUsers() {
        /**
         * 模拟从数据库查询
         */
        List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
        for (int i = 1; i < 5; i++) {
            Map<String, Object> user = new HashMap<String, Object>();
            user.put("id", i);
            user.put("name", "小明" + i);
            users.add(user);
        }
        return "服务器端口号：   " + serverPort + "   |   用户信息：   " + users.toString();
    }

    @GetMapping("/getTestValue")
    public String getTestValue(){
        return testValue;
    }

    //    整合redis实现session共享
    @GetMapping(value = "getUser")
    public String getUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (StringUtils.isEmpty(username)) {
            session.setAttribute("username","testSessionRedis|" + System.currentTimeMillis());
        }
        return username;
    }
}
