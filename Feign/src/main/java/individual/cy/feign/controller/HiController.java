package individual.cy.feign.controller;

import individual.cy.feign.service.HiScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/4 14:48
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@RestController
public class HiController {

    @Autowired
    private HiScheduleService hiScheduleService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return hiScheduleService.sayHiFromClientOne(name);
    }

}
