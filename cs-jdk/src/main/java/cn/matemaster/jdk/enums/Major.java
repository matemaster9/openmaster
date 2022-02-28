package cn.matemaster.jdk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: 计算机硕士专业枚举
 * @Author: MateMaster
 * @Date: 2022/2/27 16:24
 */
@Getter
@AllArgsConstructor
public enum Major {

    COMPUTER_SCIENCE("计算机科学", "907513"),

    ARTIFICIAL_INTELLIGENCE("人工智能", "874567"),

    IOT_ENGINEERING("物联网工程", "908213"),

    DATA_SCIENCE("数据科学", "546879"),

    SOFTWARE_ENGINEERING("软件工程", "404624");

    private String name;
    private String code;
}

