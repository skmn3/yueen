package kr.co.sunget.yueen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan(basePackages = "kr.co.sunget.yueen.global.property")
@SpringBootApplication
public class YueenApplication {

	public static void main(String[] args) {
		SpringApplication.run(YueenApplication.class, args);
	}

}
