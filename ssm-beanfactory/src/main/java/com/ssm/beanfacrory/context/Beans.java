package com.ssm.beanfacrory.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ssm.service.Car;

@Configuration
public class Beans {

	@Bean(name = "car")
	public Car buildCar() {
		Car car = new Car();
		car.setBrand("红旗CA72");
		car.setMaxSpeed(200);
		return car;
	}
}
