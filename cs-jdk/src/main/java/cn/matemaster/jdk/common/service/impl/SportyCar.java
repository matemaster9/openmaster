package cn.matemaster.jdk.common.service.impl;

import cn.matemaster.jdk.common.service.TrafficTool;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 14:41
 */
public class SportyCar implements TrafficTool {

    @Override
    public void startup() {
        System.out.println("This is a sportyCar!");
    }
}
