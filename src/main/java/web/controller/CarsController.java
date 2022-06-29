package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {
    @Autowired
    CarDaoImpl carDao;
    @GetMapping(value = "/cars")
    public String printCars( ModelMap model, @RequestParam(required = false) Long count) {
        carDao.addTestData(); //да при каждом обновлении  данные добавляются дальше
        if ((count != null) && (count >= 0)) {
            model.addAttribute("messages",carDao.getAllLimitedByCount(count));
        } else {
            model.addAttribute("messages",carDao.getAll());
        }
        return "cars";
    }

}