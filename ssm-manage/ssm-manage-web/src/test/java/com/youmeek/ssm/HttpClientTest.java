package com.sand.abacus.point;

import com.sand.commons.jackson.JsonMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
* @author zhao.yz
* 2017年12月8日 下午6:45:24
*/
public class HttpClientTest {


    public static void main(String[] args) {
        String url = "http://localhost:8888/abacus/point/trans/addPoint";
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("accessCode", "0001");
        map.put("format", "json");
        map.put("charset", "UTF-8");
        map.put("timeStamp", "20171209010101");
        map.put("version", "1.0");
        map.put("signType", "aa");
        map.put("sign", "aa");
        
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("userId", "fdsa");
        map.put("data",data);

        String jsonParam = JsonMapper.buildNormalMapper().toJson(map);
   
        
        
        HttpHeaders requestHeaders = new HttpHeaders();  
        requestHeaders.set("Accept", "application/json");
        //requestHeaders.set("Content-Type", "text/plain");  
        //requestHeaders.set("Content-Type", "application/x-www-form-urlencoded");
        requestHeaders.set("Content-Type", "application/json");

        RestTemplate restTemplate = new RestTemplate();  
        HttpEntity<String> httpEntity = new HttpEntity<String>(jsonParam, requestHeaders);  
        String jsonData = restTemplate.postForObject(url, httpEntity, String.class);  
        System.out.println(jsonData);  
        
    }
    
}
