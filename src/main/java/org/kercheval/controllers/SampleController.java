package org.kercheval.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController
{
    Logger log = Logger.getLogger(this.getClass().getCanonicalName());

    @RequestMapping(
        value = "jspsample",
        method = RequestMethod.GET)
    public String sample()
    {
        log.info("jspsample called");
        return "sample";
    }

    @RequestMapping(
        value = "sample.json",
        method = RequestMethod.GET)
    public Map<String, String> getJSON()
    {
        log.info("sample.json called");

        final Map<String, String> map = new HashMap<String, String>();
        map.put("myString", "This is a string response and should be valid JSON");

        return map;
    }

    @RequestMapping(
        value = "sample.jsonp",
        method = RequestMethod.GET,
        produces =
        {
            "application/javascript"
        })
    public Map<String, String> getJSONP()
    {
        log.info("sample.jsonp called");

        final Map<String, String> map = new HashMap<String, String>();
        map.put("myString", "This is a string response and should be valid JSONP");

        return map;
    }

    @RequestMapping(
        value = "restsample/{firstParam}",
        method = RequestMethod.GET)
    public @ResponseBody
    String sampleRestOneParam(@PathVariable final String firstParam)
    {
        log.info("sampleRestOneParam called");
        return "First parameter: " + firstParam;
    }

    @RequestMapping(
        value = "restsample/{firstParam}/{secondParam}",
        method = RequestMethod.GET)
    public @ResponseBody
    String sampleRestTwoParam(@PathVariable final String firstParam, @PathVariable final String secondParam)
    {
        log.info("sampleRestTwoParam called");
        return "First parameter: " + firstParam + ", Second parameter: " + secondParam;
    }
}
