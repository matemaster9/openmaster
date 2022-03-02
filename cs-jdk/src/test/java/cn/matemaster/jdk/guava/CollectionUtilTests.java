package cn.matemaster.jdk.guava;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/3/1 21:33
 */
public class CollectionUtilTests {

    /**
     * 静态构造器
     */
    @Test
    void staticConstructor() {
        String[] arr = {"HUAWEI", "Apple", "Oracle", "Tesla", "Amazon", "Microsoft", "Alibaba", "Tencent", "Sony", "Sun"};
        List<String> names = Lists.newArrayList(arr);
        System.out.println(names);
    }
}
