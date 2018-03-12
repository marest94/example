package com.spring.app.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import localhost._8080.soap.Agreement;
import localhost._8080.soap.Service1;

@Component
public class Service1Repository {
private Map<Integer, Service1> service1Map = new HashMap<Integer, Service1>();
	
	public Service1Repository(){
		Service1 a1 = new Service1();
		a1.setUserID(1);
		a1.setService1ID(1);
		a1.setService1Type("service1.1");
		a1.setDate("12.12.2012");
		service1Map.put(a1.getService1ID(), a1);
		
		Service1 a2 = new Service1();
		a2.setUserID(1);
		a2.setService1ID(2);
		a2.setService1Type("credit");
		a2.setDate("12.12.2012");
		service1Map.put(a2.getService1ID(), a2);
		
		Service1 a3 = new Service1();
		a3.setUserID(2);
		a3.setService1ID(3);
		a3.setService1Type("credit");
		a3.setDate("12.12.2012");
		service1Map.put(a3.getService1ID(), a3);
	}
	
	public Service1 getService1(int service1ID){
		return service1Map.get(service1ID);
	}
}
