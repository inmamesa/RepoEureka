package cpn.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path="/")
	public String myValue()
	{
		return "Hola Mundo";
	}

}
