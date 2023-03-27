package com.nobugfound.gita2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CopyService {
    private final RestTemplate restTemplate;

@Autowired
    public CopyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }



    public ResponseEntity<String> consumeApi(int num,int chapt){
    String url="https://bhagavad-gita3.p.rapidapi.com/v2/chapters/"+chapt+"/verses/"+num+"/";
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "60a5b0fec1msh9b3a7106e1945d7p111422jsn6572bd7543f2");
        headers.set("X-RapidAPI-Host", "bhagavad-gita3.p.rapidapi.com");

        HttpEntity<String> entity = new HttpEntity<>("body", headers);
    return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }
}
