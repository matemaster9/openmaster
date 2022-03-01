package cn.matemaster.jdk.jcf;

import cn.matemaster.jdk.jcf.util.ConstructUtils;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 9:44
 */
public class CompanyTests {

    /**
     * 以UUID为key，对象自身为value
     */
    @Test
    void list2Map1() {
        List<Company> list = ConstructUtils.list();
        Map<String, Company> collect = list.stream().collect(Collectors.toMap(Company::getUuid, company -> company));
        collect.forEach((a, b) -> System.out.println("key: " + a + " value: " + b));
    }

    /**
     * list2Map1的另一种实现方式
     */
    @Test
    void list2Map2() {
        List<Company> list = ConstructUtils.list();
        Map<String, Company> collect = list.stream().collect(Collectors.toMap(Company::getUuid, Function.identity()));
        collect.forEach((a, b) -> System.out.println("key: " + a + " value: " + b));
    }

    /**
     * 提取uuid-name作为map
     */
    @Test
    void list2Map3() {
        List<Company> list = ConstructUtils.list();
        Map<String, String> collect = list.stream().collect(Collectors.toMap(Company::getUuid, Company::getName));
        collect.forEach((a, b) -> System.out.println("uuid: " + a + " name: " + b));
    }

}
