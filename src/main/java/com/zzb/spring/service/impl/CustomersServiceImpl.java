package com.zzb.spring.service.impl;

import com.zzb.spring.dao.CustomersDao;
import com.zzb.spring.entity.Customers;
import com.zzb.spring.service.Aservice;
import com.zzb.spring.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className:CustomersServiceImpl
 * @desc:
 * @author:zzb
 * @date:2020/8/3121:02 version:1.0
 **/
@Service
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    private Aservice aservice;
    @Autowired
    private CustomersDao customersDao;


    @Override
    public Customers selectByPrimaryKey(Integer custId) {
        aservice.haha();
        return customersDao.selectByPrimaryKey(custId);
    }
}
