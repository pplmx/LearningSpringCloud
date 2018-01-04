package individual.cy.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/4 13:58
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

}
