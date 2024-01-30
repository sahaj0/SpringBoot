package com.stackroute.resttemplate.service;

import com.stackroute.resttemplate.model.Weather;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    //add your api key here
    private static final String API_KEY = "08be2aba8eb942bcaf271558231511";
    //add your api url here
    private static final String API_URL = "http://api.weatherapi.com/v1/current.json?key={apiKey}&q={location}&aqi=no";
    private final RestTemplate restTemplate;
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    //using rest template, get the weather details of a city
    public Weather getWeather(String city) {
        String apiUrl = API_URL.replace("{location}", city).replace("{apiKey}", API_KEY);
        return restTemplate.getForObject(apiUrl, Weather.class);
    }
}



