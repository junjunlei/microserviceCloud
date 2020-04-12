/**
 * 不用if和for比较两个数的大小
 * @author Jerry
 * @create 2019-08-14 16:48
 */
public class CompareNoIfAndFor {
    public static void main(String[] args) {
        System.out.println(Func(2,2));
    }
    public static int Func(int a,int b){
        return (a-b)<0?-1:(a-b>0?1:0);
        //return (a-b?1:0); C语言三元表达式只要  不为0（false）都会返回第一个结果
        // return (a - b) >> 31 ? -1 : (a - b ? 1 : 0);
    }
}
