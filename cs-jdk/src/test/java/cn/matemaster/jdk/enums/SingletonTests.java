package cn.matemaster.jdk.enums;

import cn.matemaster.jdk.enums.design.Singleton;
import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 9:56
 */
public class SingletonTests {
    @Test
    void autoTest() {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance.equals(instance1));
    }
}
