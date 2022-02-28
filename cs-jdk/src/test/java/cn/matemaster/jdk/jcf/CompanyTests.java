package cn.matemaster.jdk.jcf;

import cn.matemaster.jdk.jcf.util.ConstructUtils;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.*;
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

    /**
     * 增强for进行删除操作： java.util.ConcurrentModificationException
     */
    @Test
    void listErr1() {
        List<Company> list = ConstructUtils.list();
        for (Company company : list) {
            if (company.getName().equals("HUAWEI")) {
                list.remove(company);
            }
        }
    }

    @Test
    void correctErr1V1() {
        List<Company> list = ConstructUtils.list();
        Iterator<Company> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals("HUAWEI")) {
                it.remove();
            }
        }
        list.forEach(System.out::println);
    }

    @Test
    void correctErr1V2() {
        List<Company> list = ConstructUtils.list();
        list.removeIf(a -> a.getName().equals("HUAWEI"));
        list.forEach(System.out::println);
    }

    /**
     * Arrays.asList生成的list引起的结构性变化错误
     * java.lang.UnsupportedOperationException
     */
    @Test
    void listErr2() {
        String[] companies = {"HUAWEI", "Apple", "Oracle", "Tesla", "Amazon", "Microsoft", "Alibaba", "Tencent", "Sony", "Sun"};
        List<String> companyList = Arrays.asList(companies);
        companyList.remove("Sony");
    }

    @Test
    void correctErr2V1() {
        String[] companies = {"HUAWEI", "Apple", "Oracle", "Tesla", "Amazon", "Microsoft", "Alibaba", "Tencent", "Sony", "Sun"};
/** [jdk]
 List<String> companyList = Arrays.asList(companies);
 companyList = new ArrayList<>(companyList);
 */
        // [guava]
        List<String> companyList = Lists.newArrayList(companies);
        companyList.remove("Sony");
        companyList.forEach(System.out::println);
    }
}
