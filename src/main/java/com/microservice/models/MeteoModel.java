package com.microservice.models;

import java.util.List;

public class MeteoModel {
	private String cod;
	private int message;
	private int cnt;
	private Lst[] list;
	private City city;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public Lst[] getList() {
		return list;
	}
	public void setList(Lst[] list) {
		this.list = list;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
