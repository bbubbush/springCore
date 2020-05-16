package com.bbubbush.demo.logic.service.impl;

import com.bbubbush.demo.logic.service.DemoService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("local")
@Service
public class DemoServiceForLocal implements DemoService {

}
