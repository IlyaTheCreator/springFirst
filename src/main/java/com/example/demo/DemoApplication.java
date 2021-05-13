package com.example.demo;

//import com.example.demo.learnbean.service.CarVehicleService;
//import com.example.demo.learnbean.service.VehicleService;
//import com.example.demo.learnbean.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//
////		VehicleService vehicleService = context.getBean(CarVehicleService.class);
////
////		vehicleService.startEngine();
////		vehicleService.move();
////		vehicleService.stopEngine();
//
//		VehicleTestService vehicleTestService = context.getBean(VehicleTestService.class);
//		vehicleTestService.testVehicle();
//	}
}
