package com.cklearning.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RestController;

@Component
public class Computer {


    @Autowired
    private Dev dev;

    public String computerFunction(){

        dev.build();

        return "";
    }
}
