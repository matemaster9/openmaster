package cn.matemaster.jdk.common;

import cn.matemaster.jdk.common.service.TrafficTool;
import cn.matemaster.jdk.common.service.impl.SportyCar;
import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 21:21
 */
public class TrafficToolTests {
    @Test
    void testSportyCar() {
        TrafficTool sportyCar = new SportyCar();
        sportyCar.startup();
        TrafficTool.callback();
        System.out.println(SportyCar.NAME);
    }
}
