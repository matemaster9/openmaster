package cn.matemaster.jdk.enums;

import cn.matemaster.jdk.enums.service.Systemctl;
import cn.matemaster.jdk.enums.service.impl.User;
import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/27 20:46
 */
public class SystemctlTests {
    Systemctl systemctl = null;

    @Test
    void autoTest() {
        systemctl = User.valueOf("ADMIN");
        act(systemctl);
        systemctl = User.valueOf("GUEST");
        act(systemctl);
    }

    void act(Systemctl systemctl) {
        systemctl.start();
        systemctl.status();
        systemctl.stop();
    }
}
