package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceCar;

@Controller
public class ControllerCars {
	private final ServiceCar serviceCar;

	@Autowired
	public ControllerCars(ServiceCar serviceCar) {
		this.serviceCar = serviceCar;
	}

	@GetMapping(value = "/cars")
	public String showCars(@RequestParam(value = "count", required = false) Integer count,
						   ModelMap model) {
		ServiceCar garage = new ServiceCar();
		model.addAttribute("myCars", garage.getCars(count));
		return "cars";
	}
}
