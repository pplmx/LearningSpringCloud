package individual.cy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/4 11:21
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class LearningSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringCloudApplication.class, args);
	}
}
