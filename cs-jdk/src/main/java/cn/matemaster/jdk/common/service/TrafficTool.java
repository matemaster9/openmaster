package cn.matemaster.jdk.common.service;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 14:41
 */
public interface TrafficTool {

    String NAME = "tool";

    /**
     * 交通工具的启动行为
     */
    void startup();

    /**
     * 静态方法
     */
    static void callback() {
        System.out.println("接口调用");
    }

    /**
     * 默认方法
     */
    default void defaultMethod() {
        System.out.println("接口的默认方法！");
    }
}
