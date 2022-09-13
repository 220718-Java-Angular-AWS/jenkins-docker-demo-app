package com.revature.dockerDemo.beans.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DataService {
    public Map<String, Object> dataMap;

    public DataService() {
        this.dataMap = new HashMap<>();
    }

    public void add(String name, Object obj) {
        this.dataMap.put(name, obj);
    }

    public Object get(String name) {
        return this.dataMap.get(name);
    }

    public void remove(String name) {
        this.dataMap.remove(name);
    }

    public void clear() {
        this.dataMap.clear();
    }
}
