package cn.matemaster.jdk.enums;

import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/27 20:06
 */
public class MajorTests {
    Major major;

    @Test
    void autoPrintAll() {
        for (Major value : major.values()) {
            System.out.println(value);
        }
    }

    @Test
    void autoPrintOrdinal() {
        for (Major value : major.values()) {
            System.out.println(value.ordinal());
        }
    }

    @Test
    void autoPrintName() {
        for (Major value : major.values()) {
            System.out.println(value.name());
        }
    }

    @Test
    void autoToString() {
        for (Major value : major.values()) {
            System.out.println(value.toString());
        }
    }

    @Test
    void autoGetDeclaringClass() {
        Class<Major> declaringClass = Major.COMPUTER_SCIENCE.getDeclaringClass();
        System.out.println(declaringClass);
    }
}
