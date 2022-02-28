package cn.matemaster.jdk.jcf;

import cn.matemaster.jdk.jcf.util.ConstructUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 11:05
 */
public class ConstructUtilTests {

    @Test
    void testList() {
        List<Company> list = ConstructUtils.list();
        list.forEach(System.out::println);
    }
}
