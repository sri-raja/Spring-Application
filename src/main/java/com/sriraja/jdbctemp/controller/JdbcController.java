package com.sriraja.jdbctemp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {

    /*@Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("executeQuery")
    public static void executeSQLQuery(){
        //jdbcTemplate.execute("Insert into itemMaster (itemCode,itemName,itemPrice) values (3,'Gold Winner',150)");
        //return "Successfully Query Executed";
    }*/
    @RequestMapping("/helloworld")
    public static String printHello(){
        return "Hello World";
    }

}
