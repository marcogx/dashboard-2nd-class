package com.spacex.mars.monitoring.datadashboard.controller;

import com.spacex.mars.monitoring.datadashboard.model.dao.DataDao;
import com.spacex.mars.monitoring.datadashboard.model.dao.impl.DataHashMapDao;
import com.spacex.mars.monitoring.datadashboard.model.dvo.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  // == @Controller + @ResponseBody
public class DatadashboardController { // Web Layer

    private DataDao dataDao = new DataHashMapDao();

    @GetMapping("/data/{id}")
    public Data getDataById(@PathVariable Long id) {
        return dataDao.findById(id);
    }

    @PostMapping("/data")
    public Data createData(@RequestBody Data data) {
        return dataDao.save(data);
    }


    //    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello: " + name;
    }
}
