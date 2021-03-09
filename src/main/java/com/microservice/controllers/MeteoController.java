package com.microservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.models.MeteoModel;
import com.microservice.services.MeteoService;

@RestController
@CrossOrigin
@RequestMapping("/meteo")
public class MeteoController {

	@Autowired
	private MeteoService meteoService;
	
	@GetMapping("/getWeather")
	public MeteoModel getMeteo(@RequestParam String city) {
		return meteoService.meteo(city);
	}
	
}
