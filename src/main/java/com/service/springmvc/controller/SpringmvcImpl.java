package com.service.springmvc.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-04-13T10:45:55.787Z")

@RestSchema(schemaId = "springmvc")
@RequestMapping(path = "/springmvc", produces = MediaType.APPLICATION_JSON)
public class SpringmvcImpl {

    @Autowired
    private SpringmvcDelegate userSpringmvcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSpringmvcDelegate.helloworld(name);
    }

}
