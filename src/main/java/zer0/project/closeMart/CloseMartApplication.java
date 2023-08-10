package zer0.project.closeMart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value= {"zer0.project.closeMart.mapper"})
public class CloseMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloseMartApplication.class, args);
	}

}
