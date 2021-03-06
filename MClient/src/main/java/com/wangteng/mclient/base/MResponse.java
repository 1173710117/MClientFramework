package com.wangteng.mclient.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
@Getter
@Setter
@ToString
public class MResponse {
    private String status = "Success";
    private Map<String, Object> valueMap = new HashMap<>();

    public Object get(String key) {
        return this.valueMap.getOrDefault(key, null);
    }

    public MResponse set(String key, Object value) {
        this.valueMap.put(key, value);
        return this;
    }


    public Object[] getParameterValue(String[] names){
        List<Object> temp = new ArrayList<>();
        for (String s:names){
            temp.add(valueMap.get(s));
        }
        return temp.toArray();
    }


    public MResponse() {

    }

    public static MResponse failResponse() {
        MResponse response = new MResponse();
        response.setStatus("Fail");
        return response;
    }
}
