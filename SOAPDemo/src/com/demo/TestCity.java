package com.demo;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class TestCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GlobalWeather globalWeather=new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap=globalWeather.getGlobalWeatherSoap();
		String cities=globalWeatherSoap.getCitiesByCountry("India");
		System.out.println(cities);

	}

}
