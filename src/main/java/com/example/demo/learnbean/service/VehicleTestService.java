//package com.example.demo.learnbean.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//@Service
//public class VehicleTestService {
//
//    // Remember that there's a @Service class somewhere
//
////    @Autowired
////    VehicleService vehicleService; // this is just a public property and does not
//    // have a setter. Clearly, this is not a good practice. Nor is it recommended.
//
////    @Autowired
////    private VehicleService vehicleService; // this is better, but there's a headache
//    // with testing
//
//    // ....
//
//    // Constructor injection - the best
////    @Autowired // in this case, we can omit the @Autowired annotation
//    @Autowired
////    @Qualifier("carVehicleServiceConfiguration")
//    private final VehicleService vehicleService; // final is here because there's a constructor
//    // in this case final means constant
//
//    public VehicleTestService(/*@Qualifier("carVehicleServiceConfiguration")*/ VehicleService service) {
//        this.vehicleService = service;
//    }
//
//    public void testVehicle() {
//        vehicleService.startEngine();
//        vehicleService.move();
//        vehicleService.stopEngine();
//    }
//}
