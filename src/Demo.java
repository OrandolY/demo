import java.util.Arrays;  // 导入Arrays类

/**
 * @author Orandol
 */
public class Demo {
    // 静态变量
    static String message = "欢迎学习Java！";

    // 静态方法
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // 直接使用静态变量
        System.out.println(message);
        int[] numbers = {1, 2, 3};
        // 直接调用静态方法
        printArray(numbers);

        System.out.println(System.currentTimeMillis());

    }
}