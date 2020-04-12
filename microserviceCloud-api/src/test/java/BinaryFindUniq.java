/**
 * 求出唯一的数
 * ^应用场景：
 * ^0得到原值
 * 5^2^5^2=0
 * 5^2^5=2
 * 一个数异或它本身为0
 * 还可以翻转特定位数
 * @author Jerry
 * @create 2019-08-14 16:11
 */
public class BinaryFindUniq {
    /**
     * 0000 0001   --->1   0110
     * 0000 0010   --->2   0111
     * 0000 0011   --->3   0101
     * 0000 0110   --->6   0110
     * @param args
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,7,3,2,1};
        int result=0;
        for (int i=0;i<arr.length;i++) {
            result=result^arr[i];
        }
        System.out.println(result);
    }
}
