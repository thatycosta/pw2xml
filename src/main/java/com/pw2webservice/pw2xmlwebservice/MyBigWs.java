package com.pw2webservice.pw2xmlwebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "Big", serviceName = "Big")
public class MyBigWs {

    @WebMethod
    public int sum(int a, int b){
        return a + b;
    }

}