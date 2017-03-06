/**题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 *(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 *(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
 *(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 * Created by Zero on 2017/3/2.
 */
import java.util.*;
public class demo_4 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("输入一个整数：");
        int num=input.nextInt();
        new PrimeFactorization(num);
    }

    static class PrimeFactorization{
        int temp=2;
        public PrimeFactorization(int num){
            System.out.print("因数分解："+num+"=1");
            while(num>=temp){
                if(num%temp==0){
                    System.out.print("*"+temp);
                    num/=temp;
                }
                else{
                    temp++;
                }
            }
        }
    }
}
