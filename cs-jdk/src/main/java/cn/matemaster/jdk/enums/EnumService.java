package cn.matemaster.jdk.enums;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/27 16:33
 */
public class EnumService {
    public static void main(String[] args) {
        identify(Major.COMPUTER_SCIENCE);
    }

    private static void identify(Major major) {
        switch (major) {
            case COMPUTER_SCIENCE:
                autoPrint(major);
                break;
            case ARTIFICIAL_INTELLIGENCE:
                System.out.println(major.getName());
                break;
            case SOFTWARE_ENGINEERING:
                System.out.println(major.getCode());
                break;
            default:
                throw new IllegalArgumentException("DISLIKE");
        }
    }

    private static void autoPrint(Major m) {
        System.out.println("name: " + m.getName() + " code: " + m.getCode());
    }
}
