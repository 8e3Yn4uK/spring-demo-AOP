package com.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

@Component
public class AccountDao {

    public void addAccount(){
        System.out.println(getClass() + ": Doing my DB work - adding account");
    }
}
