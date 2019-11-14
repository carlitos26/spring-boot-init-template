package com.carlobutelli.tech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/admin")
public class PingController {

    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    private static void logInfoWithTransactionId(String transactionId, String message) {
        log.info(String.format("%s: %s", transactionId, message));
    }

    @GetMapping(value = "/ping")
    public String ping() {
        String transactionId = UUID.randomUUID().toString();
        logInfoWithTransactionId(
                transactionId,
                "Got new ping request"
        );

        return "pong";
    }

}
