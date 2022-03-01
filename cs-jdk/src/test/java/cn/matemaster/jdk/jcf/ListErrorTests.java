package cn.matemaster.jdk.jcf;

import cn.matemaster.jdk.jcf.util.ConstructUtils;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/3/1 11:06
 */
public class ListErrorTests {

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
