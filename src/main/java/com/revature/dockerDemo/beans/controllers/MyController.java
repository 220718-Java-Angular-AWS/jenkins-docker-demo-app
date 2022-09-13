package com.revature.dockerDemo.beans.controllers;

import com.revature.dockerDemo.beans.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MyController {

    private final DataService dataService;

    @Autowired
    public MyController(DataService dataService) {
        this.dataService = dataService;
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String ping() {
        return "Pong!";
    }

    @RequestMapping(value = "/{name}")
    public Object getObjectByName(@PathVariable String name) {
        return dataService.get(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{name}")
    public void saveObject(@PathVariable String name, @RequestBody Object obj) {
        dataService.add(name, obj);
    }
}
