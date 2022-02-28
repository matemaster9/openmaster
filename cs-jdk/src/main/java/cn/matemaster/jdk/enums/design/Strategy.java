package cn.matemaster.jdk.enums.design;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/28 10:01
 */
public class Strategy {
    public enum Calculator {

        ADDITION {
            public Double execute(Double x, Double y) {
                return x + y;
            }
        },

        SUBTRACTION {
            public Double execute(Double x, Double y) {
                return x - y;
            }
        },

        MULTIPLICATION {
            public Double execute(Double x, Double y) {
                return x * y;
            }
        },

        DIVISION {
            public Double execute(Double x, Double y) {
                return x / y;
            }
        };

        public abstract Double execute(Double x, Double y);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.ADDITION.execute(4.0, 2.0));
        // 打印 6.0
        System.out.println(Calculator.SUBTRACTION.execute(4.0, 2.0));
        // 打印 2.0
        System.out.println(Calculator.MULTIPLICATION.execute(4.0, 2.0));
        // 打印 8.0
        System.out.println(Calculator.DIVISION.execute(4.0, 2.0));
        // 打印 2.0
    }
}
