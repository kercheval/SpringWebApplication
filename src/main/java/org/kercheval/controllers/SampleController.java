package org.kercheval.controllers;

import java.util.HashMap;
import java.util.Map;

import org.kercheval.statistics.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController
{
    Logger log = LoggerFactory.getLogger(this.getClass());

    private final Timer controllerTimer = Timer.getTimer("Service - " + getName());

    public String getName()
    {
        return this.getClass().getName();
    }

    @RequestMapping(
        value = "jspsample",
        method = RequestMethod.GET)
    public String sample()
    {
        final Timer.TimerState timerState = controllerTimer.start();
        try
        {
            return "sample";
        }
        finally
        {
            timerState.stopAndDebugLog(log, getName(), ".sample() called");
        }
    }

    @RequestMapping(
        value = "sample.json",
        method = RequestMethod.GET)
    public Map<String, String> getJSON()
    {
        final Timer.TimerState timerState = controllerTimer.start();
        try
        {
            final Map<String, String> map = new HashMap<String, String>();
            map.put("myString", "This is a string response and should be valid JSON");

            return map;
        }
        finally
        {
            timerState.stopAndDebugLog(log, getName(), ".getJSON() called");
        }
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
        final Timer.TimerState timerState = controllerTimer.start();
        try
        {
            final Map<String, String> map = new HashMap<String, String>();
            map.put("myString", "This is a string response and should be valid JSONP");

            return map;
        }
        finally
        {
            timerState.stopAndDebugLog(log, getName(), ".getJSONP() called");
        }
    }

    @RequestMapping(
        value = "restsample/{firstParam}",
        method = RequestMethod.GET)
    public @ResponseBody
    String sampleRestOneParam(@PathVariable final String firstParam)
    {
        final Timer.TimerState timerState = controllerTimer.start();
        try
        {
            return "First parameter: " + firstParam;
        }
        finally
        {
            timerState.stopAndDebugLog(log, getName(), ".sampleRestOneParam() called");
        }
    }

    @RequestMapping(
        value = "restsample/{firstParam}/{secondParam}",
        method = RequestMethod.GET)
    public @ResponseBody
    String sampleRestTwoParam(@PathVariable final String firstParam, @PathVariable final String secondParam)
    {
        final Timer.TimerState timerState = controllerTimer.start();
        try
        {
            return "First parameter: " + firstParam + ", Second parameter: " + secondParam;
        }
        finally
        {
            timerState.stopAndDebugLog(log, getName(), ".sampleRestTwoParam() called");
        }
    }
}
