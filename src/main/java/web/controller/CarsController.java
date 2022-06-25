package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars( ModelMap model, @RequestParam(required = false) Long count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("zaz",12, 4));
        cars.add(new Car("belaz",6, 40));
        cars.add(new Car("seat",3, 5));
        cars.add(new Car("bicycle",2, 0));
        cars.add(new Car("ya i sam svoego roda mashina",0, 1));
        if ((count!=null)&&(count < cars.size())&&(count>=0)) {
            model.addAttribute("messages",cars.subList(0,count.intValue()));
        } else {
            model.addAttribute("messages", cars);
        }
        return "cars";
    }

}