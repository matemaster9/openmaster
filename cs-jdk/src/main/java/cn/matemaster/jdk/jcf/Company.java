package cn.matemaster.jdk.jcf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 9:38
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    /**
     * UUid
     */
    private String uuid;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 公司的好感度
     */
    private Integer star;
}
