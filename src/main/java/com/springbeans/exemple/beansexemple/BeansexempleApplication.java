package com.springbeans.exemple.beansexemple;

import com.springbeans.exemple.beansexemple.service.CarVehicleService;
import com.springbeans.exemple.beansexemple.service.VehicleService;
import com.springbeans.exemple.beansexemple.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeansexempleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(BeansexempleApplication.class, args);

		System.out.println("Selecting plane configuration. @Primary was used.");
		// Here it will select the "plane" because it is annotated with "@Primary" in class "AppConfiguration"
		VehicleService vehicleService= context.getBean(VehicleService.class);
		vehicleService.startEngine();
		vehicleService.move();
		vehicleService.stopEngine();


		System.out.println("Selecting car  configuration. getBean(CarVehicleService.class) was used");
		// Here it will select the "car" because of context.getBean(CarVehicleService.class); @Primary will be ignored
		VehicleService vehicleService2= context.getBean(CarVehicleService.class);
		vehicleService2.startEngine();
		vehicleService2.move();
		vehicleService2.stopEngine();

		System.out.println("Selecting car configuration.  @Autowired and" +
				"    @Qualifier(\"carVehicleServiceConfiguration\") was used.");

		VehicleTestService vehicleTestService = context.getBean(VehicleTestService.class);
		vehicleTestService.testVehicle();
	}

}
