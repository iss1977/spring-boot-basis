package com.springbeans.exemple.beansexemple.configuration;

import com.springbeans.exemple.beansexemple.service.CarVehicleService;
import com.springbeans.exemple.beansexemple.service.PlaneVehicleService;
import com.springbeans.exemple.beansexemple.service.VehicleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

    @Bean
    @Qualifier("carVehicleServiceConfiguration")
    public VehicleService carVehicleServiceConfiguration(){
        return new CarVehicleService();
    }

    @Bean
    @Primary
    public VehicleService planeVehicleServiceConfiguration(){
        return new PlaneVehicleService();
    }


}
