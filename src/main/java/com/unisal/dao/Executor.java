package com.unisal.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.unisal.model.City;

public class Executor {

	private static final CityDAO cityDAO = CityDAO.getInstance();
	
	public static void main(String[] args){ 

		//delete
		/*
		City city = new City();
		city.setId(new Long ("3"));
		try {
			cityDAO.delete(city);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		}
	}
}
		*/
	
		
		
		
		/*try {
		City city = cityDAO.getCityByGeocodigo(0);
		System.out.println(city.toString());
	} catch (ClassNotFoundException | SQLException | IOException e) {
		System.out.println(e.toString());
	}*/
		
		
		
		

		// TODO Auto-generated method stub
		City city = new City();
		city.setNome("itajubá");
		city.setGeocodigo(0.0);
		city.setLatitude(0.0);
		city.setLongitude(0.0);
		/*
		CityDAO cityDAO = CityDAO.getInstance();
		try {
			cityDAO.insert(city);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		} */
		try {
			city.setId(new Long("2"));
			city.setGeocodigo(601245);
			city.setLatitude(-22.12543);
			city.setLongitude(-44.12345);
			
			cityDAO.update(city);
		} catch (ClassNotFoundException | SQLException | IOException e){
			System.out.println(e.toString());
		}
		
	}

}
