package cn.matemaster.jdk.jcf.util;

import cn.matemaster.jdk.jcf.Company;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 10:22
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConstructUtils {

    private static String[] COMPANY_NAME = {"HUAWEI", "Apple", "Oracle", "Tesla", "Amazon", "Microsoft", "Alibaba", "Tencent", "Sony", "Sun"};

    public static List<Company> list() {
        ArrayList<Company> list = new ArrayList<>(COMPANY_NAME.length);
        for (String name : COMPANY_NAME) {
            Company company = new Company(UUID.randomUUID().toString(),
                    name,
                    new Random(System.currentTimeMillis()).nextInt(6));
            list.add(company);
        }
        return list;
    }
}
