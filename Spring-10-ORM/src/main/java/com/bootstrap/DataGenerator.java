package com.bootstrap;

import com.entity.Car;
import com.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1=new Car("Bmw","M%");
        Car c2=new Car("Bmw","M1");

        carRepository.save(c1);
        carRepository.save(c2);



    }
}
