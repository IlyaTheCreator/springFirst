//package com.example.demo.learnbean.configuration;
//
//import com.example.demo.learnbean.service.CarVehicleService;
//import com.example.demo.learnbean.service.PlaneVehicleService;
//import com.example.demo.learnbean.service.VehicleService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//@Configuration
//public class AppConfiguration {
//
//    @Bean
////    @Qualifier("carVehicleServiceConfiguration")
//    // If a property in application.properties file called vehicle.service.mode is equal to car,
//    // use that instance
//    @ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "car", matchIfMissing = false)
//    public VehicleService carVehicleServiceConfiguration() {
//        return new CarVehicleService();
//    }
//
//    @Bean
//    // @Primary // when we have multiple candidates, a bean with this annotation will be taken
////    @Qualifier("planeVehicleServiceConfiguration")
//    @ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "plane", matchIfMissing = false)
//    public VehicleService planeVehicleServiceConfiguration() {
//        return new PlaneVehicleService();
//    }
//}
