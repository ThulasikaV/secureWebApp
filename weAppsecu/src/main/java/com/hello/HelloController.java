package com.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by printha on 10/13/18.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "greeting hello";
    }

    @RequestMapping(value = "/secureHello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String secHello() {
        return "secure greeting";
    }
}
