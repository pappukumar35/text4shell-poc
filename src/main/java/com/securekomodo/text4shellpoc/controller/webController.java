package com.securekomodo.text4shellpoc.controller;

import org.apache.commons.text.StringSubstitutor;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {

        @RequestMapping(value = "/", method = RequestMethod.GET)
        @ResponseBody
        public String index() {
                String response = "Hello HACK3R5" + "</br>"
                                                + "Send your name to /fun?name=yourname" + "</br>"
                                                + "and see the fun!";
                return response;
        }

        @RequestMapping(value = "/fun", method = RequestMethod.GET)
        @ResponseBody
        public String reflected(@RequestParam(defaultValue="pwnb0y") String name) {
                StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
                try{
                        String vuln = interpolator.replace(name);
                } catch(Exception e) {
                        System.out.println(e);
                }
                return "Hello " + name + "!" ;
}


}
