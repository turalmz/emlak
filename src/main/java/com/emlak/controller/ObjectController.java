package com.emlak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ObjectController {


    @Autowired
    private ObjectService entityService;

    @RequestMapping("/object")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value ="/object/{obId}", method = RequestMethod.GET)
    public List<Object> getObject(@PathVariable String obId) {
        return entityService.getById(obId);
    }

    @RequestMapping(value ="/object/", method = RequestMethod.POST)
    public String addPerson(@RequestParam("name") String name, @PathVariable("id") String id)  {
        return "{status: 200}";
    }

}