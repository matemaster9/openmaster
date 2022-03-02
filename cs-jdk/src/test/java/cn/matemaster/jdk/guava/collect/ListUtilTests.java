package cn.matemaster.jdk.guava.collect;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/3/1 21:46
 */
public class ListUtilTests {

    /**
     * Lists.asList
     */
    @Test
    void asListTest() {
        String[] arr = {"HUAWEI", "Apple", "Oracle", "Tesla", "Amazon", "Microsoft", "Alibaba", "Tencent", "Sony", "Sun"};
        List<String> list = Lists.asList("Company:", arr);
        list.remove(0);
        System.out.println(list);
    }
}
