package com.bootcamp.projectcar.service;

import com.bootcamp.projectcar.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

private static final Map<String, Car> cars =new HashMap<>();

@PostConstruct
    public void inizialize() {
    Car audi = new Car();
    audi.setModel("Audi");
    audi.setPlate(121);
    audi.setKilometers(120);

    Car bmw = new Car();
    bmw.setModel("BMW");
    bmw.setPlate(4535);
    bmw.setKilometers(200);

    Car kia = new Car();
    kia.setModel("Kia");
    kia.setPlate(7658);
    kia.setKilometers(90);

    cars.put(audi.getModel(), audi);
    cars.put(bmw.getModel(), bmw);
    cars.put(kia.getModel(), kia);
}

public Car getCars(String model) {return cars.get(model);}
}
