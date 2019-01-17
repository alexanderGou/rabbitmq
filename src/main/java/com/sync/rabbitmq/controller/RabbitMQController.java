package com.sync.rabbitmq.controller;

import com.sync.rabbitmq.service.RabbitMQService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "rabbitMQ")
@RestController
public class RabbitMQController {
    @Autowired
    private RabbitMQService mqService;

    @ApiOperation(value = "produce message and send to message server")
    @PostMapping("/rabbitmq")
    Boolean produceMsg(String msg) {
        return mqService.produceMsg(msg);
    }
    @ApiOperation(value = "get all message from message server")
    @GetMapping("/messages")
    String getRabbitMsg() {
        return "";
    }
}
