package com.microservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	
	
	// GetWeather from Weather service and save it on mongoDB dataBase
	@GetMapping("/getWeatherAndSave")
	public MeteoModel getMeteoAndSave(@RequestParam String city) {		
		return meteoService.meteoSaver(city);
	}
	
	@GetMapping("/getAllSavedWeathers")
	public List<MeteoModel> getAll(){
		return meteoService.getAllSavedInfo();
	}
	
	@GetMapping("/getById")
	public Optional<MeteoModel> getById(@RequestParam String city) {
		return meteoService.findById(city);
	}
	
	@DeleteMapping("/deleteById")
	public List<MeteoModel> deleteById(@RequestParam String city) {
		meteoService.deleteById(city);
		return meteoService.getAllSavedInfo();
	}
	
	@DeleteMapping("/deleteAll")
	public List<MeteoModel>  deleteAll() {
		meteoService.deleteAll();
		return meteoService.getAllSavedInfo();
	}
	
}
