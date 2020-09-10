package com.zzb.spring.service;

import com.zzb.spring.entity.Customers;

public interface CustomersService {
    Customers selectByPrimaryKey(Integer custId);
}
