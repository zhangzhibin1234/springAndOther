package com.zzb.spring.service.impl;

import com.zzb.spring.service.Aservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className:AserviceImpl
 * @desc:
 * @author:zzb
 * @date:2020/8/3121:47 version:1.0
 **/
@Service
public class AserviceImpl implements Aservice {

    @Override
    public void haha() {
        System.out.println("hahaha");
    }
}
