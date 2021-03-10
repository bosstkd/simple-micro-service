package com.microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.models.MeteoModel;
import com.microservice.repository.MeteoRepository;

@Service
public class MeteoService {

	public MeteoModel meteo(String city) {
		
		RestTemplate restTemplate = new RestTemplate();
		String meteoHost = "https://api.openweathermap.org/data/2.5/forecast?q=";
		String meteoKey= "&units=imperial&type=accurate&APPID=ffdd58e2c0b917abe7137c942a1c1d67";
		MeteoModel meteoModel = restTemplate.getForObject(meteoHost+city+meteoKey, MeteoModel.class);
		
		return meteoModel;
	}
	
	@Autowired
	public MeteoRepository mr;
	
	public MeteoModel meteoSaver(String city) {
		MeteoModel meteoModel = meteo(city);
		meteoModel.setCityName(city);
		mr.save(meteoModel);
		return meteoModel;
	}
	
	public List<MeteoModel> getAllSavedInfo(){
		return mr.findAll();		
	}
	
	public Optional<MeteoModel> findById(String city) {
		return mr.findById(city);
	}
	
	public boolean deleteById(String city) {
		try {
			mr.deleteById(city);
		} catch (Exception e) {
			return false;
		}
		 return true;
	}
	
	public boolean deleteAll() {
		try {
			mr.deleteAll();
		} catch (Exception e) {
			return false;
		}
		 return true;
	}
	
	
}
