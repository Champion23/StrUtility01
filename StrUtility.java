import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 闫亮23
 * @version 1.0
 */
public class StrUtility {
    String str ;

    public StrUtility(String str) {
        this.str = str;
    }

    /**
     * 执行所有 判断
     */
    public void Exec(String str){
        isAllNums(str); //判断字符串是否全是数字
        isAllUpperCase(str);//判断字符串是否全是大写字母
        isAllLowerCase(str);//判断字符串是否全是小写字母
        toAscNums(str);
        toUpperCase(str);
        toAscCase(str);
    }

    /**
     *     1.判断字符串是否全是数字
     */
    public  boolean isAllNums(String string){
        char c ;
        boolean flag = true;
        for(int i =0;i< string.length();i++){
            c = string.charAt(i);
            if(!('0'<=c && c <='9')){
                flag = false;
            }
        }
        if(flag){
            System.out.println("全都是 数字！！");
        } else {
            System.out.println("并不全是 数字！！");
        }
        return flag;
    }

    /**
     *     2.判断字符串是否全是大写字母
     */
    public  void isAllUpperCase(String string){
        char c ;
        boolean flag = true;
        for(int i =0;i< string.length();i++){
            c = string.charAt(i);
            if(!('A'<=c && c <='Z')){
                flag = false;
            }
        }
        if(flag){
            System.out.println("全都是 大写字母！！");
        } else {
            System.out.println("并不全是 大写字母！！");
        }
    }

    /**
     *     3.判断字符串是否全是小写字母
     */
    public  void isAllLowerCase(String string){
            char c ;
            boolean flag = true;
            for(int i =0;i< string.length();i++){
                c = string.charAt(i);
                if(!('a'<=c && c <='z')){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("全都是 小写字母！！");
            } else {
                System.out.println("并不全是 小写字母！！");
            }
        }

    /**
     *     4.如果字符串全是字母，将其中所有小写字母转换为大写字母
     */
    public void toUpperCase(String string){
        char c ;
        boolean flag = true;
        for(int i =0;i< string.length();i++){
            c = string.charAt(i);
            if(!(('A'<=c && c <='Z')||('a'<=c && c <='z'))){
                flag = false;
            }
        }
        if(flag){
            String str1 = string.toUpperCase();
            char[] chs = str1.toCharArray();
            System.out.print("所有字母转换为大写后输出：");
            for (int i =0;i<string.length();i++){
                System.out.print(chs[i]);
            }
        }
    }

    /**
    *     5.如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组
    */
    public void toAscNums(String string){
         if(isAllNums(string)){ // 首先判断 是否全是数字

             int[] ascNums = new int[string.length()];// 整形数组

             for(int index = 0;index<string.length();index++){
                 String str1 = string.substring(index,index+1);//依次截取数字
                 int a = Integer.valueOf(str1);// 将字符串转换为 数字
                 ascNums[index] = a;// 加入到 数组中
             }
             Arrays.sort(ascNums); // 进行 升序 排序
             for(int i = 0;i<string.length();i++){ // 打印输出
                 System.out.print(ascNums[i]);
             }
         } else {
             System.out.println("不全是数字所以不进行排序。。");
         }

    }

    /**
     *     6.如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组。
     */
    public void toAscCase(String string){
        char c ;
        boolean flag = true;
        for(int i =0;i< string.length();i++){
            c = string.charAt(i);
            if(!(('A'<=c && c <='Z')||('a'<=c && c <='z'))){
                flag = false;
            }
        }
        if(flag){
            char[] chs = string.toCharArray();
            Arrays.sort(chs);
            System.out.println();
            System.out.print("原本字母排序打印： ");
            for(int i =0;i<chs.length;i++){
                System.out.print(chs[i]);
            }
        }

    }


}
