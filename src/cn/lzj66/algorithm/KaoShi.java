package cn.lzj66.algorithm;

/**
 * ClassName: KaoShi
 * Package: cn.lzj66.algorithm
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/12/7 17:05
 */
public class KaoShi {
    /**
     * 1.请用递归算法实现判断一个字符串是否是对称字符串，要求递归函数返回bool值. 比如“abcdcba”是对称字符串,递归函数返回true.
     */
    public static boolean isDuiChen(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) { //逐步比较字符串首尾字符是否一致
            return isDuiChen(str.substring(1, str.length() - 1)); //取出字符串首尾字符后继续比较
        } else {
            return false;
        }
    }

    /**
     * 2.请用递归算法求和，公式为：f(n)=2+4+6+.....+(2*n)，n为正整数，f(n)不会超出整数范围。要求递归函数返回int类型。
     */
    public static int sum(int n) {
        if (n == 1) {
            return 2;
        }
        return 2 * n + sum(n - 1);
    }

    /**
     * 3已知某数列符合规则：f(n)=f(n-1)+f(n-2)+f(n-3),且n为自然数，f(1)=1,f(2)=1，f(3)=1,那么请求第n个数是多少。要求时间复杂度为O(n)，空间复杂度为O(1).
     */
    public static int findNumByN(int n) {
        if (n <= 3) {
            return 1;
        }
        int a = 1, b = 1, c = 1, result = 0;
        for (int i = 4; i <= n; i++) {
            result = a + b + c;
            //前移一位
            a = b;
            b = c;
            c = result;
        }
        return result;
    }

    /**
     * 4最大子段和问题：给出一个序列，其子段为该序列的一个连续的区间。
     * 例如：(1 -1 2 2 3 -3 4 -4) ，(2 2 3 -3 4)为他的一个子段。给出一个序列，求出数字求和最大的一个子段。例如上面的序列， (2 2 3 -3 4)就是一个最大的子段，数字的总和为8。
     */
    public static int maxSubarrySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int cur : nums) {
            curSum = Math.max(cur, curSum + cur);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    /**
     * 5  有数组penny，penny中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个整数m(小于等于1000)代表要找的钱数，
     * 求换钱有多少方案的方法。给定数组penny及它的大小(小于等于50)，同时给定一个整数m，请返回多少的方案可以凑成m。
     *
     * @param penny 拥有的零钱
     * @param m     要找零的钱
     * @return
     */
    public static int changeMoney(int[] penny, int m) {
        int[] dp = new int[m + 1];
        dp[0] = 1;
        for (int coin : penny) {
            for (int i = coin; i <= m; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[m];
    }

    /**
     * 6 把一个字符串（数组）进行逆序操作，如“abc"逆序为“cba” ，要求空间复杂度为O(1)。函数原型为：void  reverseString(char* str);
     */
    public static char[] reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return str;
    }

    /**
     * 8使用递归算法对一个整数进行逆序转换并返回，如1234逆序为4321。
     */
    public static int reverseInteger(int a){
        return reverseIntegerH(a,0);
    }

    private static int reverseIntegerH(int a, int i) {
        if (a==0) {
            return i;
        }
        int last = a % 10; //取出最后一位数
        return reverseIntegerH(a/10,i*10+last); //去除最后一位数；将last放入新数字的最后
    }

    public static void main(String[] args) {
        //test1
        System.out.println(isDuiChen("abcdcba"));
        //test2
        System.out.println(sum(2));
        //test3
        System.out.println(findNumByN(4));
        //test4
        int[] nums = {1, -1, 2, 2, 3, -3, 4, -4};
        System.out.println(maxSubarrySum(nums));
        char[] str={'a','b','c','d'};
        System.out.println(reverseString(str));
        //test5
        System.out.println(reverseInteger(1234));

    }
}
