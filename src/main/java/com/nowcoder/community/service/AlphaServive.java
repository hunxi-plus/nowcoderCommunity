package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaServive {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaServive(){
        System.out.println("实例化AlphaServive");
    }

    @PostConstruct
    public void init(){
        System.out.println("initialize AlphaService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁AlphaServive");
    }

    public String find(){
        return alphaDao.select();
    }
}
