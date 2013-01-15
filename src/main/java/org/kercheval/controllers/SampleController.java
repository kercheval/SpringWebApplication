package org.kercheval.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController
{
    Logger log = Logger.getLogger(this.getClass().getCanonicalName());

    @RequestMapping(value = "jspsample", method=RequestMethod.GET)
    public String sample()
    {
        log.info("jspsample called");
        return "sample";
    }
}
