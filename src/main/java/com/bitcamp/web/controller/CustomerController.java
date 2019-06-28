package com.bitcamp.web.controller;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


/**
 * CustomerController
 */
@RestController // controller의 자식..controller역할+rest역할
@RequestMapping("/customers")
public class CustomerController {
    @Autowired CustomerDTO customer;
    @Autowired CustomerService customerService;	
    

    //회원가입
    @PostMapping("") //join쿼리는 insert니까 postmapping사용, insert(POSTMAPPING)는 id가 없다+클래스 전체 어노테이션으로 /customers/줌->비워둠
    public HashMap<String,Object> join(@RequestBody CustomerDTO param){ //hashmap이 json하고 호환됨..
       
        return null;
    }
}