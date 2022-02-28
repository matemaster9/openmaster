package cn.matemaster.jdk.enums.service;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/27 19:40
 */
public interface Systemctl {

    /**
     * start system service
     */
    void start();

    /**
     * look up the status of service
     */
    void status();

    /**
     * end system service
     */
    void stop();
}
