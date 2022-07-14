package service;

import model.Car;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCar {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "X", 1));
        cars.add(new Car("BMW", "X", 2));
        cars.add(new Car("BMW", "X", 3));
        cars.add(new Car("BMW", "X", 4));
        cars.add(new Car("BMW", "X", 5));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else if (count > 0 && count < 5) {
            return cars.subList(0, count);
        } else {
            return null;
        }
    }
}
