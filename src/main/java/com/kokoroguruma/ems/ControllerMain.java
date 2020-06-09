package com.kokoroguruma.ems;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMain {

    @RequestMapping(value = "/")
    public String event01() {

        return "/starter.html";
        // return "/event01.html";
    }

    @RequestMapping(value = "/starter02")
    public String starter02() {


        return "/starter02.html";
    }

    @RequestMapping(value = "/testApi")
    public String testApi(Model model) {
        HashMap<String, Object> mapData = new HashMap<String, Object>();

        mapData.put("aaa", "bbb");

        ArrayList<String> list = new ArrayList<String>();
        list.add("abb");
        list.add("aCC");
        list.add("aDD");
        mapData.put("bbb", list);

        HashMap<String, Object> mapData2 = new HashMap<String, Object>();
        mapData2.put("key1", "data1");
        mapData2.put("key2", "data2");
        mapData2.put("key3", "data3");
        mapData2.put("key4", "data4");
        mapData2.put("key5", "10");
        mapData.put("ccc", mapData2);


        HashMap<String, Object> mapData3 = new HashMap<String, Object>();
        mapData3.put("key1", "true");
        mapData3.put("key2", "false");
        mapData.put("ddd", mapData3);

        model.addAllAttributes(mapData);

        return "/testApi.html";
    }

    @RequestMapping(value = "/testApi2")
    public String testApi2(Model model) {


        return "/testApi2.html";
    }




}
