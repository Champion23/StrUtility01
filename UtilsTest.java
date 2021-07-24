import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 闫亮23
 * @version 1.0
 */
public class UtilsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入： ");
        String str = scanner.next();

        StrUtility strUtility = new StrUtility(str);
        strUtility.Exec(str); // 执行所有 判断
        //测试案例：
        //请输入：
        //acbdw
        //并不全是 数字！！
        //并不全是 大写字母！！
        //全都是 小写字母！！
        //并不全是 数字！！
        //不全是数字所以不进行排序。。
        //所有字母转换为大写后输出：ACBDW
        //原本字母排序打印： abcdw
        // 请输入：
        //1269547
        //全都是 数字！！
        //并不全是 大写字母！！
        //并不全是 小写字母！！
        //全都是 数字！！
        //1245679
        //请输入：
        //ausSHSzio
        //并不全是 数字！！
        //并不全是 大写字母！！
        //并不全是 小写字母！！
        //并不全是 数字！！
        //不全是数字所以不进行排序。。
        //所有字母转换为大写后输出：AUSSHSZIO
        //原本字母排序打印： HSSaiosuz
    }
}
