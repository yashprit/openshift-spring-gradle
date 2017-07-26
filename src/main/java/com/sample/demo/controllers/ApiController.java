package com.sample.demo.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yashprit on 26/07/17.
 */

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getAPIStatus(){
        return new ResponseEntity<>("Hello API Working", HttpStatus.OK);
    }


}
