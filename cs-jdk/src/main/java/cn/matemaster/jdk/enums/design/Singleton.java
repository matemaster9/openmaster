package cn.matemaster.jdk.enums.design;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 9:51
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Singleton {

    public enum Eg {
        SEED;

        private Singleton singleton;

        Eg() {
            this.singleton = new Singleton();
        }

        public Singleton getSingleton() {
            return singleton;
        }
    }

    public static Singleton getInstance() {
        return Eg.SEED.getSingleton();
    }
}
