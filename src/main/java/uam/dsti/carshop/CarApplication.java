package uam.dsti.carshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CarApplication {

	private static final Logger logger = LoggerFactory.getLogger(CarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
		logger.info("Car App started! Goto http://localhost:8081/dic_student_name");
	}

}


@RestController
@RequestMapping("/dic_student_name")
class CarController{
	@Value("${fullname:Ousoka}")
	private String fullname;

	@GetMapping
	String getFullname() {
		return "Work done by "+this.fullname+" !";
	}
}

