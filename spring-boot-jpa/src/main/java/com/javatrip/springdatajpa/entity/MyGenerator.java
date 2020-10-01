package com.javatrip.springdatajpa.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @Author zhbin
 * @Description ID是int类型所以这里继承的是IdentityGenerator类，如果ID为String类型的话应该继承 UUIDGenerator
 * @Date 2020-09-09 18:48
 */
public class MyGenerator implements IdentifierGenerator{
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return getId();
    }
    public static int getId(){
        return (int)((Math.random()*9+1)*100000);
    }
}
