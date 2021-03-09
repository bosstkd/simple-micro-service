package com.microservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.models.MeteoModel;

@Service
public class MeteoService {

	public MeteoModel meteo(String city) {
		
		RestTemplate restTemplate = new RestTemplate();
		String meteoHost = "https://api.openweathermap.org/data/2.5/forecast?q=";
		String meteoKey= "&units=imperial&type=accurate&APPID=ffdd58e2c0b917abe7137c942a1c1d67";
		MeteoModel meteoModel = restTemplate.getForObject(meteoHost+city+meteoKey, MeteoModel.class);
		
		return meteoModel;
	}
	
}
