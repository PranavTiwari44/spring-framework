package com.work.spring.springframework.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

@Component
class BusinessService{
    @Autowired
    private DataService dataService;

    public long calculateSum(){
        List<Integer> data = dataService.getData();
//        return data.stream().reduce(Integer::sum).get();
        return data.stream().reduce(0, (total, element) -> total + element);
    }
}
@Component
class DataService{
    public List<Integer> getData(){
        return Arrays.asList(10,22,30,33);
    }
}
