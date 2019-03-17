package com.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println("\n" + getClass() + ": Doing my DB work - adding account");
    }
}
