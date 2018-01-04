package individual.cy.feign.service.impl;

import individual.cy.feign.service.HiScheduleService;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/4 16:00
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Component
public class HiScheduleServiceHystrixImpl implements HiScheduleService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
