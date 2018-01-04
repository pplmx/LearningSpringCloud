package individual.cy.cloud.controller;

import individual.cy.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
