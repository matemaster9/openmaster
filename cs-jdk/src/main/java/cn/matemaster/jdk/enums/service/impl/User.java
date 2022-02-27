package cn.matemaster.jdk.enums.service.impl;

import cn.matemaster.jdk.enums.service.Systemctl;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/27 19:43
 */
@Getter
@AllArgsConstructor
public enum User implements Systemctl {
    ADMIN("admin", "SFJAvsQ90@!") {
        @Override
        public void start() {
            System.out.println(getType() + " start service!");
        }

        @Override
        public void status() {
            System.out.println("The status of service");
        }

        @Override
        public void stop() {
            System.out.println(getType() + " stop service!");
        }
    },
    GUEST("guest", "FVAKaj98Mq!#") {
        @Override
        public void start() {
            System.out.println(getType() + " start service!");
        }

        @Override
        public void status() {
            System.out.println("The status of service");
        }

        @Override
        public void stop() {
            System.out.println(getType() + " stop service!");
        }
    };

    private String type;
    private String key;
}
