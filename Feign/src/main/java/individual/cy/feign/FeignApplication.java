package individual.cy.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/4 14:35
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}
