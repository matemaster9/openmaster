package cn.matemaster.jdk.guava;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/3/1 21:09
 */
public class ImmutableCollectionTests {
    /**
     * guava自定义的不可变集合 ImmutableSet
     */
    @Test
    void testImmutableSet() {
        ImmutableSet<String> colorSet = ImmutableSet.of(
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "purple");
        List<String> list = colorSet.stream().filter(str -> str.length() > 5).collect(Collectors.toList());
        System.out.println(list);
    }
}
