package com.hafiz.www.controller;

import com.hafiz.www.po.UserEntity;
import com.hafiz.www.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:用户信息控制器
 * Created by hafiz.zhang on 2016/8/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        logger.info("[GET] /user/all getAllUsers");
        //List<UserEntity> list = userService.getAllUsers();
        List<UserEntity> list = new ArrayList<>();
        logger.debug("This is log of level of debug");
        logger.trace("log4j2 Demo");
        logger.error("哎呀，出错啦~");
        return list;
    }
}
