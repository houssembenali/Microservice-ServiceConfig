package tn.hoos.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceServiceConfigApplication {
	
	//after run check URL 	http://localhost:8888/application/master
	// 						http://localhost:8888/company-service/master
	// http:// IP:port / configFileName / profile
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServiceConfigApplication.class, args);
	}

}
