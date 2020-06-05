package com.bbubbush.demo.logic.controller;

import com.bbubbush.demo.logic.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    @Autowired
    DemoService service;
}
