package individual.cy.feign.service;

import individual.cy.feign.service.impl.HiScheduleServiceHystrixImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2018/1/4 14:46
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@FeignClient(value = "service-hi", fallback = HiScheduleServiceHystrixImpl.class)
public interface HiScheduleService {

    /**
     * 调用hi
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
